
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
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getRepoTags <em>Repo Tags</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getRepoDigests <em>Repo Digests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getDockerCreated <em>Docker Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getSize <em>Size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getVirtualSize <em>Virtual Size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerImage#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage()
 * @model
 * @generated
 */
public interface DockerImage extends NamedEntity {
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
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_Id()
	 * @model unique="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerImage#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Id</em>' attribute.
	 * @see #setParentId(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_ParentId()
	 * @model unique="false"
	 * @generated
	 */
	String getParentId();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerImage#getParentId <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Id</em>' attribute.
	 * @see #getParentId()
	 * @generated
	 */
	void setParentId(String value);

	/**
	 * Returns the value of the '<em><b>Repo Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo Tags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo Tags</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_RepoTags()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRepoTags();

	/**
	 * Returns the value of the '<em><b>Repo Digests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo Digests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo Digests</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_RepoDigests()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getRepoDigests();

	/**
	 * Returns the value of the '<em><b>Docker Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Docker Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Docker Created</em>' attribute.
	 * @see #setDockerCreated(Date)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_DockerCreated()
	 * @model unique="false"
	 * @generated
	 */
	Date getDockerCreated();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerImage#getDockerCreated <em>Docker Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Docker Created</em>' attribute.
	 * @see #getDockerCreated()
	 * @generated
	 */
	void setDockerCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_Size()
	 * @model unique="false"
	 * @generated
	 */
	Long getSize();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerImage#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Long value);

	/**
	 * Returns the value of the '<em><b>Virtual Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Size</em>' attribute.
	 * @see #setVirtualSize(Long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_VirtualSize()
	 * @model unique="false"
	 * @generated
	 */
	Long getVirtualSize();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerImage#getVirtualSize <em>Virtual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Size</em>' attribute.
	 * @see #getVirtualSize()
	 * @generated
	 */
	void setVirtualSize(Long value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Labels</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerImage_Labels()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getLabels();

} // DockerImage
