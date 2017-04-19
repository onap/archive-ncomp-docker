
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
 * A representation of the model object '<em><b>Container Network Stats</b></em>'.
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
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getIntf <em>Intf</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_bytes <em>Rx bytes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_dropped <em>Rx dropped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_errors <em>Rx errors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_packets <em>Rx packets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_bytes <em>Tx bytes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_dropped <em>Tx dropped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_errors <em>Tx errors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_packets <em>Tx packets</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats()
 * @model
 * @generated
 */
public interface ContainerNetworkStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Intf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intf</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intf</em>' attribute.
	 * @see #setIntf(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Intf()
	 * @model unique="false"
	 * @generated
	 */
	String getIntf();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getIntf <em>Intf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intf</em>' attribute.
	 * @see #getIntf()
	 * @generated
	 */
	void setIntf(String value);

	/**
	 * Returns the value of the '<em><b>Rx bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx bytes</em>' attribute.
	 * @see #setRx_bytes(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Rx_bytes()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_bytes();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_bytes <em>Rx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx bytes</em>' attribute.
	 * @see #getRx_bytes()
	 * @generated
	 */
	void setRx_bytes(int value);

	/**
	 * Returns the value of the '<em><b>Rx dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx dropped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx dropped</em>' attribute.
	 * @see #setRx_dropped(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Rx_dropped()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_dropped();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_dropped <em>Rx dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx dropped</em>' attribute.
	 * @see #getRx_dropped()
	 * @generated
	 */
	void setRx_dropped(int value);

	/**
	 * Returns the value of the '<em><b>Rx errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx errors</em>' attribute.
	 * @see #setRx_errors(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Rx_errors()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_errors();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_errors <em>Rx errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx errors</em>' attribute.
	 * @see #getRx_errors()
	 * @generated
	 */
	void setRx_errors(int value);

	/**
	 * Returns the value of the '<em><b>Rx packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rx packets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rx packets</em>' attribute.
	 * @see #setRx_packets(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Rx_packets()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_packets();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_packets <em>Rx packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rx packets</em>' attribute.
	 * @see #getRx_packets()
	 * @generated
	 */
	void setRx_packets(int value);

	/**
	 * Returns the value of the '<em><b>Tx bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx bytes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx bytes</em>' attribute.
	 * @see #setTx_bytes(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Tx_bytes()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_bytes();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_bytes <em>Tx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx bytes</em>' attribute.
	 * @see #getTx_bytes()
	 * @generated
	 */
	void setTx_bytes(int value);

	/**
	 * Returns the value of the '<em><b>Tx dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx dropped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx dropped</em>' attribute.
	 * @see #setTx_dropped(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Tx_dropped()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_dropped();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_dropped <em>Tx dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx dropped</em>' attribute.
	 * @see #getTx_dropped()
	 * @generated
	 */
	void setTx_dropped(int value);

	/**
	 * Returns the value of the '<em><b>Tx errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx errors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx errors</em>' attribute.
	 * @see #setTx_errors(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Tx_errors()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_errors();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_errors <em>Tx errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx errors</em>' attribute.
	 * @see #getTx_errors()
	 * @generated
	 */
	void setTx_errors(int value);

	/**
	 * Returns the value of the '<em><b>Tx packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tx packets</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tx packets</em>' attribute.
	 * @see #setTx_packets(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerNetworkStats_Tx_packets()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_packets();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_packets <em>Tx packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx packets</em>' attribute.
	 * @see #getTx_packets()
	 * @generated
	 */
	void setTx_packets(int value);

} // ContainerNetworkStats
