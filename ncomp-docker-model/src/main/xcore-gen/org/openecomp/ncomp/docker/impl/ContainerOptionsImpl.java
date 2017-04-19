
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
import org.openecomp.ncomp.docker.ContainerOptions;
import org.openecomp.ncomp.docker.ContainerPortBindings;
import org.openecomp.ncomp.docker.ContainerRestartPolicy;
import org.openecomp.ncomp.docker.DockerPackage;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Options</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#getImageNm <em>Image Nm</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#isSetContainerName <em>Set Container Name</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#isPublishAllPorts <em>Publish All Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#getPortBindings <em>Port Bindings</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl#getAutoRestart <em>Auto Restart</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerOptionsImpl extends NamedEntityImpl implements ContainerOptions {
	/**
	 * The default value of the '{@link #getImageNm() <em>Image Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageNm()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_NM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageNm() <em>Image Nm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageNm()
	 * @generated
	 * @ordered
	 */
	protected String imageNm = IMAGE_NM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EList<String> env;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> volumes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<String> links;

	/**
	 * The default value of the '{@link #isSetContainerName() <em>Set Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainerName()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SET_CONTAINER_NAME_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSetContainerName() <em>Set Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetContainerName()
	 * @generated
	 * @ordered
	 */
	protected boolean setContainerName = SET_CONTAINER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublishAllPorts() <em>Publish All Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublishAllPorts()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLISH_ALL_PORTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublishAllPorts() <em>Publish All Ports</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublishAllPorts()
	 * @generated
	 * @ordered
	 */
	protected boolean publishAllPorts = PUBLISH_ALL_PORTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPortBindings() <em>Port Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerPortBindings> portBindings;

	/**
	 * The cached value of the '{@link #getAutoRestart() <em>Auto Restart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoRestart()
	 * @generated
	 * @ordered
	 */
	protected ContainerRestartPolicy autoRestart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerOptionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER_OPTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageNm() {
		return imageNm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageNm(String newImageNm) {
		String oldImageNm = imageNm;
		imageNm = newImageNm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_OPTIONS__IMAGE_NM, oldImageNm, imageNm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnv() {
		if (env == null) {
			env = new EDataTypeEList<String>(String.class, this, DockerPackage.CONTAINER_OPTIONS__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVolumes() {
		if (volumes == null) {
			volumes = new EDataTypeEList<String>(String.class, this, DockerPackage.CONTAINER_OPTIONS__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLinks() {
		if (links == null) {
			links = new EDataTypeEList<String>(String.class, this, DockerPackage.CONTAINER_OPTIONS__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetContainerName() {
		return setContainerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetContainerName(boolean newSetContainerName) {
		boolean oldSetContainerName = setContainerName;
		setContainerName = newSetContainerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_OPTIONS__SET_CONTAINER_NAME, oldSetContainerName, setContainerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublishAllPorts() {
		return publishAllPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishAllPorts(boolean newPublishAllPorts) {
		boolean oldPublishAllPorts = publishAllPorts;
		publishAllPorts = newPublishAllPorts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_OPTIONS__PUBLISH_ALL_PORTS, oldPublishAllPorts, publishAllPorts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainerPortBindings> getPortBindings() {
		if (portBindings == null) {
			portBindings = new EObjectContainmentEList<ContainerPortBindings>(ContainerPortBindings.class, this, DockerPackage.CONTAINER_OPTIONS__PORT_BINDINGS);
		}
		return portBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRestartPolicy getAutoRestart() {
		return autoRestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoRestart(ContainerRestartPolicy newAutoRestart, NotificationChain msgs) {
		ContainerRestartPolicy oldAutoRestart = autoRestart;
		autoRestart = newAutoRestart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART, oldAutoRestart, newAutoRestart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoRestart(ContainerRestartPolicy newAutoRestart) {
		if (newAutoRestart != autoRestart) {
			NotificationChain msgs = null;
			if (autoRestart != null)
				msgs = ((InternalEObject)autoRestart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART, null, msgs);
			if (newAutoRestart != null)
				msgs = ((InternalEObject)newAutoRestart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART, null, msgs);
			msgs = basicSetAutoRestart(newAutoRestart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART, newAutoRestart, newAutoRestart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.CONTAINER_OPTIONS__PORT_BINDINGS:
				return ((InternalEList<?>)getPortBindings()).basicRemove(otherEnd, msgs);
			case DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART:
				return basicSetAutoRestart(null, msgs);
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
			case DockerPackage.CONTAINER_OPTIONS__IMAGE_NM:
				return getImageNm();
			case DockerPackage.CONTAINER_OPTIONS__ENV:
				return getEnv();
			case DockerPackage.CONTAINER_OPTIONS__VOLUMES:
				return getVolumes();
			case DockerPackage.CONTAINER_OPTIONS__LINKS:
				return getLinks();
			case DockerPackage.CONTAINER_OPTIONS__SET_CONTAINER_NAME:
				return isSetContainerName();
			case DockerPackage.CONTAINER_OPTIONS__PUBLISH_ALL_PORTS:
				return isPublishAllPorts();
			case DockerPackage.CONTAINER_OPTIONS__PORT_BINDINGS:
				return getPortBindings();
			case DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART:
				return getAutoRestart();
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
			case DockerPackage.CONTAINER_OPTIONS__IMAGE_NM:
				setImageNm((String)newValue);
				return;
			case DockerPackage.CONTAINER_OPTIONS__ENV:
				getEnv().clear();
				getEnv().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.CONTAINER_OPTIONS__VOLUMES:
				getVolumes().clear();
				getVolumes().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.CONTAINER_OPTIONS__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.CONTAINER_OPTIONS__SET_CONTAINER_NAME:
				setSetContainerName((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER_OPTIONS__PUBLISH_ALL_PORTS:
				setPublishAllPorts((Boolean)newValue);
				return;
			case DockerPackage.CONTAINER_OPTIONS__PORT_BINDINGS:
				getPortBindings().clear();
				getPortBindings().addAll((Collection<? extends ContainerPortBindings>)newValue);
				return;
			case DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART:
				setAutoRestart((ContainerRestartPolicy)newValue);
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
			case DockerPackage.CONTAINER_OPTIONS__IMAGE_NM:
				setImageNm(IMAGE_NM_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_OPTIONS__ENV:
				getEnv().clear();
				return;
			case DockerPackage.CONTAINER_OPTIONS__VOLUMES:
				getVolumes().clear();
				return;
			case DockerPackage.CONTAINER_OPTIONS__LINKS:
				getLinks().clear();
				return;
			case DockerPackage.CONTAINER_OPTIONS__SET_CONTAINER_NAME:
				setSetContainerName(SET_CONTAINER_NAME_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_OPTIONS__PUBLISH_ALL_PORTS:
				setPublishAllPorts(PUBLISH_ALL_PORTS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_OPTIONS__PORT_BINDINGS:
				getPortBindings().clear();
				return;
			case DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART:
				setAutoRestart((ContainerRestartPolicy)null);
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
			case DockerPackage.CONTAINER_OPTIONS__IMAGE_NM:
				return IMAGE_NM_EDEFAULT == null ? imageNm != null : !IMAGE_NM_EDEFAULT.equals(imageNm);
			case DockerPackage.CONTAINER_OPTIONS__ENV:
				return env != null && !env.isEmpty();
			case DockerPackage.CONTAINER_OPTIONS__VOLUMES:
				return volumes != null && !volumes.isEmpty();
			case DockerPackage.CONTAINER_OPTIONS__LINKS:
				return links != null && !links.isEmpty();
			case DockerPackage.CONTAINER_OPTIONS__SET_CONTAINER_NAME:
				return setContainerName != SET_CONTAINER_NAME_EDEFAULT;
			case DockerPackage.CONTAINER_OPTIONS__PUBLISH_ALL_PORTS:
				return publishAllPorts != PUBLISH_ALL_PORTS_EDEFAULT;
			case DockerPackage.CONTAINER_OPTIONS__PORT_BINDINGS:
				return portBindings != null && !portBindings.isEmpty();
			case DockerPackage.CONTAINER_OPTIONS__AUTO_RESTART:
				return autoRestart != null;
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
		result.append(" (imageNm: ");
		result.append(imageNm);
		result.append(", env: ");
		result.append(env);
		result.append(", volumes: ");
		result.append(volumes);
		result.append(", links: ");
		result.append(links);
		result.append(", setContainerName: ");
		result.append(setContainerName);
		result.append(", publishAllPorts: ");
		result.append(publishAllPorts);
		result.append(')');
		return result.toString();
	}

} //ContainerOptionsImpl
