
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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Port Bindings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerPortBindings#getContainerPort <em>Container Port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerPortBindings#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerPortBindings#getVmPort <em>Vm Port</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerPortBindings()
 * @model
 * @generated
 */
public interface ContainerPortBindings extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Port</em>' attribute.
	 * @see #setContainerPort(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerPortBindings_ContainerPort()
	 * @model unique="false"
	 * @generated
	 */
	int getContainerPort();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerPortBindings#getContainerPort <em>Container Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Port</em>' attribute.
	 * @see #getContainerPort()
	 * @generated
	 */
	void setContainerPort(int value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol</em>' attribute.
	 * @see #setProtocol(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerPortBindings_Protocol()
	 * @model unique="false"
	 * @generated
	 */
	String getProtocol();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerPortBindings#getProtocol <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol</em>' attribute.
	 * @see #getProtocol()
	 * @generated
	 */
	void setProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Vm Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Port</em>' attribute.
	 * @see #setVmPort(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerPortBindings_VmPort()
	 * @model unique="false"
	 * @generated
	 */
	int getVmPort();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerPortBindings#getVmPort <em>Vm Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Port</em>' attribute.
	 * @see #getVmPort()
	 * @generated
	 */
	void setVmPort(int value);

} // ContainerPortBindings
