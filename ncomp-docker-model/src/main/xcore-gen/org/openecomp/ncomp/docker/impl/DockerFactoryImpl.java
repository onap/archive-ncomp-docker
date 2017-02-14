
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

import org.openecomp.ncomp.docker.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerFactoryImpl extends EFactoryImpl implements DockerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockerFactory init() {
		try {
			DockerFactory theDockerFactory = (DockerFactory)EPackage.Registry.INSTANCE.getEFactory(DockerPackage.eNS_URI);
			if (theDockerFactory != null) {
				return theDockerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DockerPackage.DOCKER_ADAPTOR: return createDockerAdaptor();
			case DockerPackage.DOCKER_HOST: return createDockerHost();
			case DockerPackage.DOCKER_IMAGE: return createDockerImage();
			case DockerPackage.DOCKER_CONTAINER: return createDockerContainer();
			case DockerPackage.DOCKER_PORT: return createDockerPort();
			case DockerPackage.DOCKER_KEY_PAIR: return createDockerKeyPair();
			case DockerPackage.DOCKER_MOUNT: return createDockerMount();
			case DockerPackage.CONTAINER_OPTIONS: return createContainerOptions();
			case DockerPackage.CONTAINER_RESTART_POLICY: return createContainerRestartPolicy();
			case DockerPackage.CONTAINER_PORT_BINDINGS: return createContainerPortBindings();
			case DockerPackage.DOCKER_NETWORK: return createDockerNetwork();
			case DockerPackage.DOCKER_IPAM: return createDockerIpam();
			case DockerPackage.DOCKER_IPAM_CONFIG: return createDockerIpamConfig();
			case DockerPackage.DOCKER_NETWORK_CONTAINER: return createDockerNetworkContainer();
			case DockerPackage.DOCKER_EVENTS: return createDockerEvents();
			case DockerPackage.DOCKER_ACTOR: return createDockerActor();
			case DockerPackage.DOCKER_ACTOR_ATTRIBUTES: return createDockerActorAttributes();
			case DockerPackage.DOCKER_CREATE_REQUEST: return createDockerCreateRequest();
			case DockerPackage.DOCKER_PROCESS: return createDockerProcess();
			case DockerPackage.DOCKER_CONTAINER_STATS: return createDockerContainerStats();
			case DockerPackage.CONTAINER_NETWORK_STATS: return createContainerNetworkStats();
			case DockerPackage.CONTAINER_MEMORY_STATS: return createContainerMemoryStats();
			case DockerPackage.CONTAINER_MEMORY_USAGE: return createContainerMemoryUsage();
			case DockerPackage.CONTAINER_CPU_USAGE: return createContainerCpuUsage();
			case DockerPackage.CONTAINER_CPU_STATS: return createContainerCpuStats();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerAdaptor createDockerAdaptor() {
		DockerAdaptorImpl dockerAdaptor = new DockerAdaptorImpl();
		return dockerAdaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerHost createDockerHost() {
		DockerHostImpl dockerHost = new DockerHostImpl();
		return dockerHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerImage createDockerImage() {
		DockerImageImpl dockerImage = new DockerImageImpl();
		return dockerImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerContainer createDockerContainer() {
		DockerContainerImpl dockerContainer = new DockerContainerImpl();
		return dockerContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerPort createDockerPort() {
		DockerPortImpl dockerPort = new DockerPortImpl();
		return dockerPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerKeyPair createDockerKeyPair() {
		DockerKeyPairImpl dockerKeyPair = new DockerKeyPairImpl();
		return dockerKeyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerMount createDockerMount() {
		DockerMountImpl dockerMount = new DockerMountImpl();
		return dockerMount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerOptions createContainerOptions() {
		ContainerOptionsImpl containerOptions = new ContainerOptionsImpl();
		return containerOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerRestartPolicy createContainerRestartPolicy() {
		ContainerRestartPolicyImpl containerRestartPolicy = new ContainerRestartPolicyImpl();
		return containerRestartPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerPortBindings createContainerPortBindings() {
		ContainerPortBindingsImpl containerPortBindings = new ContainerPortBindingsImpl();
		return containerPortBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerNetwork createDockerNetwork() {
		DockerNetworkImpl dockerNetwork = new DockerNetworkImpl();
		return dockerNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerIpam createDockerIpam() {
		DockerIpamImpl dockerIpam = new DockerIpamImpl();
		return dockerIpam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerIpamConfig createDockerIpamConfig() {
		DockerIpamConfigImpl dockerIpamConfig = new DockerIpamConfigImpl();
		return dockerIpamConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerNetworkContainer createDockerNetworkContainer() {
		DockerNetworkContainerImpl dockerNetworkContainer = new DockerNetworkContainerImpl();
		return dockerNetworkContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerEvents createDockerEvents() {
		DockerEventsImpl dockerEvents = new DockerEventsImpl();
		return dockerEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerActor createDockerActor() {
		DockerActorImpl dockerActor = new DockerActorImpl();
		return dockerActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerActorAttributes createDockerActorAttributes() {
		DockerActorAttributesImpl dockerActorAttributes = new DockerActorAttributesImpl();
		return dockerActorAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerCreateRequest createDockerCreateRequest() {
		DockerCreateRequestImpl dockerCreateRequest = new DockerCreateRequestImpl();
		return dockerCreateRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerProcess createDockerProcess() {
		DockerProcessImpl dockerProcess = new DockerProcessImpl();
		return dockerProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerContainerStats createDockerContainerStats() {
		DockerContainerStatsImpl dockerContainerStats = new DockerContainerStatsImpl();
		return dockerContainerStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerNetworkStats createContainerNetworkStats() {
		ContainerNetworkStatsImpl containerNetworkStats = new ContainerNetworkStatsImpl();
		return containerNetworkStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerMemoryStats createContainerMemoryStats() {
		ContainerMemoryStatsImpl containerMemoryStats = new ContainerMemoryStatsImpl();
		return containerMemoryStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerMemoryUsage createContainerMemoryUsage() {
		ContainerMemoryUsageImpl containerMemoryUsage = new ContainerMemoryUsageImpl();
		return containerMemoryUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerCpuUsage createContainerCpuUsage() {
		ContainerCpuUsageImpl containerCpuUsage = new ContainerCpuUsageImpl();
		return containerCpuUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerCpuStats createContainerCpuStats() {
		ContainerCpuStatsImpl containerCpuStats = new ContainerCpuStatsImpl();
		return containerCpuStats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerPackage getDockerPackage() {
		return (DockerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockerPackage getPackage() {
		return DockerPackage.eINSTANCE;
	}

} //DockerFactoryImpl
