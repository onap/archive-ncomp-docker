
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
 * A representation of the model object '<em><b>Container Memory Stats</b></em>'.
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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgmajfault <em>Total pgmajfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getCache <em>Cache</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getMapped_file <em>Mapped file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_file <em>Total inactive file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgout <em>Pgpgout</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getRss <em>Rss</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_mapped_file <em>Total mapped file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getWriteback <em>Writeback</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getUnevictable <em>Unevictable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgin <em>Pgpgin</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_unevictable <em>Total unevictable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgmajfault <em>Pgmajfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss <em>Total rss</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss_huge <em>Total rss huge</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_writeback <em>Total writeback</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_anon <em>Total inactive anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getRss_huge <em>Rss huge</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getHierarchical_memory_limit <em>Hierarchical memory limit</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgfault <em>Total pgfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_file <em>Total active file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_anon <em>Active anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_anon <em>Total active anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgout <em>Total pgpgout</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_cache <em>Total cache</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_anon <em>Inactive anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_file <em>Active file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgfault <em>Pgfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_file <em>Inactive file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgin <em>Total pgpgin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats()
 * @model
 * @generated
 */
public interface ContainerMemoryStats extends EObject {

	/**
	 * Returns the value of the '<em><b>Total pgmajfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total pgmajfault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total pgmajfault</em>' attribute.
	 * @see #setTotal_pgmajfault(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_pgmajfault()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_pgmajfault();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgmajfault <em>Total pgmajfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total pgmajfault</em>' attribute.
	 * @see #getTotal_pgmajfault()
	 * @generated
	 */
	void setTotal_pgmajfault(int value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' attribute.
	 * @see #setCache(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Cache()
	 * @model unique="false"
	 * @generated
	 */
	int getCache();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getCache <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' attribute.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(int value);

	/**
	 * Returns the value of the '<em><b>Mapped file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapped file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapped file</em>' attribute.
	 * @see #setMapped_file(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Mapped_file()
	 * @model unique="false"
	 * @generated
	 */
	int getMapped_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getMapped_file <em>Mapped file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapped file</em>' attribute.
	 * @see #getMapped_file()
	 * @generated
	 */
	void setMapped_file(int value);

	/**
	 * Returns the value of the '<em><b>Total inactive file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total inactive file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total inactive file</em>' attribute.
	 * @see #setTotal_inactive_file(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_inactive_file()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_inactive_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_file <em>Total inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total inactive file</em>' attribute.
	 * @see #getTotal_inactive_file()
	 * @generated
	 */
	void setTotal_inactive_file(int value);

	/**
	 * Returns the value of the '<em><b>Pgpgout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgpgout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgpgout</em>' attribute.
	 * @see #setPgpgout(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Pgpgout()
	 * @model unique="false"
	 * @generated
	 */
	int getPgpgout();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgout <em>Pgpgout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgpgout</em>' attribute.
	 * @see #getPgpgout()
	 * @generated
	 */
	void setPgpgout(int value);

	/**
	 * Returns the value of the '<em><b>Rss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rss</em>' attribute.
	 * @see #setRss(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Rss()
	 * @model unique="false"
	 * @generated
	 */
	int getRss();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getRss <em>Rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rss</em>' attribute.
	 * @see #getRss()
	 * @generated
	 */
	void setRss(int value);

	/**
	 * Returns the value of the '<em><b>Total mapped file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total mapped file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total mapped file</em>' attribute.
	 * @see #setTotal_mapped_file(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_mapped_file()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_mapped_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_mapped_file <em>Total mapped file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total mapped file</em>' attribute.
	 * @see #getTotal_mapped_file()
	 * @generated
	 */
	void setTotal_mapped_file(int value);

	/**
	 * Returns the value of the '<em><b>Writeback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Writeback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Writeback</em>' attribute.
	 * @see #setWriteback(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Writeback()
	 * @model unique="false"
	 * @generated
	 */
	int getWriteback();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getWriteback <em>Writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Writeback</em>' attribute.
	 * @see #getWriteback()
	 * @generated
	 */
	void setWriteback(int value);

	/**
	 * Returns the value of the '<em><b>Unevictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unevictable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unevictable</em>' attribute.
	 * @see #setUnevictable(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Unevictable()
	 * @model unique="false"
	 * @generated
	 */
	int getUnevictable();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getUnevictable <em>Unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unevictable</em>' attribute.
	 * @see #getUnevictable()
	 * @generated
	 */
	void setUnevictable(int value);

	/**
	 * Returns the value of the '<em><b>Pgpgin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgpgin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgpgin</em>' attribute.
	 * @see #setPgpgin(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Pgpgin()
	 * @model unique="false"
	 * @generated
	 */
	int getPgpgin();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgpgin <em>Pgpgin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgpgin</em>' attribute.
	 * @see #getPgpgin()
	 * @generated
	 */
	void setPgpgin(int value);

	/**
	 * Returns the value of the '<em><b>Total unevictable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total unevictable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total unevictable</em>' attribute.
	 * @see #setTotal_unevictable(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_unevictable()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_unevictable();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_unevictable <em>Total unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total unevictable</em>' attribute.
	 * @see #getTotal_unevictable()
	 * @generated
	 */
	void setTotal_unevictable(int value);

	/**
	 * Returns the value of the '<em><b>Pgmajfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgmajfault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgmajfault</em>' attribute.
	 * @see #setPgmajfault(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Pgmajfault()
	 * @model unique="false"
	 * @generated
	 */
	int getPgmajfault();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgmajfault <em>Pgmajfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgmajfault</em>' attribute.
	 * @see #getPgmajfault()
	 * @generated
	 */
	void setPgmajfault(int value);

	/**
	 * Returns the value of the '<em><b>Total rss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total rss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total rss</em>' attribute.
	 * @see #setTotal_rss(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_rss()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_rss();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss <em>Total rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total rss</em>' attribute.
	 * @see #getTotal_rss()
	 * @generated
	 */
	void setTotal_rss(int value);

	/**
	 * Returns the value of the '<em><b>Total rss huge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total rss huge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total rss huge</em>' attribute.
	 * @see #setTotal_rss_huge(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_rss_huge()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_rss_huge();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_rss_huge <em>Total rss huge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total rss huge</em>' attribute.
	 * @see #getTotal_rss_huge()
	 * @generated
	 */
	void setTotal_rss_huge(int value);

	/**
	 * Returns the value of the '<em><b>Total writeback</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total writeback</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total writeback</em>' attribute.
	 * @see #setTotal_writeback(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_writeback()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_writeback();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_writeback <em>Total writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total writeback</em>' attribute.
	 * @see #getTotal_writeback()
	 * @generated
	 */
	void setTotal_writeback(int value);

	/**
	 * Returns the value of the '<em><b>Total inactive anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total inactive anon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total inactive anon</em>' attribute.
	 * @see #setTotal_inactive_anon(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_inactive_anon()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_inactive_anon();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_inactive_anon <em>Total inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total inactive anon</em>' attribute.
	 * @see #getTotal_inactive_anon()
	 * @generated
	 */
	void setTotal_inactive_anon(int value);

	/**
	 * Returns the value of the '<em><b>Rss huge</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rss huge</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rss huge</em>' attribute.
	 * @see #setRss_huge(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Rss_huge()
	 * @model unique="false"
	 * @generated
	 */
	int getRss_huge();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getRss_huge <em>Rss huge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rss huge</em>' attribute.
	 * @see #getRss_huge()
	 * @generated
	 */
	void setRss_huge(int value);

	/**
	 * Returns the value of the '<em><b>Hierarchical memory limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hierarchical memory limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hierarchical memory limit</em>' attribute.
	 * @see #setHierarchical_memory_limit(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Hierarchical_memory_limit()
	 * @model unique="false"
	 * @generated
	 */
	int getHierarchical_memory_limit();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getHierarchical_memory_limit <em>Hierarchical memory limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hierarchical memory limit</em>' attribute.
	 * @see #getHierarchical_memory_limit()
	 * @generated
	 */
	void setHierarchical_memory_limit(int value);

	/**
	 * Returns the value of the '<em><b>Total pgfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total pgfault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total pgfault</em>' attribute.
	 * @see #setTotal_pgfault(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_pgfault()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_pgfault();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgfault <em>Total pgfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total pgfault</em>' attribute.
	 * @see #getTotal_pgfault()
	 * @generated
	 */
	void setTotal_pgfault(int value);

	/**
	 * Returns the value of the '<em><b>Total active file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total active file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total active file</em>' attribute.
	 * @see #setTotal_active_file(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_active_file()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_active_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_file <em>Total active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total active file</em>' attribute.
	 * @see #getTotal_active_file()
	 * @generated
	 */
	void setTotal_active_file(int value);

	/**
	 * Returns the value of the '<em><b>Active anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active anon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active anon</em>' attribute.
	 * @see #setActive_anon(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Active_anon()
	 * @model unique="false"
	 * @generated
	 */
	int getActive_anon();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_anon <em>Active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active anon</em>' attribute.
	 * @see #getActive_anon()
	 * @generated
	 */
	void setActive_anon(int value);

	/**
	 * Returns the value of the '<em><b>Total active anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total active anon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total active anon</em>' attribute.
	 * @see #setTotal_active_anon(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_active_anon()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_active_anon();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_active_anon <em>Total active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total active anon</em>' attribute.
	 * @see #getTotal_active_anon()
	 * @generated
	 */
	void setTotal_active_anon(int value);

	/**
	 * Returns the value of the '<em><b>Total pgpgout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total pgpgout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total pgpgout</em>' attribute.
	 * @see #setTotal_pgpgout(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_pgpgout()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_pgpgout();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgout <em>Total pgpgout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total pgpgout</em>' attribute.
	 * @see #getTotal_pgpgout()
	 * @generated
	 */
	void setTotal_pgpgout(int value);

	/**
	 * Returns the value of the '<em><b>Total cache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total cache</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total cache</em>' attribute.
	 * @see #setTotal_cache(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_cache()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_cache();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_cache <em>Total cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total cache</em>' attribute.
	 * @see #getTotal_cache()
	 * @generated
	 */
	void setTotal_cache(int value);

	/**
	 * Returns the value of the '<em><b>Inactive anon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive anon</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive anon</em>' attribute.
	 * @see #setInactive_anon(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Inactive_anon()
	 * @model unique="false"
	 * @generated
	 */
	int getInactive_anon();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_anon <em>Inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive anon</em>' attribute.
	 * @see #getInactive_anon()
	 * @generated
	 */
	void setInactive_anon(int value);

	/**
	 * Returns the value of the '<em><b>Active file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active file</em>' attribute.
	 * @see #setActive_file(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Active_file()
	 * @model unique="false"
	 * @generated
	 */
	int getActive_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getActive_file <em>Active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active file</em>' attribute.
	 * @see #getActive_file()
	 * @generated
	 */
	void setActive_file(int value);

	/**
	 * Returns the value of the '<em><b>Pgfault</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pgfault</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pgfault</em>' attribute.
	 * @see #setPgfault(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Pgfault()
	 * @model unique="false"
	 * @generated
	 */
	int getPgfault();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getPgfault <em>Pgfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pgfault</em>' attribute.
	 * @see #getPgfault()
	 * @generated
	 */
	void setPgfault(int value);

	/**
	 * Returns the value of the '<em><b>Inactive file</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inactive file</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inactive file</em>' attribute.
	 * @see #setInactive_file(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Inactive_file()
	 * @model unique="false"
	 * @generated
	 */
	int getInactive_file();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getInactive_file <em>Inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inactive file</em>' attribute.
	 * @see #getInactive_file()
	 * @generated
	 */
	void setInactive_file(int value);

	/**
	 * Returns the value of the '<em><b>Total pgpgin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total pgpgin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total pgpgin</em>' attribute.
	 * @see #setTotal_pgpgin(int)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getContainerMemoryStats_Total_pgpgin()
	 * @model unique="false"
	 * @generated
	 */
	int getTotal_pgpgin();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.ContainerMemoryStats#getTotal_pgpgin <em>Total pgpgin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total pgpgin</em>' attribute.
	 * @see #getTotal_pgpgin()
	 * @generated
	 */
	void setTotal_pgpgin(int value);
} // ContainerMemoryStats
