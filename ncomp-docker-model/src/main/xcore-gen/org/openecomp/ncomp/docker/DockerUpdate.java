
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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * "memory_stats" : {
 *         "stats" : {
 *            "total_pgmajfault" : 0,
 *            "cache" : 0,
 *            "mapped_file" : 0,
 *            "total_inactive_file" : 0,
 *            "pgpgout" : 414,
 *            "rss" : 6537216,
 *            "total_mapped_file" : 0,
 *            "writeback" : 0,
 *            "unevictable" : 0,
 *            "pgpgin" : 477,
 *            "total_unevictable" : 0,
 *            "pgmajfault" : 0,
 *            "total_rss" : 6537216,
 *            "total_rss_huge" : 6291456,
 *            "total_writeback" : 0,
 *            "total_inactive_anon" : 0,
 *            "rss_huge" : 6291456,
 *            "hierarchical_memory_limit" : 67108864,
 *            "total_pgfault" : 964,
 *            "total_active_file" : 0,
 *            "active_anon" : 6537216,
 *            "total_active_anon" : 6537216,
 *            "total_pgpgout" : 414,
 *            "total_cache" : 0,
 *            "inactive_anon" : 0,
 *            "active_file" : 0,
 *            "pgfault" : 964,
 *            "inactive_file" : 0,
 *            "total_pgpgin" : 477
 *         },
 *         "max_usage" : 6651904,
 *         "usage" : 6537216,
 *         "failcnt" : 0,
 *         "limit" : 67108864
 *      },
 * <!-- end-model-doc -->
 *
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerUpdate()
 * @model
 * @generated
 */
public interface DockerUpdate extends EObject {
} // DockerUpdate
