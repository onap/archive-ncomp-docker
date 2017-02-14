
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
package org.openecomp.ncomp.docker.util;

import org.openecomp.ncomp.core.NamedEntity;
import org.openecomp.ncomp.docker.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.docker.DockerPackage
 * @generated
 */
public class DockerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerSwitch() {
		if (modelPackage == null) {
			modelPackage = DockerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DockerPackage.DOCKER_ADAPTOR: {
				DockerAdaptor dockerAdaptor = (DockerAdaptor)theEObject;
				T result = caseDockerAdaptor(dockerAdaptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_HOST: {
				DockerHost dockerHost = (DockerHost)theEObject;
				T result = caseDockerHost(dockerHost);
				if (result == null) result = caseNamedEntity(dockerHost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_IMAGE: {
				DockerImage dockerImage = (DockerImage)theEObject;
				T result = caseDockerImage(dockerImage);
				if (result == null) result = caseNamedEntity(dockerImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_CONTAINER: {
				DockerContainer dockerContainer = (DockerContainer)theEObject;
				T result = caseDockerContainer(dockerContainer);
				if (result == null) result = caseNamedEntity(dockerContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_PORT: {
				DockerPort dockerPort = (DockerPort)theEObject;
				T result = caseDockerPort(dockerPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_KEY_PAIR: {
				DockerKeyPair dockerKeyPair = (DockerKeyPair)theEObject;
				T result = caseDockerKeyPair(dockerKeyPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_MOUNT: {
				DockerMount dockerMount = (DockerMount)theEObject;
				T result = caseDockerMount(dockerMount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_OPTIONS: {
				ContainerOptions containerOptions = (ContainerOptions)theEObject;
				T result = caseContainerOptions(containerOptions);
				if (result == null) result = caseNamedEntity(containerOptions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_RESTART_POLICY: {
				ContainerRestartPolicy containerRestartPolicy = (ContainerRestartPolicy)theEObject;
				T result = caseContainerRestartPolicy(containerRestartPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_PORT_BINDINGS: {
				ContainerPortBindings containerPortBindings = (ContainerPortBindings)theEObject;
				T result = caseContainerPortBindings(containerPortBindings);
				if (result == null) result = caseNamedEntity(containerPortBindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_NETWORK: {
				DockerNetwork dockerNetwork = (DockerNetwork)theEObject;
				T result = caseDockerNetwork(dockerNetwork);
				if (result == null) result = caseNamedEntity(dockerNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_IPAM: {
				DockerIpam dockerIpam = (DockerIpam)theEObject;
				T result = caseDockerIpam(dockerIpam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_IPAM_CONFIG: {
				DockerIpamConfig dockerIpamConfig = (DockerIpamConfig)theEObject;
				T result = caseDockerIpamConfig(dockerIpamConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_NETWORK_CONTAINER: {
				DockerNetworkContainer dockerNetworkContainer = (DockerNetworkContainer)theEObject;
				T result = caseDockerNetworkContainer(dockerNetworkContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_EVENTS: {
				DockerEvents dockerEvents = (DockerEvents)theEObject;
				T result = caseDockerEvents(dockerEvents);
				if (result == null) result = caseNamedEntity(dockerEvents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_ACTOR: {
				DockerActor dockerActor = (DockerActor)theEObject;
				T result = caseDockerActor(dockerActor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_ACTOR_ATTRIBUTES: {
				DockerActorAttributes dockerActorAttributes = (DockerActorAttributes)theEObject;
				T result = caseDockerActorAttributes(dockerActorAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_CREATE_REQUEST: {
				DockerCreateRequest dockerCreateRequest = (DockerCreateRequest)theEObject;
				T result = caseDockerCreateRequest(dockerCreateRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_PROCESS: {
				DockerProcess dockerProcess = (DockerProcess)theEObject;
				T result = caseDockerProcess(dockerProcess);
				if (result == null) result = caseNamedEntity(dockerProcess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.DOCKER_CONTAINER_STATS: {
				DockerContainerStats dockerContainerStats = (DockerContainerStats)theEObject;
				T result = caseDockerContainerStats(dockerContainerStats);
				if (result == null) result = caseNamedEntity(dockerContainerStats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_NETWORK_STATS: {
				ContainerNetworkStats containerNetworkStats = (ContainerNetworkStats)theEObject;
				T result = caseContainerNetworkStats(containerNetworkStats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_MEMORY_STATS: {
				ContainerMemoryStats containerMemoryStats = (ContainerMemoryStats)theEObject;
				T result = caseContainerMemoryStats(containerMemoryStats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_MEMORY_USAGE: {
				ContainerMemoryUsage containerMemoryUsage = (ContainerMemoryUsage)theEObject;
				T result = caseContainerMemoryUsage(containerMemoryUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_CPU_USAGE: {
				ContainerCpuUsage containerCpuUsage = (ContainerCpuUsage)theEObject;
				T result = caseContainerCpuUsage(containerCpuUsage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DockerPackage.CONTAINER_CPU_STATS: {
				ContainerCpuStats containerCpuStats = (ContainerCpuStats)theEObject;
				T result = caseContainerCpuStats(containerCpuStats);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerAdaptor(DockerAdaptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Host</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Host</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerHost(DockerHost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerImage(DockerImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerContainer(DockerContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerPort(DockerPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerKeyPair(DockerKeyPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerMount(DockerMount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Options</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Options</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerOptions(ContainerOptions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Restart Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Restart Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerRestartPolicy(ContainerRestartPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Port Bindings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Port Bindings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerPortBindings(ContainerPortBindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerNetwork(DockerNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ipam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ipam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerIpam(DockerIpam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ipam Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ipam Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerIpamConfig(DockerIpamConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerNetworkContainer(DockerNetworkContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Events</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Events</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerEvents(DockerEvents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerActor(DockerActor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actor Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actor Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerActorAttributes(DockerActorAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerCreateRequest(DockerCreateRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerProcess(DockerProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerContainerStats(DockerContainerStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Network Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Network Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerNetworkStats(ContainerNetworkStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Memory Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Memory Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerMemoryStats(ContainerMemoryStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Memory Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Memory Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerMemoryUsage(ContainerMemoryUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Cpu Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Cpu Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerCpuUsage(ContainerCpuUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Cpu Stats</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Cpu Stats</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerCpuStats(ContainerCpuStats object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DockerSwitch
