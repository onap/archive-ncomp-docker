
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.servers.docker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.net.URLEncoder;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.io.UnsupportedEncodingException;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;

import org.apache.commons.codec.binary.Base64;
import org.apache.log4j.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.docker.ContainerOptions;
import org.openecomp.ncomp.docker.ContainerCpuUsage;
import org.openecomp.ncomp.docker.ContainerCpuStats;
import org.openecomp.ncomp.docker.ContainerPortBindings;
import org.openecomp.ncomp.docker.ContainerNetworkStats;
import org.openecomp.ncomp.docker.ContainerMemoryStats;
import org.openecomp.ncomp.docker.ContainerMemoryUsage;
import org.openecomp.ncomp.docker.ContainerRestartPolicy;
import org.openecomp.ncomp.docker.DockerContainer;
import org.openecomp.ncomp.docker.DockerContainerStats;
import org.openecomp.ncomp.docker.DockerFactory;
import org.openecomp.ncomp.docker.DockerProcess;
import org.openecomp.ncomp.docker.DockerHost;
import org.openecomp.ncomp.docker.DockerImage;
import org.openecomp.ncomp.docker.DockerNetwork;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.util.EList;

class DockerDockerHostProvider extends BasicAdaptorProvider {
    
    private static final Logger logger = Logger.getLogger(DockerDockerHostProvider.class);
    
    DockerHost o;
    DockerHttpClient client;
    protected Date lastPoll;
    
    //
    // Docker endpoint types are --
    //  -> containers
    //  -> images
    //  -> networks
    //  -> misc 
    // 
    private static final String CONTAINERS = "/containers/";
    private static final String IMAGES = "/images/";
    private static final String NETWORKS = "/networks/";
    private static final String MISC = "/misc/";

    private static final String GET_METHOD = "GET";
    private static final String POST_METHOD = "POST";
    private static final String DELETE_METHOD = "DELETE";
    private static final int PRETTY_PRINT = 4;
    private static final int REPO = 0;
	private static final int PORT = 1;
	private static final int NAME = 2;
	private static final int VER = 3;
    
    private enum ContainerState { 
    	CREATED, STOPPED, RUNNING, PAUSED, DELETED
    }
    
    private enum ContainerEvents { 
    	CREATE, START, STOP, RESTART, PAUSE, UNPAUSE, KILL, DESTORY
    }
    
    private JSONObject encodeAuth(String json) {
    	String auth = Base64.encodeBase64String(json.getBytes());	
    	return new JSONObject(auth);
    }
    
    public DockerDockerHostProvider(ISiriusServer controller, DockerHost o) {
        super(controller, o);
        this.o = o;
        this.client = new DockerHttpClient("docker.properties","dockerHost");
    }

    @Override
    public void start() {
        if (o.isRemote()) return;
    	Thread t = new Thread("docker poller: " + o.getName()) {
            @Override
            public void run() {
                while (true) {
                    try {
                        if (lastPoll == null
                                || lastPoll.getTime() + o.getPollingFrequency() < new Date()
                                        .getTime())
                            o.poll();
                        Thread.sleep(5000); // sleep 5 seconds
                    } catch (Exception e) {
                        ManagementServerUtils.printStackTrace(e);
                        logger.fatal("openstackPoller Thread DIED: " + e);
                        try {
                            Thread.sleep(30000);
                        } catch (InterruptedException e1) {
                        }
                    }
                }
            };
        };
        t.start();
    }

    protected void poll() {
        logger.info("XXXX poll");
        lastPoll = new Date();
        JSONObject json = callRemoteApi("/images/json", GET_METHOD);
        logger.info("XXXX res:" + json.toString(2));
        updateImages(json);
        // containers
        // if you only want to see running containers, set "all" to false
        // this results in only running containers being shown
        //
        int ALL=1;
        json = callRemoteApi("/containers/json?all=" + ALL, GET_METHOD);
        logger.info("XXXX res:" + json.toString(2));
        updateContainers(json);
        // networks
        json = callRemoteApi("/networks", GET_METHOD);   
        logger.info("XXXX res:" + json.toString(2));
        updateNetworks(json);  
        updateContainerStats();

        logger.info("XXXX " + ManagementServer.ecore2json(o, 100, null, true).toString(2));
    }
    
    /*
     * json to provide with request to create a container from an image
     */
    private JSONObject mkContainerJson(String image) {
    	
            StringBuilder json = new StringBuilder();
            
                json.append("{");
                json.append("\"Hostname\":\"\",");
                json.append("\"User\":\"\",");
                json.append("\"Memory\":0,");
                json.append("\"MemorySwam\":0,");
                json.append("\"AttachStdin\":false,");
                json.append("\"AttachStdout\":true,");
                json.append("\"AttachStderr\":true,");
                json.append("\"PortSpecs\":null,");
                json.append("\"Privleged\":false,");
                json.append("\"Tty\":false,");
                json.append("\"OpenStdin\":false,");
                json.append("\"StdinOnce\":false,");
                json.append("\"Env\":null,");
                json.append("\"Dns\":null,");
                json.append("\"Image\":\"<image>\",");
                json.append("\"Volumes\":null,");
                json.append("\"VolumesFrom\":null,");
                json.append("\"WorkingDir\":\"\",");
                json.append("}");
                
                
                return new JSONObject(json.toString().replace("<image>", image));
    }
    
    /*
     * this is a composite of two separate API calls. the first call creates the
     * container. the second call starts the created container
     */ 
    public void dockerRun(String image) {
    	dockerRunWithName(image, null);
    }
    
    public void dockerRunWithName(String image, String name) {
         logger.debug("image <-" + image);
         boolean chkEnv = false;
         
         if (chkEnv) {
             Map<String,String> env = System.getenv();
             for(Map.Entry<String,String> entry : env.entrySet()) {
                 if (entry.getKey().toLowerCase().contains("proxy")) {
                     logger.debug(entry.getKey() + " = " + entry.getValue());
                 }
             }
         }
         
         String api = "/containers/create";
         if (name != null) {
        	 api += "?name=" + name;
         }
         
         JSONObject jobj = mkContainerJson(image);
         
         logger.info("container json <- " + jobj.toString(PRETTY_PRINT));
         
         JSONObject json = callRemoteApi(api, POST_METHOD, jobj);

        // 201 - no error
        // 404 - no such container
        // 406 - impossible to attach (container not running)
        // 500 - server error

         if (client.getResponseCode() == 201) {
        	 String shortId = json.getString("Id").substring(0,11);
        	 logger.info("Starting container <- " + shortId);
             startContainer(shortId);
         }
         
     }
    
    public void dockerRunWithOptions(String image, ContainerOptions opts) {
    	
          String api = "/containers/create";
          String name = opts.getName();
      
          if (name != null) {
         	 api += "?name=" + name;
          }
          
          JSONObject jobj = mkContainerJson(image);       
          JSONObject options = new JSONObject();
          JSONArray binds = new JSONArray();
                   
          for(String binding : opts.getVolumes()) {
        	  binds.put(binding);
          }
          
          if (binds.length() > 0) {
        	  options.put("Binds",binds);
          }
          
          JSONObject portBindings = new JSONObject();
          JSONObject exposedPorts = new JSONObject();
          
          for(ContainerPortBindings portMap : opts.getPortBindings()) {
        	  String tag = Integer.toString(portMap.getContainerPort()) + "/" + portMap.getProtocol();
        	  String val = Integer.toString(portMap.getVmPort());
        	  JSONObject pair = new JSONObject().put("HostIp", "").put("HostPort", val);
        	 
        	  if (portBindings.has(tag)) {
        		  portBindings.accumulate(tag,pair);
        	  } else {
        		  portBindings.put(tag, new JSONArray().put(pair));
        	  }
        	  exposedPorts.put(tag, new JSONObject());
          }
          
          if (portBindings.length() > 0) {
        	  options.put("PortBindings",portBindings);
          }
          
          // container links 
          if (!opts.getLinks().isEmpty()) {
        	  JSONArray links = new JSONArray();
        	  for(String fromLink : opts.getLinks()) {
        		  String linkAlias = "";
        		  String link = "";
        		  
        		  if (fromLink.contains(":")) {
        			  String[] ary = fromLink.split("\\:");
        			  if (ary.length > 1) {
        				  link = ary[0];
        				  linkAlias = ary[1];
        			  } 
        		  } else {
        			  link = fromLink;
        		  }
     
        		  String fqLink = link + ":" + name + "/" + linkAlias;
        		  links.put(fqLink);
        	  }
        	  options.put("Links", links);
          }
          
          // default behavior
          opts.setPublishAllPorts(true);
          
          if (opts.isPublishAllPorts()) {
        	  options.put("PublishAllPorts", true);
          }
          
          // restart policy defaults
          String policy = "always";
          int retries = 0;
                
          if (opts.getAutoRestart() != null && opts.getAutoRestart().getNm() != null) {
        	  policy = opts.getAutoRestart().getNm();
          }
          
          if ("on-failure".equals(policy)) {
        	  retries = opts.getAutoRestart().getMaxRetryCnt();
          }
          
          JSONObject restartPolicy = new JSONObject()
        	.put("Name", policy)
        	.put("MaximumRetryCount", retries);
        
          options.put("RestartPolicy", restartPolicy);
          
          if (options.length() > 0) {
        	  jobj.put("HostConfig",options);
          }
          
          if (exposedPorts.length() > 0) {
        	  jobj.put("ExposedPorts",exposedPorts);
          }
          
          JSONObject config = new JSONObject();  
           
          // add any runtime environment arguments
          if (!opts.getEnv().isEmpty()) {
        	  JSONArray rekv = new JSONArray();
        	  for(String kv : opts.getEnv()) {
        		  logger.debug("adding runtime argument " + kv);
        		  rekv.put(kv);
        	  }
              jobj.put("Env", rekv);
          }
       
          opts.setSetContainerName(true);
          
          if (opts.isSetContainerName()) {
        	  try { 
        		  jobj.put("Hostname", InetAddress.getLocalHost().getHostName());
        	  } catch(UnknownHostException e) {
        		  logger.error("Unable to determine local hostname", e);
        	  }
          }
          
          logger.info("container json <- " + jobj.toString(PRETTY_PRINT));
          
          JSONObject json = callRemoteApi(api, POST_METHOD, jobj);

         // 201 - no error
         // 404 - no such container
         // 406 - impossible to attach (container not running)
         // 500 - server error

          if (client.getResponseCode() == 201) {
         	 String shortId = json.getString("Id").substring(0,11);
         	 logger.info("Starting container <- " + shortId);
              startContainer(shortId);
          }
          
		
	}
    
    private void updateContainers(JSONObject json) {
        JSONArray a = json.getJSONArray("$list");
         o.getContainers().clear();
        for (int i = 0; i < a.length(); i++) {
            JSONObject j = a.getJSONObject(i);
            decapitalize(j);
            fixNull(j);
            rename(j, "created", "dockerCreated");
            fixMap(j, "hostConfig");
            fixMap(j, "labels");
            DockerContainer container = (DockerContainer) controller
                    .getServer().json2ecore(
                            DockerPackage.eINSTANCE.getDockerContainer(), j);
             if (container.getNames().size()>0)
                 container.setName(container.getNames().get(0).replace("/", ""));
             else container.setName(container.getId().substring(0, 10));
             
             // get container process info 
             //containerProcesses(container.getId());
//             String name = container.getId();
//             String api = CONTAINERS + name + "/top?ps_args=aux";   
//             JSONObject jo = callRemoteApi(api,GET_METHOD);
//             DockerProcess[] dp = setPtbl(jo);
             // so how do we actually update the DockerProcess processes 
             // member of the container class?
             // EList<DockerProcess> cp = container.getProcesses();
             // cp = (EList<DockerProcess>)Arrays.asList(dp);
             
            System.err.println("XXXX "
                    + ManagementServer.ecore2json(container, 100, null, true)
                            .toString(2));
            o.getContainers().add(container);
        }
    }

    private void updateImages(JSONObject json) {
    	
    	
        JSONArray a = json.getJSONArray("$list");
        o.getImages().clear();
        for (int i = 0; i < a.length(); i++) {
            JSONObject j = a.getJSONObject(i);
            decapitalize(j);
            fixNull(j);
            rename(j, "created", "dockerCreated");
            if (j.has("labels")) j.remove("labels");
            System.err.println("XXXX " + j.toString());
            DockerImage image = (DockerImage) controller.getServer()
                    .json2ecore(DockerPackage.eINSTANCE.getDockerImage(), j);
            // System.err.println("XXXX " + ManagementServer.ecore2json(image,
            // 100, null, true).toString(2));
            if (image.getRepoTags().size() > 0)
                image.setName(image.getRepoTags().get(0));
            image.setName(image.getName().replace("/", "_"));
            o.getImages().add(image);
        }
    }
    
   
    /*
     * should probably break this up into discrete pieces for 
     * cpu, memory, blkio, and network. but this is good enough for now.
     * blkio stats not modeled - since i'm not certain what is actually 
     * being reported
     */   
    private void updateContainerStats() {
    	
    	for(DockerContainer c : o.getContainers()) {
    		if (c.getStatus().equals("exited")) continue;
    		if (c.getStatus().startsWith("Exited")) continue;
    		if (c.getStatus().startsWith("Created")) continue;
    		String nm = c.getName();
    		JSONObject j = containerStats(nm,false);
    		logger.info("container stats json <- " + j.toString(4));
    		
    		DockerContainerStats cstats = DockerFactory.eINSTANCE.createDockerContainerStats();
    		
    		/*
    		 * network stats
    		 */
    		JSONObject netwks = j.getJSONObject("networks");
    		for(String net : JSONObject.getNames(netwks)) {
    			JSONObject intf = netwks.getJSONObject(net);
    			System.err.println(net + " <- " + intf.toString(4));
    			ContainerNetworkStats cnet = DockerFactory.eINSTANCE.createContainerNetworkStats();
    			cnet.setIntf(net);
    			cnet.setRx_bytes(intf.getInt("rx_bytes"));
    			cnet.setRx_dropped(intf.getInt("rx_dropped"));
    			cnet.setRx_errors(intf.getInt("rx_errors"));
    			cnet.setRx_packets(intf.getInt("rx_packets"));
    			cnet.setTx_bytes(intf.getInt("tx_bytes"));
    			cnet.setTx_dropped(intf.getInt("tx_dropped"));
    			cnet.setTx_errors(intf.getInt("tx_errors"));
    			cnet.setTx_packets(intf.getInt("tx_packets"));
    			
    			cstats.getNetworks().add(cnet);
    		}
    		
    		/*
    		 * memory usage
    		 */
    		JSONObject mem = j.getJSONObject("memory_stats");
    		ContainerMemoryUsage memusg = DockerFactory.eINSTANCE.createContainerMemoryUsage();
    		
    		memusg.setUsage(mem.getInt("usage"));
    		memusg.setMax_usage(mem.getInt("max_usage"));
    		memusg.setLimit(mem.getInt("limit"));
    		memusg.setFailcnt(mem.getInt("failcnt"));
    		
    		/*
    		 * memory stats
    		 */
    		if (mem.has("stats") && isaJSONObject(mem.get("stats"))) {
    			JSONObject mstats = mem.getJSONObject("stats");
    		
    			if (mstats != null) {
    				ContainerMemoryStats memstats = DockerFactory.eINSTANCE.createContainerMemoryStats();		
    				memstats.setActive_anon(mstats.getInt("active_anon"));
    				memstats.setActive_file(mstats.getInt("active_file"));
    				memstats.setCache(mstats.getInt("cache"));
    				memstats.setHierarchical_memory_limit(mstats.getInt("hierarchical_memory_limit"));
    				memstats.setInactive_anon(mstats.getInt("inactive_anon"));
    				memstats.setInactive_file(mstats.getInt("inactive_file"));
    				memstats.setMapped_file(mstats.getInt("mapped_file"));
    				memstats.setPgfault(mstats.getInt("pgfault"));
    				memstats.setPgmajfault(mstats.getInt("pgmajfault"));
    				memstats.setPgpgin(mstats.getInt("pgpgin"));
    				memstats.setPgpgout(mstats.getInt("pgpgout"));
    				memstats.setRss(mstats.getInt("rss"));
    				memstats.setRss_huge(mstats.getInt("rss_huge"));
//    				memstats.setUnevictable(mstats.getInt("unevicatable"));
    				memstats.setTotal_active_anon(mstats.getInt("total_active_anon"));
    				memstats.setTotal_active_file(mstats.getInt("total_active_file"));
    				memstats.setTotal_cache(mstats.getInt("total_cache"));
    				memstats.setTotal_inactive_anon(mstats.getInt("total_inactive_anon"));
    				memstats.setTotal_inactive_file(mstats.getInt("total_inactive_file"));
    				memstats.setTotal_mapped_file(mstats.getInt("total_mapped_file"));
    				memstats.setTotal_pgfault(mstats.getInt("total_pgfault"));
    				memstats.setTotal_pgmajfault(mstats.getInt("total_pgmajfault"));
    				memstats.setTotal_pgpgin(mstats.getInt("total_pgpgin"));
    				memstats.setTotal_pgpgout(mstats.getInt("total_pgpgout"));
    				memstats.setTotal_rss(mstats.getInt("total_rss"));
    				memstats.setTotal_rss_huge(mstats.getInt("total_rss_huge"));
    				memstats.setTotal_unevictable(mstats.getInt("total_unevictable"));
    				memstats.setTotal_writeback(mstats.getInt("total_writeback"));
    			
    				memusg.setMemstats(memstats);
    			}
    		}	
    		
    		cstats.setMemory(memusg);
    		
    		/*
    		 * cpu stats
    		 */
    		ContainerCpuStats ccpustats = DockerFactory.eINSTANCE.createContainerCpuStats();
    		ContainerCpuUsage ccpuusage = DockerFactory.eINSTANCE.createContainerCpuUsage();
    
    		JSONObject jcpuusage = j.getJSONObject("cpu_stats").getJSONObject("cpu_usage");  		
    		
    		ccpuusage.setTotal_usage(jcpuusage.getLong("total_usage"));
    		ccpuusage.setUsage_in_usermode(jcpuusage.getLong("usage_in_kernelmode"));
    		ccpuusage.setUser_in_kernelmode(jcpuusage.getLong("usage_in_usermode"));
    		
    		JSONArray ccpupcpu = jcpuusage.getJSONArray("percpu_usage"); 
    		
    		for(int idx = 0; idx < ccpupcpu.length(); idx++) {
    			ccpuusage.getPercpu_usage().add(ccpupcpu.getLong(idx));	
    		}
    		
    		ccpustats.setCpu_usage(ccpuusage);
    		cstats.setCpu(ccpustats);
    		
    		c.setStats(cstats);
    	}
    	
    }

    private static final boolean isaJSONObject(Object v) {
        if (v.getClass().equals(JSONObject.class)) {
            return true;
        }
        return false;
    }
    
    private void updateNetworks(JSONObject json) {
        JSONArray a = json.getJSONArray("$list");
        o.getNetworks().clear();
        for (int i = 0; i < a.length(); i++) {
            JSONObject j = a.getJSONObject(i);
            decapitalize(j);
            fixNull(j);
            rename(j, "created", "dockerCreated");
            fixMap(j, "containers", "id");
            fixMap(j, "options");
            DockerNetwork network = (DockerNetwork) controller.getServer()
                    .json2ecore(DockerPackage.eINSTANCE.getDockerNetwork(), j);
            // System.err.println("XXXX " + ManagementServer.ecore2json(network,
            // 100, null, true).toString(2));
            o.getNetworks().add(network);
        }
    }

    // change JSONObject to a JSONArray with name,value objects
    private void fixMap(JSONObject j, String key) {
        JSONArray a = new JSONArray();
        if (!j.has(key)) return;
        JSONObject jjj = j.getJSONObject(key);
        for (Iterator<String> i = jjj.keys(); i.hasNext();) {
            String k = i.next();
            Object v = jjj.get(k);
            JSONObject jj = new JSONObject();
            jj.put("name", k);
            jj.put("value", v);
            a.put(jj);
        }
        j.put(key, a);
    }

    // change JSONObject to a JSONArray with name,value objects
    private void fixMap(JSONObject j, String key, String nameKey) {
        JSONArray a = new JSONArray();
        JSONObject jjj = j.getJSONObject(key);
        for (Iterator<String> i = jjj.keys(); i.hasNext();) {
            String k = i.next();
            JSONObject v = jjj.getJSONObject(k);
            v.put(nameKey, k);
            a.put(v);
        }
        j.put(key, a);
    }

    private void fixNull(JSONObject j) {
        for (Iterator<String> i = j.keys(); i.hasNext();) {
            String k = i.next();
            Object v = j.get(k);
            // System.err.println("XXXX " + v.getClass().getName());
            if (v.getClass().getName().equals("org.json.JSONObject$Null")) {
                j.put(k, new JSONArray());
                System.err.println("XXXX change null to empty array " + k);
            }
        }
    }

    private void decapitalize(JSONObject j) {
        ArrayList<String> l = new ArrayList<String>();
        for (Iterator<String> i = j.keys(); i.hasNext();) {
            l.add(i.next());
        }
        for (String k : l) {
            Object v = j.get(k);
            if (v instanceof JSONObject) {
                JSONObject jj = (JSONObject) v;
                decapitalize(jj);
            }
            if (v instanceof JSONArray) {
				JSONArray a = (JSONArray) v;
		        for (int i = 0; i < a.length(); i++) {
		        	Object v1 = a.get(i);
		            if (v1 instanceof JSONObject) {
		                JSONObject jj = (JSONObject) v1;
		                decapitalize(jj);
		            }
		        }		        	
			}
            rename(j, k, k.substring(0, 1).toLowerCase() + k.substring(1));
        }

    }

    private void rename(JSONObject j, String k1, String k2) {
        if (k1.equals(k2))
            return;
        if (j.has(k1)) {
            j.put(k2, j.get(k1));
            j.remove(k1);
        }
    }

	// run through json.get("Processes") arrays 
	// and generate a DockerProcess object
    // "USER","PID","%CPU","%MEM","VSZ","RSS","TTY","STAT","START","TIME","COMMAND" 
    private DockerProcess[] setPtbl(JSONObject json) {
    	
    	if (!json.has("Proccesses")) {
    		return null;
    	}
    	JSONArray processes = json.getJSONArray("Processes");
    	int sz = processes.length();
    	
    	DockerProcess[] dprocs = new DockerProcess[sz];
    
    	for (int i=0; i < processes.length(); i++) {
    		JSONArray proc = processes.getJSONArray(i);
    		logger.debug("proc <- " + proc.toString(PRETTY_PRINT));
    		
    		DateFormat df = new SimpleDateFormat();
    
    		DockerProcess dp = DockerFactory.eINSTANCE.createDockerProcess();
    			dp.setUser(proc.getString(0));
    			dp.setPid(proc.getLong(1));
    			dp.setCpu(proc.getDouble(2));
    			dp.setMem(proc.getDouble(3));
    			dp.setVsz(proc.getLong(4));
    			dp.setRss(proc.getLong(5));
    			dp.setTty(proc.getString(6));
    			dp.setStat(proc.getString(7));
    			dp.setCommand(proc.getString(10));
    			// 9th field is a duration indicator. FIXME
    			dp.setTimeElapsed(0);
    			
    			try { 
    				dp.setStart(df.parse(proc.getString(8)));
    			} 
    			catch(ParseException ep) {
    				logger.warn("Could not parse " + proc.getString(8) + " into a Date");
    				dp.setStart(null);
    			}
    			catch(NullPointerException e){
    				logger.warn("Could not parse " + proc.getString(8) + " into a Date");
    				dp.setStart(null);
    			}
    			
    			dprocs[i] = dp;
    	}
    	
    	return dprocs;
    }
    
    /*
     * many remote docker api calls do not return a json message
     * your only indication of operational success will be in the 
     * http client response code. the json object will be null in 
     * those cases
     */
    private JSONObject callRemoteApi(String api, String method) {
    	return callRemoteApi(api,method,null);
    }
    
    private JSONObject callRemoteApi(String api, String method, JSONObject context) {
    	
    	 HashMap<String, String> headers = new HashMap<String, String>();
    	 JSONObject json = null;
    	 
    	 // this will be prepended to the api string passed into the method
         String url = client.getBaseAddress();
         
         logger.info("api <- " + method + " " + url + api);
         
         switch(method) {
         case GET_METHOD : 
        	 json = client.httpJsonTransaction(api, method, headers, null, 5000L);
        	 break;
         case POST_METHOD :
        	 if (context == null) {
        		 client.httpBinaryTransaction(api, method, headers, context, 5000L);
        	 } else {
        		 json = client.httpJsonTransaction(api,method, headers, context, 5000L);
        	 }
        	 break;
         case DELETE_METHOD :
        	 json = client.httpJsonTransaction(api, method, headers, null, 5000L);
        	 break;
         }
         
         logger.info("http response <- " + client.getResponseCode());
         
         if (json != null) {
        	 logger.debug("json <- " + json.toString(PRETTY_PRINT));
         } 
         
         return json;
    }
    
    private JSONArray callRemoteApiStream(String api, String method, JSONObject aContext) {
  
     	 HashMap<String, String> headers = new HashMap<String, String>();
     	 byte[] bytes;
     	 JSONObject context = aContext;
     	 String func = "callRemoteApiStream";
    	 
    	 // this will be prepended to the api string passed into the method
         String url = client.getBaseAddress();
         
         logger.info("api <- " + method + " " + url + api);
        
         bytes = client.httpBinaryTransaction(api, method, headers, context, 5000L);
         logger.info("http response <- " + client.getResponseCode());
         
         JSONObject json = new JSONObject(bytes.toString());
         JSONArray a = json.getJSONArray("$list");
         
    	return a;
    }
    
    //
    // GET /containers/(id)/json
    // 
    // return low level information about a container
    //
    // should it be void? this is returns  
    public void inspectContainer(String name) {
    	
        int size = 0; // 1 - true, 0 - false
        String url = CONTAINERS + name + "/json?size=" + size;
        
        JSONObject json = callRemoteApi(url,GET_METHOD);
        logger.info("container " + name + " <- " + json.toString(PRETTY_PRINT));
        
        // status codes: 
        //    200 - no error
        //    404 - no such container
        //    500 - server error
        // process JSON
    }

    // GET /containers/(id)/top
    // List processes running in a container
    public void containerProcesses(String name) {
    	
        String api = CONTAINERS + name + "/top?ps_args=aux";   
        JSONObject json = callRemoteApi(api,GET_METHOD);
        logger.info("container " + name + " <- " + json.toString(PRETTY_PRINT));     
        setPtbl(json);
    }
    
    // POST /containers/(id)/kill 
    public void killContainer(String name,String sigint) {
    	
        String url = CONTAINERS + name + "/kill?signal=" + sigint;    
        JSONObject json = callRemoteApi(url,POST_METHOD);
        
        // status codes: 
        //    204 - no error
        //    404 - no such container
        //    500 - server err
        // process JSON
    }
    
    // POST /containers/(id)/restart?t=seconds
    public void restartContainer(String name, int seconds) {
    	
        String url = CONTAINERS + name + "/restart?seconds=" + seconds;       
        JSONObject json = callRemoteApi(url,POST_METHOD);
        // status codes: 
        //    204 - no error
        //    404 - no such container
        //    500 - server err
        // process JSON
    }
    
    // remove - remove volumes, force - kill & remove
    public void removeContainer(String name, boolean remove, boolean force) {
    	
    	int rm = (force) ? 1 : 0;
    	int vol = (remove) ? 1 : 0;
    	
    	String url = CONTAINERS + name + "?force=" + rm + "&v=" + vol;
    	
        JSONObject json = callRemoteApi(url,DELETE_METHOD);
        
        // status codes: 
        //  204 - no error
        //  400 - bad parameter
        //  404 - no such container
        //  500 - server error
        // process JSON
    }
    
    // POST /containers/(id)/pause
    public void pauseContainer(String name) {
    	
        String url = CONTAINERS + name + "/pause";      
        JSONObject json = callRemoteApi(url,POST_METHOD);
        
        // status codes: 
        //    204 - no error
        //    404 - no such container
        //    500 - server err
        // process JSON
    }
    
    // POST /containers/(id)/unpause
    public void unpauseContainer(String name) {
  
        String url = CONTAINERS + name + "/unpause";
        JSONObject json = callRemoteApi(url,POST_METHOD);
        
        // status codes: 
        //    204 - no error
        //    404 - no such container
        //    500 - server err
        // process JSON
    }
    
    // GET /containers/(id)/stats?stream
    // stream - true or false, if false, poll once and exit
    public JSONObject containerStats(String  name, boolean stream) {
    	
    	String url = CONTAINERS + name + "/stats?stream=" + stream;
    	JSONObject json = callRemoteApi(url,GET_METHOD);
    	
    	return json;   
    }
    
    // POST /containers/(id)/start
    public void startContainer(String name) {
    	
        String url = CONTAINERS + name + "/start";
        JSONObject json = callRemoteApi(url,POST_METHOD);
        // status codes: 
        //    200 - no error
        //    304 - container already started
        //    404 - no such container
        //    500 - server err
    }
    
    // POST /containers/(id)/stop?t=seconds
    // t = seconds to wait before killing the container
    public void stopContainer(String name, int seconds) {
    	
        String url = CONTAINERS + name + "/stop?t=" + seconds;
        JSONObject json = callRemoteApi(url,POST_METHOD);    
        // status codes: 
        //    204 - no error
        //    304 - container already stopped
        //    404 - no such container
        //    500 - server err
    }
   
    private List<String> getImageNameElements(String image) {
    	
    	 List<String> a = new ArrayList<>();
         for(String z : image.split("\\/")) {
         	String[] iz = z.split(":");
         	for(int i = 0; i < iz.length; i++) {
         		a.add(iz[i]);
         	}
         }
    	return a;
    }
    
    /*
     * return the latest version nbr of a package
     */
    private String getLatest(String image) {
 
    	List<String> vers = new ArrayList<>();
    	
    	for(DockerImage im : o.getImages()) {
    		List<String> elms = getImageNameElements(im.getName()); 
    		
    		if (image.contains(elms.get(NAME))) {
    			EList<String> tags = im.getRepoTags();
    			for(int i = 0; i < tags.size(); i++) {
    				List<String> repoElm = getImageNameElements(tags.get(i));
    				vers.add(repoElm.get(VER));
    			}
    		}	
    	}
    	Collections.sort(vers);
		
    	return vers.get(vers.size()-1);
    }
    
   /*
    * Tag the most current version of an image as latest 
    */
    public void tagImage(String image, String ver, boolean force) {
    	
    	 int f = (force) ? 1 : 0;
    	 
    	 if (ver.isEmpty()) {
    		 ver = "latest";
    	 }
    	 
    	 List<String> elms = getImageNameElements(image);
    	 String repo = elms.get(REPO);
    	 
    	 String url = IMAGES + "/" + image + "/tag" + "?repo=" + repo + "&tag=" + ver + "&force=" + f;
    	 
         JSONObject json = callRemoteApi(url,POST_METHOD);    
         // status codes: 
         //    201 - no error
         //    400 - bad parameter
         //    404 - no such image
         //    500 - server err
     }
}
