
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

import org.openecomp.ncomp.docker.DockerMount;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mount</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerMountImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerMountImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerMountImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerMountImpl#getRW <em>RW</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerMountImpl#getPropagation <em>Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerMountImpl extends MinimalEObjectImpl.Container implements DockerMount {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRW() <em>RW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRW()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRW() <em>RW</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRW()
	 * @generated
	 * @ordered
	 */
	protected Boolean rW = RW_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPAGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropagation() <em>Propagation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropagation()
	 * @generated
	 * @ordered
	 */
	protected String propagation = PROPAGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerMountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_MOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_MOUNT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_MOUNT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_MOUNT__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRW() {
		return rW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRW(Boolean newRW) {
		Boolean oldRW = rW;
		rW = newRW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_MOUNT__RW, oldRW, rW));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropagation() {
		return propagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropagation(String newPropagation) {
		String oldPropagation = propagation;
		propagation = newPropagation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_MOUNT__PROPAGATION, oldPropagation, propagation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.DOCKER_MOUNT__SOURCE:
				return getSource();
			case DockerPackage.DOCKER_MOUNT__DESTINATION:
				return getDestination();
			case DockerPackage.DOCKER_MOUNT__MODE:
				return getMode();
			case DockerPackage.DOCKER_MOUNT__RW:
				return getRW();
			case DockerPackage.DOCKER_MOUNT__PROPAGATION:
				return getPropagation();
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
			case DockerPackage.DOCKER_MOUNT__SOURCE:
				setSource((String)newValue);
				return;
			case DockerPackage.DOCKER_MOUNT__DESTINATION:
				setDestination((String)newValue);
				return;
			case DockerPackage.DOCKER_MOUNT__MODE:
				setMode((String)newValue);
				return;
			case DockerPackage.DOCKER_MOUNT__RW:
				setRW((Boolean)newValue);
				return;
			case DockerPackage.DOCKER_MOUNT__PROPAGATION:
				setPropagation((String)newValue);
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
			case DockerPackage.DOCKER_MOUNT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_MOUNT__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case DockerPackage.DOCKER_MOUNT__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_MOUNT__RW:
				setRW(RW_EDEFAULT);
				return;
			case DockerPackage.DOCKER_MOUNT__PROPAGATION:
				setPropagation(PROPAGATION_EDEFAULT);
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
			case DockerPackage.DOCKER_MOUNT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case DockerPackage.DOCKER_MOUNT__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case DockerPackage.DOCKER_MOUNT__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case DockerPackage.DOCKER_MOUNT__RW:
				return RW_EDEFAULT == null ? rW != null : !RW_EDEFAULT.equals(rW);
			case DockerPackage.DOCKER_MOUNT__PROPAGATION:
				return PROPAGATION_EDEFAULT == null ? propagation != null : !PROPAGATION_EDEFAULT.equals(propagation);
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
		result.append(" (source: ");
		result.append(source);
		result.append(", destination: ");
		result.append(destination);
		result.append(", mode: ");
		result.append(mode);
		result.append(", rW: ");
		result.append(rW);
		result.append(", propagation: ");
		result.append(propagation);
		result.append(')');
		return result.toString();
	}

} //DockerMountImpl
