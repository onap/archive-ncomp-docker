
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
	
/**
 */
package org.openecomp.ncomp.docker;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adaptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerAdaptor#getDockerHosts <em>Docker Hosts</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerAdaptor()
 * @model
 * @generated
 */
public interface DockerAdaptor extends EObject {

	/**
	 * Returns the value of the '<em><b>Docker Hosts</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerHost}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Hosts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Hosts</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerAdaptor_DockerHosts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerHost> getDockerHosts();
} // DockerAdaptor
