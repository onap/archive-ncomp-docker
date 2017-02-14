
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.docker.DockerPackage
 * @generated
 */
public class DockerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DockerPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerSwitch<Adapter> modelSwitch =
		new DockerSwitch<Adapter>() {
			@Override
			public Adapter caseDockerAdaptor(DockerAdaptor object) {
				return createDockerAdaptorAdapter();
			}
			@Override
			public Adapter caseDockerHost(DockerHost object) {
				return createDockerHostAdapter();
			}
			@Override
			public Adapter caseDockerImage(DockerImage object) {
				return createDockerImageAdapter();
			}
			@Override
			public Adapter caseDockerContainer(DockerContainer object) {
				return createDockerContainerAdapter();
			}
			@Override
			public Adapter caseDockerPort(DockerPort object) {
				return createDockerPortAdapter();
			}
			@Override
			public Adapter caseDockerKeyPair(DockerKeyPair object) {
				return createDockerKeyPairAdapter();
			}
			@Override
			public Adapter caseDockerMount(DockerMount object) {
				return createDockerMountAdapter();
			}
			@Override
			public Adapter caseContainerOptions(ContainerOptions object) {
				return createContainerOptionsAdapter();
			}
			@Override
			public Adapter caseContainerRestartPolicy(ContainerRestartPolicy object) {
				return createContainerRestartPolicyAdapter();
			}
			@Override
			public Adapter caseContainerPortBindings(ContainerPortBindings object) {
				return createContainerPortBindingsAdapter();
			}
			@Override
			public Adapter caseDockerNetwork(DockerNetwork object) {
				return createDockerNetworkAdapter();
			}
			@Override
			public Adapter caseDockerIpam(DockerIpam object) {
				return createDockerIpamAdapter();
			}
			@Override
			public Adapter caseDockerIpamConfig(DockerIpamConfig object) {
				return createDockerIpamConfigAdapter();
			}
			@Override
			public Adapter caseDockerNetworkContainer(DockerNetworkContainer object) {
				return createDockerNetworkContainerAdapter();
			}
			@Override
			public Adapter caseDockerEvents(DockerEvents object) {
				return createDockerEventsAdapter();
			}
			@Override
			public Adapter caseDockerActor(DockerActor object) {
				return createDockerActorAdapter();
			}
			@Override
			public Adapter caseDockerActorAttributes(DockerActorAttributes object) {
				return createDockerActorAttributesAdapter();
			}
			@Override
			public Adapter caseDockerCreateRequest(DockerCreateRequest object) {
				return createDockerCreateRequestAdapter();
			}
			@Override
			public Adapter caseDockerProcess(DockerProcess object) {
				return createDockerProcessAdapter();
			}
			@Override
			public Adapter caseDockerContainerStats(DockerContainerStats object) {
				return createDockerContainerStatsAdapter();
			}
			@Override
			public Adapter caseContainerNetworkStats(ContainerNetworkStats object) {
				return createContainerNetworkStatsAdapter();
			}
			@Override
			public Adapter caseContainerMemoryStats(ContainerMemoryStats object) {
				return createContainerMemoryStatsAdapter();
			}
			@Override
			public Adapter caseContainerMemoryUsage(ContainerMemoryUsage object) {
				return createContainerMemoryUsageAdapter();
			}
			@Override
			public Adapter caseContainerCpuUsage(ContainerCpuUsage object) {
				return createContainerCpuUsageAdapter();
			}
			@Override
			public Adapter caseContainerCpuStats(ContainerCpuStats object) {
				return createContainerCpuStatsAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerAdaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerAdaptor
	 * @generated
	 */
	public Adapter createDockerAdaptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerHost
	 * @generated
	 */
	public Adapter createDockerHostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerImage
	 * @generated
	 */
	public Adapter createDockerImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerContainer
	 * @generated
	 */
	public Adapter createDockerContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerPort
	 * @generated
	 */
	public Adapter createDockerPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerKeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerKeyPair
	 * @generated
	 */
	public Adapter createDockerKeyPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerMount <em>Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerMount
	 * @generated
	 */
	public Adapter createDockerMountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerOptions <em>Container Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerOptions
	 * @generated
	 */
	public Adapter createContainerOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerRestartPolicy <em>Container Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerRestartPolicy
	 * @generated
	 */
	public Adapter createContainerRestartPolicyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerPortBindings <em>Container Port Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerPortBindings
	 * @generated
	 */
	public Adapter createContainerPortBindingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerNetwork
	 * @generated
	 */
	public Adapter createDockerNetworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerIpam <em>Ipam</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerIpam
	 * @generated
	 */
	public Adapter createDockerIpamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerIpamConfig <em>Ipam Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerIpamConfig
	 * @generated
	 */
	public Adapter createDockerIpamConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerNetworkContainer <em>Network Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerNetworkContainer
	 * @generated
	 */
	public Adapter createDockerNetworkContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerEvents
	 * @generated
	 */
	public Adapter createDockerEventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerActor
	 * @generated
	 */
	public Adapter createDockerActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerActorAttributes <em>Actor Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerActorAttributes
	 * @generated
	 */
	public Adapter createDockerActorAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerCreateRequest <em>Create Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerCreateRequest
	 * @generated
	 */
	public Adapter createDockerCreateRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerProcess
	 * @generated
	 */
	public Adapter createDockerProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.DockerContainerStats <em>Container Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.DockerContainerStats
	 * @generated
	 */
	public Adapter createDockerContainerStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerNetworkStats <em>Container Network Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats
	 * @generated
	 */
	public Adapter createContainerNetworkStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerMemoryStats <em>Container Memory Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats
	 * @generated
	 */
	public Adapter createContainerMemoryStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage <em>Container Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryUsage
	 * @generated
	 */
	public Adapter createContainerMemoryUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerCpuUsage <em>Container Cpu Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerCpuUsage
	 * @generated
	 */
	public Adapter createContainerCpuUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.docker.ContainerCpuStats <em>Container Cpu Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.docker.ContainerCpuStats
	 * @generated
	 */
	public Adapter createContainerCpuStatsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openecomp.ncomp.core.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openecomp.ncomp.core.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DockerAdapterFactory
