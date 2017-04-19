
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
	
package org.openecomp.ncomp.docker.adaptor.tools;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.openecomp.utils.YamlToJava;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllerModel;
import org.openecomp.ncomp.sirius.manager.controllermodel.ControllermodelFactory;
import org.openecomp.ncomp.sirius.manager.generator.ControllerGenerator;
import org.openecomp.ncomp.gwt.siriusportal.model.*;
import org.openecomp.ncomp.sirius.manager.server.ServerPackage;
import org.openecomp.ncomp.docker.DockerFactory;

public class Generator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ServerPackage f = ServerPackage.eINSTANCE;
		EObject o = DockerFactory.eINSTANCE.createDockerAdaptor();
		EPackage p = o.eClass().getEPackage();
		String dir = p.getNsURI().replaceAll(p.getNsPrefix() + '$', "") + "servers." + p.getNsPrefix();
		dir = "src/main/sirius-gen/" + dir.replace('.', '/');
		ControllerModel m = ControllermodelFactory.eINSTANCE.createControllerModel();
		m.setTemplateDirectory("../../ncomp.sirius.manager/ncomp-sirius-manager-generator/src/main/templates");
		m.setPrefix("Docker");
		m.setPluginName(p.getNsURI());
		m.setName("Docker");
		m.setTitle("Docker");
		ControllerGenerator g = new ControllerGenerator(o, m);
		g.setVersion("ONAP-R2");
		EObject h = DockerFactory.eINSTANCE.createDockerHost();
		g.addApi("host", h, m, false, true);
		g.setEnableIRequestHandler(false);
		g.setEnableISiriusPlugin(false);
		EObject gui = ModelFactory.eINSTANCE.createGuiClientApi();
		g.addObject("gui", gui, m);
		g.generate(dir);
		String pName = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".logging";
//		YamlToJava.convert("src/main/resources/DockerAdaptor.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/DockerAdaptor.yaml", dir + "/logging", pName);
		YamlToJava.convert("src/main/sirius-gen/DockerHost.yaml", dir + "/logging", pName);
		String pName1 = p.getNsURI().replaceAll(p.getNsPrefix()+'$',"") + "servers." + p.getNsPrefix() +".gui.logging";
		YamlToJava.convert("src/main/sirius-gen/GuiClientApi.yaml", dir + "/gui/logging", pName1);

	}

}
