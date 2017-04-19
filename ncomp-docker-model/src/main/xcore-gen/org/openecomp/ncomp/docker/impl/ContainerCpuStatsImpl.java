
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

import org.openecomp.ncomp.docker.ContainerCpuStats;
import org.openecomp.ncomp.docker.ContainerCpuUsage;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Cpu Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerCpuStatsImpl#getCpu_usage <em>Cpu usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerCpuStatsImpl#getSystem_cpu_usage <em>System cpu usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerCpuStatsImpl extends MinimalEObjectImpl.Container implements ContainerCpuStats {
	/**
	 * The cached value of the '{@link #getCpu_usage() <em>Cpu usage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu_usage()
	 * @generated
	 * @ordered
	 */
	protected ContainerCpuUsage cpu_usage;

	/**
	 * The default value of the '{@link #getSystem_cpu_usage() <em>System cpu usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_cpu_usage()
	 * @generated
	 * @ordered
	 */
	protected static final long SYSTEM_CPU_USAGE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSystem_cpu_usage() <em>System cpu usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystem_cpu_usage()
	 * @generated
	 * @ordered
	 */
	protected long system_cpu_usage = SYSTEM_CPU_USAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerCpuStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER_CPU_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerCpuUsage getCpu_usage() {
		return cpu_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpu_usage(ContainerCpuUsage newCpu_usage, NotificationChain msgs) {
		ContainerCpuUsage oldCpu_usage = cpu_usage;
		cpu_usage = newCpu_usage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE, oldCpu_usage, newCpu_usage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu_usage(ContainerCpuUsage newCpu_usage) {
		if (newCpu_usage != cpu_usage) {
			NotificationChain msgs = null;
			if (cpu_usage != null)
				msgs = ((InternalEObject)cpu_usage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE, null, msgs);
			if (newCpu_usage != null)
				msgs = ((InternalEObject)newCpu_usage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE, null, msgs);
			msgs = basicSetCpu_usage(newCpu_usage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE, newCpu_usage, newCpu_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSystem_cpu_usage() {
		return system_cpu_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystem_cpu_usage(long newSystem_cpu_usage) {
		long oldSystem_cpu_usage = system_cpu_usage;
		system_cpu_usage = newSystem_cpu_usage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE, oldSystem_cpu_usage, system_cpu_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE:
				return basicSetCpu_usage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE:
				return getCpu_usage();
			case DockerPackage.CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE:
				return getSystem_cpu_usage();
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
			case DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE:
				setCpu_usage((ContainerCpuUsage)newValue);
				return;
			case DockerPackage.CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE:
				setSystem_cpu_usage((Long)newValue);
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
			case DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE:
				setCpu_usage((ContainerCpuUsage)null);
				return;
			case DockerPackage.CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE:
				setSystem_cpu_usage(SYSTEM_CPU_USAGE_EDEFAULT);
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
			case DockerPackage.CONTAINER_CPU_STATS__CPU_USAGE:
				return cpu_usage != null;
			case DockerPackage.CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE:
				return system_cpu_usage != SYSTEM_CPU_USAGE_EDEFAULT;
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
		result.append(" (system_cpu_usage: ");
		result.append(system_cpu_usage);
		result.append(')');
		return result.toString();
	}

} //ContainerCpuStatsImpl
