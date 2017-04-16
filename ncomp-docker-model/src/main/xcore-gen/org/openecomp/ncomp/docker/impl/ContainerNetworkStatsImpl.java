
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

import org.openecomp.ncomp.docker.ContainerNetworkStats;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Network Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getIntf <em>Intf</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getRx_bytes <em>Rx bytes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getRx_dropped <em>Rx dropped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getRx_errors <em>Rx errors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getRx_packets <em>Rx packets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getTx_bytes <em>Tx bytes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getTx_dropped <em>Tx dropped</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getTx_errors <em>Tx errors</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl#getTx_packets <em>Tx packets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerNetworkStatsImpl extends MinimalEObjectImpl.Container implements ContainerNetworkStats {
	/**
	 * The default value of the '{@link #getIntf() <em>Intf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntf()
	 * @generated
	 * @ordered
	 */
	protected static final String INTF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntf() <em>Intf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntf()
	 * @generated
	 * @ordered
	 */
	protected String intf = INTF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_bytes() <em>Rx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bytes()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_bytes() <em>Rx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_bytes()
	 * @generated
	 * @ordered
	 */
	protected int rx_bytes = RX_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_dropped() <em>Rx dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_dropped()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_DROPPED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_dropped() <em>Rx dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_dropped()
	 * @generated
	 * @ordered
	 */
	protected int rx_dropped = RX_DROPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_errors() <em>Rx errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_errors()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_ERRORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_errors() <em>Rx errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_errors()
	 * @generated
	 * @ordered
	 */
	protected int rx_errors = RX_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRx_packets() <em>Rx packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_packets()
	 * @generated
	 * @ordered
	 */
	protected static final int RX_PACKETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRx_packets() <em>Rx packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRx_packets()
	 * @generated
	 * @ordered
	 */
	protected int rx_packets = RX_PACKETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_bytes() <em>Tx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_bytes()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_BYTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_bytes() <em>Tx bytes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_bytes()
	 * @generated
	 * @ordered
	 */
	protected int tx_bytes = TX_BYTES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_dropped() <em>Tx dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_dropped()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_DROPPED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_dropped() <em>Tx dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_dropped()
	 * @generated
	 * @ordered
	 */
	protected int tx_dropped = TX_DROPPED_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_errors() <em>Tx errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_errors()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_ERRORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_errors() <em>Tx errors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_errors()
	 * @generated
	 * @ordered
	 */
	protected int tx_errors = TX_ERRORS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx_packets() <em>Tx packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_packets()
	 * @generated
	 * @ordered
	 */
	protected static final int TX_PACKETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTx_packets() <em>Tx packets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx_packets()
	 * @generated
	 * @ordered
	 */
	protected int tx_packets = TX_PACKETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerNetworkStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER_NETWORK_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntf() {
		return intf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntf(String newIntf) {
		String oldIntf = intf;
		intf = newIntf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__INTF, oldIntf, intf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_bytes() {
		return rx_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_bytes(int newRx_bytes) {
		int oldRx_bytes = rx_bytes;
		rx_bytes = newRx_bytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__RX_BYTES, oldRx_bytes, rx_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_dropped() {
		return rx_dropped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_dropped(int newRx_dropped) {
		int oldRx_dropped = rx_dropped;
		rx_dropped = newRx_dropped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__RX_DROPPED, oldRx_dropped, rx_dropped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_errors() {
		return rx_errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_errors(int newRx_errors) {
		int oldRx_errors = rx_errors;
		rx_errors = newRx_errors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__RX_ERRORS, oldRx_errors, rx_errors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRx_packets() {
		return rx_packets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRx_packets(int newRx_packets) {
		int oldRx_packets = rx_packets;
		rx_packets = newRx_packets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__RX_PACKETS, oldRx_packets, rx_packets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_bytes() {
		return tx_bytes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_bytes(int newTx_bytes) {
		int oldTx_bytes = tx_bytes;
		tx_bytes = newTx_bytes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__TX_BYTES, oldTx_bytes, tx_bytes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_dropped() {
		return tx_dropped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_dropped(int newTx_dropped) {
		int oldTx_dropped = tx_dropped;
		tx_dropped = newTx_dropped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__TX_DROPPED, oldTx_dropped, tx_dropped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_errors() {
		return tx_errors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_errors(int newTx_errors) {
		int oldTx_errors = tx_errors;
		tx_errors = newTx_errors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__TX_ERRORS, oldTx_errors, tx_errors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTx_packets() {
		return tx_packets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx_packets(int newTx_packets) {
		int oldTx_packets = tx_packets;
		tx_packets = newTx_packets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_NETWORK_STATS__TX_PACKETS, oldTx_packets, tx_packets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.CONTAINER_NETWORK_STATS__INTF:
				return getIntf();
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_BYTES:
				return getRx_bytes();
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_DROPPED:
				return getRx_dropped();
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_ERRORS:
				return getRx_errors();
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_PACKETS:
				return getRx_packets();
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_BYTES:
				return getTx_bytes();
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_DROPPED:
				return getTx_dropped();
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_ERRORS:
				return getTx_errors();
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_PACKETS:
				return getTx_packets();
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
			case DockerPackage.CONTAINER_NETWORK_STATS__INTF:
				setIntf((String)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_BYTES:
				setRx_bytes((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_DROPPED:
				setRx_dropped((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_ERRORS:
				setRx_errors((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_PACKETS:
				setRx_packets((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_BYTES:
				setTx_bytes((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_DROPPED:
				setTx_dropped((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_ERRORS:
				setTx_errors((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_PACKETS:
				setTx_packets((Integer)newValue);
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
			case DockerPackage.CONTAINER_NETWORK_STATS__INTF:
				setIntf(INTF_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_BYTES:
				setRx_bytes(RX_BYTES_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_DROPPED:
				setRx_dropped(RX_DROPPED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_ERRORS:
				setRx_errors(RX_ERRORS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_PACKETS:
				setRx_packets(RX_PACKETS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_BYTES:
				setTx_bytes(TX_BYTES_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_DROPPED:
				setTx_dropped(TX_DROPPED_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_ERRORS:
				setTx_errors(TX_ERRORS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_PACKETS:
				setTx_packets(TX_PACKETS_EDEFAULT);
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
			case DockerPackage.CONTAINER_NETWORK_STATS__INTF:
				return INTF_EDEFAULT == null ? intf != null : !INTF_EDEFAULT.equals(intf);
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_BYTES:
				return rx_bytes != RX_BYTES_EDEFAULT;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_DROPPED:
				return rx_dropped != RX_DROPPED_EDEFAULT;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_ERRORS:
				return rx_errors != RX_ERRORS_EDEFAULT;
			case DockerPackage.CONTAINER_NETWORK_STATS__RX_PACKETS:
				return rx_packets != RX_PACKETS_EDEFAULT;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_BYTES:
				return tx_bytes != TX_BYTES_EDEFAULT;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_DROPPED:
				return tx_dropped != TX_DROPPED_EDEFAULT;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_ERRORS:
				return tx_errors != TX_ERRORS_EDEFAULT;
			case DockerPackage.CONTAINER_NETWORK_STATS__TX_PACKETS:
				return tx_packets != TX_PACKETS_EDEFAULT;
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
		result.append(" (intf: ");
		result.append(intf);
		result.append(", rx_bytes: ");
		result.append(rx_bytes);
		result.append(", rx_dropped: ");
		result.append(rx_dropped);
		result.append(", rx_errors: ");
		result.append(rx_errors);
		result.append(", rx_packets: ");
		result.append(rx_packets);
		result.append(", tx_bytes: ");
		result.append(tx_bytes);
		result.append(", tx_dropped: ");
		result.append(tx_dropped);
		result.append(", tx_errors: ");
		result.append(tx_errors);
		result.append(", tx_packets: ");
		result.append(tx_packets);
		result.append(')');
		return result.toString();
	}

} //ContainerNetworkStatsImpl
