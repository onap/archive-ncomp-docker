
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
 * A representation of the model object '<em><b>Network Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Container stats - JSON
 * 
 * 	{
 *      "read" : "2015-01-08T22:57:31.547920715Z",
 *      "networks": {
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
 *      "memory_stats" : {
 *         "stats" : {
 *            "total_pgmajfault" : 0,
 *            "cache" : 0,
 *            "mapped_file" : 0,
 *            "total_inactive_file" : 0,
 *            "pgpgout" : 414,
 *            "rss" : 6537216,
 *            "total_mapped_file" : 0,
 *            "writeback" : 0,
 *            "unevictable" : 0,
 *            "pgpgin" : 477,
 *            "total_unevictable" : 0,
 *            "pgmajfault" : 0,
 *            "total_rss" : 6537216,
 *            "total_rss_huge" : 6291456,
 *            "total_writeback" : 0,
 *            "total_inactive_anon" : 0,
 *            "rss_huge" : 6291456,
 *            "hierarchical_memory_limit" : 67108864,
 *            "total_pgfault" : 964,
 *            "total_active_file" : 0,
 *            "active_anon" : 6537216,
 *            "total_active_anon" : 6537216,
 *            "total_pgpgout" : 414,
 *            "total_cache" : 0,
 *            "inactive_anon" : 0,
 *            "active_file" : 0,
 *            "pgfault" : 964,
 *            "inactive_file" : 0,
 *            "total_pgpgin" : 477
 *         },
 *         "max_usage" : 6651904,
 *         "usage" : 6537216,
 *         "failcnt" : 0,
 *         "limit" : 67108864
 *      },
 *      "blkio_stats" : {},
 *      "cpu_stats" : {
 *         "cpu_usage" : {
 *            "percpu_usage" : [
 *               16970827,
 *               1839451,
 *               7107380,
 *               10571290
 *            ],
 *            "usage_in_usermode" : 10000000,
 *            "total_usage" : 36488948,
 *            "usage_in_kernelmode" : 20000000
 *         },
 *         "system_cpu_usage" : 20091722000000000,
 *         "throttling_data" : {}
 *      }
 *   }
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getRx_bytes <em>Rx bytes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getRx_dropped <em>Rx dropped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getRx_errors <em>Rx errors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getRx_packets <em>Rx packets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getTx_bytes <em>Tx bytes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getTx_dropped <em>Tx dropped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getTx_errors <em>Tx errors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.NetworkStats#getTx_packets <em>Tx packets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats()
 * @model
 * @generated
 */
public interface NetworkStats extends NamedEntity {
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Rx_bytes()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_bytes();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getRx_bytes <em>Rx bytes</em>}' attribute.
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Rx_dropped()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_dropped();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getRx_dropped <em>Rx dropped</em>}' attribute.
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Rx_errors()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_errors();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getRx_errors <em>Rx errors</em>}' attribute.
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Rx_packets()
	 * @model unique="false"
	 * @generated
	 */
	int getRx_packets();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getRx_packets <em>Rx packets</em>}' attribute.
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Tx_bytes()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_bytes();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getTx_bytes <em>Tx bytes</em>}' attribute.
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Tx_dropped()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_dropped();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getTx_dropped <em>Tx dropped</em>}' attribute.
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Tx_errors()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_errors();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getTx_errors <em>Tx errors</em>}' attribute.
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getNetworkStats_Tx_packets()
	 * @model unique="false"
	 * @generated
	 */
	int getTx_packets();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.NetworkStats#getTx_packets <em>Tx packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tx packets</em>' attribute.
	 * @see #getTx_packets()
	 * @generated
	 */
	void setTx_packets(int value);

} // NetworkStats
