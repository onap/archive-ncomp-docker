
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
import org.openecomp.ncomp.docker.DockerContainer;
import org.openecomp.ncomp.docker.DockerHost;
import org.openecomp.ncomp.docker.DockerImage;
import org.openecomp.ncomp.docker.DockerNetwork;
import org.openecomp.ncomp.docker.DockerPackage;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerHostImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerHostImpl#getPollingFrequency <em>Polling Frequency</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerHostImpl#isRemote <em>Remote</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerHostImpl#getImages <em>Images</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerHostImpl#getContainers <em>Containers</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerHostImpl#getNetworks <em>Networks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerHostImpl extends NamedEntityImpl implements DockerHost {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingFrequency() <em>Polling Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final long POLLING_FREQUENCY_EDEFAULT = 30000L;

	/**
	 * The cached value of the '{@link #getPollingFrequency() <em>Polling Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingFrequency()
	 * @generated
	 * @ordered
	 */
	protected long pollingFrequency = POLLING_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected boolean remote = REMOTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerImage> images;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerContainer> containers;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerNetwork> networks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerHostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_HOST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_HOST__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPollingFrequency() {
		return pollingFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingFrequency(long newPollingFrequency) {
		long oldPollingFrequency = pollingFrequency;
		pollingFrequency = newPollingFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_HOST__POLLING_FREQUENCY, oldPollingFrequency, pollingFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(boolean newRemote) {
		boolean oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_HOST__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerImage> getImages() {
		if (images == null) {
			images = new EObjectContainmentEList<DockerImage>(DockerImage.class, this, DockerPackage.DOCKER_HOST__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<DockerContainer>(DockerContainer.class, this, DockerPackage.DOCKER_HOST__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerNetwork> getNetworks() {
		if (networks == null) {
			networks = new EObjectContainmentEList<DockerNetwork>(DockerNetwork.class, this, DockerPackage.DOCKER_HOST__NETWORKS);
		}
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void poll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void startContainer(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stopContainer(String name, int seconds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void restartContainer(String name, int seconds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void pauseContainer(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unpauseContainer(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeContainer(String name, boolean remove, boolean force) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void inspectContainer(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void killContainer(String name, String sigint) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dockerRun(String image) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dockerRunWithName(String image, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dockerRunWithOptions(String image, ContainerOptions opts) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void containerStats(String name, boolean stream) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void containerProcesses(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.DOCKER_HOST__IMAGES:
				return ((InternalEList<?>)getImages()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_HOST__CONTAINERS:
				return ((InternalEList<?>)getContainers()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_HOST__NETWORKS:
				return ((InternalEList<?>)getNetworks()).basicRemove(otherEnd, msgs);
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
			case DockerPackage.DOCKER_HOST__URL:
				return getUrl();
			case DockerPackage.DOCKER_HOST__POLLING_FREQUENCY:
				return getPollingFrequency();
			case DockerPackage.DOCKER_HOST__REMOTE:
				return isRemote();
			case DockerPackage.DOCKER_HOST__IMAGES:
				return getImages();
			case DockerPackage.DOCKER_HOST__CONTAINERS:
				return getContainers();
			case DockerPackage.DOCKER_HOST__NETWORKS:
				return getNetworks();
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
			case DockerPackage.DOCKER_HOST__URL:
				setUrl((String)newValue);
				return;
			case DockerPackage.DOCKER_HOST__POLLING_FREQUENCY:
				setPollingFrequency((Long)newValue);
				return;
			case DockerPackage.DOCKER_HOST__REMOTE:
				setRemote((Boolean)newValue);
				return;
			case DockerPackage.DOCKER_HOST__IMAGES:
				getImages().clear();
				getImages().addAll((Collection<? extends DockerImage>)newValue);
				return;
			case DockerPackage.DOCKER_HOST__CONTAINERS:
				getContainers().clear();
				getContainers().addAll((Collection<? extends DockerContainer>)newValue);
				return;
			case DockerPackage.DOCKER_HOST__NETWORKS:
				getNetworks().clear();
				getNetworks().addAll((Collection<? extends DockerNetwork>)newValue);
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
			case DockerPackage.DOCKER_HOST__URL:
				setUrl(URL_EDEFAULT);
				return;
			case DockerPackage.DOCKER_HOST__POLLING_FREQUENCY:
				setPollingFrequency(POLLING_FREQUENCY_EDEFAULT);
				return;
			case DockerPackage.DOCKER_HOST__REMOTE:
				setRemote(REMOTE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_HOST__IMAGES:
				getImages().clear();
				return;
			case DockerPackage.DOCKER_HOST__CONTAINERS:
				getContainers().clear();
				return;
			case DockerPackage.DOCKER_HOST__NETWORKS:
				getNetworks().clear();
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
			case DockerPackage.DOCKER_HOST__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case DockerPackage.DOCKER_HOST__POLLING_FREQUENCY:
				return pollingFrequency != POLLING_FREQUENCY_EDEFAULT;
			case DockerPackage.DOCKER_HOST__REMOTE:
				return remote != REMOTE_EDEFAULT;
			case DockerPackage.DOCKER_HOST__IMAGES:
				return images != null && !images.isEmpty();
			case DockerPackage.DOCKER_HOST__CONTAINERS:
				return containers != null && !containers.isEmpty();
			case DockerPackage.DOCKER_HOST__NETWORKS:
				return networks != null && !networks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DockerPackage.DOCKER_HOST___POLL:
				poll();
				return null;
			case DockerPackage.DOCKER_HOST___START_CONTAINER__STRING:
				startContainer((String)arguments.get(0));
				return null;
			case DockerPackage.DOCKER_HOST___STOP_CONTAINER__STRING_INT:
				stopContainer((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case DockerPackage.DOCKER_HOST___RESTART_CONTAINER__STRING_INT:
				restartContainer((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case DockerPackage.DOCKER_HOST___PAUSE_CONTAINER__STRING:
				pauseContainer((String)arguments.get(0));
				return null;
			case DockerPackage.DOCKER_HOST___UNPAUSE_CONTAINER__STRING:
				unpauseContainer((String)arguments.get(0));
				return null;
			case DockerPackage.DOCKER_HOST___REMOVE_CONTAINER__STRING_BOOLEAN_BOOLEAN:
				removeContainer((String)arguments.get(0), (Boolean)arguments.get(1), (Boolean)arguments.get(2));
				return null;
			case DockerPackage.DOCKER_HOST___INSPECT_CONTAINER__STRING:
				inspectContainer((String)arguments.get(0));
				return null;
			case DockerPackage.DOCKER_HOST___KILL_CONTAINER__STRING_STRING:
				killContainer((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case DockerPackage.DOCKER_HOST___DOCKER_RUN__STRING:
				dockerRun((String)arguments.get(0));
				return null;
			case DockerPackage.DOCKER_HOST___DOCKER_RUN_WITH_NAME__STRING_STRING:
				dockerRunWithName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case DockerPackage.DOCKER_HOST___DOCKER_RUN_WITH_OPTIONS__STRING_CONTAINEROPTIONS:
				dockerRunWithOptions((String)arguments.get(0), (ContainerOptions)arguments.get(1));
				return null;
			case DockerPackage.DOCKER_HOST___CONTAINER_STATS__STRING_BOOLEAN:
				containerStats((String)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case DockerPackage.DOCKER_HOST___CONTAINER_PROCESSES__STRING:
				containerProcesses((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (url: ");
		result.append(url);
		result.append(", pollingFrequency: ");
		result.append(pollingFrequency);
		result.append(", remote: ");
		result.append(remote);
		result.append(')');
		return result.toString();
	}

} //DockerHostImpl
