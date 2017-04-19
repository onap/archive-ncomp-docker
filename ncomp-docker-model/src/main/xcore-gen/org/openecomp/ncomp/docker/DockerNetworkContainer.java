
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
 * A representation of the model object '<em><b>Network Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getEndpointID <em>Endpoint ID</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getMacAddress <em>Mac Address</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetworkContainer()
 * @model
 * @generated
 */
public interface DockerNetworkContainer extends EObject {
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetworkContainer_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>IPv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPv4 Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPv4 Address</em>' attribute.
	 * @see #setIPv4Address(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetworkContainer_IPv4Address()
	 * @model unique="false"
	 * @generated
	 */
	String getIPv4Address();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv4Address <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv4 Address</em>' attribute.
	 * @see #getIPv4Address()
	 * @generated
	 */
	void setIPv4Address(String value);

	/**
	 * Returns the value of the '<em><b>IPv6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IPv6 Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IPv6 Address</em>' attribute.
	 * @see #setIPv6Address(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetworkContainer_IPv6Address()
	 * @model unique="false"
	 * @generated
	 */
	String getIPv6Address();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv6Address <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPv6 Address</em>' attribute.
	 * @see #getIPv6Address()
	 * @generated
	 */
	void setIPv6Address(String value);

	/**
	 * Returns the value of the '<em><b>Endpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint ID</em>' attribute.
	 * @see #setEndpointID(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetworkContainer_EndpointID()
	 * @model unique="false"
	 * @generated
	 */
	String getEndpointID();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getEndpointID <em>Endpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint ID</em>' attribute.
	 * @see #getEndpointID()
	 * @generated
	 */
	void setEndpointID(String value);

	/**
	 * Returns the value of the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mac Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mac Address</em>' attribute.
	 * @see #setMacAddress(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerNetworkContainer_MacAddress()
	 * @model unique="false"
	 * @generated
	 */
	String getMacAddress();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getMacAddress <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mac Address</em>' attribute.
	 * @see #getMacAddress()
	 * @generated
	 */
	void setMacAddress(String value);

} // DockerNetworkContainer
