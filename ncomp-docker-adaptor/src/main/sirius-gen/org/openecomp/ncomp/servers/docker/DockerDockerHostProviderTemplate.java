
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





import java.io.InputStream;

import org.openecomp.ncomp.sirius.manager.IRequestHandler;
import org.openecomp.ncomp.sirius.manager.ISiriusPlugin;
import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.function.FunctionUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONObject;



import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;


import org.openecomp.ncomp.docker.impl.DockerHostImpl;
import org.openecomp.ncomp.docker.DockerHost;


public class DockerDockerHostProviderTemplate extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(DockerDockerHostProviderTemplate.class);
	DockerHost o;

	public DockerDockerHostProviderTemplate(ISiriusServer controller, DockerHost o) {
		super(controller, o);
		this.o = o;
	}

	public void poll() {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void startContainer(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void stopContainer(java.lang.String name, int seconds) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void restartContainer(java.lang.String name, int seconds) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void pauseContainer(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void unpauseContainer(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void removeContainer(java.lang.String name, boolean remove, boolean force) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void inspectContainer(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void killContainer(java.lang.String name, java.lang.String sigint) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void dockerRun(java.lang.String image) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void dockerRunWithName(java.lang.String image, java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void dockerRunWithOptions(java.lang.String image, org.openecomp.ncomp.docker.ContainerOptions opts) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void containerStats(java.lang.String name, boolean stream) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}

	public void containerProcesses(java.lang.String name) {
		
     // TODO IMPLEMENT
     throw new UnsupportedOperationException();
	}







	
}
