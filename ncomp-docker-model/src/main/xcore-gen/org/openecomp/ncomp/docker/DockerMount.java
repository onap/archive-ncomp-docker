
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
 * A representation of the model object '<em><b>Mount</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerMount#getSource <em>Source</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerMount#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerMount#getMode <em>Mode</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerMount#getRW <em>RW</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerMount#getPropagation <em>Propagation</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerMount()
 * @model
 * @generated
 */
public interface DockerMount extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerMount_Source()
	 * @model unique="false"
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerMount#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerMount_Destination()
	 * @model unique="false"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerMount#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerMount_Mode()
	 * @model unique="false"
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerMount#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>RW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RW</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RW</em>' attribute.
	 * @see #setRW(Boolean)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerMount_RW()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getRW();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerMount#getRW <em>RW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RW</em>' attribute.
	 * @see #getRW()
	 * @generated
	 */
	void setRW(Boolean value);

	/**
	 * Returns the value of the '<em><b>Propagation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagation</em>' attribute.
	 * @see #setPropagation(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerMount_Propagation()
	 * @model unique="false"
	 * @generated
	 */
	String getPropagation();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerMount#getPropagation <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation</em>' attribute.
	 * @see #getPropagation()
	 * @generated
	 */
	void setPropagation(String value);

} // DockerMount
