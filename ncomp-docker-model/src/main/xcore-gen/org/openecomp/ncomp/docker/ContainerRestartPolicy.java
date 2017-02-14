
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Restart Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerRestartPolicy#getNm <em>Nm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerRestartPolicy#getMaxRetryCnt <em>Max Retry Cnt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerRestartPolicy()
 * @model
 * @generated
 */
public interface ContainerRestartPolicy extends EObject {
	/**
	 * Returns the value of the '<em><b>Nm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nm</em>' attribute.
	 * @see #setNm(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerRestartPolicy_Nm()
	 * @model unique="false"
	 * @generated
	 */
	String getNm();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerRestartPolicy#getNm <em>Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nm</em>' attribute.
	 * @see #getNm()
	 * @generated
	 */
	void setNm(String value);

	/**
	 * Returns the value of the '<em><b>Max Retry Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Retry Cnt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Retry Cnt</em>' attribute.
	 * @see #setMaxRetryCnt(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerRestartPolicy_MaxRetryCnt()
	 * @model unique="false"
	 * @generated
	 */
	int getMaxRetryCnt();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerRestartPolicy#getMaxRetryCnt <em>Max Retry Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Retry Cnt</em>' attribute.
	 * @see #getMaxRetryCnt()
	 * @generated
	 */
	void setMaxRetryCnt(int value);

} // ContainerRestartPolicy
