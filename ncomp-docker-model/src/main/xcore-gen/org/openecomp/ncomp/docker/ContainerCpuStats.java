
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
 * A representation of the model object '<em><b>Container Cpu Stats</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerCpuStats#getCpu_usage <em>Cpu usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerCpuStats#getSystem_cpu_usage <em>System cpu usage</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuStats()
 * @model
 * @generated
 */
public interface ContainerCpuStats extends EObject {
	/**
	 * Returns the value of the '<em><b>Cpu usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu usage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu usage</em>' containment reference.
	 * @see #setCpu_usage(ContainerCpuUsage)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuStats_Cpu_usage()
	 * @model containment="true"
	 * @generated
	 */
	ContainerCpuUsage getCpu_usage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerCpuStats#getCpu_usage <em>Cpu usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu usage</em>' containment reference.
	 * @see #getCpu_usage()
	 * @generated
	 */
	void setCpu_usage(ContainerCpuUsage value);

	/**
	 * Returns the value of the '<em><b>System cpu usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System cpu usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System cpu usage</em>' attribute.
	 * @see #setSystem_cpu_usage(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerCpuStats_System_cpu_usage()
	 * @model unique="false"
	 * @generated
	 */
	long getSystem_cpu_usage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerCpuStats#getSystem_cpu_usage <em>System cpu usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System cpu usage</em>' attribute.
	 * @see #getSystem_cpu_usage()
	 * @generated
	 */
	void setSystem_cpu_usage(long value);

} // ContainerCpuStats
