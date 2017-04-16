
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

import org.openecomp.ncomp.docker.ContainerRestartPolicy;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Restart Policy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerRestartPolicyImpl#getNm <em>Nm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerRestartPolicyImpl#getMaxRetryCnt <em>Max Retry Cnt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerRestartPolicyImpl extends MinimalEObjectImpl.Container implements ContainerRestartPolicy {
	/**
	 * The default value of the '{@link #getNm() <em>Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNm()
	 * @generated
	 * @ordered
	 */
	protected static final String NM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNm() <em>Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNm()
	 * @generated
	 * @ordered
	 */
	protected String nm = NM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRetryCnt() <em>Max Retry Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRetryCnt()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RETRY_CNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRetryCnt() <em>Max Retry Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRetryCnt()
	 * @generated
	 * @ordered
	 */
	protected int maxRetryCnt = MAX_RETRY_CNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerRestartPolicyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER_RESTART_POLICY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNm() {
		return nm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNm(String newNm) {
		String oldNm = nm;
		nm = newNm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_RESTART_POLICY__NM, oldNm, nm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRetryCnt() {
		return maxRetryCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRetryCnt(int newMaxRetryCnt) {
		int oldMaxRetryCnt = maxRetryCnt;
		maxRetryCnt = newMaxRetryCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_RESTART_POLICY__MAX_RETRY_CNT, oldMaxRetryCnt, maxRetryCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.CONTAINER_RESTART_POLICY__NM:
				return getNm();
			case DockerPackage.CONTAINER_RESTART_POLICY__MAX_RETRY_CNT:
				return getMaxRetryCnt();
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
			case DockerPackage.CONTAINER_RESTART_POLICY__NM:
				setNm((String)newValue);
				return;
			case DockerPackage.CONTAINER_RESTART_POLICY__MAX_RETRY_CNT:
				setMaxRetryCnt((Integer)newValue);
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
			case DockerPackage.CONTAINER_RESTART_POLICY__NM:
				setNm(NM_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_RESTART_POLICY__MAX_RETRY_CNT:
				setMaxRetryCnt(MAX_RETRY_CNT_EDEFAULT);
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
			case DockerPackage.CONTAINER_RESTART_POLICY__NM:
				return NM_EDEFAULT == null ? nm != null : !NM_EDEFAULT.equals(nm);
			case DockerPackage.CONTAINER_RESTART_POLICY__MAX_RETRY_CNT:
				return maxRetryCnt != MAX_RETRY_CNT_EDEFAULT;
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
		result.append(" (nm: ");
		result.append(nm);
		result.append(", maxRetryCnt: ");
		result.append(maxRetryCnt);
		result.append(')');
		return result.toString();
	}

} //ContainerRestartPolicyImpl
