
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

import org.openecomp.ncomp.docker.DockerContainer;
import org.openecomp.ncomp.docker.DockerContainerStats;
import org.openecomp.ncomp.docker.DockerEvents;
import org.openecomp.ncomp.docker.DockerKeyPair;
import org.openecomp.ncomp.docker.DockerMount;
import org.openecomp.ncomp.docker.DockerPackage;
import org.openecomp.ncomp.docker.DockerPort;
import org.openecomp.ncomp.docker.DockerProcess;

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
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getNames <em>Names</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getImageID <em>Image ID</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getDockerCreated <em>Docker Created</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getHostConfig <em>Host Config</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getMounts <em>Mounts</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getStats <em>Stats</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerContainerImpl extends NamedEntityImpl implements DockerContainer {
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
	 * The cached value of the '{@link #getNames() <em>Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> names;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getImageID() <em>Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageID()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageID() <em>Image ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageID()
	 * @generated
	 * @ordered
	 */
	protected String imageID = IMAGE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerCreated() <em>Docker Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerCreated()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerCreated() <em>Docker Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerCreated()
	 * @generated
	 * @ordered
	 */
	protected String dockerCreated = DOCKER_CREATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerPort> ports;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerKeyPair> labels;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHostConfig() <em>Host Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerKeyPair> hostConfig;

	/**
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerProcess> processes;

	/**
	 * The cached value of the '{@link #getMounts() <em>Mounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMounts()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerMount> mounts;

	/**
	 * The cached value of the '{@link #getStats() <em>Stats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStats()
	 * @generated
	 * @ordered
	 */
	protected DockerContainerStats stats;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<DockerEvents> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNames() {
		if (names == null) {
			names = new EDataTypeEList<String>(String.class, this, DockerPackage.DOCKER_CONTAINER__NAMES);
		}
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageID() {
		return imageID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageID(String newImageID) {
		String oldImageID = imageID;
		imageID = newImageID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__IMAGE_ID, oldImageID, imageID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDockerCreated() {
		return dockerCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDockerCreated(String newDockerCreated) {
		String oldDockerCreated = dockerCreated;
		dockerCreated = newDockerCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__DOCKER_CREATED, oldDockerCreated, dockerCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerPort> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<DockerPort>(DockerPort.class, this, DockerPackage.DOCKER_CONTAINER__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerKeyPair> getLabels() {
		if (labels == null) {
			labels = new EObjectContainmentEList<DockerKeyPair>(DockerKeyPair.class, this, DockerPackage.DOCKER_CONTAINER__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerKeyPair> getHostConfig() {
		if (hostConfig == null) {
			hostConfig = new EObjectContainmentEList<DockerKeyPair>(DockerKeyPair.class, this, DockerPackage.DOCKER_CONTAINER__HOST_CONFIG);
		}
		return hostConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerProcess> getProcesses() {
		if (processes == null) {
			processes = new EObjectContainmentEList<DockerProcess>(DockerProcess.class, this, DockerPackage.DOCKER_CONTAINER__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerMount> getMounts() {
		if (mounts == null) {
			mounts = new EObjectContainmentEList<DockerMount>(DockerMount.class, this, DockerPackage.DOCKER_CONTAINER__MOUNTS);
		}
		return mounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerContainerStats getStats() {
		return stats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStats(DockerContainerStats newStats, NotificationChain msgs) {
		DockerContainerStats oldStats = stats;
		stats = newStats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__STATS, oldStats, newStats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStats(DockerContainerStats newStats) {
		if (newStats != stats) {
			NotificationChain msgs = null;
			if (stats != null)
				msgs = ((InternalEObject)stats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_CONTAINER__STATS, null, msgs);
			if (newStats != null)
				msgs = ((InternalEObject)newStats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DockerPackage.DOCKER_CONTAINER__STATS, null, msgs);
			msgs = basicSetStats(newStats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_CONTAINER__STATS, newStats, newStats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DockerEvents> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<DockerEvents>(DockerEvents.class, this, DockerPackage.DOCKER_CONTAINER__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DockerPackage.DOCKER_CONTAINER__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_CONTAINER__LABELS:
				return ((InternalEList<?>)getLabels()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_CONTAINER__HOST_CONFIG:
				return ((InternalEList<?>)getHostConfig()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_CONTAINER__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_CONTAINER__MOUNTS:
				return ((InternalEList<?>)getMounts()).basicRemove(otherEnd, msgs);
			case DockerPackage.DOCKER_CONTAINER__STATS:
				return basicSetStats(null, msgs);
			case DockerPackage.DOCKER_CONTAINER__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
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
			case DockerPackage.DOCKER_CONTAINER__ID:
				return getId();
			case DockerPackage.DOCKER_CONTAINER__NAMES:
				return getNames();
			case DockerPackage.DOCKER_CONTAINER__IMAGE:
				return getImage();
			case DockerPackage.DOCKER_CONTAINER__IMAGE_ID:
				return getImageID();
			case DockerPackage.DOCKER_CONTAINER__COMMAND:
				return getCommand();
			case DockerPackage.DOCKER_CONTAINER__DOCKER_CREATED:
				return getDockerCreated();
			case DockerPackage.DOCKER_CONTAINER__PORTS:
				return getPorts();
			case DockerPackage.DOCKER_CONTAINER__LABELS:
				return getLabels();
			case DockerPackage.DOCKER_CONTAINER__STATUS:
				return getStatus();
			case DockerPackage.DOCKER_CONTAINER__HOST_CONFIG:
				return getHostConfig();
			case DockerPackage.DOCKER_CONTAINER__PROCESSES:
				return getProcesses();
			case DockerPackage.DOCKER_CONTAINER__MOUNTS:
				return getMounts();
			case DockerPackage.DOCKER_CONTAINER__STATS:
				return getStats();
			case DockerPackage.DOCKER_CONTAINER__EVENTS:
				return getEvents();
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
			case DockerPackage.DOCKER_CONTAINER__ID:
				setId((String)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__NAMES:
				getNames().clear();
				getNames().addAll((Collection<? extends String>)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__IMAGE:
				setImage((String)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__IMAGE_ID:
				setImageID((String)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__COMMAND:
				setCommand((String)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__DOCKER_CREATED:
				setDockerCreated((String)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends DockerPort>)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__LABELS:
				getLabels().clear();
				getLabels().addAll((Collection<? extends DockerKeyPair>)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__STATUS:
				setStatus((String)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__HOST_CONFIG:
				getHostConfig().clear();
				getHostConfig().addAll((Collection<? extends DockerKeyPair>)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends DockerProcess>)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__MOUNTS:
				getMounts().clear();
				getMounts().addAll((Collection<? extends DockerMount>)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__STATS:
				setStats((DockerContainerStats)newValue);
				return;
			case DockerPackage.DOCKER_CONTAINER__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends DockerEvents>)newValue);
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
			case DockerPackage.DOCKER_CONTAINER__ID:
				setId(ID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_CONTAINER__NAMES:
				getNames().clear();
				return;
			case DockerPackage.DOCKER_CONTAINER__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case DockerPackage.DOCKER_CONTAINER__IMAGE_ID:
				setImageID(IMAGE_ID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_CONTAINER__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case DockerPackage.DOCKER_CONTAINER__DOCKER_CREATED:
				setDockerCreated(DOCKER_CREATED_EDEFAULT);
				return;
			case DockerPackage.DOCKER_CONTAINER__PORTS:
				getPorts().clear();
				return;
			case DockerPackage.DOCKER_CONTAINER__LABELS:
				getLabels().clear();
				return;
			case DockerPackage.DOCKER_CONTAINER__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case DockerPackage.DOCKER_CONTAINER__HOST_CONFIG:
				getHostConfig().clear();
				return;
			case DockerPackage.DOCKER_CONTAINER__PROCESSES:
				getProcesses().clear();
				return;
			case DockerPackage.DOCKER_CONTAINER__MOUNTS:
				getMounts().clear();
				return;
			case DockerPackage.DOCKER_CONTAINER__STATS:
				setStats((DockerContainerStats)null);
				return;
			case DockerPackage.DOCKER_CONTAINER__EVENTS:
				getEvents().clear();
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
			case DockerPackage.DOCKER_CONTAINER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DockerPackage.DOCKER_CONTAINER__NAMES:
				return names != null && !names.isEmpty();
			case DockerPackage.DOCKER_CONTAINER__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case DockerPackage.DOCKER_CONTAINER__IMAGE_ID:
				return IMAGE_ID_EDEFAULT == null ? imageID != null : !IMAGE_ID_EDEFAULT.equals(imageID);
			case DockerPackage.DOCKER_CONTAINER__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
			case DockerPackage.DOCKER_CONTAINER__DOCKER_CREATED:
				return DOCKER_CREATED_EDEFAULT == null ? dockerCreated != null : !DOCKER_CREATED_EDEFAULT.equals(dockerCreated);
			case DockerPackage.DOCKER_CONTAINER__PORTS:
				return ports != null && !ports.isEmpty();
			case DockerPackage.DOCKER_CONTAINER__LABELS:
				return labels != null && !labels.isEmpty();
			case DockerPackage.DOCKER_CONTAINER__STATUS:
				return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
			case DockerPackage.DOCKER_CONTAINER__HOST_CONFIG:
				return hostConfig != null && !hostConfig.isEmpty();
			case DockerPackage.DOCKER_CONTAINER__PROCESSES:
				return processes != null && !processes.isEmpty();
			case DockerPackage.DOCKER_CONTAINER__MOUNTS:
				return mounts != null && !mounts.isEmpty();
			case DockerPackage.DOCKER_CONTAINER__STATS:
				return stats != null;
			case DockerPackage.DOCKER_CONTAINER__EVENTS:
				return events != null && !events.isEmpty();
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
		result.append(", names: ");
		result.append(names);
		result.append(", image: ");
		result.append(image);
		result.append(", imageID: ");
		result.append(imageID);
		result.append(", command: ");
		result.append(command);
		result.append(", dockerCreated: ");
		result.append(dockerCreated);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //DockerContainerImpl
