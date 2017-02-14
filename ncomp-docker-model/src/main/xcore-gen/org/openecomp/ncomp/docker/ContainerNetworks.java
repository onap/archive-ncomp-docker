
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
 * A representation of the model object '<em><b>Container Networks</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *    "networks": {
 *              "eth0": {
 *                  "rx_bytes": 5338,
 *                  "rx_dropped": 0,
 *                  "rx_errors": 0,
 *                  "rx_packets": 36,
 *                  "tx_bytes": 648,
 *                  "tx_dropped": 0,
 *                  "tx_errors": 0,
 *                  "tx_packets": 8
 *              },
 *              "eth5": {
 *                  "rx_bytes": 4641,
 *                  "rx_dropped": 0,
 *                  "rx_errors": 0,
 *                  "rx_packets": 26,
 *                  "tx_bytes": 690,
 *                  "tx_dropped": 0,
 *                  "tx_errors": 0,
 *                  "tx_packets": 9
 *              }
 *      },
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworks#getNetwork <em>Network</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworks#getNetworkStats <em>Network Stats</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworks()
 * @model
 * @generated
 */
public interface ContainerNetworks extends EObject {

	/**
	 * Returns the value of the '<em><b>Network</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' attribute.
	 * @see #setNetwork(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworks_Network()
	 * @model unique="false"
	 * @generated
	 */
	String getNetwork();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworks#getNetwork <em>Network</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network</em>' attribute.
	 * @see #getNetwork()
	 * @generated
	 */
	void setNetwork(String value);

	/**
	 * Returns the value of the '<em><b>Network Stats</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.ContainerNetworkStats}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Stats</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Stats</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworks_NetworkStats()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerNetworkStats> getNetworkStats();
} // ContainerNetworks
