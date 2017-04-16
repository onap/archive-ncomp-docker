
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
 * A representation of the model object '<em><b>Container Memory Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getMemstats <em>Memstats</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getMax_usage <em>Max usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getFailcnt <em>Failcnt</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryUsage()
 * @model
 * @generated
 */
public interface ContainerMemoryUsage extends EObject {
	/**
	 * Returns the value of the '<em><b>Memstats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memstats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memstats</em>' containment reference.
	 * @see #setMemstats(ContainerMemoryStats)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryUsage_Memstats()
	 * @model containment="true"
	 * @generated
	 */
	ContainerMemoryStats getMemstats();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getMemstats <em>Memstats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memstats</em>' containment reference.
	 * @see #getMemstats()
	 * @generated
	 */
	void setMemstats(ContainerMemoryStats value);

	/**
	 * Returns the value of the '<em><b>Max usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max usage</em>' attribute.
	 * @see #setMax_usage(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryUsage_Max_usage()
	 * @model unique="false"
	 * @generated
	 */
	int getMax_usage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getMax_usage <em>Max usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max usage</em>' attribute.
	 * @see #getMax_usage()
	 * @generated
	 */
	void setMax_usage(int value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see #setUsage(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryUsage_Usage()
	 * @model unique="false"
	 * @generated
	 */
	int getUsage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(int value);

	/**
	 * Returns the value of the '<em><b>Failcnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failcnt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failcnt</em>' attribute.
	 * @see #setFailcnt(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryUsage_Failcnt()
	 * @model unique="false"
	 * @generated
	 */
	int getFailcnt();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getFailcnt <em>Failcnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failcnt</em>' attribute.
	 * @see #getFailcnt()
	 * @generated
	 */
	void setFailcnt(int value);

	/**
	 * Returns the value of the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Limit</em>' attribute.
	 * @see #setLimit(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryUsage_Limit()
	 * @model unique="false"
	 * @generated
	 */
	int getLimit();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getLimit <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Limit</em>' attribute.
	 * @see #getLimit()
	 * @generated
	 */
	void setLimit(int value);

} // ContainerMemoryUsage
