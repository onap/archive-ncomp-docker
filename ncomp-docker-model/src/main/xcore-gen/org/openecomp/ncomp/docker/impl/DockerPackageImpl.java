
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

import org.openecomp.ncomp.core.CorePackage;

import org.openecomp.ncomp.docker.ContainerCpuStats;
import org.openecomp.ncomp.docker.ContainerCpuUsage;
import org.openecomp.ncomp.docker.ContainerMemoryStats;
import org.openecomp.ncomp.docker.ContainerMemoryUsage;
import org.openecomp.ncomp.docker.ContainerNetworkStats;
import org.openecomp.ncomp.docker.ContainerOptions;
import org.openecomp.ncomp.docker.ContainerPortBindings;
import org.openecomp.ncomp.docker.ContainerRestartPolicy;
import org.openecomp.ncomp.docker.DockerActor;
import org.openecomp.ncomp.docker.DockerActorAttributes;
import org.openecomp.ncomp.docker.DockerAdaptor;
import org.openecomp.ncomp.docker.DockerContainer;
import org.openecomp.ncomp.docker.DockerContainerStats;
import org.openecomp.ncomp.docker.DockerCreateRequest;
import org.openecomp.ncomp.docker.DockerEvents;
import org.openecomp.ncomp.docker.DockerFactory;
import org.openecomp.ncomp.docker.DockerHost;
import org.openecomp.ncomp.docker.DockerImage;
import org.openecomp.ncomp.docker.DockerIpam;
import org.openecomp.ncomp.docker.DockerIpamConfig;
import org.openecomp.ncomp.docker.DockerKeyPair;
import org.openecomp.ncomp.docker.DockerMount;
import org.openecomp.ncomp.docker.DockerNetwork;
import org.openecomp.ncomp.docker.DockerNetworkContainer;
import org.openecomp.ncomp.docker.DockerPackage;
import org.openecomp.ncomp.docker.DockerPort;
import org.openecomp.ncomp.docker.DockerProcess;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockerPackageImpl extends EPackageImpl implements DockerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerAdaptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerHostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerKeyPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerMountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerRestartPolicyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortBindingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerIpamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerIpamConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerNetworkContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerEventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerActorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerActorAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerCreateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dockerContainerStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerNetworkStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerMemoryStatsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerMemoryUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCpuUsageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCpuStatsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.docker.DockerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DockerPackageImpl() {
		super(eNS_URI, DockerFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DockerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DockerPackage init() {
		if (isInited) return (DockerPackage)EPackage.Registry.INSTANCE.getEPackage(DockerPackage.eNS_URI);

		// Obtain or create and register package
		DockerPackageImpl theDockerPackage = (DockerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DockerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DockerPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDockerPackage.createPackageContents();

		// Initialize created meta-data
		theDockerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDockerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DockerPackage.eNS_URI, theDockerPackage);
		return theDockerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerAdaptor() {
		return dockerAdaptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerAdaptor_DockerHosts() {
		return (EReference)dockerAdaptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerHost() {
		return dockerHostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerHost_Url() {
		return (EAttribute)dockerHostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerHost_PollingFrequency() {
		return (EAttribute)dockerHostEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerHost_Remote() {
		return (EAttribute)dockerHostEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerHost_Images() {
		return (EReference)dockerHostEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerHost_Containers() {
		return (EReference)dockerHostEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerHost_Networks() {
		return (EReference)dockerHostEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__Poll() {
		return dockerHostEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__StartContainer__String() {
		return dockerHostEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__StopContainer__String_int() {
		return dockerHostEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__RestartContainer__String_int() {
		return dockerHostEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__PauseContainer__String() {
		return dockerHostEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__UnpauseContainer__String() {
		return dockerHostEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__RemoveContainer__String_boolean_boolean() {
		return dockerHostEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__InspectContainer__String() {
		return dockerHostEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__KillContainer__String_String() {
		return dockerHostEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__DockerRun__String() {
		return dockerHostEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__DockerRunWithName__String_String() {
		return dockerHostEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__DockerRunWithOptions__String_ContainerOptions() {
		return dockerHostEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__ContainerStats__String_boolean() {
		return dockerHostEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDockerHost__ContainerProcesses__String() {
		return dockerHostEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerImage() {
		return dockerImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_Id() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_ParentId() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_RepoTags() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_RepoDigests() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_DockerCreated() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_Size() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_VirtualSize() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerImage_Labels() {
		return (EAttribute)dockerImageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerContainer() {
		return dockerContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainer_Id() {
		return (EAttribute)dockerContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainer_Names() {
		return (EAttribute)dockerContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainer_Image() {
		return (EAttribute)dockerContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainer_ImageID() {
		return (EAttribute)dockerContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainer_Command() {
		return (EAttribute)dockerContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainer_DockerCreated() {
		return (EAttribute)dockerContainerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_Ports() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_Labels() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainer_Status() {
		return (EAttribute)dockerContainerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_HostConfig() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_Processes() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_Mounts() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_Stats() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainer_Events() {
		return (EReference)dockerContainerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerPort() {
		return dockerPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerPort_PrivatePort() {
		return (EAttribute)dockerPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerPort_PublicPort() {
		return (EAttribute)dockerPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerPort_Type() {
		return (EAttribute)dockerPortEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerKeyPair() {
		return dockerKeyPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerKeyPair_Name() {
		return (EAttribute)dockerKeyPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerKeyPair_Value() {
		return (EAttribute)dockerKeyPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerMount() {
		return dockerMountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerMount_Source() {
		return (EAttribute)dockerMountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerMount_Destination() {
		return (EAttribute)dockerMountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerMount_Mode() {
		return (EAttribute)dockerMountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerMount_RW() {
		return (EAttribute)dockerMountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerMount_Propagation() {
		return (EAttribute)dockerMountEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerOptions() {
		return containerOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerOptions_ImageNm() {
		return (EAttribute)containerOptionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerOptions_Env() {
		return (EAttribute)containerOptionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerOptions_Volumes() {
		return (EAttribute)containerOptionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerOptions_Links() {
		return (EAttribute)containerOptionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerOptions_SetContainerName() {
		return (EAttribute)containerOptionsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerOptions_PublishAllPorts() {
		return (EAttribute)containerOptionsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerOptions_PortBindings() {
		return (EReference)containerOptionsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerOptions_AutoRestart() {
		return (EReference)containerOptionsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerRestartPolicy() {
		return containerRestartPolicyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerRestartPolicy_Nm() {
		return (EAttribute)containerRestartPolicyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerRestartPolicy_MaxRetryCnt() {
		return (EAttribute)containerRestartPolicyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerPortBindings() {
		return containerPortBindingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerPortBindings_ContainerPort() {
		return (EAttribute)containerPortBindingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerPortBindings_Protocol() {
		return (EAttribute)containerPortBindingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerPortBindings_VmPort() {
		return (EAttribute)containerPortBindingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerNetwork() {
		return dockerNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetwork_Id() {
		return (EAttribute)dockerNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetwork_Scope() {
		return (EAttribute)dockerNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetwork_Driver() {
		return (EAttribute)dockerNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerNetwork_IPAM() {
		return (EReference)dockerNetworkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerNetwork_Containers() {
		return (EReference)dockerNetworkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerNetwork_Options() {
		return (EReference)dockerNetworkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerIpam() {
		return dockerIpamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerIpam_Driver() {
		return (EAttribute)dockerIpamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerIpam_Config() {
		return (EReference)dockerIpamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerIpamConfig() {
		return dockerIpamConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerIpamConfig_Subnet() {
		return (EAttribute)dockerIpamConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerNetworkContainer() {
		return dockerNetworkContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetworkContainer_Id() {
		return (EAttribute)dockerNetworkContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetworkContainer_IPv4Address() {
		return (EAttribute)dockerNetworkContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetworkContainer_IPv6Address() {
		return (EAttribute)dockerNetworkContainerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetworkContainer_EndpointID() {
		return (EAttribute)dockerNetworkContainerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerNetworkContainer_MacAddress() {
		return (EAttribute)dockerNetworkContainerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerEvents() {
		return dockerEventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerEvents_Status() {
		return (EAttribute)dockerEventsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerEvents_Id() {
		return (EAttribute)dockerEventsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerEvents_Type() {
		return (EAttribute)dockerEventsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerEvents_Action() {
		return (EAttribute)dockerEventsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerEvents_Actor() {
		return (EReference)dockerEventsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerEvents_Time() {
		return (EAttribute)dockerEventsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerEvents_Timenano() {
		return (EAttribute)dockerEventsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerActor() {
		return dockerActorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerActor_Id() {
		return (EAttribute)dockerActorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerActor_Attributes() {
		return (EReference)dockerActorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerActorAttributes() {
		return dockerActorAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerActorAttributes_Name() {
		return (EAttribute)dockerActorAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerCreateRequest() {
		return dockerCreateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerCreateRequest_Hostname() {
		return (EAttribute)dockerCreateRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerCreateRequest_Cmd() {
		return (EAttribute)dockerCreateRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerProcess() {
		return dockerProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_User() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Pid() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Cpu() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Mem() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Vsz() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Rss() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Tty() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Stat() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Start() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_TimeElapsed() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerProcess_Command() {
		return (EAttribute)dockerProcessEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDockerContainerStats() {
		return dockerContainerStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainerStats_Networks() {
		return (EReference)dockerContainerStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainerStats_Memory() {
		return (EReference)dockerContainerStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDockerContainerStats_Cpu() {
		return (EReference)dockerContainerStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDockerContainerStats_LastRead() {
		return (EAttribute)dockerContainerStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerNetworkStats() {
		return containerNetworkStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Intf() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Rx_bytes() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Rx_dropped() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Rx_errors() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Rx_packets() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Tx_bytes() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Tx_dropped() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Tx_errors() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerNetworkStats_Tx_packets() {
		return (EAttribute)containerNetworkStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerMemoryStats() {
		return containerMemoryStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_pgmajfault() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Cache() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Mapped_file() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_inactive_file() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Pgpgout() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Rss() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_mapped_file() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Writeback() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Unevictable() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Pgpgin() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_unevictable() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Pgmajfault() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_rss() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_rss_huge() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_writeback() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_inactive_anon() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Rss_huge() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Hierarchical_memory_limit() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_pgfault() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_active_file() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Active_anon() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_active_anon() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_pgpgout() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_cache() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Inactive_anon() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Active_file() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Pgfault() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Inactive_file() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryStats_Total_pgpgin() {
		return (EAttribute)containerMemoryStatsEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerMemoryUsage() {
		return containerMemoryUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerMemoryUsage_Memstats() {
		return (EReference)containerMemoryUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryUsage_Max_usage() {
		return (EAttribute)containerMemoryUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryUsage_Usage() {
		return (EAttribute)containerMemoryUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryUsage_Failcnt() {
		return (EAttribute)containerMemoryUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerMemoryUsage_Limit() {
		return (EAttribute)containerMemoryUsageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerCpuUsage() {
		return containerCpuUsageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerCpuUsage_Percpu_usage() {
		return (EAttribute)containerCpuUsageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerCpuUsage_Usage_in_usermode() {
		return (EAttribute)containerCpuUsageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerCpuUsage_Total_usage() {
		return (EAttribute)containerCpuUsageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerCpuUsage_User_in_kernelmode() {
		return (EAttribute)containerCpuUsageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerCpuStats() {
		return containerCpuStatsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerCpuStats_Cpu_usage() {
		return (EReference)containerCpuStatsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerCpuStats_System_cpu_usage() {
		return (EAttribute)containerCpuStatsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockerFactory getDockerFactory() {
		return (DockerFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dockerAdaptorEClass = createEClass(DOCKER_ADAPTOR);
		createEReference(dockerAdaptorEClass, DOCKER_ADAPTOR__DOCKER_HOSTS);

		dockerHostEClass = createEClass(DOCKER_HOST);
		createEAttribute(dockerHostEClass, DOCKER_HOST__URL);
		createEAttribute(dockerHostEClass, DOCKER_HOST__POLLING_FREQUENCY);
		createEAttribute(dockerHostEClass, DOCKER_HOST__REMOTE);
		createEReference(dockerHostEClass, DOCKER_HOST__IMAGES);
		createEReference(dockerHostEClass, DOCKER_HOST__CONTAINERS);
		createEReference(dockerHostEClass, DOCKER_HOST__NETWORKS);
		createEOperation(dockerHostEClass, DOCKER_HOST___POLL);
		createEOperation(dockerHostEClass, DOCKER_HOST___START_CONTAINER__STRING);
		createEOperation(dockerHostEClass, DOCKER_HOST___STOP_CONTAINER__STRING_INT);
		createEOperation(dockerHostEClass, DOCKER_HOST___RESTART_CONTAINER__STRING_INT);
		createEOperation(dockerHostEClass, DOCKER_HOST___PAUSE_CONTAINER__STRING);
		createEOperation(dockerHostEClass, DOCKER_HOST___UNPAUSE_CONTAINER__STRING);
		createEOperation(dockerHostEClass, DOCKER_HOST___REMOVE_CONTAINER__STRING_BOOLEAN_BOOLEAN);
		createEOperation(dockerHostEClass, DOCKER_HOST___INSPECT_CONTAINER__STRING);
		createEOperation(dockerHostEClass, DOCKER_HOST___KILL_CONTAINER__STRING_STRING);
		createEOperation(dockerHostEClass, DOCKER_HOST___DOCKER_RUN__STRING);
		createEOperation(dockerHostEClass, DOCKER_HOST___DOCKER_RUN_WITH_NAME__STRING_STRING);
		createEOperation(dockerHostEClass, DOCKER_HOST___DOCKER_RUN_WITH_OPTIONS__STRING_CONTAINEROPTIONS);
		createEOperation(dockerHostEClass, DOCKER_HOST___CONTAINER_STATS__STRING_BOOLEAN);
		createEOperation(dockerHostEClass, DOCKER_HOST___CONTAINER_PROCESSES__STRING);

		dockerImageEClass = createEClass(DOCKER_IMAGE);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__ID);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__PARENT_ID);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__REPO_TAGS);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__REPO_DIGESTS);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__DOCKER_CREATED);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__SIZE);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__VIRTUAL_SIZE);
		createEAttribute(dockerImageEClass, DOCKER_IMAGE__LABELS);

		dockerContainerEClass = createEClass(DOCKER_CONTAINER);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__ID);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__NAMES);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__IMAGE);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__IMAGE_ID);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__COMMAND);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__DOCKER_CREATED);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__PORTS);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__LABELS);
		createEAttribute(dockerContainerEClass, DOCKER_CONTAINER__STATUS);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__HOST_CONFIG);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__PROCESSES);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__MOUNTS);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__STATS);
		createEReference(dockerContainerEClass, DOCKER_CONTAINER__EVENTS);

		dockerPortEClass = createEClass(DOCKER_PORT);
		createEAttribute(dockerPortEClass, DOCKER_PORT__PRIVATE_PORT);
		createEAttribute(dockerPortEClass, DOCKER_PORT__PUBLIC_PORT);
		createEAttribute(dockerPortEClass, DOCKER_PORT__TYPE);

		dockerKeyPairEClass = createEClass(DOCKER_KEY_PAIR);
		createEAttribute(dockerKeyPairEClass, DOCKER_KEY_PAIR__NAME);
		createEAttribute(dockerKeyPairEClass, DOCKER_KEY_PAIR__VALUE);

		dockerMountEClass = createEClass(DOCKER_MOUNT);
		createEAttribute(dockerMountEClass, DOCKER_MOUNT__SOURCE);
		createEAttribute(dockerMountEClass, DOCKER_MOUNT__DESTINATION);
		createEAttribute(dockerMountEClass, DOCKER_MOUNT__MODE);
		createEAttribute(dockerMountEClass, DOCKER_MOUNT__RW);
		createEAttribute(dockerMountEClass, DOCKER_MOUNT__PROPAGATION);

		containerOptionsEClass = createEClass(CONTAINER_OPTIONS);
		createEAttribute(containerOptionsEClass, CONTAINER_OPTIONS__IMAGE_NM);
		createEAttribute(containerOptionsEClass, CONTAINER_OPTIONS__ENV);
		createEAttribute(containerOptionsEClass, CONTAINER_OPTIONS__VOLUMES);
		createEAttribute(containerOptionsEClass, CONTAINER_OPTIONS__LINKS);
		createEAttribute(containerOptionsEClass, CONTAINER_OPTIONS__SET_CONTAINER_NAME);
		createEAttribute(containerOptionsEClass, CONTAINER_OPTIONS__PUBLISH_ALL_PORTS);
		createEReference(containerOptionsEClass, CONTAINER_OPTIONS__PORT_BINDINGS);
		createEReference(containerOptionsEClass, CONTAINER_OPTIONS__AUTO_RESTART);

		containerRestartPolicyEClass = createEClass(CONTAINER_RESTART_POLICY);
		createEAttribute(containerRestartPolicyEClass, CONTAINER_RESTART_POLICY__NM);
		createEAttribute(containerRestartPolicyEClass, CONTAINER_RESTART_POLICY__MAX_RETRY_CNT);

		containerPortBindingsEClass = createEClass(CONTAINER_PORT_BINDINGS);
		createEAttribute(containerPortBindingsEClass, CONTAINER_PORT_BINDINGS__CONTAINER_PORT);
		createEAttribute(containerPortBindingsEClass, CONTAINER_PORT_BINDINGS__PROTOCOL);
		createEAttribute(containerPortBindingsEClass, CONTAINER_PORT_BINDINGS__VM_PORT);

		dockerNetworkEClass = createEClass(DOCKER_NETWORK);
		createEAttribute(dockerNetworkEClass, DOCKER_NETWORK__ID);
		createEAttribute(dockerNetworkEClass, DOCKER_NETWORK__SCOPE);
		createEAttribute(dockerNetworkEClass, DOCKER_NETWORK__DRIVER);
		createEReference(dockerNetworkEClass, DOCKER_NETWORK__IPAM);
		createEReference(dockerNetworkEClass, DOCKER_NETWORK__CONTAINERS);
		createEReference(dockerNetworkEClass, DOCKER_NETWORK__OPTIONS);

		dockerIpamEClass = createEClass(DOCKER_IPAM);
		createEAttribute(dockerIpamEClass, DOCKER_IPAM__DRIVER);
		createEReference(dockerIpamEClass, DOCKER_IPAM__CONFIG);

		dockerIpamConfigEClass = createEClass(DOCKER_IPAM_CONFIG);
		createEAttribute(dockerIpamConfigEClass, DOCKER_IPAM_CONFIG__SUBNET);

		dockerNetworkContainerEClass = createEClass(DOCKER_NETWORK_CONTAINER);
		createEAttribute(dockerNetworkContainerEClass, DOCKER_NETWORK_CONTAINER__ID);
		createEAttribute(dockerNetworkContainerEClass, DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS);
		createEAttribute(dockerNetworkContainerEClass, DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS);
		createEAttribute(dockerNetworkContainerEClass, DOCKER_NETWORK_CONTAINER__ENDPOINT_ID);
		createEAttribute(dockerNetworkContainerEClass, DOCKER_NETWORK_CONTAINER__MAC_ADDRESS);

		dockerEventsEClass = createEClass(DOCKER_EVENTS);
		createEAttribute(dockerEventsEClass, DOCKER_EVENTS__STATUS);
		createEAttribute(dockerEventsEClass, DOCKER_EVENTS__ID);
		createEAttribute(dockerEventsEClass, DOCKER_EVENTS__TYPE);
		createEAttribute(dockerEventsEClass, DOCKER_EVENTS__ACTION);
		createEReference(dockerEventsEClass, DOCKER_EVENTS__ACTOR);
		createEAttribute(dockerEventsEClass, DOCKER_EVENTS__TIME);
		createEAttribute(dockerEventsEClass, DOCKER_EVENTS__TIMENANO);

		dockerActorEClass = createEClass(DOCKER_ACTOR);
		createEAttribute(dockerActorEClass, DOCKER_ACTOR__ID);
		createEReference(dockerActorEClass, DOCKER_ACTOR__ATTRIBUTES);

		dockerActorAttributesEClass = createEClass(DOCKER_ACTOR_ATTRIBUTES);
		createEAttribute(dockerActorAttributesEClass, DOCKER_ACTOR_ATTRIBUTES__NAME);

		dockerCreateRequestEClass = createEClass(DOCKER_CREATE_REQUEST);
		createEAttribute(dockerCreateRequestEClass, DOCKER_CREATE_REQUEST__HOSTNAME);
		createEAttribute(dockerCreateRequestEClass, DOCKER_CREATE_REQUEST__CMD);

		dockerProcessEClass = createEClass(DOCKER_PROCESS);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__USER);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__PID);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__CPU);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__MEM);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__VSZ);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__RSS);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__TTY);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__STAT);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__START);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__TIME_ELAPSED);
		createEAttribute(dockerProcessEClass, DOCKER_PROCESS__COMMAND);

		dockerContainerStatsEClass = createEClass(DOCKER_CONTAINER_STATS);
		createEReference(dockerContainerStatsEClass, DOCKER_CONTAINER_STATS__NETWORKS);
		createEReference(dockerContainerStatsEClass, DOCKER_CONTAINER_STATS__MEMORY);
		createEReference(dockerContainerStatsEClass, DOCKER_CONTAINER_STATS__CPU);
		createEAttribute(dockerContainerStatsEClass, DOCKER_CONTAINER_STATS__LAST_READ);

		containerNetworkStatsEClass = createEClass(CONTAINER_NETWORK_STATS);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__INTF);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__RX_BYTES);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__RX_DROPPED);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__RX_ERRORS);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__RX_PACKETS);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__TX_BYTES);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__TX_DROPPED);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__TX_ERRORS);
		createEAttribute(containerNetworkStatsEClass, CONTAINER_NETWORK_STATS__TX_PACKETS);

		containerMemoryStatsEClass = createEClass(CONTAINER_MEMORY_STATS);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__CACHE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__MAPPED_FILE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__PGPGOUT);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__RSS);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__WRITEBACK);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__UNEVICTABLE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__PGPGIN);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__PGMAJFAULT);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_RSS);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__RSS_HUGE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_PGFAULT);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__ACTIVE_ANON);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_CACHE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__INACTIVE_ANON);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__ACTIVE_FILE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__PGFAULT);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__INACTIVE_FILE);
		createEAttribute(containerMemoryStatsEClass, CONTAINER_MEMORY_STATS__TOTAL_PGPGIN);

		containerMemoryUsageEClass = createEClass(CONTAINER_MEMORY_USAGE);
		createEReference(containerMemoryUsageEClass, CONTAINER_MEMORY_USAGE__MEMSTATS);
		createEAttribute(containerMemoryUsageEClass, CONTAINER_MEMORY_USAGE__MAX_USAGE);
		createEAttribute(containerMemoryUsageEClass, CONTAINER_MEMORY_USAGE__USAGE);
		createEAttribute(containerMemoryUsageEClass, CONTAINER_MEMORY_USAGE__FAILCNT);
		createEAttribute(containerMemoryUsageEClass, CONTAINER_MEMORY_USAGE__LIMIT);

		containerCpuUsageEClass = createEClass(CONTAINER_CPU_USAGE);
		createEAttribute(containerCpuUsageEClass, CONTAINER_CPU_USAGE__PERCPU_USAGE);
		createEAttribute(containerCpuUsageEClass, CONTAINER_CPU_USAGE__USAGE_IN_USERMODE);
		createEAttribute(containerCpuUsageEClass, CONTAINER_CPU_USAGE__TOTAL_USAGE);
		createEAttribute(containerCpuUsageEClass, CONTAINER_CPU_USAGE__USER_IN_KERNELMODE);

		containerCpuStatsEClass = createEClass(CONTAINER_CPU_STATS);
		createEReference(containerCpuStatsEClass, CONTAINER_CPU_STATS__CPU_USAGE);
		createEAttribute(containerCpuStatsEClass, CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dockerHostEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dockerImageEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dockerContainerEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		containerOptionsEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		containerPortBindingsEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dockerNetworkEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dockerEventsEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dockerProcessEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		dockerContainerStatsEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(dockerAdaptorEClass, DockerAdaptor.class, "DockerAdaptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerAdaptor_DockerHosts(), this.getDockerHost(), null, "dockerHosts", null, 0, -1, DockerAdaptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerHostEClass, DockerHost.class, "DockerHost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerHost_Url(), theEcorePackage.getEString(), "url", null, 0, 1, DockerHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerHost_PollingFrequency(), theEcorePackage.getELong(), "pollingFrequency", "30000", 0, 1, DockerHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerHost_Remote(), theEcorePackage.getEBoolean(), "remote", "false", 0, 1, DockerHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerHost_Images(), this.getDockerImage(), null, "images", null, 0, -1, DockerHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerHost_Containers(), this.getDockerContainer(), null, "containers", null, 0, -1, DockerHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerHost_Networks(), this.getDockerNetwork(), null, "networks", null, 0, -1, DockerHost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDockerHost__Poll(), null, "poll", 0, 1, !IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getDockerHost__StartContainer__String(), null, "startContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__StopContainer__String_int(), null, "stopContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "seconds", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__RestartContainer__String_int(), null, "restartContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "seconds", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__PauseContainer__String(), null, "pauseContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__UnpauseContainer__String(), null, "unpauseContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__RemoveContainer__String_boolean_boolean(), null, "removeContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "remove", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "force", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__InspectContainer__String(), null, "inspectContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__KillContainer__String_String(), null, "killContainer", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "sigint", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__DockerRun__String(), null, "dockerRun", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "image", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__DockerRunWithName__String_String(), null, "dockerRunWithName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "image", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__DockerRunWithOptions__String_ContainerOptions(), null, "dockerRunWithOptions", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "image", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getContainerOptions(), "opts", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__ContainerStats__String_boolean(), null, "containerStats", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "stream", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDockerHost__ContainerProcesses__String(), null, "containerProcesses", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(dockerImageEClass, DockerImage.class, "DockerImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerImage_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImage_ParentId(), theEcorePackage.getEString(), "parentId", null, 0, 1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImage_RepoTags(), theEcorePackage.getEString(), "repoTags", null, 0, -1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImage_RepoDigests(), theEcorePackage.getEString(), "repoDigests", null, 0, -1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImage_DockerCreated(), theEcorePackage.getEDate(), "dockerCreated", null, 0, 1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImage_Size(), theEcorePackage.getELongObject(), "size", null, 0, 1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImage_VirtualSize(), theEcorePackage.getELongObject(), "virtualSize", null, 0, 1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerImage_Labels(), theEcorePackage.getEString(), "labels", null, 0, -1, DockerImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerContainerEClass, DockerContainer.class, "DockerContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerContainer_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_Names(), theEcorePackage.getEString(), "names", null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_Image(), theEcorePackage.getEString(), "image", null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_ImageID(), theEcorePackage.getEString(), "imageID", null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_Command(), theEcorePackage.getEString(), "command", null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_DockerCreated(), theEcorePackage.getEString(), "dockerCreated", null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Ports(), this.getDockerPort(), null, "ports", null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Labels(), this.getDockerKeyPair(), null, "labels", null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainer_Status(), theEcorePackage.getEString(), "status", null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_HostConfig(), this.getDockerKeyPair(), null, "hostConfig", null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Processes(), this.getDockerProcess(), null, "processes", null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Mounts(), this.getDockerMount(), null, "mounts", null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Stats(), this.getDockerContainerStats(), null, "stats", null, 0, 1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainer_Events(), this.getDockerEvents(), null, "events", null, 0, -1, DockerContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerPortEClass, DockerPort.class, "DockerPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerPort_PrivatePort(), theEcorePackage.getEInt(), "privatePort", null, 0, 1, DockerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerPort_PublicPort(), theEcorePackage.getEInt(), "publicPort", null, 0, 1, DockerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerPort_Type(), theEcorePackage.getEString(), "type", null, 0, 1, DockerPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerKeyPairEClass, DockerKeyPair.class, "DockerKeyPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerKeyPair_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DockerKeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerKeyPair_Value(), theEcorePackage.getEString(), "value", null, 0, 1, DockerKeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerMountEClass, DockerMount.class, "DockerMount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerMount_Source(), theEcorePackage.getEString(), "source", null, 0, 1, DockerMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerMount_Destination(), theEcorePackage.getEString(), "destination", null, 0, 1, DockerMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerMount_Mode(), theEcorePackage.getEString(), "mode", null, 0, 1, DockerMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerMount_RW(), theEcorePackage.getEBooleanObject(), "rW", null, 0, 1, DockerMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerMount_Propagation(), theEcorePackage.getEString(), "propagation", null, 0, 1, DockerMount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerOptionsEClass, ContainerOptions.class, "ContainerOptions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerOptions_ImageNm(), theEcorePackage.getEString(), "imageNm", null, 0, 1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerOptions_Env(), theEcorePackage.getEString(), "env", null, 0, -1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerOptions_Volumes(), theEcorePackage.getEString(), "volumes", null, 0, -1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerOptions_Links(), theEcorePackage.getEString(), "links", null, 0, -1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerOptions_SetContainerName(), theEcorePackage.getEBoolean(), "setContainerName", null, 0, 1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerOptions_PublishAllPorts(), theEcorePackage.getEBoolean(), "publishAllPorts", null, 0, 1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerOptions_PortBindings(), this.getContainerPortBindings(), null, "portBindings", null, 0, -1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainerOptions_AutoRestart(), this.getContainerRestartPolicy(), null, "autoRestart", null, 0, 1, ContainerOptions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerRestartPolicyEClass, ContainerRestartPolicy.class, "ContainerRestartPolicy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerRestartPolicy_Nm(), theEcorePackage.getEString(), "nm", null, 0, 1, ContainerRestartPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerRestartPolicy_MaxRetryCnt(), theEcorePackage.getEInt(), "maxRetryCnt", null, 0, 1, ContainerRestartPolicy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerPortBindingsEClass, ContainerPortBindings.class, "ContainerPortBindings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerPortBindings_ContainerPort(), theEcorePackage.getEInt(), "containerPort", null, 0, 1, ContainerPortBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPortBindings_Protocol(), theEcorePackage.getEString(), "protocol", null, 0, 1, ContainerPortBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerPortBindings_VmPort(), theEcorePackage.getEInt(), "vmPort", null, 0, 1, ContainerPortBindings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerNetworkEClass, DockerNetwork.class, "DockerNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerNetwork_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DockerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerNetwork_Scope(), theEcorePackage.getEString(), "scope", null, 0, 1, DockerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerNetwork_Driver(), theEcorePackage.getEString(), "driver", null, 0, 1, DockerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerNetwork_IPAM(), this.getDockerIpam(), null, "iPAM", null, 0, 1, DockerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerNetwork_Containers(), this.getDockerNetworkContainer(), null, "containers", null, 0, -1, DockerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerNetwork_Options(), this.getDockerKeyPair(), null, "options", null, 0, -1, DockerNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerIpamEClass, DockerIpam.class, "DockerIpam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerIpam_Driver(), theEcorePackage.getEString(), "driver", null, 0, 1, DockerIpam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerIpam_Config(), this.getDockerIpamConfig(), null, "config", null, 0, -1, DockerIpam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerIpamConfigEClass, DockerIpamConfig.class, "DockerIpamConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerIpamConfig_Subnet(), theEcorePackage.getEString(), "subnet", null, 0, 1, DockerIpamConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerNetworkContainerEClass, DockerNetworkContainer.class, "DockerNetworkContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerNetworkContainer_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DockerNetworkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerNetworkContainer_IPv4Address(), theEcorePackage.getEString(), "iPv4Address", null, 0, 1, DockerNetworkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerNetworkContainer_IPv6Address(), theEcorePackage.getEString(), "iPv6Address", null, 0, 1, DockerNetworkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerNetworkContainer_EndpointID(), theEcorePackage.getEString(), "endpointID", null, 0, 1, DockerNetworkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerNetworkContainer_MacAddress(), theEcorePackage.getEString(), "macAddress", null, 0, 1, DockerNetworkContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerEventsEClass, DockerEvents.class, "DockerEvents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerEvents_Status(), theEcorePackage.getEString(), "status", null, 0, 1, DockerEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerEvents_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DockerEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerEvents_Type(), theEcorePackage.getEString(), "type", null, 0, 1, DockerEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerEvents_Action(), theEcorePackage.getEString(), "action", null, 0, 1, DockerEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerEvents_Actor(), this.getDockerActor(), null, "actor", null, 0, 1, DockerEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerEvents_Time(), theEcorePackage.getEInt(), "time", null, 0, 1, DockerEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerEvents_Timenano(), theEcorePackage.getELong(), "timenano", null, 0, 1, DockerEvents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerActorEClass, DockerActor.class, "DockerActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerActor_Id(), theEcorePackage.getEString(), "id", null, 0, 1, DockerActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerActor_Attributes(), this.getDockerActorAttributes(), null, "attributes", null, 0, 1, DockerActor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerActorAttributesEClass, DockerActorAttributes.class, "DockerActorAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerActorAttributes_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DockerActorAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerCreateRequestEClass, DockerCreateRequest.class, "DockerCreateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerCreateRequest_Hostname(), theEcorePackage.getEString(), "hostname", null, 0, 1, DockerCreateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerCreateRequest_Cmd(), theEcorePackage.getEString(), "cmd", null, 0, -1, DockerCreateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerProcessEClass, DockerProcess.class, "DockerProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDockerProcess_User(), theEcorePackage.getEString(), "user", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Pid(), theEcorePackage.getELong(), "pid", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Cpu(), theEcorePackage.getEDouble(), "cpu", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Mem(), theEcorePackage.getEDouble(), "mem", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Vsz(), theEcorePackage.getELong(), "vsz", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Rss(), theEcorePackage.getELong(), "rss", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Tty(), theEcorePackage.getEString(), "tty", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Stat(), theEcorePackage.getEString(), "stat", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Start(), theEcorePackage.getEDate(), "start", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_TimeElapsed(), theEcorePackage.getELong(), "timeElapsed", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerProcess_Command(), theEcorePackage.getEString(), "command", null, 0, 1, DockerProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dockerContainerStatsEClass, DockerContainerStats.class, "DockerContainerStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDockerContainerStats_Networks(), this.getContainerNetworkStats(), null, "networks", null, 0, -1, DockerContainerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainerStats_Memory(), this.getContainerMemoryUsage(), null, "memory", null, 0, 1, DockerContainerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDockerContainerStats_Cpu(), this.getContainerCpuStats(), null, "cpu", null, 0, 1, DockerContainerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDockerContainerStats_LastRead(), theEcorePackage.getEDate(), "lastRead", null, 0, 1, DockerContainerStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerNetworkStatsEClass, ContainerNetworkStats.class, "ContainerNetworkStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerNetworkStats_Intf(), theEcorePackage.getEString(), "intf", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Rx_bytes(), theEcorePackage.getEInt(), "rx_bytes", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Rx_dropped(), theEcorePackage.getEInt(), "rx_dropped", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Rx_errors(), theEcorePackage.getEInt(), "rx_errors", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Rx_packets(), theEcorePackage.getEInt(), "rx_packets", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Tx_bytes(), theEcorePackage.getEInt(), "tx_bytes", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Tx_dropped(), theEcorePackage.getEInt(), "tx_dropped", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Tx_errors(), theEcorePackage.getEInt(), "tx_errors", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerNetworkStats_Tx_packets(), theEcorePackage.getEInt(), "tx_packets", null, 0, 1, ContainerNetworkStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerMemoryStatsEClass, ContainerMemoryStats.class, "ContainerMemoryStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerMemoryStats_Total_pgmajfault(), theEcorePackage.getEInt(), "total_pgmajfault", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Cache(), theEcorePackage.getEInt(), "cache", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Mapped_file(), theEcorePackage.getEInt(), "mapped_file", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_inactive_file(), theEcorePackage.getEInt(), "total_inactive_file", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Pgpgout(), theEcorePackage.getEInt(), "pgpgout", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Rss(), theEcorePackage.getEInt(), "rss", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_mapped_file(), theEcorePackage.getEInt(), "total_mapped_file", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Writeback(), theEcorePackage.getEInt(), "writeback", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Unevictable(), theEcorePackage.getEInt(), "unevictable", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Pgpgin(), theEcorePackage.getEInt(), "pgpgin", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_unevictable(), theEcorePackage.getEInt(), "total_unevictable", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Pgmajfault(), theEcorePackage.getEInt(), "pgmajfault", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_rss(), theEcorePackage.getEInt(), "total_rss", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_rss_huge(), theEcorePackage.getEInt(), "total_rss_huge", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_writeback(), theEcorePackage.getEInt(), "total_writeback", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_inactive_anon(), theEcorePackage.getEInt(), "total_inactive_anon", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Rss_huge(), theEcorePackage.getEInt(), "rss_huge", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Hierarchical_memory_limit(), theEcorePackage.getEInt(), "hierarchical_memory_limit", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_pgfault(), theEcorePackage.getEInt(), "total_pgfault", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_active_file(), theEcorePackage.getEInt(), "total_active_file", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Active_anon(), theEcorePackage.getEInt(), "active_anon", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_active_anon(), theEcorePackage.getEInt(), "total_active_anon", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_pgpgout(), theEcorePackage.getEInt(), "total_pgpgout", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_cache(), theEcorePackage.getEInt(), "total_cache", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Inactive_anon(), theEcorePackage.getEInt(), "inactive_anon", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Active_file(), theEcorePackage.getEInt(), "active_file", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Pgfault(), theEcorePackage.getEInt(), "pgfault", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Inactive_file(), theEcorePackage.getEInt(), "inactive_file", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryStats_Total_pgpgin(), theEcorePackage.getEInt(), "total_pgpgin", null, 0, 1, ContainerMemoryStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerMemoryUsageEClass, ContainerMemoryUsage.class, "ContainerMemoryUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerMemoryUsage_Memstats(), this.getContainerMemoryStats(), null, "memstats", null, 0, 1, ContainerMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryUsage_Max_usage(), theEcorePackage.getEInt(), "max_usage", null, 0, 1, ContainerMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryUsage_Usage(), theEcorePackage.getEInt(), "usage", null, 0, 1, ContainerMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryUsage_Failcnt(), theEcorePackage.getEInt(), "failcnt", null, 0, 1, ContainerMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerMemoryUsage_Limit(), theEcorePackage.getEInt(), "limit", null, 0, 1, ContainerMemoryUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerCpuUsageEClass, ContainerCpuUsage.class, "ContainerCpuUsage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerCpuUsage_Percpu_usage(), theEcorePackage.getELong(), "percpu_usage", null, 0, -1, ContainerCpuUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerCpuUsage_Usage_in_usermode(), theEcorePackage.getELong(), "usage_in_usermode", null, 0, 1, ContainerCpuUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerCpuUsage_Total_usage(), theEcorePackage.getELong(), "total_usage", null, 0, 1, ContainerCpuUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerCpuUsage_User_in_kernelmode(), theEcorePackage.getELong(), "user_in_kernelmode", null, 0, 1, ContainerCpuUsage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerCpuStatsEClass, ContainerCpuStats.class, "ContainerCpuStats", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainerCpuStats_Cpu_usage(), this.getContainerCpuUsage(), null, "cpu_usage", null, 0, 1, ContainerCpuStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerCpuStats_System_cpu_usage(), theEcorePackage.getELong(), "system_cpu_usage", null, 0, 1, ContainerCpuStats.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DockerPackageImpl
