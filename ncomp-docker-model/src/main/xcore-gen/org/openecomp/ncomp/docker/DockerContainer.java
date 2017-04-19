
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
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getNames <em>Names</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getImage <em>Image</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getImageID <em>Image ID</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getCommand <em>Command</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getDockerCreated <em>Docker Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getHostConfig <em>Host Config</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getMounts <em>Mounts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getStats <em>Stats</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerContainer#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer()
 * @model
 * @generated
 */
public interface DockerContainer extends NamedEntity {
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainer#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Names</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Names()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getNames();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Image()
	 * @model unique="false"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainer#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Image ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image ID</em>' attribute.
	 * @see #setImageID(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_ImageID()
	 * @model unique="false"
	 * @generated
	 */
	String getImageID();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainer#getImageID <em>Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image ID</em>' attribute.
	 * @see #getImageID()
	 * @generated
	 */
	void setImageID(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Command()
	 * @model unique="false"
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainer#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

	/**
	 * Returns the value of the '<em><b>Docker Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Created</em>' attribute.
	 * @see #setDockerCreated(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_DockerCreated()
	 * @model unique="false"
	 * @generated
	 */
	String getDockerCreated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainer#getDockerCreated <em>Docker Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Created</em>' attribute.
	 * @see #getDockerCreated()
	 * @generated
	 */
	void setDockerCreated(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerPort> getPorts();

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerKeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Labels()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerKeyPair> getLabels();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Status()
	 * @model unique="false"
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainer#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Host Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerKeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Config</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_HostConfig()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerKeyPair> getHostConfig();

	/**
	 * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerProcess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processes</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Processes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerProcess> getProcesses();

	/**
	 * Returns the value of the '<em><b>Mounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerMount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mounts</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Mounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerMount> getMounts();

	/**
	 * Returns the value of the '<em><b>Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stats</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stats</em>' containment reference.
	 * @see #setStats(DockerContainerStats)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Stats()
	 * @model containment="true"
	 * @generated
	 */
	DockerContainerStats getStats();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerContainer#getStats <em>Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stats</em>' containment reference.
	 * @see #getStats()
	 * @generated
	 */
	void setStats(DockerContainerStats value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerEvents}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerContainer_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerEvents> getEvents();

} // DockerContainer
