
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
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetwork#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetwork#getScope <em>Scope</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetwork#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetwork#getIPAM <em>IPAM</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetwork#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetwork#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetwork()
 * @model
 * @generated
 */
public interface DockerNetwork extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetwork_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetwork#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see #setScope(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetwork_Scope()
	 * @model unique="false"
	 * @generated
	 */
	String getScope();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetwork#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see #getScope()
	 * @generated
	 */
	void setScope(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Driver</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetwork_Driver()
	 * @model unique="false"
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetwork#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>IPAM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPAM</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPAM</em>' containment reference.
	 * @see #setIPAM(DockerIpam)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetwork_IPAM()
	 * @model containment="true"
	 * @generated
	 */
	DockerIpam getIPAM();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetwork#getIPAM <em>IPAM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPAM</em>' containment reference.
	 * @see #getIPAM()
	 * @generated
	 */
	void setIPAM(DockerIpam value);

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerNetworkContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetwork_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerNetworkContainer> getContainers();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerKeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetwork_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerKeyPair> getOptions();

} // DockerNetwork
