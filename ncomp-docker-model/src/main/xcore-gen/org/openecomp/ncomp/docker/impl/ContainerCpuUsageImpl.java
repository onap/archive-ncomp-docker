
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

import org.openecomp.ncomp.docker.ContainerCpuUsage;
import org.openecomp.ncomp.docker.DockerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Cpu Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl#getPercpu_usage <em>Percpu usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl#getUsage_in_usermode <em>Usage in usermode</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl#getTotal_usage <em>Total usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl#getUser_in_kernelmode <em>User in kernelmode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerCpuUsageImpl extends MinimalEObjectImpl.Container implements ContainerCpuUsage {
	/**
	 * The cached value of the '{@link #getPercpu_usage() <em>Percpu usage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercpu_usage()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> percpu_usage;

	/**
	 * The default value of the '{@link #getUsage_in_usermode() <em>Usage in usermode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage_in_usermode()
	 * @generated
	 * @ordered
	 */
	protected static final long USAGE_IN_USERMODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUsage_in_usermode() <em>Usage in usermode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage_in_usermode()
	 * @generated
	 * @ordered
	 */
	protected long usage_in_usermode = USAGE_IN_USERMODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_usage() <em>Total usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_usage()
	 * @generated
	 * @ordered
	 */
	protected static final long TOTAL_USAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTotal_usage() <em>Total usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_usage()
	 * @generated
	 * @ordered
	 */
	protected long total_usage = TOTAL_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUser_in_kernelmode() <em>User in kernelmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_in_kernelmode()
	 * @generated
	 * @ordered
	 */
	protected static final long USER_IN_KERNELMODE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUser_in_kernelmode() <em>User in kernelmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser_in_kernelmode()
	 * @generated
	 * @ordered
	 */
	protected long user_in_kernelmode = USER_IN_KERNELMODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerCpuUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER_CPU_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getPercpu_usage() {
		if (percpu_usage == null) {
			percpu_usage = new EDataTypeEList<Long>(Long.class, this, DockerPackage.CONTAINER_CPU_USAGE__PERCPU_USAGE);
		}
		return percpu_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUsage_in_usermode() {
		return usage_in_usermode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage_in_usermode(long newUsage_in_usermode) {
		long oldUsage_in_usermode = usage_in_usermode;
		usage_in_usermode = newUsage_in_usermode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_CPU_USAGE__USAGE_IN_USERMODE, oldUsage_in_usermode, usage_in_usermode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTotal_usage() {
		return total_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_usage(long newTotal_usage) {
		long oldTotal_usage = total_usage;
		total_usage = newTotal_usage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_CPU_USAGE__TOTAL_USAGE, oldTotal_usage, total_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getUser_in_kernelmode() {
		return user_in_kernelmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser_in_kernelmode(long newUser_in_kernelmode) {
		long oldUser_in_kernelmode = user_in_kernelmode;
		user_in_kernelmode = newUser_in_kernelmode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_CPU_USAGE__USER_IN_KERNELMODE, oldUser_in_kernelmode, user_in_kernelmode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.CONTAINER_CPU_USAGE__PERCPU_USAGE:
				return getPercpu_usage();
			case DockerPackage.CONTAINER_CPU_USAGE__USAGE_IN_USERMODE:
				return getUsage_in_usermode();
			case DockerPackage.CONTAINER_CPU_USAGE__TOTAL_USAGE:
				return getTotal_usage();
			case DockerPackage.CONTAINER_CPU_USAGE__USER_IN_KERNELMODE:
				return getUser_in_kernelmode();
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
			case DockerPackage.CONTAINER_CPU_USAGE__PERCPU_USAGE:
				getPercpu_usage().clear();
				getPercpu_usage().addAll((Collection<? extends Long>)newValue);
				return;
			case DockerPackage.CONTAINER_CPU_USAGE__USAGE_IN_USERMODE:
				setUsage_in_usermode((Long)newValue);
				return;
			case DockerPackage.CONTAINER_CPU_USAGE__TOTAL_USAGE:
				setTotal_usage((Long)newValue);
				return;
			case DockerPackage.CONTAINER_CPU_USAGE__USER_IN_KERNELMODE:
				setUser_in_kernelmode((Long)newValue);
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
			case DockerPackage.CONTAINER_CPU_USAGE__PERCPU_USAGE:
				getPercpu_usage().clear();
				return;
			case DockerPackage.CONTAINER_CPU_USAGE__USAGE_IN_USERMODE:
				setUsage_in_usermode(USAGE_IN_USERMODE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_CPU_USAGE__TOTAL_USAGE:
				setTotal_usage(TOTAL_USAGE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_CPU_USAGE__USER_IN_KERNELMODE:
				setUser_in_kernelmode(USER_IN_KERNELMODE_EDEFAULT);
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
			case DockerPackage.CONTAINER_CPU_USAGE__PERCPU_USAGE:
				return percpu_usage != null && !percpu_usage.isEmpty();
			case DockerPackage.CONTAINER_CPU_USAGE__USAGE_IN_USERMODE:
				return usage_in_usermode != USAGE_IN_USERMODE_EDEFAULT;
			case DockerPackage.CONTAINER_CPU_USAGE__TOTAL_USAGE:
				return total_usage != TOTAL_USAGE_EDEFAULT;
			case DockerPackage.CONTAINER_CPU_USAGE__USER_IN_KERNELMODE:
				return user_in_kernelmode != USER_IN_KERNELMODE_EDEFAULT;
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
		result.append(" (percpu_usage: ");
		result.append(percpu_usage);
		result.append(", usage_in_usermode: ");
		result.append(usage_in_usermode);
		result.append(", total_usage: ");
		result.append(total_usage);
		result.append(", user_in_kernelmode: ");
		result.append(user_in_kernelmode);
		result.append(')');
		return result.toString();
	}

} //ContainerCpuUsageImpl
