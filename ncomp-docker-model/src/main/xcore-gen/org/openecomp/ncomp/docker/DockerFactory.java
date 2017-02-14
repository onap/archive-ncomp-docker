
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
package org.openecomp.ncomp.docker;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.docker.DockerPackage
 * @generated
 */
public interface DockerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerFactory eINSTANCE = org.openecomp.ncomp.docker.impl.DockerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adaptor</em>'.
	 * @generated
	 */
	DockerAdaptor createDockerAdaptor();

	/**
	 * Returns a new object of class '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Host</em>'.
	 * @generated
	 */
	DockerHost createDockerHost();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	DockerImage createDockerImage();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	DockerContainer createDockerContainer();

	/**
	 * Returns a new object of class '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	DockerPort createDockerPort();

	/**
	 * Returns a new object of class '<em>Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Pair</em>'.
	 * @generated
	 */
	DockerKeyPair createDockerKeyPair();

	/**
	 * Returns a new object of class '<em>Mount</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mount</em>'.
	 * @generated
	 */
	DockerMount createDockerMount();

	/**
	 * Returns a new object of class '<em>Container Options</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Options</em>'.
	 * @generated
	 */
	ContainerOptions createContainerOptions();

	/**
	 * Returns a new object of class '<em>Container Restart Policy</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Restart Policy</em>'.
	 * @generated
	 */
	ContainerRestartPolicy createContainerRestartPolicy();

	/**
	 * Returns a new object of class '<em>Container Port Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Port Bindings</em>'.
	 * @generated
	 */
	ContainerPortBindings createContainerPortBindings();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	DockerNetwork createDockerNetwork();

	/**
	 * Returns a new object of class '<em>Ipam</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ipam</em>'.
	 * @generated
	 */
	DockerIpam createDockerIpam();

	/**
	 * Returns a new object of class '<em>Ipam Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ipam Config</em>'.
	 * @generated
	 */
	DockerIpamConfig createDockerIpamConfig();

	/**
	 * Returns a new object of class '<em>Network Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Container</em>'.
	 * @generated
	 */
	DockerNetworkContainer createDockerNetworkContainer();

	/**
	 * Returns a new object of class '<em>Events</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Events</em>'.
	 * @generated
	 */
	DockerEvents createDockerEvents();

	/**
	 * Returns a new object of class '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor</em>'.
	 * @generated
	 */
	DockerActor createDockerActor();

	/**
	 * Returns a new object of class '<em>Actor Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Actor Attributes</em>'.
	 * @generated
	 */
	DockerActorAttributes createDockerActorAttributes();

	/**
	 * Returns a new object of class '<em>Create Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Request</em>'.
	 * @generated
	 */
	DockerCreateRequest createDockerCreateRequest();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	DockerProcess createDockerProcess();

	/**
	 * Returns a new object of class '<em>Container Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Stats</em>'.
	 * @generated
	 */
	DockerContainerStats createDockerContainerStats();

	/**
	 * Returns a new object of class '<em>Container Network Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Network Stats</em>'.
	 * @generated
	 */
	ContainerNetworkStats createContainerNetworkStats();

	/**
	 * Returns a new object of class '<em>Container Memory Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Memory Stats</em>'.
	 * @generated
	 */
	ContainerMemoryStats createContainerMemoryStats();

	/**
	 * Returns a new object of class '<em>Container Memory Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Memory Usage</em>'.
	 * @generated
	 */
	ContainerMemoryUsage createContainerMemoryUsage();

	/**
	 * Returns a new object of class '<em>Container Cpu Usage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Cpu Usage</em>'.
	 * @generated
	 */
	ContainerCpuUsage createContainerCpuUsage();

	/**
	 * Returns a new object of class '<em>Container Cpu Stats</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container Cpu Stats</em>'.
	 * @generated
	 */
	ContainerCpuStats createContainerCpuStats();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DockerPackage getDockerPackage();

} //DockerFactory
