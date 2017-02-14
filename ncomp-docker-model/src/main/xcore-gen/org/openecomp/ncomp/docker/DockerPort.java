
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
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerPort#getPrivatePort <em>Private Port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerPort#getPublicPort <em>Public Port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerPort#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerPort()
 * @model
 * @generated
 */
public interface DockerPort extends EObject {
	/**
	 * Returns the value of the '<em><b>Private Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Port</em>' attribute.
	 * @see #setPrivatePort(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerPort_PrivatePort()
	 * @model unique="false"
	 * @generated
	 */
	int getPrivatePort();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerPort#getPrivatePort <em>Private Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Port</em>' attribute.
	 * @see #getPrivatePort()
	 * @generated
	 */
	void setPrivatePort(int value);

	/**
	 * Returns the value of the '<em><b>Public Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Port</em>' attribute.
	 * @see #setPublicPort(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerPort_PublicPort()
	 * @model unique="false"
	 * @generated
	 */
	int getPublicPort();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerPort#getPublicPort <em>Public Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Port</em>' attribute.
	 * @see #getPublicPort()
	 * @generated
	 */
	void setPublicPort(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerPort_Type()
	 * @model unique="false"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerPort#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // DockerPort
