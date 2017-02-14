
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

import org.openecomp.ncomp.docker.DockerIpam;
import org.openecomp.ncomp.docker.DockerKeyPair;
import org.openecomp.ncomp.docker.DockerNetwork;
import org.openecomp.ncomp.docker.DockerNetworkContainer;
import org.openecomp.ncomp.docker.DockerPackage;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl#getIPAM <em>IPAM</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerNetworkImpl extends NamedEntityImpl implements DockerNetwork {
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
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final String SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected String scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected String driver = DRIVER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIPAM() <em>IPAM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPAM()
	 * @generated
	 * @ordered
	 */
	protected DockerIpam iPAM;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerNetworkContainer> containers;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerKeyPair> options;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(String newScope) {
		String oldScope = scope;
		scope = newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDriver(String newDriver) {
		String oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK__DRIVER, oldDriver, driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerIpam getIPAM() {
		return iPAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIPAM(DockerIpam newIPAM, NotificationChain msgs) {
		DockerIpam oldIPAM = iPAM;
		iPAM = newIPAM;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK__IPAM, oldIPAM, newIPAM);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPAM(DockerIpam newIPAM) {
		if (newIPAM != iPAM) {
			NotificationChain msgs = null;
			if (iPAM != null)
				msgs = ((InternalEObject)iPAM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_NETWORK__IPAM, null, msgs);
			if (newIPAM != null)
				msgs = ((InternalEObject)newIPAM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_NETWORK__IPAM, null, msgs);
			msgs = basicSetIPAM(newIPAM, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK__IPAM, newIPAM, newIPAM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerNetworkContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<DockerNetworkContainer>(DockerNetworkContainer.class, this, DockerPackage.DOCKER_NETWORK__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerKeyPair> getOptions() {
		if (options == null) {
			options = new EObjectContainmentEList<DockerKeyPair>(DockerKeyPair.class, this, DockerPackage.DOCKER_NETWORK__OPTIONS);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.DOCKER_NETWORK__IPAM:
				return basicSetIPAM(null, msgs);
			case DockerPackage.DOCKER_NETWORK__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_NETWORK__OPTIONS:
				return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
			case DockerPackage.DOCKER_NETWORK__ID:
				return getId();
			case DockerPackage.DOCKER_NETWORK__SCOPE:
				return getScope();
			case DockerPackage.DOCKER_NETWORK__DRIVER:
				return getDriver();
			case DockerPackage.DOCKER_NETWORK__IPAM:
				return getIPAM();
			case DockerPackage.DOCKER_NETWORK__CONTAINERS:
				return getContainers();
			case DockerPackage.DOCKER_NETWORK__OPTIONS:
				return getOptions();
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
			case DockerPackage.DOCKER_NETWORK__ID:
				setId((String)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK__SCOPE:
				setScope((String)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK__DRIVER:
				setDriver((String)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK__IPAM:
				setIPAM((DockerIpam)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends DockerNetworkContainer>)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends DockerKeyPair>)newValue);
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
			case DockerPackage.DOCKER_NETWORK__ID:
				setId(ID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_NETWORK__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_NETWORK__DRIVER:
				setDriver(DRIVER_EDEFAULT);
				return;
			case DockerPackage.DOCKER_NETWORK__IPAM:
				setIPAM((DockerIpam)null);
				return;
			case DockerPackage.DOCKER_NETWORK__CONTAINERS:
				getContainers().clear();
				return;
			case DockerPackage.DOCKER_NETWORK__OPTIONS:
				getOptions().clear();
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
			case DockerPackage.DOCKER_NETWORK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DockerPackage.DOCKER_NETWORK__SCOPE:
				return SCOPE_EDEFAULT == null ? scope != null : !SCOPE_EDEFAULT.equals(scope);
			case DockerPackage.DOCKER_NETWORK__DRIVER:
				return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
			case DockerPackage.DOCKER_NETWORK__IPAM:
				return iPAM != null;
			case DockerPackage.DOCKER_NETWORK__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case DockerPackage.DOCKER_NETWORK__OPTIONS:
				return options != null && !options.isEmpty();
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
		result.append(", scope: ");
		result.append(scope);
		result.append(", driver: ");
		result.append(driver);
		result.append(')');
		return result.toString();
	}

} //DockerNetworkImpl
