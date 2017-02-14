
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

import org.openecomp.ncomp.docker.ContainerOptions;
import org.openecomp.ncomp.docker.ContainerPortBindings;
import org.openecomp.ncomp.docker.ContainerRestartPolicy;
import org.openecomp.ncomp.docker.DockerFactory;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.ManagementServer;

import java.util.List;
import java.util.ArrayList;

public class TestDockerRun implements ISiriusServer {
	
	private ManagementServer server;
	
	public static void main(String[] args) {
		TestDockerRun t = new TestDockerRun();
	    String dockerRegistry = "cdf-2.novalocal:7113";
		String dockerImage = "dcae-controller-sdnlocal";
		String dockerImageTag = "latest";
		String image = dockerRegistry + "/" + dockerImage + ":" + dockerImageTag;	

		t.dockerRun(image);
	}
	
	private void dockerRun(String image) {
		server = new ManagementServer();
		DockerDockerHost dockerd = new DockerDockerHost(this);
		boolean withOpts = true;
		
		if (withOpts) {
			ContainerOptions opts = DockerFactory.eINSTANCE.createContainerOptions();
			
			// explicit port mapping
			ContainerPortBindings portBinds = DockerFactory.eINSTANCE.createContainerPortBindings();
			portBinds.setContainerPort(27001);
			portBinds.setProtocol("tcp");
			portBinds.setVmPort(27001);
			opts.getPortBindings().add(portBinds);
			
			// container name
			opts.setName("kens_folly");
			
			// vm to container volume mapping
			opts.getVolumes().add("/var/log:/opt/app/logs");
	
			// publish exposed ports to an ephemeral vm port
			opts.setPublishAllPorts(true);
			
			// set the containerName equal to the VM name
			opts.setSetContainerName(true);;
			
			// set restart policy 
			// if the docker engine is stopped and containers killed - this will 
			// instruct the docker engine to restart those containers when it 
			// is brought back up
			ContainerRestartPolicy restartPolicy = DockerFactory.eINSTANCE.createContainerRestartPolicy();
			restartPolicy.setNm("always");
			restartPolicy.setMaxRetryCnt(0);
			opts.setAutoRestart(restartPolicy);
		
			// add some environment variables
			List<String> rtEnv = new ArrayList<>();		
			rtEnv.add("FOO=bar");
			rtEnv.add("BAR=baz");
			rtEnv.add("BAz=foo");			
			opts.getEnv().addAll(rtEnv);
	
			dockerd.dockerRunWithOptions(image, opts);
		} else {
			dockerd.dockerRunWithName(image, "kens_folly");
		}
	}
	
	@Override
	public ManagementServer getServer() {
		return server;
	}

}
