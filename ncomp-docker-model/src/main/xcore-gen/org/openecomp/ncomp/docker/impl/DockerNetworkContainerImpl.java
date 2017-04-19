
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

import org.openecomp.ncomp.docker.DockerNetworkContainer;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl#getIPv4Address <em>IPv4 Address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl#getIPv6Address <em>IPv6 Address</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl#getEndpointID <em>Endpoint ID</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl#getMacAddress <em>Mac Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerNetworkContainerImpl extends MinimalEObjectImpl.Container implements DockerNetworkContainer {
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
	 * The default value of the '{@link #getIPv4Address() <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPv4Address() <em>IPv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv4Address()
	 * @generated
	 * @ordered
	 */
	protected String iPv4Address = IPV4_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPv6Address() <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV6_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPv6Address() <em>IPv6 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPv6Address()
	 * @generated
	 * @ordered
	 */
	protected String iPv6Address = IPV6_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndpointID() <em>Endpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointID()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointID() <em>Endpoint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointID()
	 * @generated
	 * @ordered
	 */
	protected String endpointID = ENDPOINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAC_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacAddress() <em>Mac Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacAddress()
	 * @generated
	 * @ordered
	 */
	protected String macAddress = MAC_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerNetworkContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_NETWORK_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK_CONTAINER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPv4Address() {
		return iPv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPv4Address(String newIPv4Address) {
		String oldIPv4Address = iPv4Address;
		iPv4Address = newIPv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS, oldIPv4Address, iPv4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIPv6Address() {
		return iPv6Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPv6Address(String newIPv6Address) {
		String oldIPv6Address = iPv6Address;
		iPv6Address = newIPv6Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS, oldIPv6Address, iPv6Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointID() {
		return endpointID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointID(String newEndpointID) {
		String oldEndpointID = endpointID;
		endpointID = newEndpointID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK_CONTAINER__ENDPOINT_ID, oldEndpointID, endpointID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacAddress() {
		return macAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacAddress(String newMacAddress) {
		String oldMacAddress = macAddress;
		macAddress = newMacAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_NETWORK_CONTAINER__MAC_ADDRESS, oldMacAddress, macAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ID:
				return getId();
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS:
				return getIPv4Address();
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS:
				return getIPv6Address();
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ENDPOINT_ID:
				return getEndpointID();
			case DockerPackage.DOCKER_NETWORK_CONTAINER__MAC_ADDRESS:
				return getMacAddress();
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
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ID:
				setId((String)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS:
				setIPv4Address((String)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS:
				setIPv6Address((String)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ENDPOINT_ID:
				setEndpointID((String)newValue);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__MAC_ADDRESS:
				setMacAddress((String)newValue);
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
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS:
				setIPv4Address(IPV4_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS:
				setIPv6Address(IPV6_ADDRESS_EDEFAULT);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ENDPOINT_ID:
				setEndpointID(ENDPOINT_ID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_NETWORK_CONTAINER__MAC_ADDRESS:
				setMacAddress(MAC_ADDRESS_EDEFAULT);
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
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS:
				return IPV4_ADDRESS_EDEFAULT == null ? iPv4Address != null : !IPV4_ADDRESS_EDEFAULT.equals(iPv4Address);
			case DockerPackage.DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS:
				return IPV6_ADDRESS_EDEFAULT == null ? iPv6Address != null : !IPV6_ADDRESS_EDEFAULT.equals(iPv6Address);
			case DockerPackage.DOCKER_NETWORK_CONTAINER__ENDPOINT_ID:
				return ENDPOINT_ID_EDEFAULT == null ? endpointID != null : !ENDPOINT_ID_EDEFAULT.equals(endpointID);
			case DockerPackage.DOCKER_NETWORK_CONTAINER__MAC_ADDRESS:
				return MAC_ADDRESS_EDEFAULT == null ? macAddress != null : !MAC_ADDRESS_EDEFAULT.equals(macAddress);
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
		result.append(", iPv4Address: ");
		result.append(iPv4Address);
		result.append(", iPv6Address: ");
		result.append(iPv6Address);
		result.append(", endpointID: ");
		result.append(endpointID);
		result.append(", macAddress: ");
		result.append(macAddress);
		result.append(')');
		return result.toString();
	}

} //DockerNetworkContainerImpl
