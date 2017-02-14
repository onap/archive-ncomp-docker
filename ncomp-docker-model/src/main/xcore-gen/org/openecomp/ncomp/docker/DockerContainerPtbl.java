
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

import org.openecomp.ncomp.core.NamedEntity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Ptbl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * docker container process table json
 * 
 * {
 *   "Titles" : [
 *     "USER","PID","%CPU","%MEM","VSZ","RSS","TTY","STAT","START","TIME","COMMAND"
 *   ]
 *   "Processes" : [
 *     [
 *       "root","13642","0.0","0.1","18172","3184","pts/0","Ss","17:03","0:00","/bin/bash"
 *     ],
 *     [
 *       "root","13895","0.0","0.0","4348","692","pts/0","S+","17:15","0:00","sleep 10"
 *     ]
 *  ],
 * }
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainerPtbl#getTitles <em>Titles</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainerPtbl#getProcesses <em>Processes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerPtbl()
 * @model
 * @generated
 */
public interface DockerContainerPtbl extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Titles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Titles</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titles</em>' containment reference.
	 * @see #setTitles(DockerContainerPtblTitles)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerPtbl_Titles()
	 * @model containment="true"
	 * @generated
	 */
	DockerContainerPtblTitles getTitles();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainerPtbl#getTitles <em>Titles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titles</em>' containment reference.
	 * @see #getTitles()
	 * @generated
	 */
	void setTitles(DockerContainerPtblTitles value);

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerContainerPtblProcesses}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerPtbl_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerContainerPtblProcesses> getProcesses();

} // DockerContainerPtbl
