
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
 * A representation of the model object '<em><b>Container Cpu Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 	"cpu_stats" : {
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
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getPercpu_usage <em>Percpu usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getUsage_in_usermode <em>Usage in usermode</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getTotal_usage <em>Total usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getUser_in_kernelmode <em>User in kernelmode</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuUsage()
 * @model
 * @generated
 */
public interface ContainerCpuUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Percpu usage</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percpu usage</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percpu usage</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuUsage_Percpu_usage()
	 * @model unique="false"
	 * @generated
	 */
	EList<Long> getPercpu_usage();

	/**
	 * Returns the value of the '<em><b>Usage in usermode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage in usermode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage in usermode</em>' attribute.
	 * @see #setUsage_in_usermode(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuUsage_Usage_in_usermode()
	 * @model unique="false"
	 * @generated
	 */
	long getUsage_in_usermode();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getUsage_in_usermode <em>Usage in usermode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage in usermode</em>' attribute.
	 * @see #getUsage_in_usermode()
	 * @generated
	 */
	void setUsage_in_usermode(long value);

	/**
	 * Returns the value of the '<em><b>Total usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total usage</em>' attribute.
	 * @see #setTotal_usage(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuUsage_Total_usage()
	 * @model unique="false"
	 * @generated
	 */
	long getTotal_usage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getTotal_usage <em>Total usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total usage</em>' attribute.
	 * @see #getTotal_usage()
	 * @generated
	 */
	void setTotal_usage(long value);

	/**
	 * Returns the value of the '<em><b>User in kernelmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User in kernelmode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User in kernelmode</em>' attribute.
	 * @see #setUser_in_kernelmode(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuUsage_User_in_kernelmode()
	 * @model unique="false"
	 * @generated
	 */
	long getUser_in_kernelmode();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getUser_in_kernelmode <em>User in kernelmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User in kernelmode</em>' attribute.
	 * @see #getUser_in_kernelmode()
	 * @generated
	 */
	void setUser_in_kernelmode(long value);

} // ContainerCpuUsage
