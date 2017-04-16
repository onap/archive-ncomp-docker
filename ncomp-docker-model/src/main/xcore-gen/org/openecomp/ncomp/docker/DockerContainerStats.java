
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
import java.util.Date;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Stats</b></em>'.
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
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainerStats#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainerStats#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainerStats#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainerStats#getLastRead <em>Last Read</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerStats()
 * @model
 * @generated
 */
public interface DockerContainerStats extends NamedEntity {

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.ContainerNetworkStats}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerStats_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerNetworkStats> getNetworks();

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' containment reference.
	 * @see #setMemory(ContainerMemoryUsage)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerStats_Memory()
	 * @model containment="true"
	 * @generated
	 */
	ContainerMemoryUsage getMemory();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainerStats#getMemory <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' containment reference.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(ContainerMemoryUsage value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' containment reference.
	 * @see #setCpu(ContainerCpuStats)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerStats_Cpu()
	 * @model containment="true"
	 * @generated
	 */
	ContainerCpuStats getCpu();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainerStats#getCpu <em>Cpu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' containment reference.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(ContainerCpuStats value);

	/**
	 * Returns the value of the '<em><b>Last Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Read</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Read</em>' attribute.
	 * @see #setLastRead(Date)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainerStats_LastRead()
	 * @model unique="false"
	 * @generated
	 */
	Date getLastRead();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainerStats#getLastRead <em>Last Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Read</em>' attribute.
	 * @see #getLastRead()
	 * @generated
	 */
	void setLastRead(Date value);
} // DockerContainerStats
