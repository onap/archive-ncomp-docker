
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
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerHost#getUrl <em>Url</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerHost#getPollingFrequency <em>Polling Frequency</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerHost#isRemote <em>Remote</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerHost#getImages <em>Images</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerHost#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerHost#getNetworks <em>Networks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerHost()
 * @model
 * @generated
 */
public interface DockerHost extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerHost_Url()
	 * @model unique="false"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerHost#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Polling Frequency</b></em>' attribute.
	 * The default value is <code>"30000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Frequency</em>' attribute.
	 * @see #setPollingFrequency(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerHost_PollingFrequency()
	 * @model default="30000" unique="false"
	 * @generated
	 */
	long getPollingFrequency();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerHost#getPollingFrequency <em>Polling Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Frequency</em>' attribute.
	 * @see #getPollingFrequency()
	 * @generated
	 */
	void setPollingFrequency(long value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #setRemote(boolean)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerHost_Remote()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isRemote();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerHost#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #isRemote()
	 * @generated
	 */
	void setRemote(boolean value);

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerHost_Images()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerImage> getImages();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerContainer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerHost_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerContainer> getContainers();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.DockerNetwork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Networks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerHost_Networks()
	 * @model containment="true"
	 * @generated
	 */
	EList<DockerNetwork> getNetworks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void poll();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void startContainer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false" secondsUnique="false"
	 * @generated
	 */
	void stopContainer(String name, int seconds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false" secondsUnique="false"
	 * @generated
	 */
	void restartContainer(String name, int seconds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void pauseContainer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void unpauseContainer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false" removeUnique="false" forceUnique="false"
	 * @generated
	 */
	void removeContainer(String name, boolean remove, boolean force);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void inspectContainer(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false" sigintUnique="false"
	 * @generated
	 */
	void killContainer(String name, String sigint);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imageUnique="false"
	 * @generated
	 */
	void dockerRun(String image);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imageUnique="false" nameUnique="false"
	 * @generated
	 */
	void dockerRunWithName(String image, String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model imageUnique="false" optsUnique="false"
	 * @generated
	 */
	void dockerRunWithOptions(String image, ContainerOptions opts);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false" streamUnique="false"
	 * @generated
	 */
	void containerStats(String name, boolean stream);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameUnique="false"
	 * @generated
	 */
	void containerProcesses(String name);

} // DockerHost
