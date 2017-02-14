
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
package org.openecomp.ncomp.docker.impl;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import org.openecomp.ncomp.docker.DockerImage;
import org.openecomp.ncomp.docker.DockerPackage;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getParentId <em>Parent Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getRepoTags <em>Repo Tags</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getRepoDigests <em>Repo Digests</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getDockerCreated <em>Docker Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getVirtualSize <em>Virtual Size</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerImageImpl#getLabels <em>Labels</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerImageImpl extends NamedEntityImpl implements DockerImage {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentId() <em>Parent Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentId()
	 * @generated
	 * @ordered
	 */
	protected String parentId = PARENT_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepoTags() <em>Repo Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> repoTags;

	/**
	 * The cached value of the '{@link #getRepoDigests() <em>Repo Digests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepoDigests()
	 * @generated
	 * @ordered
	 */
	protected EList<String> repoDigests;

	/**
	 * The default value of the '{@link #getDockerCreated() <em>Docker Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DOCKER_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerCreated() <em>Docker Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerCreated()
	 * @generated
	 * @ordered
	 */
	protected Date dockerCreated = DOCKER_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Long size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVirtualSize() <em>Virtual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSize()
	 * @generated
	 * @ordered
	 */
	protected static final Long VIRTUAL_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVirtualSize() <em>Virtual Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualSize()
	 * @generated
	 * @ordered
	 */
	protected Long virtualSize = VIRTUAL_SIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> labels;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_IMAGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentId(String newParentId) {
		String oldParentId = parentId;
		parentId = newParentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_IMAGE__PARENT_ID, oldParentId, parentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepoTags() {
		if (repoTags == null) {
			repoTags = new EDataTypeEList<String>(String.class, this, DockerPackage.DOCKER_IMAGE__REPO_TAGS);
		}
		return repoTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRepoDigests() {
		if (repoDigests == null) {
			repoDigests = new EDataTypeEList<String>(String.class, this, DockerPackage.DOCKER_IMAGE__REPO_DIGESTS);
		}
		return repoDigests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDockerCreated() {
		return dockerCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerCreated(Date newDockerCreated) {
		Date oldDockerCreated = dockerCreated;
		dockerCreated = newDockerCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_IMAGE__DOCKER_CREATED, oldDockerCreated, dockerCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Long newSize) {
		Long oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_IMAGE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getVirtualSize() {
		return virtualSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualSize(Long newVirtualSize) {
		Long oldVirtualSize = virtualSize;
		virtualSize = newVirtualSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_IMAGE__VIRTUAL_SIZE, oldVirtualSize, virtualSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeEList<String>(String.class, this, DockerPackage.DOCKER_IMAGE__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.DOCKER_IMAGE__ID:
				return getId();
			case DockerPackage.DOCKER_IMAGE__PARENT_ID:
				return getParentId();
			case DockerPackage.DOCKER_IMAGE__REPO_TAGS:
				return getRepoTags();
			case DockerPackage.DOCKER_IMAGE__REPO_DIGESTS:
				return getRepoDigests();
			case DockerPackage.DOCKER_IMAGE__DOCKER_CREATED:
				return getDockerCreated();
			case DockerPackage.DOCKER_IMAGE__SIZE:
				return getSize();
			case DockerPackage.DOCKER_IMAGE__VIRTUAL_SIZE:
				return getVirtualSize();
			case DockerPackage.DOCKER_IMAGE__LABELS:
				return getLabels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.DOCKER_IMAGE__ID:
				setId((String)newValue);
				return;
			case DockerPackage.DOCKER_IMAGE__PARENT_ID:
				setParentId((String)newValue);
				return;
			case DockerPackage.DOCKER_IMAGE__REPO_TAGS:
				getRepoTags().clear();
				getRepoTags().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.DOCKER_IMAGE__REPO_DIGESTS:
				getRepoDigests().clear();
				getRepoDigests().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.DOCKER_IMAGE__DOCKER_CREATED:
				setDockerCreated((Date)newValue);
				return;
			case DockerPackage.DOCKER_IMAGE__SIZE:
				setSize((Long)newValue);
				return;
			case DockerPackage.DOCKER_IMAGE__VIRTUAL_SIZE:
				setVirtualSize((Long)newValue);
				return;
			case DockerPackage.DOCKER_IMAGE__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DockerPackage.DOCKER_IMAGE__ID:
				setId(ID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_IMAGE__PARENT_ID:
				setParentId(PARENT_ID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_IMAGE__REPO_TAGS:
				getRepoTags().clear();
				return;
			case DockerPackage.DOCKER_IMAGE__REPO_DIGESTS:
				getRepoDigests().clear();
				return;
			case DockerPackage.DOCKER_IMAGE__DOCKER_CREATED:
				setDockerCreated(DOCKER_CREATED_EDEFAULT);
				return;
			case DockerPackage.DOCKER_IMAGE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_IMAGE__VIRTUAL_SIZE:
				setVirtualSize(VIRTUAL_SIZE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_IMAGE__LABELS:
				getLabels().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DockerPackage.DOCKER_IMAGE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DockerPackage.DOCKER_IMAGE__PARENT_ID:
				return PARENT_ID_EDEFAULT == null ? parentId != null : !PARENT_ID_EDEFAULT.equals(parentId);
			case DockerPackage.DOCKER_IMAGE__REPO_TAGS:
				return repoTags != null && !repoTags.isEmpty();
			case DockerPackage.DOCKER_IMAGE__REPO_DIGESTS:
				return repoDigests != null && !repoDigests.isEmpty();
			case DockerPackage.DOCKER_IMAGE__DOCKER_CREATED:
				return DOCKER_CREATED_EDEFAULT == null ? dockerCreated != null : !DOCKER_CREATED_EDEFAULT.equals(dockerCreated);
			case DockerPackage.DOCKER_IMAGE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case DockerPackage.DOCKER_IMAGE__VIRTUAL_SIZE:
				return VIRTUAL_SIZE_EDEFAULT == null ? virtualSize != null : !VIRTUAL_SIZE_EDEFAULT.equals(virtualSize);
			case DockerPackage.DOCKER_IMAGE__LABELS:
				return labels != null && !labels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", parentId: ");
		result.append(parentId);
		result.append(", repoTags: ");
		result.append(repoTags);
		result.append(", repoDigests: ");
		result.append(repoDigests);
		result.append(", dockerCreated: ");
		result.append(dockerCreated);
		result.append(", size: ");
		result.append(size);
		result.append(", virtualSize: ");
		result.append(virtualSize);
		result.append(", labels: ");
		result.append(labels);
		result.append(')');
		return result.toString();
	}

} //DockerImageImpl
