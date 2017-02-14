
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

import org.openecomp.ncomp.docker.DockerPackage;
import org.openecomp.ncomp.docker.DockerPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerPortImpl#getPrivatePort <em>Private Port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerPortImpl#getPublicPort <em>Public Port</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerPortImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerPortImpl extends MinimalEObjectImpl.Container implements DockerPort {
	/**
	 * The default value of the '{@link #getPrivatePort() <em>Private Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivatePort()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIVATE_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrivatePort() <em>Private Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivatePort()
	 * @generated
	 * @ordered
	 */
	protected int privatePort = PRIVATE_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublicPort() <em>Public Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PUBLIC_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPublicPort() <em>Public Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicPort()
	 * @generated
	 * @ordered
	 */
	protected int publicPort = PUBLIC_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerPortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrivatePort() {
		return privatePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivatePort(int newPrivatePort) {
		int oldPrivatePort = privatePort;
		privatePort = newPrivatePort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PORT__PRIVATE_PORT, oldPrivatePort, privatePort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPublicPort() {
		return publicPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicPort(int newPublicPort) {
		int oldPublicPort = publicPort;
		publicPort = newPublicPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PORT__PUBLIC_PORT, oldPublicPort, publicPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PORT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.DOCKER_PORT__PRIVATE_PORT:
				return getPrivatePort();
			case DockerPackage.DOCKER_PORT__PUBLIC_PORT:
				return getPublicPort();
			case DockerPackage.DOCKER_PORT__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.DOCKER_PORT__PRIVATE_PORT:
				setPrivatePort((Integer)newValue);
				return;
			case DockerPackage.DOCKER_PORT__PUBLIC_PORT:
				setPublicPort((Integer)newValue);
				return;
			case DockerPackage.DOCKER_PORT__TYPE:
				setType((String)newValue);
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
			case DockerPackage.DOCKER_PORT__PRIVATE_PORT:
				setPrivatePort(PRIVATE_PORT_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PORT__PUBLIC_PORT:
				setPublicPort(PUBLIC_PORT_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PORT__TYPE:
				setType(TYPE_EDEFAULT);
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
			case DockerPackage.DOCKER_PORT__PRIVATE_PORT:
				return privatePort != PRIVATE_PORT_EDEFAULT;
			case DockerPackage.DOCKER_PORT__PUBLIC_PORT:
				return publicPort != PUBLIC_PORT_EDEFAULT;
			case DockerPackage.DOCKER_PORT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (privatePort: ");
		result.append(privatePort);
		result.append(", publicPort: ");
		result.append(publicPort);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //DockerPortImpl
