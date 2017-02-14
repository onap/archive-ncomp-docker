
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
	
// Autogenerated
// Do not edit but extend this class as needed
package org.openecomp.ncomp.servers.docker;


import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;

import org.openecomp.ncomp.sirius.manager.console.Console;
import org.openecomp.ncomp.sirius.manager.AbstractClient;
import org.openecomp.ncomp.sirius.manager.ManagementServerError;




public class DockerDockerHostConsole extends Console {
	public static final Logger logger = Logger.getLogger(DockerDockerHostConsole.class);
    protected DockerDockerHostClient controller;
    



    public DockerDockerHostConsole(String filename, String name) {
            super(filename, name);
            controller = new DockerDockerHostClient(filename,name);
            client = controller.client;

    }
    
	public DockerDockerHostConsole(AbstractClient c) {
        controller = new DockerDockerHostClient(c);
        client = controller.client;
    }


	public void poll(String path) {
		
		try {
			 controller.poll(path);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void startContainer(String path, java.lang.String name) {
		
		try {
			 controller.startContainer(path,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void stopContainer(String path, java.lang.String name, int seconds) {
		
		try {
			 controller.stopContainer(path,name,seconds);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void restartContainer(String path, java.lang.String name, int seconds) {
		
		try {
			 controller.restartContainer(path,name,seconds);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void pauseContainer(String path, java.lang.String name) {
		
		try {
			 controller.pauseContainer(path,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void unpauseContainer(String path, java.lang.String name) {
		
		try {
			 controller.unpauseContainer(path,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void removeContainer(String path, java.lang.String name, boolean remove, boolean force) {
		
		try {
			 controller.removeContainer(path,name,remove,force);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void inspectContainer(String path, java.lang.String name) {
		
		try {
			 controller.inspectContainer(path,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void killContainer(String path, java.lang.String name, java.lang.String sigint) {
		
		try {
			 controller.killContainer(path,name,sigint);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void dockerRun(String path, java.lang.String image) {
		
		try {
			 controller.dockerRun(path,image);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void dockerRunWithName(String path, java.lang.String image, java.lang.String name) {
		
		try {
			 controller.dockerRunWithName(path,image,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void dockerRunWithOptions(String path, java.lang.String image, org.openecomp.ncomp.docker.ContainerOptions opts) {
		
		try {
			 controller.dockerRunWithOptions(path,image,opts);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void containerStats(String path, java.lang.String name, boolean stream) {
		
		try {
			 controller.containerStats(path,name,stream);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

	public void containerProcesses(String path, java.lang.String name) {
		
		try {
			 controller.containerProcesses(path,name);
		}
		catch (ManagementServerError e) {
			System.err.println("ERROR: " + e.getJson().toString(2));
		}
		
	}

}