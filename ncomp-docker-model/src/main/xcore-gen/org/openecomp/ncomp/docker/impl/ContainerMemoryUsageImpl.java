
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

import org.openecomp.ncomp.docker.ContainerMemoryStats;
import org.openecomp.ncomp.docker.ContainerMemoryUsage;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Memory Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl#getMemstats <em>Memstats</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl#getMax_usage <em>Max usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl#getFailcnt <em>Failcnt</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl#getLimit <em>Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerMemoryUsageImpl extends MinimalEObjectImpl.Container implements ContainerMemoryUsage {
	/**
	 * The cached value of the '{@link #getMemstats() <em>Memstats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemstats()
	 * @generated
	 * @ordered
	 */
	protected ContainerMemoryStats memstats;

	/**
	 * The default value of the '{@link #getMax_usage() <em>Max usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_usage()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMax_usage() <em>Max usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_usage()
	 * @generated
	 * @ordered
	 */
	protected int max_usage = MAX_USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final int USAGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected int usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailcnt() <em>Failcnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailcnt()
	 * @generated
	 * @ordered
	 */
	protected static final int FAILCNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFailcnt() <em>Failcnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailcnt()
	 * @generated
	 * @ordered
	 */
	protected int failcnt = FAILCNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLimit() <em>Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLimit()
	 * @generated
	 * @ordered
	 */
	protected int limit = LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerMemoryUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER_MEMORY_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerMemoryStats getMemstats() {
		return memstats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemstats(ContainerMemoryStats newMemstats, NotificationChain msgs) {
		ContainerMemoryStats oldMemstats = memstats;
		memstats = newMemstats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS, oldMemstats, newMemstats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemstats(ContainerMemoryStats newMemstats) {
		if (newMemstats != memstats) {
			NotificationChain msgs = null;
			if (memstats != null)
				msgs = ((InternalEObject)memstats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS, null, msgs);
			if (newMemstats != null)
				msgs = ((InternalEObject)newMemstats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS, null, msgs);
			msgs = basicSetMemstats(newMemstats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS, newMemstats, newMemstats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMax_usage() {
		return max_usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax_usage(int newMax_usage) {
		int oldMax_usage = max_usage;
		max_usage = newMax_usage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_USAGE__MAX_USAGE, oldMax_usage, max_usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(int newUsage) {
		int oldUsage = usage;
		usage = newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_USAGE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFailcnt() {
		return failcnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailcnt(int newFailcnt) {
		int oldFailcnt = failcnt;
		failcnt = newFailcnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_USAGE__FAILCNT, oldFailcnt, failcnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLimit(int newLimit) {
		int oldLimit = limit;
		limit = newLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_USAGE__LIMIT, oldLimit, limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS:
				return basicSetMemstats(null, msgs);
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
			case DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS:
				return getMemstats();
			case DockerPackage.CONTAINER_MEMORY_USAGE__MAX_USAGE:
				return getMax_usage();
			case DockerPackage.CONTAINER_MEMORY_USAGE__USAGE:
				return getUsage();
			case DockerPackage.CONTAINER_MEMORY_USAGE__FAILCNT:
				return getFailcnt();
			case DockerPackage.CONTAINER_MEMORY_USAGE__LIMIT:
				return getLimit();
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
			case DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS:
				setMemstats((ContainerMemoryStats)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__MAX_USAGE:
				setMax_usage((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__USAGE:
				setUsage((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__FAILCNT:
				setFailcnt((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__LIMIT:
				setLimit((Integer)newValue);
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
			case DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS:
				setMemstats((ContainerMemoryStats)null);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__MAX_USAGE:
				setMax_usage(MAX_USAGE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__FAILCNT:
				setFailcnt(FAILCNT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_USAGE__LIMIT:
				setLimit(LIMIT_EDEFAULT);
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
			case DockerPackage.CONTAINER_MEMORY_USAGE__MEMSTATS:
				return memstats != null;
			case DockerPackage.CONTAINER_MEMORY_USAGE__MAX_USAGE:
				return max_usage != MAX_USAGE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_USAGE__USAGE:
				return usage != USAGE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_USAGE__FAILCNT:
				return failcnt != FAILCNT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_USAGE__LIMIT:
				return limit != LIMIT_EDEFAULT;
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
		result.append(" (max_usage: ");
		result.append(max_usage);
		result.append(", usage: ");
		result.append(usage);
		result.append(", failcnt: ");
		result.append(failcnt);
		result.append(", limit: ");
		result.append(limit);
		result.append(')');
		return result.toString();
	}

} //ContainerMemoryUsageImpl
