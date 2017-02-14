
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

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.docker.DockerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-docker-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp'"
 * @generated
 */
public interface DockerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docker";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.docker";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "docker";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockerPackage eINSTANCE = org.openecomp.ncomp.docker.impl.DockerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerAdaptorImpl <em>Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerAdaptorImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerAdaptor()
	 * @generated
	 */
	int DOCKER_ADAPTOR = 0;

	/**
	 * The feature id for the '<em><b>Docker Hosts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ADAPTOR__DOCKER_HOSTS = 0;

	/**
	 * The number of structural features of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ADAPTOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ADAPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerHostImpl <em>Host</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerHostImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerHost()
	 * @generated
	 */
	int DOCKER_HOST = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__URL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Polling Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__POLLING_FREQUENCY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__REMOTE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Images</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__IMAGES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__CONTAINERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST__NETWORKS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Poll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___POLL = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Start Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___START_CONTAINER__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Stop Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___STOP_CONTAINER__STRING_INT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Restart Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___RESTART_CONTAINER__STRING_INT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Pause Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___PAUSE_CONTAINER__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Unpause Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___UNPAUSE_CONTAINER__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Remove Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___REMOVE_CONTAINER__STRING_BOOLEAN_BOOLEAN = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Inspect Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___INSPECT_CONTAINER__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Kill Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___KILL_CONTAINER__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Docker Run</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___DOCKER_RUN__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Docker Run With Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___DOCKER_RUN_WITH_NAME__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Docker Run With Options</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___DOCKER_RUN_WITH_OPTIONS__STRING_CONTAINEROPTIONS = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Container Stats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___CONTAINER_STATS__STRING_BOOLEAN = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Container Processes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST___CONTAINER_PROCESSES__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Host</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_HOST_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerImageImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerImage()
	 * @generated
	 */
	int DOCKER_IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__PARENT_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Repo Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__REPO_TAGS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Repo Digests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__REPO_DIGESTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Docker Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__DOCKER_CREATED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__SIZE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Virtual Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__VIRTUAL_SIZE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE__LABELS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerContainerImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerContainer()
	 * @generated
	 */
	int DOCKER_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__NAMES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__IMAGE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Image ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__IMAGE_ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__COMMAND = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Docker Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__DOCKER_CREATED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__PORTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__LABELS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__STATUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Host Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__HOST_CONFIG = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__PROCESSES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Mounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__MOUNTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Stats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__STATS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER__EVENTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 14;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerPortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerPortImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerPort()
	 * @generated
	 */
	int DOCKER_PORT = 4;

	/**
	 * The feature id for the '<em><b>Private Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PORT__PRIVATE_PORT = 0;

	/**
	 * The feature id for the '<em><b>Public Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PORT__PUBLIC_PORT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PORT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerKeyPairImpl <em>Key Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerKeyPairImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerKeyPair()
	 * @generated
	 */
	int DOCKER_KEY_PAIR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_KEY_PAIR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_KEY_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_KEY_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_KEY_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerMountImpl <em>Mount</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerMountImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerMount()
	 * @generated
	 */
	int DOCKER_MOUNT = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MOUNT__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MOUNT__DESTINATION = 1;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MOUNT__MODE = 2;

	/**
	 * The feature id for the '<em><b>RW</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MOUNT__RW = 3;

	/**
	 * The feature id for the '<em><b>Propagation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MOUNT__PROPAGATION = 4;

	/**
	 * The number of structural features of the '<em>Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MOUNT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Mount</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_MOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl <em>Container Options</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerOptionsImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerOptions()
	 * @generated
	 */
	int CONTAINER_OPTIONS = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Image Nm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__IMAGE_NM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Env</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__ENV = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__VOLUMES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__LINKS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Set Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__SET_CONTAINER_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Publish All Ports</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__PUBLISH_ALL_PORTS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Port Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__PORT_BINDINGS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Auto Restart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS__AUTO_RESTART = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Container Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Container Options</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPTIONS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerRestartPolicyImpl <em>Container Restart Policy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerRestartPolicyImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerRestartPolicy()
	 * @generated
	 */
	int CONTAINER_RESTART_POLICY = 8;

	/**
	 * The feature id for the '<em><b>Nm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESTART_POLICY__NM = 0;

	/**
	 * The feature id for the '<em><b>Max Retry Cnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESTART_POLICY__MAX_RETRY_CNT = 1;

	/**
	 * The number of structural features of the '<em>Container Restart Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESTART_POLICY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container Restart Policy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_RESTART_POLICY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerPortBindingsImpl <em>Container Port Bindings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerPortBindingsImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerPortBindings()
	 * @generated
	 */
	int CONTAINER_PORT_BINDINGS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Container Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS__CONTAINER_PORT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS__PROTOCOL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Vm Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS__VM_PORT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Container Port Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Container Port Bindings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_PORT_BINDINGS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerNetworkImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerNetwork()
	 * @generated
	 */
	int DOCKER_NETWORK = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__SCOPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__DRIVER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IPAM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__IPAM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__CONTAINERS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK__OPTIONS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerIpamImpl <em>Ipam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerIpamImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerIpam()
	 * @generated
	 */
	int DOCKER_IPAM = 11;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IPAM__DRIVER = 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IPAM__CONFIG = 1;

	/**
	 * The number of structural features of the '<em>Ipam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IPAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ipam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IPAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerIpamConfigImpl <em>Ipam Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerIpamConfigImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerIpamConfig()
	 * @generated
	 */
	int DOCKER_IPAM_CONFIG = 12;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IPAM_CONFIG__SUBNET = 0;

	/**
	 * The number of structural features of the '<em>Ipam Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IPAM_CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ipam Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IPAM_CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl <em>Network Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerNetworkContainer()
	 * @generated
	 */
	int DOCKER_NETWORK_CONTAINER = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_CONTAINER__ID = 0;

	/**
	 * The feature id for the '<em><b>IPv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>IPv6 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Endpoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_CONTAINER__ENDPOINT_ID = 3;

	/**
	 * The feature id for the '<em><b>Mac Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_CONTAINER__MAC_ADDRESS = 4;

	/**
	 * The number of structural features of the '<em>Network Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_CONTAINER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Network Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_NETWORK_CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerEventsImpl <em>Events</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerEventsImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerEvents()
	 * @generated
	 */
	int DOCKER_EVENTS = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__STATUS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__ACTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__ACTOR = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__TIME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Timenano</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS__TIMENANO = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Events</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_EVENTS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerActorImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerActor()
	 * @generated
	 */
	int DOCKER_ACTOR = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ACTOR__ID = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ACTOR__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ACTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerActorAttributesImpl <em>Actor Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerActorAttributesImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerActorAttributes()
	 * @generated
	 */
	int DOCKER_ACTOR_ATTRIBUTES = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ACTOR_ATTRIBUTES__NAME = 0;

	/**
	 * The number of structural features of the '<em>Actor Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ACTOR_ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Actor Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_ACTOR_ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerCreateRequestImpl <em>Create Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerCreateRequestImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerCreateRequest()
	 * @generated
	 */
	int DOCKER_CREATE_REQUEST = 17;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CREATE_REQUEST__HOSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Cmd</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CREATE_REQUEST__CMD = 1;

	/**
	 * The number of structural features of the '<em>Create Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CREATE_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Create Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CREATE_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerProcessImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerProcess()
	 * @generated
	 */
	int DOCKER_PROCESS = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__USER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__PID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__CPU = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__MEM = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vsz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__VSZ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Rss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__RSS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Tty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__TTY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Stat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__STAT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__START = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Time Elapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__TIME_ELAPSED = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS__COMMAND = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_PROCESS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl <em>Container Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerContainerStats()
	 * @generated
	 */
	int DOCKER_CONTAINER_STATS = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__NETWORKS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__MEMORY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cpu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__CPU = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Last Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS__LAST_READ = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Container Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Container Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_CONTAINER_STATS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl <em>Container Network Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerNetworkStats()
	 * @generated
	 */
	int CONTAINER_NETWORK_STATS = 20;

	/**
	 * The feature id for the '<em><b>Intf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__INTF = 0;

	/**
	 * The feature id for the '<em><b>Rx bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__RX_BYTES = 1;

	/**
	 * The feature id for the '<em><b>Rx dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__RX_DROPPED = 2;

	/**
	 * The feature id for the '<em><b>Rx errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__RX_ERRORS = 3;

	/**
	 * The feature id for the '<em><b>Rx packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__RX_PACKETS = 4;

	/**
	 * The feature id for the '<em><b>Tx bytes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__TX_BYTES = 5;

	/**
	 * The feature id for the '<em><b>Tx dropped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__TX_DROPPED = 6;

	/**
	 * The feature id for the '<em><b>Tx errors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__TX_ERRORS = 7;

	/**
	 * The feature id for the '<em><b>Tx packets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS__TX_PACKETS = 8;

	/**
	 * The number of structural features of the '<em>Container Network Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Container Network Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_NETWORK_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl <em>Container Memory Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerMemoryStats()
	 * @generated
	 */
	int CONTAINER_MEMORY_STATS = 21;

	/**
	 * The feature id for the '<em><b>Total pgmajfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT = 0;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__CACHE = 1;

	/**
	 * The feature id for the '<em><b>Mapped file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__MAPPED_FILE = 2;

	/**
	 * The feature id for the '<em><b>Total inactive file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE = 3;

	/**
	 * The feature id for the '<em><b>Pgpgout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__PGPGOUT = 4;

	/**
	 * The feature id for the '<em><b>Rss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__RSS = 5;

	/**
	 * The feature id for the '<em><b>Total mapped file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE = 6;

	/**
	 * The feature id for the '<em><b>Writeback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__WRITEBACK = 7;

	/**
	 * The feature id for the '<em><b>Unevictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__UNEVICTABLE = 8;

	/**
	 * The feature id for the '<em><b>Pgpgin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__PGPGIN = 9;

	/**
	 * The feature id for the '<em><b>Total unevictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE = 10;

	/**
	 * The feature id for the '<em><b>Pgmajfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__PGMAJFAULT = 11;

	/**
	 * The feature id for the '<em><b>Total rss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_RSS = 12;

	/**
	 * The feature id for the '<em><b>Total rss huge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE = 13;

	/**
	 * The feature id for the '<em><b>Total writeback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK = 14;

	/**
	 * The feature id for the '<em><b>Total inactive anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON = 15;

	/**
	 * The feature id for the '<em><b>Rss huge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__RSS_HUGE = 16;

	/**
	 * The feature id for the '<em><b>Hierarchical memory limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT = 17;

	/**
	 * The feature id for the '<em><b>Total pgfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_PGFAULT = 18;

	/**
	 * The feature id for the '<em><b>Total active file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE = 19;

	/**
	 * The feature id for the '<em><b>Active anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__ACTIVE_ANON = 20;

	/**
	 * The feature id for the '<em><b>Total active anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON = 21;

	/**
	 * The feature id for the '<em><b>Total pgpgout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT = 22;

	/**
	 * The feature id for the '<em><b>Total cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_CACHE = 23;

	/**
	 * The feature id for the '<em><b>Inactive anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__INACTIVE_ANON = 24;

	/**
	 * The feature id for the '<em><b>Active file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__ACTIVE_FILE = 25;

	/**
	 * The feature id for the '<em><b>Pgfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__PGFAULT = 26;

	/**
	 * The feature id for the '<em><b>Inactive file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__INACTIVE_FILE = 27;

	/**
	 * The feature id for the '<em><b>Total pgpgin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS__TOTAL_PGPGIN = 28;

	/**
	 * The number of structural features of the '<em>Container Memory Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Container Memory Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_STATS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl <em>Container Memory Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerMemoryUsage()
	 * @generated
	 */
	int CONTAINER_MEMORY_USAGE = 22;

	/**
	 * The feature id for the '<em><b>Memstats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_USAGE__MEMSTATS = 0;

	/**
	 * The feature id for the '<em><b>Max usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_USAGE__MAX_USAGE = 1;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_USAGE__USAGE = 2;

	/**
	 * The feature id for the '<em><b>Failcnt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_USAGE__FAILCNT = 3;

	/**
	 * The feature id for the '<em><b>Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_USAGE__LIMIT = 4;

	/**
	 * The number of structural features of the '<em>Container Memory Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_USAGE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Container Memory Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_MEMORY_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl <em>Container Cpu Usage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerCpuUsage()
	 * @generated
	 */
	int CONTAINER_CPU_USAGE = 23;

	/**
	 * The feature id for the '<em><b>Percpu usage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_USAGE__PERCPU_USAGE = 0;

	/**
	 * The feature id for the '<em><b>Usage in usermode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_USAGE__USAGE_IN_USERMODE = 1;

	/**
	 * The feature id for the '<em><b>Total usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_USAGE__TOTAL_USAGE = 2;

	/**
	 * The feature id for the '<em><b>User in kernelmode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_USAGE__USER_IN_KERNELMODE = 3;

	/**
	 * The number of structural features of the '<em>Container Cpu Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_USAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Container Cpu Usage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_USAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.docker.impl.ContainerCpuStatsImpl <em>Container Cpu Stats</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.docker.impl.ContainerCpuStatsImpl
	 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerCpuStats()
	 * @generated
	 */
	int CONTAINER_CPU_STATS = 24;

	/**
	 * The feature id for the '<em><b>Cpu usage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_STATS__CPU_USAGE = 0;

	/**
	 * The feature id for the '<em><b>System cpu usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE = 1;

	/**
	 * The number of structural features of the '<em>Container Cpu Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_STATS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container Cpu Stats</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_CPU_STATS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerAdaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor</em>'.
	 * @see org.openecomp.ncomp.docker.DockerAdaptor
	 * @generated
	 */
	EClass getDockerAdaptor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerAdaptor#getDockerHosts <em>Docker Hosts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Docker Hosts</em>'.
	 * @see org.openecomp.ncomp.docker.DockerAdaptor#getDockerHosts()
	 * @see #getDockerAdaptor()
	 * @generated
	 */
	EReference getDockerAdaptor_DockerHosts();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Host</em>'.
	 * @see org.openecomp.ncomp.docker.DockerHost
	 * @generated
	 */
	EClass getDockerHost();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerHost#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.openecomp.ncomp.docker.DockerHost#getUrl()
	 * @see #getDockerHost()
	 * @generated
	 */
	EAttribute getDockerHost_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerHost#getPollingFrequency <em>Polling Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Frequency</em>'.
	 * @see org.openecomp.ncomp.docker.DockerHost#getPollingFrequency()
	 * @see #getDockerHost()
	 * @generated
	 */
	EAttribute getDockerHost_PollingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerHost#isRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see org.openecomp.ncomp.docker.DockerHost#isRemote()
	 * @see #getDockerHost()
	 * @generated
	 */
	EAttribute getDockerHost_Remote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerHost#getImages <em>Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Images</em>'.
	 * @see org.openecomp.ncomp.docker.DockerHost#getImages()
	 * @see #getDockerHost()
	 * @generated
	 */
	EReference getDockerHost_Images();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerHost#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.openecomp.ncomp.docker.DockerHost#getContainers()
	 * @see #getDockerHost()
	 * @generated
	 */
	EReference getDockerHost_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerHost#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see org.openecomp.ncomp.docker.DockerHost#getNetworks()
	 * @see #getDockerHost()
	 * @generated
	 */
	EReference getDockerHost_Networks();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#poll() <em>Poll</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Poll</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#poll()
	 * @generated
	 */
	EOperation getDockerHost__Poll();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#startContainer(java.lang.String) <em>Start Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#startContainer(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__StartContainer__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#stopContainer(java.lang.String, int) <em>Stop Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#stopContainer(java.lang.String, int)
	 * @generated
	 */
	EOperation getDockerHost__StopContainer__String_int();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#restartContainer(java.lang.String, int) <em>Restart Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#restartContainer(java.lang.String, int)
	 * @generated
	 */
	EOperation getDockerHost__RestartContainer__String_int();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#pauseContainer(java.lang.String) <em>Pause Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#pauseContainer(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__PauseContainer__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#unpauseContainer(java.lang.String) <em>Unpause Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unpause Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#unpauseContainer(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__UnpauseContainer__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#removeContainer(java.lang.String, boolean, boolean) <em>Remove Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#removeContainer(java.lang.String, boolean, boolean)
	 * @generated
	 */
	EOperation getDockerHost__RemoveContainer__String_boolean_boolean();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#inspectContainer(java.lang.String) <em>Inspect Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inspect Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#inspectContainer(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__InspectContainer__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#killContainer(java.lang.String, java.lang.String) <em>Kill Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Kill Container</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#killContainer(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__KillContainer__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#dockerRun(java.lang.String) <em>Docker Run</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Docker Run</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#dockerRun(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__DockerRun__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#dockerRunWithName(java.lang.String, java.lang.String) <em>Docker Run With Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Docker Run With Name</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#dockerRunWithName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__DockerRunWithName__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#dockerRunWithOptions(java.lang.String, org.openecomp.ncomp.docker.ContainerOptions) <em>Docker Run With Options</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Docker Run With Options</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#dockerRunWithOptions(java.lang.String, org.openecomp.ncomp.docker.ContainerOptions)
	 * @generated
	 */
	EOperation getDockerHost__DockerRunWithOptions__String_ContainerOptions();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#containerStats(java.lang.String, boolean) <em>Container Stats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Stats</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#containerStats(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getDockerHost__ContainerStats__String_boolean();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.docker.DockerHost#containerProcesses(java.lang.String) <em>Container Processes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Container Processes</em>' operation.
	 * @see org.openecomp.ncomp.docker.DockerHost#containerProcesses(java.lang.String)
	 * @generated
	 */
	EOperation getDockerHost__ContainerProcesses__String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage
	 * @generated
	 */
	EClass getDockerImage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerImage#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getId()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerImage#getParentId <em>Parent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Id</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getParentId()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_ParentId();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.DockerImage#getRepoTags <em>Repo Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repo Tags</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getRepoTags()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_RepoTags();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.DockerImage#getRepoDigests <em>Repo Digests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Repo Digests</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getRepoDigests()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_RepoDigests();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerImage#getDockerCreated <em>Docker Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Created</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getDockerCreated()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_DockerCreated();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerImage#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getSize()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerImage#getVirtualSize <em>Virtual Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Size</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getVirtualSize()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_VirtualSize();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.DockerImage#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see org.openecomp.ncomp.docker.DockerImage#getLabels()
	 * @see #getDockerImage()
	 * @generated
	 */
	EAttribute getDockerImage_Labels();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer
	 * @generated
	 */
	EClass getDockerContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerContainer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getId()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Id();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.DockerContainer#getNames <em>Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Names</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getNames()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Names();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerContainer#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getImage()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Image();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerContainer#getImageID <em>Image ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image ID</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getImageID()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_ImageID();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerContainer#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getCommand()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Command();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerContainer#getDockerCreated <em>Docker Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Created</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getDockerCreated()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_DockerCreated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerContainer#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getPorts()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerContainer#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getLabels()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Labels();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerContainer#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getStatus()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EAttribute getDockerContainer_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerContainer#getHostConfig <em>Host Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Host Config</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getHostConfig()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_HostConfig();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerContainer#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getProcesses()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerContainer#getMounts <em>Mounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mounts</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getMounts()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Mounts();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.DockerContainer#getStats <em>Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stats</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getStats()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Stats();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerContainer#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainer#getEvents()
	 * @see #getDockerContainer()
	 * @generated
	 */
	EReference getDockerContainer_Events();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see org.openecomp.ncomp.docker.DockerPort
	 * @generated
	 */
	EClass getDockerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerPort#getPrivatePort <em>Private Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private Port</em>'.
	 * @see org.openecomp.ncomp.docker.DockerPort#getPrivatePort()
	 * @see #getDockerPort()
	 * @generated
	 */
	EAttribute getDockerPort_PrivatePort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerPort#getPublicPort <em>Public Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Port</em>'.
	 * @see org.openecomp.ncomp.docker.DockerPort#getPublicPort()
	 * @see #getDockerPort()
	 * @generated
	 */
	EAttribute getDockerPort_PublicPort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerPort#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.docker.DockerPort#getType()
	 * @see #getDockerPort()
	 * @generated
	 */
	EAttribute getDockerPort_Type();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerKeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Pair</em>'.
	 * @see org.openecomp.ncomp.docker.DockerKeyPair
	 * @generated
	 */
	EClass getDockerKeyPair();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerKeyPair#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.docker.DockerKeyPair#getName()
	 * @see #getDockerKeyPair()
	 * @generated
	 */
	EAttribute getDockerKeyPair_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerKeyPair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.docker.DockerKeyPair#getValue()
	 * @see #getDockerKeyPair()
	 * @generated
	 */
	EAttribute getDockerKeyPair_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerMount <em>Mount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mount</em>'.
	 * @see org.openecomp.ncomp.docker.DockerMount
	 * @generated
	 */
	EClass getDockerMount();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerMount#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.openecomp.ncomp.docker.DockerMount#getSource()
	 * @see #getDockerMount()
	 * @generated
	 */
	EAttribute getDockerMount_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerMount#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see org.openecomp.ncomp.docker.DockerMount#getDestination()
	 * @see #getDockerMount()
	 * @generated
	 */
	EAttribute getDockerMount_Destination();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerMount#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.openecomp.ncomp.docker.DockerMount#getMode()
	 * @see #getDockerMount()
	 * @generated
	 */
	EAttribute getDockerMount_Mode();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerMount#getRW <em>RW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>RW</em>'.
	 * @see org.openecomp.ncomp.docker.DockerMount#getRW()
	 * @see #getDockerMount()
	 * @generated
	 */
	EAttribute getDockerMount_RW();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerMount#getPropagation <em>Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagation</em>'.
	 * @see org.openecomp.ncomp.docker.DockerMount#getPropagation()
	 * @see #getDockerMount()
	 * @generated
	 */
	EAttribute getDockerMount_Propagation();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerOptions <em>Container Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Options</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions
	 * @generated
	 */
	EClass getContainerOptions();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerOptions#getImageNm <em>Image Nm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Nm</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#getImageNm()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EAttribute getContainerOptions_ImageNm();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.ContainerOptions#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Env</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#getEnv()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EAttribute getContainerOptions_Env();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.ContainerOptions#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Volumes</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#getVolumes()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EAttribute getContainerOptions_Volumes();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.ContainerOptions#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Links</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#getLinks()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EAttribute getContainerOptions_Links();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerOptions#isSetContainerName <em>Set Container Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Set Container Name</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#isSetContainerName()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EAttribute getContainerOptions_SetContainerName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerOptions#isPublishAllPorts <em>Publish All Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publish All Ports</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#isPublishAllPorts()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EAttribute getContainerOptions_PublishAllPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.ContainerOptions#getPortBindings <em>Port Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Bindings</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#getPortBindings()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EReference getContainerOptions_PortBindings();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.ContainerOptions#getAutoRestart <em>Auto Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Auto Restart</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerOptions#getAutoRestart()
	 * @see #getContainerOptions()
	 * @generated
	 */
	EReference getContainerOptions_AutoRestart();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerRestartPolicy <em>Container Restart Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Restart Policy</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerRestartPolicy
	 * @generated
	 */
	EClass getContainerRestartPolicy();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerRestartPolicy#getNm <em>Nm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nm</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerRestartPolicy#getNm()
	 * @see #getContainerRestartPolicy()
	 * @generated
	 */
	EAttribute getContainerRestartPolicy_Nm();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerRestartPolicy#getMaxRetryCnt <em>Max Retry Cnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Retry Cnt</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerRestartPolicy#getMaxRetryCnt()
	 * @see #getContainerRestartPolicy()
	 * @generated
	 */
	EAttribute getContainerRestartPolicy_MaxRetryCnt();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerPortBindings <em>Container Port Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Port Bindings</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerPortBindings
	 * @generated
	 */
	EClass getContainerPortBindings();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerPortBindings#getContainerPort <em>Container Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Port</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerPortBindings#getContainerPort()
	 * @see #getContainerPortBindings()
	 * @generated
	 */
	EAttribute getContainerPortBindings_ContainerPort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerPortBindings#getProtocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Protocol</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerPortBindings#getProtocol()
	 * @see #getContainerPortBindings()
	 * @generated
	 */
	EAttribute getContainerPortBindings_Protocol();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerPortBindings#getVmPort <em>Vm Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Port</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerPortBindings#getVmPort()
	 * @see #getContainerPortBindings()
	 * @generated
	 */
	EAttribute getContainerPortBindings_VmPort();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetwork
	 * @generated
	 */
	EClass getDockerNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetwork#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetwork#getId()
	 * @see #getDockerNetwork()
	 * @generated
	 */
	EAttribute getDockerNetwork_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetwork#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetwork#getScope()
	 * @see #getDockerNetwork()
	 * @generated
	 */
	EAttribute getDockerNetwork_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetwork#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetwork#getDriver()
	 * @see #getDockerNetwork()
	 * @generated
	 */
	EAttribute getDockerNetwork_Driver();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.DockerNetwork#getIPAM <em>IPAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>IPAM</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetwork#getIPAM()
	 * @see #getDockerNetwork()
	 * @generated
	 */
	EReference getDockerNetwork_IPAM();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerNetwork#getContainers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Containers</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetwork#getContainers()
	 * @see #getDockerNetwork()
	 * @generated
	 */
	EReference getDockerNetwork_Containers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerNetwork#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetwork#getOptions()
	 * @see #getDockerNetwork()
	 * @generated
	 */
	EReference getDockerNetwork_Options();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerIpam <em>Ipam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ipam</em>'.
	 * @see org.openecomp.ncomp.docker.DockerIpam
	 * @generated
	 */
	EClass getDockerIpam();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerIpam#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see org.openecomp.ncomp.docker.DockerIpam#getDriver()
	 * @see #getDockerIpam()
	 * @generated
	 */
	EAttribute getDockerIpam_Driver();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerIpam#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config</em>'.
	 * @see org.openecomp.ncomp.docker.DockerIpam#getConfig()
	 * @see #getDockerIpam()
	 * @generated
	 */
	EReference getDockerIpam_Config();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerIpamConfig <em>Ipam Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ipam Config</em>'.
	 * @see org.openecomp.ncomp.docker.DockerIpamConfig
	 * @generated
	 */
	EClass getDockerIpamConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerIpamConfig#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see org.openecomp.ncomp.docker.DockerIpamConfig#getSubnet()
	 * @see #getDockerIpamConfig()
	 * @generated
	 */
	EAttribute getDockerIpamConfig_Subnet();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerNetworkContainer <em>Network Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Container</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetworkContainer
	 * @generated
	 */
	EClass getDockerNetworkContainer();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetworkContainer#getId()
	 * @see #getDockerNetworkContainer()
	 * @generated
	 */
	EAttribute getDockerNetworkContainer_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv4Address <em>IPv4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IPv4 Address</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv4Address()
	 * @see #getDockerNetworkContainer()
	 * @generated
	 */
	EAttribute getDockerNetworkContainer_IPv4Address();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv6Address <em>IPv6 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>IPv6 Address</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetworkContainer#getIPv6Address()
	 * @see #getDockerNetworkContainer()
	 * @generated
	 */
	EAttribute getDockerNetworkContainer_IPv6Address();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getEndpointID <em>Endpoint ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Endpoint ID</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetworkContainer#getEndpointID()
	 * @see #getDockerNetworkContainer()
	 * @generated
	 */
	EAttribute getDockerNetworkContainer_EndpointID();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerNetworkContainer#getMacAddress <em>Mac Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac Address</em>'.
	 * @see org.openecomp.ncomp.docker.DockerNetworkContainer#getMacAddress()
	 * @see #getDockerNetworkContainer()
	 * @generated
	 */
	EAttribute getDockerNetworkContainer_MacAddress();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Events</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents
	 * @generated
	 */
	EClass getDockerEvents();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerEvents#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents#getStatus()
	 * @see #getDockerEvents()
	 * @generated
	 */
	EAttribute getDockerEvents_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerEvents#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents#getId()
	 * @see #getDockerEvents()
	 * @generated
	 */
	EAttribute getDockerEvents_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerEvents#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents#getType()
	 * @see #getDockerEvents()
	 * @generated
	 */
	EAttribute getDockerEvents_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerEvents#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents#getAction()
	 * @see #getDockerEvents()
	 * @generated
	 */
	EAttribute getDockerEvents_Action();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.DockerEvents#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actor</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents#getActor()
	 * @see #getDockerEvents()
	 * @generated
	 */
	EReference getDockerEvents_Actor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerEvents#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents#getTime()
	 * @see #getDockerEvents()
	 * @generated
	 */
	EAttribute getDockerEvents_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerEvents#getTimenano <em>Timenano</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timenano</em>'.
	 * @see org.openecomp.ncomp.docker.DockerEvents#getTimenano()
	 * @see #getDockerEvents()
	 * @generated
	 */
	EAttribute getDockerEvents_Timenano();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see org.openecomp.ncomp.docker.DockerActor
	 * @generated
	 */
	EClass getDockerActor();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerActor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.docker.DockerActor#getId()
	 * @see #getDockerActor()
	 * @generated
	 */
	EAttribute getDockerActor_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.DockerActor#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see org.openecomp.ncomp.docker.DockerActor#getAttributes()
	 * @see #getDockerActor()
	 * @generated
	 */
	EReference getDockerActor_Attributes();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerActorAttributes <em>Actor Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Attributes</em>'.
	 * @see org.openecomp.ncomp.docker.DockerActorAttributes
	 * @generated
	 */
	EClass getDockerActorAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerActorAttributes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openecomp.ncomp.docker.DockerActorAttributes#getName()
	 * @see #getDockerActorAttributes()
	 * @generated
	 */
	EAttribute getDockerActorAttributes_Name();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerCreateRequest <em>Create Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Request</em>'.
	 * @see org.openecomp.ncomp.docker.DockerCreateRequest
	 * @generated
	 */
	EClass getDockerCreateRequest();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerCreateRequest#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see org.openecomp.ncomp.docker.DockerCreateRequest#getHostname()
	 * @see #getDockerCreateRequest()
	 * @generated
	 */
	EAttribute getDockerCreateRequest_Hostname();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.DockerCreateRequest#getCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cmd</em>'.
	 * @see org.openecomp.ncomp.docker.DockerCreateRequest#getCmd()
	 * @see #getDockerCreateRequest()
	 * @generated
	 */
	EAttribute getDockerCreateRequest_Cmd();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess
	 * @generated
	 */
	EClass getDockerProcess();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getUser()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_User();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getPid <em>Pid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pid</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getPid()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Pid();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getCpu()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Cpu();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getMem <em>Mem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mem</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getMem()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Mem();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getVsz <em>Vsz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vsz</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getVsz()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Vsz();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getRss <em>Rss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rss</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getRss()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Rss();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getTty <em>Tty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tty</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getTty()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Tty();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getStat <em>Stat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stat</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getStat()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Stat();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getStart()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Start();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getTimeElapsed <em>Time Elapsed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Elapsed</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getTimeElapsed()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_TimeElapsed();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerProcess#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Command</em>'.
	 * @see org.openecomp.ncomp.docker.DockerProcess#getCommand()
	 * @see #getDockerProcess()
	 * @generated
	 */
	EAttribute getDockerProcess_Command();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.DockerContainerStats <em>Container Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Stats</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainerStats
	 * @generated
	 */
	EClass getDockerContainerStats();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.docker.DockerContainerStats#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Networks</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainerStats#getNetworks()
	 * @see #getDockerContainerStats()
	 * @generated
	 */
	EReference getDockerContainerStats_Networks();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.DockerContainerStats#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memory</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainerStats#getMemory()
	 * @see #getDockerContainerStats()
	 * @generated
	 */
	EReference getDockerContainerStats_Memory();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.DockerContainerStats#getCpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cpu</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainerStats#getCpu()
	 * @see #getDockerContainerStats()
	 * @generated
	 */
	EReference getDockerContainerStats_Cpu();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.DockerContainerStats#getLastRead <em>Last Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Read</em>'.
	 * @see org.openecomp.ncomp.docker.DockerContainerStats#getLastRead()
	 * @see #getDockerContainerStats()
	 * @generated
	 */
	EAttribute getDockerContainerStats_LastRead();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerNetworkStats <em>Container Network Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Network Stats</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats
	 * @generated
	 */
	EClass getContainerNetworkStats();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getIntf <em>Intf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intf</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getIntf()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Intf();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_bytes <em>Rx bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx bytes</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_bytes()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Rx_bytes();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_dropped <em>Rx dropped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx dropped</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_dropped()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Rx_dropped();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_errors <em>Rx errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx errors</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_errors()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Rx_errors();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_packets <em>Rx packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rx packets</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getRx_packets()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Rx_packets();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_bytes <em>Tx bytes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx bytes</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_bytes()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Tx_bytes();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_dropped <em>Tx dropped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx dropped</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_dropped()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Tx_dropped();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_errors <em>Tx errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx errors</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_errors()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Tx_errors();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_packets <em>Tx packets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tx packets</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerNetworkStats#getTx_packets()
	 * @see #getContainerNetworkStats()
	 * @generated
	 */
	EAttribute getContainerNetworkStats_Tx_packets();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerMemoryStats <em>Container Memory Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Memory Stats</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats
	 * @generated
	 */
	EClass getContainerMemoryStats();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgmajfault <em>Total pgmajfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total pgmajfault</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgmajfault()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_pgmajfault();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getCache()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Cache();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getMapped_file <em>Mapped file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapped file</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getMapped_file()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Mapped_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_file <em>Total inactive file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total inactive file</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_file()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_inactive_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgout <em>Pgpgout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgpgout</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgout()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Pgpgout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getRss <em>Rss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rss</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getRss()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Rss();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_mapped_file <em>Total mapped file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total mapped file</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_mapped_file()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_mapped_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getWriteback <em>Writeback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Writeback</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getWriteback()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Writeback();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getUnevictable <em>Unevictable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unevictable</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getUnevictable()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Unevictable();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgin <em>Pgpgin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgpgin</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgin()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Pgpgin();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_unevictable <em>Total unevictable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total unevictable</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_unevictable()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_unevictable();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgmajfault <em>Pgmajfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgmajfault</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getPgmajfault()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Pgmajfault();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss <em>Total rss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total rss</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_rss();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss_huge <em>Total rss huge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total rss huge</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss_huge()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_rss_huge();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_writeback <em>Total writeback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total writeback</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_writeback()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_writeback();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_anon <em>Total inactive anon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total inactive anon</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_anon()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_inactive_anon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getRss_huge <em>Rss huge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rss huge</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getRss_huge()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Rss_huge();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getHierarchical_memory_limit <em>Hierarchical memory limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hierarchical memory limit</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getHierarchical_memory_limit()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Hierarchical_memory_limit();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgfault <em>Total pgfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total pgfault</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgfault()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_pgfault();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_file <em>Total active file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total active file</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_file()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_active_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_anon <em>Active anon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active anon</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_anon()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Active_anon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_anon <em>Total active anon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total active anon</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_anon()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_active_anon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgout <em>Total pgpgout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total pgpgout</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgout()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_pgpgout();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_cache <em>Total cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total cache</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_cache()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_cache();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_anon <em>Inactive anon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inactive anon</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_anon()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Inactive_anon();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_file <em>Active file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active file</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_file()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Active_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgfault <em>Pgfault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pgfault</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getPgfault()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Pgfault();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_file <em>Inactive file</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inactive file</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_file()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Inactive_file();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgin <em>Total pgpgin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total pgpgin</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgin()
	 * @see #getContainerMemoryStats()
	 * @generated
	 */
	EAttribute getContainerMemoryStats_Total_pgpgin();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage <em>Container Memory Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Memory Usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryUsage
	 * @generated
	 */
	EClass getContainerMemoryUsage();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getMemstats <em>Memstats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Memstats</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryUsage#getMemstats()
	 * @see #getContainerMemoryUsage()
	 * @generated
	 */
	EReference getContainerMemoryUsage_Memstats();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getMax_usage <em>Max usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryUsage#getMax_usage()
	 * @see #getContainerMemoryUsage()
	 * @generated
	 */
	EAttribute getContainerMemoryUsage_Max_usage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryUsage#getUsage()
	 * @see #getContainerMemoryUsage()
	 * @generated
	 */
	EAttribute getContainerMemoryUsage_Usage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getFailcnt <em>Failcnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failcnt</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryUsage#getFailcnt()
	 * @see #getContainerMemoryUsage()
	 * @generated
	 */
	EAttribute getContainerMemoryUsage_Failcnt();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerMemoryUsage#getLimit <em>Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Limit</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerMemoryUsage#getLimit()
	 * @see #getContainerMemoryUsage()
	 * @generated
	 */
	EAttribute getContainerMemoryUsage_Limit();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerCpuUsage <em>Container Cpu Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Cpu Usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuUsage
	 * @generated
	 */
	EClass getContainerCpuUsage();

	/**
	 * Returns the meta object for the attribute list '{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getPercpu_usage <em>Percpu usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Percpu usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuUsage#getPercpu_usage()
	 * @see #getContainerCpuUsage()
	 * @generated
	 */
	EAttribute getContainerCpuUsage_Percpu_usage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getUsage_in_usermode <em>Usage in usermode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage in usermode</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuUsage#getUsage_in_usermode()
	 * @see #getContainerCpuUsage()
	 * @generated
	 */
	EAttribute getContainerCpuUsage_Usage_in_usermode();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getTotal_usage <em>Total usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuUsage#getTotal_usage()
	 * @see #getContainerCpuUsage()
	 * @generated
	 */
	EAttribute getContainerCpuUsage_Total_usage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerCpuUsage#getUser_in_kernelmode <em>User in kernelmode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User in kernelmode</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuUsage#getUser_in_kernelmode()
	 * @see #getContainerCpuUsage()
	 * @generated
	 */
	EAttribute getContainerCpuUsage_User_in_kernelmode();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.docker.ContainerCpuStats <em>Container Cpu Stats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Cpu Stats</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuStats
	 * @generated
	 */
	EClass getContainerCpuStats();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.docker.ContainerCpuStats#getCpu_usage <em>Cpu usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cpu usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuStats#getCpu_usage()
	 * @see #getContainerCpuStats()
	 * @generated
	 */
	EReference getContainerCpuStats_Cpu_usage();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.docker.ContainerCpuStats#getSystem_cpu_usage <em>System cpu usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System cpu usage</em>'.
	 * @see org.openecomp.ncomp.docker.ContainerCpuStats#getSystem_cpu_usage()
	 * @see #getContainerCpuStats()
	 * @generated
	 */
	EAttribute getContainerCpuStats_System_cpu_usage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockerFactory getDockerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerAdaptorImpl <em>Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerAdaptorImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerAdaptor()
		 * @generated
		 */
		EClass DOCKER_ADAPTOR = eINSTANCE.getDockerAdaptor();

		/**
		 * The meta object literal for the '<em><b>Docker Hosts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_ADAPTOR__DOCKER_HOSTS = eINSTANCE.getDockerAdaptor_DockerHosts();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerHostImpl <em>Host</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerHostImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerHost()
		 * @generated
		 */
		EClass DOCKER_HOST = eINSTANCE.getDockerHost();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_HOST__URL = eINSTANCE.getDockerHost_Url();

		/**
		 * The meta object literal for the '<em><b>Polling Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_HOST__POLLING_FREQUENCY = eINSTANCE.getDockerHost_PollingFrequency();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_HOST__REMOTE = eINSTANCE.getDockerHost_Remote();

		/**
		 * The meta object literal for the '<em><b>Images</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_HOST__IMAGES = eINSTANCE.getDockerHost_Images();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_HOST__CONTAINERS = eINSTANCE.getDockerHost_Containers();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_HOST__NETWORKS = eINSTANCE.getDockerHost_Networks();

		/**
		 * The meta object literal for the '<em><b>Poll</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___POLL = eINSTANCE.getDockerHost__Poll();

		/**
		 * The meta object literal for the '<em><b>Start Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___START_CONTAINER__STRING = eINSTANCE.getDockerHost__StartContainer__String();

		/**
		 * The meta object literal for the '<em><b>Stop Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___STOP_CONTAINER__STRING_INT = eINSTANCE.getDockerHost__StopContainer__String_int();

		/**
		 * The meta object literal for the '<em><b>Restart Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___RESTART_CONTAINER__STRING_INT = eINSTANCE.getDockerHost__RestartContainer__String_int();

		/**
		 * The meta object literal for the '<em><b>Pause Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___PAUSE_CONTAINER__STRING = eINSTANCE.getDockerHost__PauseContainer__String();

		/**
		 * The meta object literal for the '<em><b>Unpause Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___UNPAUSE_CONTAINER__STRING = eINSTANCE.getDockerHost__UnpauseContainer__String();

		/**
		 * The meta object literal for the '<em><b>Remove Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___REMOVE_CONTAINER__STRING_BOOLEAN_BOOLEAN = eINSTANCE.getDockerHost__RemoveContainer__String_boolean_boolean();

		/**
		 * The meta object literal for the '<em><b>Inspect Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___INSPECT_CONTAINER__STRING = eINSTANCE.getDockerHost__InspectContainer__String();

		/**
		 * The meta object literal for the '<em><b>Kill Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___KILL_CONTAINER__STRING_STRING = eINSTANCE.getDockerHost__KillContainer__String_String();

		/**
		 * The meta object literal for the '<em><b>Docker Run</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___DOCKER_RUN__STRING = eINSTANCE.getDockerHost__DockerRun__String();

		/**
		 * The meta object literal for the '<em><b>Docker Run With Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___DOCKER_RUN_WITH_NAME__STRING_STRING = eINSTANCE.getDockerHost__DockerRunWithName__String_String();

		/**
		 * The meta object literal for the '<em><b>Docker Run With Options</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___DOCKER_RUN_WITH_OPTIONS__STRING_CONTAINEROPTIONS = eINSTANCE.getDockerHost__DockerRunWithOptions__String_ContainerOptions();

		/**
		 * The meta object literal for the '<em><b>Container Stats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___CONTAINER_STATS__STRING_BOOLEAN = eINSTANCE.getDockerHost__ContainerStats__String_boolean();

		/**
		 * The meta object literal for the '<em><b>Container Processes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCKER_HOST___CONTAINER_PROCESSES__STRING = eINSTANCE.getDockerHost__ContainerProcesses__String();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerImageImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerImage()
		 * @generated
		 */
		EClass DOCKER_IMAGE = eINSTANCE.getDockerImage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__ID = eINSTANCE.getDockerImage_Id();

		/**
		 * The meta object literal for the '<em><b>Parent Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__PARENT_ID = eINSTANCE.getDockerImage_ParentId();

		/**
		 * The meta object literal for the '<em><b>Repo Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__REPO_TAGS = eINSTANCE.getDockerImage_RepoTags();

		/**
		 * The meta object literal for the '<em><b>Repo Digests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__REPO_DIGESTS = eINSTANCE.getDockerImage_RepoDigests();

		/**
		 * The meta object literal for the '<em><b>Docker Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__DOCKER_CREATED = eINSTANCE.getDockerImage_DockerCreated();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__SIZE = eINSTANCE.getDockerImage_Size();

		/**
		 * The meta object literal for the '<em><b>Virtual Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__VIRTUAL_SIZE = eINSTANCE.getDockerImage_VirtualSize();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE__LABELS = eINSTANCE.getDockerImage_Labels();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerContainerImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerContainer()
		 * @generated
		 */
		EClass DOCKER_CONTAINER = eINSTANCE.getDockerContainer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__ID = eINSTANCE.getDockerContainer_Id();

		/**
		 * The meta object literal for the '<em><b>Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__NAMES = eINSTANCE.getDockerContainer_Names();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__IMAGE = eINSTANCE.getDockerContainer_Image();

		/**
		 * The meta object literal for the '<em><b>Image ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__IMAGE_ID = eINSTANCE.getDockerContainer_ImageID();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__COMMAND = eINSTANCE.getDockerContainer_Command();

		/**
		 * The meta object literal for the '<em><b>Docker Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__DOCKER_CREATED = eINSTANCE.getDockerContainer_DockerCreated();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__PORTS = eINSTANCE.getDockerContainer_Ports();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__LABELS = eINSTANCE.getDockerContainer_Labels();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER__STATUS = eINSTANCE.getDockerContainer_Status();

		/**
		 * The meta object literal for the '<em><b>Host Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__HOST_CONFIG = eINSTANCE.getDockerContainer_HostConfig();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__PROCESSES = eINSTANCE.getDockerContainer_Processes();

		/**
		 * The meta object literal for the '<em><b>Mounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__MOUNTS = eINSTANCE.getDockerContainer_Mounts();

		/**
		 * The meta object literal for the '<em><b>Stats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__STATS = eINSTANCE.getDockerContainer_Stats();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER__EVENTS = eINSTANCE.getDockerContainer_Events();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerPortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerPortImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerPort()
		 * @generated
		 */
		EClass DOCKER_PORT = eINSTANCE.getDockerPort();

		/**
		 * The meta object literal for the '<em><b>Private Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PORT__PRIVATE_PORT = eINSTANCE.getDockerPort_PrivatePort();

		/**
		 * The meta object literal for the '<em><b>Public Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PORT__PUBLIC_PORT = eINSTANCE.getDockerPort_PublicPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PORT__TYPE = eINSTANCE.getDockerPort_Type();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerKeyPairImpl <em>Key Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerKeyPairImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerKeyPair()
		 * @generated
		 */
		EClass DOCKER_KEY_PAIR = eINSTANCE.getDockerKeyPair();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_KEY_PAIR__NAME = eINSTANCE.getDockerKeyPair_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_KEY_PAIR__VALUE = eINSTANCE.getDockerKeyPair_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerMountImpl <em>Mount</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerMountImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerMount()
		 * @generated
		 */
		EClass DOCKER_MOUNT = eINSTANCE.getDockerMount();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_MOUNT__SOURCE = eINSTANCE.getDockerMount_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_MOUNT__DESTINATION = eINSTANCE.getDockerMount_Destination();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_MOUNT__MODE = eINSTANCE.getDockerMount_Mode();

		/**
		 * The meta object literal for the '<em><b>RW</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_MOUNT__RW = eINSTANCE.getDockerMount_RW();

		/**
		 * The meta object literal for the '<em><b>Propagation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_MOUNT__PROPAGATION = eINSTANCE.getDockerMount_Propagation();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerOptionsImpl <em>Container Options</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerOptionsImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerOptions()
		 * @generated
		 */
		EClass CONTAINER_OPTIONS = eINSTANCE.getContainerOptions();

		/**
		 * The meta object literal for the '<em><b>Image Nm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_OPTIONS__IMAGE_NM = eINSTANCE.getContainerOptions_ImageNm();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_OPTIONS__ENV = eINSTANCE.getContainerOptions_Env();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_OPTIONS__VOLUMES = eINSTANCE.getContainerOptions_Volumes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_OPTIONS__LINKS = eINSTANCE.getContainerOptions_Links();

		/**
		 * The meta object literal for the '<em><b>Set Container Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_OPTIONS__SET_CONTAINER_NAME = eINSTANCE.getContainerOptions_SetContainerName();

		/**
		 * The meta object literal for the '<em><b>Publish All Ports</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_OPTIONS__PUBLISH_ALL_PORTS = eINSTANCE.getContainerOptions_PublishAllPorts();

		/**
		 * The meta object literal for the '<em><b>Port Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_OPTIONS__PORT_BINDINGS = eINSTANCE.getContainerOptions_PortBindings();

		/**
		 * The meta object literal for the '<em><b>Auto Restart</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_OPTIONS__AUTO_RESTART = eINSTANCE.getContainerOptions_AutoRestart();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerRestartPolicyImpl <em>Container Restart Policy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerRestartPolicyImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerRestartPolicy()
		 * @generated
		 */
		EClass CONTAINER_RESTART_POLICY = eINSTANCE.getContainerRestartPolicy();

		/**
		 * The meta object literal for the '<em><b>Nm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_RESTART_POLICY__NM = eINSTANCE.getContainerRestartPolicy_Nm();

		/**
		 * The meta object literal for the '<em><b>Max Retry Cnt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_RESTART_POLICY__MAX_RETRY_CNT = eINSTANCE.getContainerRestartPolicy_MaxRetryCnt();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerPortBindingsImpl <em>Container Port Bindings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerPortBindingsImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerPortBindings()
		 * @generated
		 */
		EClass CONTAINER_PORT_BINDINGS = eINSTANCE.getContainerPortBindings();

		/**
		 * The meta object literal for the '<em><b>Container Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT_BINDINGS__CONTAINER_PORT = eINSTANCE.getContainerPortBindings_ContainerPort();

		/**
		 * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT_BINDINGS__PROTOCOL = eINSTANCE.getContainerPortBindings_Protocol();

		/**
		 * The meta object literal for the '<em><b>Vm Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_PORT_BINDINGS__VM_PORT = eINSTANCE.getContainerPortBindings_VmPort();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerNetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerNetworkImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerNetwork()
		 * @generated
		 */
		EClass DOCKER_NETWORK = eINSTANCE.getDockerNetwork();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK__ID = eINSTANCE.getDockerNetwork_Id();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK__SCOPE = eINSTANCE.getDockerNetwork_Scope();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK__DRIVER = eINSTANCE.getDockerNetwork_Driver();

		/**
		 * The meta object literal for the '<em><b>IPAM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_NETWORK__IPAM = eINSTANCE.getDockerNetwork_IPAM();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_NETWORK__CONTAINERS = eINSTANCE.getDockerNetwork_Containers();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_NETWORK__OPTIONS = eINSTANCE.getDockerNetwork_Options();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerIpamImpl <em>Ipam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerIpamImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerIpam()
		 * @generated
		 */
		EClass DOCKER_IPAM = eINSTANCE.getDockerIpam();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IPAM__DRIVER = eINSTANCE.getDockerIpam_Driver();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_IPAM__CONFIG = eINSTANCE.getDockerIpam_Config();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerIpamConfigImpl <em>Ipam Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerIpamConfigImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerIpamConfig()
		 * @generated
		 */
		EClass DOCKER_IPAM_CONFIG = eINSTANCE.getDockerIpamConfig();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IPAM_CONFIG__SUBNET = eINSTANCE.getDockerIpamConfig_Subnet();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl <em>Network Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerNetworkContainerImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerNetworkContainer()
		 * @generated
		 */
		EClass DOCKER_NETWORK_CONTAINER = eINSTANCE.getDockerNetworkContainer();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK_CONTAINER__ID = eINSTANCE.getDockerNetworkContainer_Id();

		/**
		 * The meta object literal for the '<em><b>IPv4 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK_CONTAINER__IPV4_ADDRESS = eINSTANCE.getDockerNetworkContainer_IPv4Address();

		/**
		 * The meta object literal for the '<em><b>IPv6 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK_CONTAINER__IPV6_ADDRESS = eINSTANCE.getDockerNetworkContainer_IPv6Address();

		/**
		 * The meta object literal for the '<em><b>Endpoint ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK_CONTAINER__ENDPOINT_ID = eINSTANCE.getDockerNetworkContainer_EndpointID();

		/**
		 * The meta object literal for the '<em><b>Mac Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_NETWORK_CONTAINER__MAC_ADDRESS = eINSTANCE.getDockerNetworkContainer_MacAddress();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerEventsImpl <em>Events</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerEventsImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerEvents()
		 * @generated
		 */
		EClass DOCKER_EVENTS = eINSTANCE.getDockerEvents();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_EVENTS__STATUS = eINSTANCE.getDockerEvents_Status();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_EVENTS__ID = eINSTANCE.getDockerEvents_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_EVENTS__TYPE = eINSTANCE.getDockerEvents_Type();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_EVENTS__ACTION = eINSTANCE.getDockerEvents_Action();

		/**
		 * The meta object literal for the '<em><b>Actor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_EVENTS__ACTOR = eINSTANCE.getDockerEvents_Actor();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_EVENTS__TIME = eINSTANCE.getDockerEvents_Time();

		/**
		 * The meta object literal for the '<em><b>Timenano</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_EVENTS__TIMENANO = eINSTANCE.getDockerEvents_Timenano();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerActorImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerActor()
		 * @generated
		 */
		EClass DOCKER_ACTOR = eINSTANCE.getDockerActor();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_ACTOR__ID = eINSTANCE.getDockerActor_Id();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_ACTOR__ATTRIBUTES = eINSTANCE.getDockerActor_Attributes();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerActorAttributesImpl <em>Actor Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerActorAttributesImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerActorAttributes()
		 * @generated
		 */
		EClass DOCKER_ACTOR_ATTRIBUTES = eINSTANCE.getDockerActorAttributes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_ACTOR_ATTRIBUTES__NAME = eINSTANCE.getDockerActorAttributes_Name();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerCreateRequestImpl <em>Create Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerCreateRequestImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerCreateRequest()
		 * @generated
		 */
		EClass DOCKER_CREATE_REQUEST = eINSTANCE.getDockerCreateRequest();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CREATE_REQUEST__HOSTNAME = eINSTANCE.getDockerCreateRequest_Hostname();

		/**
		 * The meta object literal for the '<em><b>Cmd</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CREATE_REQUEST__CMD = eINSTANCE.getDockerCreateRequest_Cmd();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerProcessImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerProcess()
		 * @generated
		 */
		EClass DOCKER_PROCESS = eINSTANCE.getDockerProcess();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__USER = eINSTANCE.getDockerProcess_User();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__PID = eINSTANCE.getDockerProcess_Pid();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__CPU = eINSTANCE.getDockerProcess_Cpu();

		/**
		 * The meta object literal for the '<em><b>Mem</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__MEM = eINSTANCE.getDockerProcess_Mem();

		/**
		 * The meta object literal for the '<em><b>Vsz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__VSZ = eINSTANCE.getDockerProcess_Vsz();

		/**
		 * The meta object literal for the '<em><b>Rss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__RSS = eINSTANCE.getDockerProcess_Rss();

		/**
		 * The meta object literal for the '<em><b>Tty</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__TTY = eINSTANCE.getDockerProcess_Tty();

		/**
		 * The meta object literal for the '<em><b>Stat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__STAT = eINSTANCE.getDockerProcess_Stat();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__START = eINSTANCE.getDockerProcess_Start();

		/**
		 * The meta object literal for the '<em><b>Time Elapsed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__TIME_ELAPSED = eINSTANCE.getDockerProcess_TimeElapsed();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_PROCESS__COMMAND = eINSTANCE.getDockerProcess_Command();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl <em>Container Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.DockerContainerStatsImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getDockerContainerStats()
		 * @generated
		 */
		EClass DOCKER_CONTAINER_STATS = eINSTANCE.getDockerContainerStats();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER_STATS__NETWORKS = eINSTANCE.getDockerContainerStats_Networks();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER_STATS__MEMORY = eINSTANCE.getDockerContainerStats_Memory();

		/**
		 * The meta object literal for the '<em><b>Cpu</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_CONTAINER_STATS__CPU = eINSTANCE.getDockerContainerStats_Cpu();

		/**
		 * The meta object literal for the '<em><b>Last Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_CONTAINER_STATS__LAST_READ = eINSTANCE.getDockerContainerStats_LastRead();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl <em>Container Network Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerNetworkStatsImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerNetworkStats()
		 * @generated
		 */
		EClass CONTAINER_NETWORK_STATS = eINSTANCE.getContainerNetworkStats();

		/**
		 * The meta object literal for the '<em><b>Intf</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__INTF = eINSTANCE.getContainerNetworkStats_Intf();

		/**
		 * The meta object literal for the '<em><b>Rx bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__RX_BYTES = eINSTANCE.getContainerNetworkStats_Rx_bytes();

		/**
		 * The meta object literal for the '<em><b>Rx dropped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__RX_DROPPED = eINSTANCE.getContainerNetworkStats_Rx_dropped();

		/**
		 * The meta object literal for the '<em><b>Rx errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__RX_ERRORS = eINSTANCE.getContainerNetworkStats_Rx_errors();

		/**
		 * The meta object literal for the '<em><b>Rx packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__RX_PACKETS = eINSTANCE.getContainerNetworkStats_Rx_packets();

		/**
		 * The meta object literal for the '<em><b>Tx bytes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__TX_BYTES = eINSTANCE.getContainerNetworkStats_Tx_bytes();

		/**
		 * The meta object literal for the '<em><b>Tx dropped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__TX_DROPPED = eINSTANCE.getContainerNetworkStats_Tx_dropped();

		/**
		 * The meta object literal for the '<em><b>Tx errors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__TX_ERRORS = eINSTANCE.getContainerNetworkStats_Tx_errors();

		/**
		 * The meta object literal for the '<em><b>Tx packets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_NETWORK_STATS__TX_PACKETS = eINSTANCE.getContainerNetworkStats_Tx_packets();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl <em>Container Memory Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerMemoryStats()
		 * @generated
		 */
		EClass CONTAINER_MEMORY_STATS = eINSTANCE.getContainerMemoryStats();

		/**
		 * The meta object literal for the '<em><b>Total pgmajfault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT = eINSTANCE.getContainerMemoryStats_Total_pgmajfault();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__CACHE = eINSTANCE.getContainerMemoryStats_Cache();

		/**
		 * The meta object literal for the '<em><b>Mapped file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__MAPPED_FILE = eINSTANCE.getContainerMemoryStats_Mapped_file();

		/**
		 * The meta object literal for the '<em><b>Total inactive file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE = eINSTANCE.getContainerMemoryStats_Total_inactive_file();

		/**
		 * The meta object literal for the '<em><b>Pgpgout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__PGPGOUT = eINSTANCE.getContainerMemoryStats_Pgpgout();

		/**
		 * The meta object literal for the '<em><b>Rss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__RSS = eINSTANCE.getContainerMemoryStats_Rss();

		/**
		 * The meta object literal for the '<em><b>Total mapped file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE = eINSTANCE.getContainerMemoryStats_Total_mapped_file();

		/**
		 * The meta object literal for the '<em><b>Writeback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__WRITEBACK = eINSTANCE.getContainerMemoryStats_Writeback();

		/**
		 * The meta object literal for the '<em><b>Unevictable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__UNEVICTABLE = eINSTANCE.getContainerMemoryStats_Unevictable();

		/**
		 * The meta object literal for the '<em><b>Pgpgin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__PGPGIN = eINSTANCE.getContainerMemoryStats_Pgpgin();

		/**
		 * The meta object literal for the '<em><b>Total unevictable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE = eINSTANCE.getContainerMemoryStats_Total_unevictable();

		/**
		 * The meta object literal for the '<em><b>Pgmajfault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__PGMAJFAULT = eINSTANCE.getContainerMemoryStats_Pgmajfault();

		/**
		 * The meta object literal for the '<em><b>Total rss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_RSS = eINSTANCE.getContainerMemoryStats_Total_rss();

		/**
		 * The meta object literal for the '<em><b>Total rss huge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE = eINSTANCE.getContainerMemoryStats_Total_rss_huge();

		/**
		 * The meta object literal for the '<em><b>Total writeback</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK = eINSTANCE.getContainerMemoryStats_Total_writeback();

		/**
		 * The meta object literal for the '<em><b>Total inactive anon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON = eINSTANCE.getContainerMemoryStats_Total_inactive_anon();

		/**
		 * The meta object literal for the '<em><b>Rss huge</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__RSS_HUGE = eINSTANCE.getContainerMemoryStats_Rss_huge();

		/**
		 * The meta object literal for the '<em><b>Hierarchical memory limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT = eINSTANCE.getContainerMemoryStats_Hierarchical_memory_limit();

		/**
		 * The meta object literal for the '<em><b>Total pgfault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_PGFAULT = eINSTANCE.getContainerMemoryStats_Total_pgfault();

		/**
		 * The meta object literal for the '<em><b>Total active file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE = eINSTANCE.getContainerMemoryStats_Total_active_file();

		/**
		 * The meta object literal for the '<em><b>Active anon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__ACTIVE_ANON = eINSTANCE.getContainerMemoryStats_Active_anon();

		/**
		 * The meta object literal for the '<em><b>Total active anon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON = eINSTANCE.getContainerMemoryStats_Total_active_anon();

		/**
		 * The meta object literal for the '<em><b>Total pgpgout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT = eINSTANCE.getContainerMemoryStats_Total_pgpgout();

		/**
		 * The meta object literal for the '<em><b>Total cache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_CACHE = eINSTANCE.getContainerMemoryStats_Total_cache();

		/**
		 * The meta object literal for the '<em><b>Inactive anon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__INACTIVE_ANON = eINSTANCE.getContainerMemoryStats_Inactive_anon();

		/**
		 * The meta object literal for the '<em><b>Active file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__ACTIVE_FILE = eINSTANCE.getContainerMemoryStats_Active_file();

		/**
		 * The meta object literal for the '<em><b>Pgfault</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__PGFAULT = eINSTANCE.getContainerMemoryStats_Pgfault();

		/**
		 * The meta object literal for the '<em><b>Inactive file</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__INACTIVE_FILE = eINSTANCE.getContainerMemoryStats_Inactive_file();

		/**
		 * The meta object literal for the '<em><b>Total pgpgin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_STATS__TOTAL_PGPGIN = eINSTANCE.getContainerMemoryStats_Total_pgpgin();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl <em>Container Memory Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerMemoryUsageImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerMemoryUsage()
		 * @generated
		 */
		EClass CONTAINER_MEMORY_USAGE = eINSTANCE.getContainerMemoryUsage();

		/**
		 * The meta object literal for the '<em><b>Memstats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_MEMORY_USAGE__MEMSTATS = eINSTANCE.getContainerMemoryUsage_Memstats();

		/**
		 * The meta object literal for the '<em><b>Max usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_USAGE__MAX_USAGE = eINSTANCE.getContainerMemoryUsage_Max_usage();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_USAGE__USAGE = eINSTANCE.getContainerMemoryUsage_Usage();

		/**
		 * The meta object literal for the '<em><b>Failcnt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_USAGE__FAILCNT = eINSTANCE.getContainerMemoryUsage_Failcnt();

		/**
		 * The meta object literal for the '<em><b>Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_MEMORY_USAGE__LIMIT = eINSTANCE.getContainerMemoryUsage_Limit();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl <em>Container Cpu Usage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerCpuUsageImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerCpuUsage()
		 * @generated
		 */
		EClass CONTAINER_CPU_USAGE = eINSTANCE.getContainerCpuUsage();

		/**
		 * The meta object literal for the '<em><b>Percpu usage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CPU_USAGE__PERCPU_USAGE = eINSTANCE.getContainerCpuUsage_Percpu_usage();

		/**
		 * The meta object literal for the '<em><b>Usage in usermode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CPU_USAGE__USAGE_IN_USERMODE = eINSTANCE.getContainerCpuUsage_Usage_in_usermode();

		/**
		 * The meta object literal for the '<em><b>Total usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CPU_USAGE__TOTAL_USAGE = eINSTANCE.getContainerCpuUsage_Total_usage();

		/**
		 * The meta object literal for the '<em><b>User in kernelmode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CPU_USAGE__USER_IN_KERNELMODE = eINSTANCE.getContainerCpuUsage_User_in_kernelmode();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.docker.impl.ContainerCpuStatsImpl <em>Container Cpu Stats</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.docker.impl.ContainerCpuStatsImpl
		 * @see org.openecomp.ncomp.docker.impl.DockerPackageImpl#getContainerCpuStats()
		 * @generated
		 */
		EClass CONTAINER_CPU_STATS = eINSTANCE.getContainerCpuStats();

		/**
		 * The meta object literal for the '<em><b>Cpu usage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER_CPU_STATS__CPU_USAGE = eINSTANCE.getContainerCpuStats_Cpu_usage();

		/**
		 * The meta object literal for the '<em><b>System cpu usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_CPU_STATS__SYSTEM_CPU_USAGE = eINSTANCE.getContainerCpuStats_System_cpu_usage();

	}

} //DockerPackage
