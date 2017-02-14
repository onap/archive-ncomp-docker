
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

public class TestDockerRunLinks implements ISiriusServer {
	
	private ManagementServer server;
	
	public static void main(String[] args) {
		
		TestDockerRunLinks t = new TestDockerRunLinks();
		
		String dockerRegistry = "cdf-2.novalocal:7113";
		String dockerImage = "dcae-mysql";
		String dockerImageTag = "5.7";
		String image = dockerRegistry + "/" + dockerImage + ":" + dockerImageTag;	
		
		ContainerOptions opts = DockerFactory.eINSTANCE.createContainerOptions();
		
		String containerName = dockerImage + "_kens_test";
		
		// container name
		opts.setName(containerName);
		
		// vm to container volume mapping
		opts.getVolumes().add("/var/log:/opt/app/logs");

		// publish exposed ports to an ephemeral vm port
		opts.setPublishAllPorts(true);
		
		// set restart policy 
		// if the docker engine is stopped and containers killed - this will 
		// instruct the docker engine to restart those containers when it 
		// is brought back up
		ContainerRestartPolicy restartPolicy = DockerFactory.eINSTANCE.createContainerRestartPolicy();
		restartPolicy.setNm("always");
		restartPolicy.setMaxRetryCnt(0);
		opts.setAutoRestart(restartPolicy);
		
		// mysql runtime arguments
		// not really necessary because we set these in the Dockerfile
		/*
		opts.getEnv().add("MYSQL_USER=nmsadm");
		opts.getEnv().add("MYSQL_PASSWORD=nmsadm");
		opts.getEnv().add("MYSQL_DATABASE=ucsnmp");
		opts.getEnv().add("MYSQL_ROOT_PASSWORD=dcae");
		*/

		System.err.println("Starting first container " + opts.getName() + " ...");
		t.dockerRun(image,opts);
		
		// create container to link to the previous one
		ContainerOptions linkOpts = DockerFactory.eINSTANCE.createContainerOptions();
		String linkedImage = dockerRegistry + "/" + "dcae-controller-snmptrap" + ":" + "5.7";
		linkOpts.getLinks().add(containerName + ":" + "mysql");
		linkOpts.setName("dcae-controller-snmptrap" + "_kens_test");
		linkOpts.setPublishAllPorts(true);
			
		System.err.println("Starting second container " + opts.getName() + " ...");
		t.dockerRun(linkedImage,linkOpts);
		
	}
	
	private void dockerRun(String image, ContainerOptions opts) {
		server = new ManagementServer();
		DockerDockerHost dockerd = new DockerDockerHost(this);
		
		dockerd.dockerRunWithOptions(image, opts);
	}
	
	@Override
	public ManagementServer getServer() {
		return server;
	}

}
