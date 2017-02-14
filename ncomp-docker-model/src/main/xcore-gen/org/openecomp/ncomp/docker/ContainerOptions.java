
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
 * A representation of the model object '<em><b>Container Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#getImageNm <em>Image Nm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#getEnv <em>Env</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#isSetContainerName <em>Set Container Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#isPublishAllPorts <em>Publish All Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#getPortBindings <em>Port Bindings</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerOptions#getAutoRestart <em>Auto Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions()
 * @model
 * @generated
 */
public interface ContainerOptions extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Image Nm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Nm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Nm</em>' attribute.
	 * @see #setImageNm(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_ImageNm()
	 * @model unique="false"
	 * @generated
	 */
	String getImageNm();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerOptions#getImageNm <em>Image Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Nm</em>' attribute.
	 * @see #getImageNm()
	 * @generated
	 */
	void setImageNm(String value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_Env()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getEnv();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volumes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_Volumes()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getVolumes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_Links()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLinks();

	/**
	 * Returns the value of the '<em><b>Set Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Container Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Container Name</em>' attribute.
	 * @see #setSetContainerName(boolean)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_SetContainerName()
	 * @model unique="false"
	 * @generated
	 */
	boolean isSetContainerName();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerOptions#isSetContainerName <em>Set Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Container Name</em>' attribute.
	 * @see #isSetContainerName()
	 * @generated
	 */
	void setSetContainerName(boolean value);

	/**
	 * Returns the value of the '<em><b>Publish All Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish All Ports</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish All Ports</em>' attribute.
	 * @see #setPublishAllPorts(boolean)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_PublishAllPorts()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPublishAllPorts();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerOptions#isPublishAllPorts <em>Publish All Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish All Ports</em>' attribute.
	 * @see #isPublishAllPorts()
	 * @generated
	 */
	void setPublishAllPorts(boolean value);

	/**
	 * Returns the value of the '<em><b>Port Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.docker.ContainerPortBindings}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Bindings</em>' containment reference list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_PortBindings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerPortBindings> getPortBindings();

	/**
	 * Returns the value of the '<em><b>Auto Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Restart</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Restart</em>' containment reference.
	 * @see #setAutoRestart(ContainerRestartPolicy)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerOptions_AutoRestart()
	 * @model containment="true"
	 * @generated
	 */
	ContainerRestartPolicy getAutoRestart();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerOptions#getAutoRestart <em>Auto Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Restart</em>' containment reference.
	 * @see #getAutoRestart()
	 * @generated
	 */
	void setAutoRestart(ContainerRestartPolicy value);

} // ContainerOptions
