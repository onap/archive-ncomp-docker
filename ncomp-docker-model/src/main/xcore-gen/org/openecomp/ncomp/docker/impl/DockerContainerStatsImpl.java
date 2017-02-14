
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

import org.openecomp.ncomp.docker.ContainerCpuStats;
import org.openecomp.ncomp.docker.ContainerMemoryUsage;
import org.openecomp.ncomp.docker.ContainerNetworkStats;
import org.openecomp.ncomp.docker.DockerContainerStats;
import org.openecomp.ncomp.docker.DockerPackage;

import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl#getMemory <em>Memory</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl#getLastRead <em>Last Read</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerContainerStatsImpl extends NamedEntityImpl implements DockerContainerStats {
	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerNetworkStats> networks;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected ContainerMemoryUsage memory;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected ContainerCpuStats cpu;

	/**
	 * The default value of the '{@link #getLastRead() <em>Last Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRead()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_READ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastRead() <em>Last Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastRead()
	 * @generated
	 * @ordered
	 */
	protected Date lastRead = LAST_READ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerContainerStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_CONTAINER_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerNetworkStats> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<ContainerNetworkStats>(ContainerNetworkStats.class, this, DockerPackage.DOCKER_CONTAINER_STATS__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerMemoryUsage getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemory(ContainerMemoryUsage newMemory, NotificationChain msgs) {
		ContainerMemoryUsage oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER_STATS__MEMORY, oldMemory, newMemory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(ContainerMemoryUsage newMemory) {
		if (newMemory != memory) {
			NotificationChain msgs = null;
			if (memory != null)
				msgs = ((InternalEObject)memory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_CONTAINER_STATS__MEMORY, null, msgs);
			if (newMemory != null)
				msgs = ((InternalEObject)newMemory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_CONTAINER_STATS__MEMORY, null, msgs);
			msgs = basicSetMemory(newMemory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER_STATS__MEMORY, newMemory, newMemory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerCpuStats getCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCpu(ContainerCpuStats newCpu, NotificationChain msgs) {
		ContainerCpuStats oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER_STATS__CPU, oldCpu, newCpu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(ContainerCpuStats newCpu) {
		if (newCpu != cpu) {
			NotificationChain msgs = null;
			if (cpu != null)
				msgs = ((InternalEObject)cpu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_CONTAINER_STATS__CPU, null, msgs);
			if (newCpu != null)
				msgs = ((InternalEObject)newCpu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_CONTAINER_STATS__CPU, null, msgs);
			msgs = basicSetCpu(newCpu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER_STATS__CPU, newCpu, newCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastRead() {
		return lastRead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastRead(Date newLastRead) {
		Date oldLastRead = lastRead;
		lastRead = newLastRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER_STATS__LAST_READ, oldLastRead, lastRead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.DOCKER_CONTAINER_STATS__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_CONTAINER_STATS__MEMORY:
				return basicSetMemory(null, msgs);
			case DockerPackage.DOCKER_CONTAINER_STATS__CPU:
				return basicSetCpu(null, msgs);
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
			case DockerPackage.DOCKER_CONTAINER_STATS__NETWORKS:
				return getNetworks();
			case DockerPackage.DOCKER_CONTAINER_STATS__MEMORY:
				return getMemory();
			case DockerPackage.DOCKER_CONTAINER_STATS__CPU:
				return getCpu();
			case DockerPackage.DOCKER_CONTAINER_STATS__LAST_READ:
				return getLastRead();
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
			case DockerPackage.DOCKER_CONTAINER_STATS__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends ContainerNetworkStats>)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER_STATS__MEMORY:
				setMemory((ContainerMemoryUsage)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER_STATS__CPU:
				setCpu((ContainerCpuStats)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER_STATS__LAST_READ:
				setLastRead((Date)newValue);
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
			case DockerPackage.DOCKER_CONTAINER_STATS__NETWORKS:
				getNetworks().clear();
				return;
			case DockerPackage.DOCKER_CONTAINER_STATS__MEMORY:
				setMemory((ContainerMemoryUsage)null);
				return;
			case DockerPackage.DOCKER_CONTAINER_STATS__CPU:
				setCpu((ContainerCpuStats)null);
				return;
			case DockerPackage.DOCKER_CONTAINER_STATS__LAST_READ:
				setLastRead(LAST_READ_EDEFAULT);
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
			case DockerPackage.DOCKER_CONTAINER_STATS__NETWORKS:
				return networks != null && !networks.isEmpty();
			case DockerPackage.DOCKER_CONTAINER_STATS__MEMORY:
				return memory != null;
			case DockerPackage.DOCKER_CONTAINER_STATS__CPU:
				return cpu != null;
			case DockerPackage.DOCKER_CONTAINER_STATS__LAST_READ:
				return LAST_READ_EDEFAULT == null ? lastRead != null : !LAST_READ_EDEFAULT.equals(lastRead);
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
		result.append(" (lastRead: ");
		result.append(lastRead);
		result.append(')');
		return result.toString();
	}

} //DockerContainerStatsImpl
