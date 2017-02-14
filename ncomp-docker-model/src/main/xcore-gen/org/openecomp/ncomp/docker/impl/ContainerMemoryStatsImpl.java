
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

import org.openecomp.ncomp.docker.ContainerMemoryStats;
import org.openecomp.ncomp.docker.DockerPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Memory Stats</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_pgmajfault <em>Total pgmajfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getMapped_file <em>Mapped file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_inactive_file <em>Total inactive file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getPgpgout <em>Pgpgout</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_mapped_file <em>Total mapped file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getWriteback <em>Writeback</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getUnevictable <em>Unevictable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getPgpgin <em>Pgpgin</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_unevictable <em>Total unevictable</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getPgmajfault <em>Pgmajfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_rss <em>Total rss</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_rss_huge <em>Total rss huge</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_writeback <em>Total writeback</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_inactive_anon <em>Total inactive anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getRss_huge <em>Rss huge</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getHierarchical_memory_limit <em>Hierarchical memory limit</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_pgfault <em>Total pgfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_active_file <em>Total active file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getActive_anon <em>Active anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_active_anon <em>Total active anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_pgpgout <em>Total pgpgout</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_cache <em>Total cache</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getInactive_anon <em>Inactive anon</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getActive_file <em>Active file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getPgfault <em>Pgfault</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getInactive_file <em>Inactive file</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.ContainerMemoryStatsImpl#getTotal_pgpgin <em>Total pgpgin</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainerMemoryStatsImpl extends MinimalEObjectImpl.Container implements ContainerMemoryStats {
	/**
	 * The default value of the '{@link #getTotal_pgmajfault() <em>Total pgmajfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgmajfault()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PGMAJFAULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_pgmajfault() <em>Total pgmajfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgmajfault()
	 * @generated
	 * @ordered
	 */
	protected int total_pgmajfault = TOTAL_PGMAJFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected static final int CACHE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected int cache = CACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapped_file() <em>Mapped file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped_file()
	 * @generated
	 * @ordered
	 */
	protected static final int MAPPED_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMapped_file() <em>Mapped file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapped_file()
	 * @generated
	 * @ordered
	 */
	protected int mapped_file = MAPPED_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_inactive_file() <em>Total inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_inactive_file()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_INACTIVE_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_inactive_file() <em>Total inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_inactive_file()
	 * @generated
	 * @ordered
	 */
	protected int total_inactive_file = TOTAL_INACTIVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPgpgout() <em>Pgpgout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgpgout()
	 * @generated
	 * @ordered
	 */
	protected static final int PGPGOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPgpgout() <em>Pgpgout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgpgout()
	 * @generated
	 * @ordered
	 */
	protected int pgpgout = PGPGOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRss() <em>Rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRss()
	 * @generated
	 * @ordered
	 */
	protected static final int RSS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRss() <em>Rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRss()
	 * @generated
	 * @ordered
	 */
	protected int rss = RSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_mapped_file() <em>Total mapped file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_mapped_file()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_MAPPED_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_mapped_file() <em>Total mapped file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_mapped_file()
	 * @generated
	 * @ordered
	 */
	protected int total_mapped_file = TOTAL_MAPPED_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWriteback() <em>Writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteback()
	 * @generated
	 * @ordered
	 */
	protected static final int WRITEBACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWriteback() <em>Writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWriteback()
	 * @generated
	 * @ordered
	 */
	protected int writeback = WRITEBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnevictable() <em>Unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnevictable()
	 * @generated
	 * @ordered
	 */
	protected static final int UNEVICTABLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnevictable() <em>Unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnevictable()
	 * @generated
	 * @ordered
	 */
	protected int unevictable = UNEVICTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPgpgin() <em>Pgpgin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgpgin()
	 * @generated
	 * @ordered
	 */
	protected static final int PGPGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPgpgin() <em>Pgpgin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgpgin()
	 * @generated
	 * @ordered
	 */
	protected int pgpgin = PGPGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_unevictable() <em>Total unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_unevictable()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_UNEVICTABLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_unevictable() <em>Total unevictable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_unevictable()
	 * @generated
	 * @ordered
	 */
	protected int total_unevictable = TOTAL_UNEVICTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPgmajfault() <em>Pgmajfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgmajfault()
	 * @generated
	 * @ordered
	 */
	protected static final int PGMAJFAULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPgmajfault() <em>Pgmajfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgmajfault()
	 * @generated
	 * @ordered
	 */
	protected int pgmajfault = PGMAJFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_rss() <em>Total rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_rss()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_RSS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_rss() <em>Total rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_rss()
	 * @generated
	 * @ordered
	 */
	protected int total_rss = TOTAL_RSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_rss_huge() <em>Total rss huge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_rss_huge()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_RSS_HUGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_rss_huge() <em>Total rss huge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_rss_huge()
	 * @generated
	 * @ordered
	 */
	protected int total_rss_huge = TOTAL_RSS_HUGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_writeback() <em>Total writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_writeback()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_WRITEBACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_writeback() <em>Total writeback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_writeback()
	 * @generated
	 * @ordered
	 */
	protected int total_writeback = TOTAL_WRITEBACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_inactive_anon() <em>Total inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_inactive_anon()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_INACTIVE_ANON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_inactive_anon() <em>Total inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_inactive_anon()
	 * @generated
	 * @ordered
	 */
	protected int total_inactive_anon = TOTAL_INACTIVE_ANON_EDEFAULT;

	/**
	 * The default value of the '{@link #getRss_huge() <em>Rss huge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRss_huge()
	 * @generated
	 * @ordered
	 */
	protected static final int RSS_HUGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRss_huge() <em>Rss huge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRss_huge()
	 * @generated
	 * @ordered
	 */
	protected int rss_huge = RSS_HUGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHierarchical_memory_limit() <em>Hierarchical memory limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchical_memory_limit()
	 * @generated
	 * @ordered
	 */
	protected static final int HIERARCHICAL_MEMORY_LIMIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHierarchical_memory_limit() <em>Hierarchical memory limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHierarchical_memory_limit()
	 * @generated
	 * @ordered
	 */
	protected int hierarchical_memory_limit = HIERARCHICAL_MEMORY_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_pgfault() <em>Total pgfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgfault()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PGFAULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_pgfault() <em>Total pgfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgfault()
	 * @generated
	 * @ordered
	 */
	protected int total_pgfault = TOTAL_PGFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_active_file() <em>Total active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_active_file()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_ACTIVE_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_active_file() <em>Total active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_active_file()
	 * @generated
	 * @ordered
	 */
	protected int total_active_file = TOTAL_ACTIVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_anon() <em>Active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_anon()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVE_ANON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActive_anon() <em>Active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_anon()
	 * @generated
	 * @ordered
	 */
	protected int active_anon = ACTIVE_ANON_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_active_anon() <em>Total active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_active_anon()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_ACTIVE_ANON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_active_anon() <em>Total active anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_active_anon()
	 * @generated
	 * @ordered
	 */
	protected int total_active_anon = TOTAL_ACTIVE_ANON_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_pgpgout() <em>Total pgpgout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgpgout()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PGPGOUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_pgpgout() <em>Total pgpgout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgpgout()
	 * @generated
	 * @ordered
	 */
	protected int total_pgpgout = TOTAL_PGPGOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_cache() <em>Total cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_cache()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_CACHE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_cache() <em>Total cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_cache()
	 * @generated
	 * @ordered
	 */
	protected int total_cache = TOTAL_CACHE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInactive_anon() <em>Inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_anon()
	 * @generated
	 * @ordered
	 */
	protected static final int INACTIVE_ANON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInactive_anon() <em>Inactive anon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_anon()
	 * @generated
	 * @ordered
	 */
	protected int inactive_anon = INACTIVE_ANON_EDEFAULT;

	/**
	 * The default value of the '{@link #getActive_file() <em>Active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_file()
	 * @generated
	 * @ordered
	 */
	protected static final int ACTIVE_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getActive_file() <em>Active file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActive_file()
	 * @generated
	 * @ordered
	 */
	protected int active_file = ACTIVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPgfault() <em>Pgfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgfault()
	 * @generated
	 * @ordered
	 */
	protected static final int PGFAULT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPgfault() <em>Pgfault</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgfault()
	 * @generated
	 * @ordered
	 */
	protected int pgfault = PGFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getInactive_file() <em>Inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_file()
	 * @generated
	 * @ordered
	 */
	protected static final int INACTIVE_FILE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInactive_file() <em>Inactive file</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInactive_file()
	 * @generated
	 * @ordered
	 */
	protected int inactive_file = INACTIVE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotal_pgpgin() <em>Total pgpgin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgpgin()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_PGPGIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotal_pgpgin() <em>Total pgpgin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotal_pgpgin()
	 * @generated
	 * @ordered
	 */
	protected int total_pgpgin = TOTAL_PGPGIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerMemoryStatsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.CONTAINER_MEMORY_STATS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_pgmajfault() {
		return total_pgmajfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_pgmajfault(int newTotal_pgmajfault) {
		int oldTotal_pgmajfault = total_pgmajfault;
		total_pgmajfault = newTotal_pgmajfault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT, oldTotal_pgmajfault, total_pgmajfault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCache() {
		return cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(int newCache) {
		int oldCache = cache;
		cache = newCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__CACHE, oldCache, cache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMapped_file() {
		return mapped_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapped_file(int newMapped_file) {
		int oldMapped_file = mapped_file;
		mapped_file = newMapped_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__MAPPED_FILE, oldMapped_file, mapped_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_inactive_file() {
		return total_inactive_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_inactive_file(int newTotal_inactive_file) {
		int oldTotal_inactive_file = total_inactive_file;
		total_inactive_file = newTotal_inactive_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE, oldTotal_inactive_file, total_inactive_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPgpgout() {
		return pgpgout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgpgout(int newPgpgout) {
		int oldPgpgout = pgpgout;
		pgpgout = newPgpgout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__PGPGOUT, oldPgpgout, pgpgout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRss() {
		return rss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRss(int newRss) {
		int oldRss = rss;
		rss = newRss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__RSS, oldRss, rss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_mapped_file() {
		return total_mapped_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_mapped_file(int newTotal_mapped_file) {
		int oldTotal_mapped_file = total_mapped_file;
		total_mapped_file = newTotal_mapped_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE, oldTotal_mapped_file, total_mapped_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWriteback() {
		return writeback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteback(int newWriteback) {
		int oldWriteback = writeback;
		writeback = newWriteback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__WRITEBACK, oldWriteback, writeback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUnevictable() {
		return unevictable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnevictable(int newUnevictable) {
		int oldUnevictable = unevictable;
		unevictable = newUnevictable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__UNEVICTABLE, oldUnevictable, unevictable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPgpgin() {
		return pgpgin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgpgin(int newPgpgin) {
		int oldPgpgin = pgpgin;
		pgpgin = newPgpgin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__PGPGIN, oldPgpgin, pgpgin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_unevictable() {
		return total_unevictable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_unevictable(int newTotal_unevictable) {
		int oldTotal_unevictable = total_unevictable;
		total_unevictable = newTotal_unevictable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE, oldTotal_unevictable, total_unevictable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPgmajfault() {
		return pgmajfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgmajfault(int newPgmajfault) {
		int oldPgmajfault = pgmajfault;
		pgmajfault = newPgmajfault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__PGMAJFAULT, oldPgmajfault, pgmajfault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_rss() {
		return total_rss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_rss(int newTotal_rss) {
		int oldTotal_rss = total_rss;
		total_rss = newTotal_rss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS, oldTotal_rss, total_rss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_rss_huge() {
		return total_rss_huge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_rss_huge(int newTotal_rss_huge) {
		int oldTotal_rss_huge = total_rss_huge;
		total_rss_huge = newTotal_rss_huge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE, oldTotal_rss_huge, total_rss_huge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_writeback() {
		return total_writeback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_writeback(int newTotal_writeback) {
		int oldTotal_writeback = total_writeback;
		total_writeback = newTotal_writeback;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK, oldTotal_writeback, total_writeback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_inactive_anon() {
		return total_inactive_anon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_inactive_anon(int newTotal_inactive_anon) {
		int oldTotal_inactive_anon = total_inactive_anon;
		total_inactive_anon = newTotal_inactive_anon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON, oldTotal_inactive_anon, total_inactive_anon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRss_huge() {
		return rss_huge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRss_huge(int newRss_huge) {
		int oldRss_huge = rss_huge;
		rss_huge = newRss_huge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__RSS_HUGE, oldRss_huge, rss_huge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHierarchical_memory_limit() {
		return hierarchical_memory_limit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHierarchical_memory_limit(int newHierarchical_memory_limit) {
		int oldHierarchical_memory_limit = hierarchical_memory_limit;
		hierarchical_memory_limit = newHierarchical_memory_limit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT, oldHierarchical_memory_limit, hierarchical_memory_limit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_pgfault() {
		return total_pgfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_pgfault(int newTotal_pgfault) {
		int oldTotal_pgfault = total_pgfault;
		total_pgfault = newTotal_pgfault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGFAULT, oldTotal_pgfault, total_pgfault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_active_file() {
		return total_active_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_active_file(int newTotal_active_file) {
		int oldTotal_active_file = total_active_file;
		total_active_file = newTotal_active_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE, oldTotal_active_file, total_active_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActive_anon() {
		return active_anon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_anon(int newActive_anon) {
		int oldActive_anon = active_anon;
		active_anon = newActive_anon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_ANON, oldActive_anon, active_anon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_active_anon() {
		return total_active_anon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_active_anon(int newTotal_active_anon) {
		int oldTotal_active_anon = total_active_anon;
		total_active_anon = newTotal_active_anon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON, oldTotal_active_anon, total_active_anon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_pgpgout() {
		return total_pgpgout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_pgpgout(int newTotal_pgpgout) {
		int oldTotal_pgpgout = total_pgpgout;
		total_pgpgout = newTotal_pgpgout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT, oldTotal_pgpgout, total_pgpgout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_cache() {
		return total_cache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_cache(int newTotal_cache) {
		int oldTotal_cache = total_cache;
		total_cache = newTotal_cache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_CACHE, oldTotal_cache, total_cache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInactive_anon() {
		return inactive_anon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive_anon(int newInactive_anon) {
		int oldInactive_anon = inactive_anon;
		inactive_anon = newInactive_anon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_ANON, oldInactive_anon, inactive_anon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getActive_file() {
		return active_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive_file(int newActive_file) {
		int oldActive_file = active_file;
		active_file = newActive_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_FILE, oldActive_file, active_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPgfault() {
		return pgfault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgfault(int newPgfault) {
		int oldPgfault = pgfault;
		pgfault = newPgfault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__PGFAULT, oldPgfault, pgfault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInactive_file() {
		return inactive_file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInactive_file(int newInactive_file) {
		int oldInactive_file = inactive_file;
		inactive_file = newInactive_file;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_FILE, oldInactive_file, inactive_file));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotal_pgpgin() {
		return total_pgpgin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotal_pgpgin(int newTotal_pgpgin) {
		int oldTotal_pgpgin = total_pgpgin;
		total_pgpgin = newTotal_pgpgin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGIN, oldTotal_pgpgin, total_pgpgin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT:
				return getTotal_pgmajfault();
			case DockerPackage.CONTAINER_MEMORY_STATS__CACHE:
				return getCache();
			case DockerPackage.CONTAINER_MEMORY_STATS__MAPPED_FILE:
				return getMapped_file();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE:
				return getTotal_inactive_file();
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGOUT:
				return getPgpgout();
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS:
				return getRss();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE:
				return getTotal_mapped_file();
			case DockerPackage.CONTAINER_MEMORY_STATS__WRITEBACK:
				return getWriteback();
			case DockerPackage.CONTAINER_MEMORY_STATS__UNEVICTABLE:
				return getUnevictable();
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGIN:
				return getPgpgin();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE:
				return getTotal_unevictable();
			case DockerPackage.CONTAINER_MEMORY_STATS__PGMAJFAULT:
				return getPgmajfault();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS:
				return getTotal_rss();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE:
				return getTotal_rss_huge();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK:
				return getTotal_writeback();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON:
				return getTotal_inactive_anon();
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS_HUGE:
				return getRss_huge();
			case DockerPackage.CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT:
				return getHierarchical_memory_limit();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGFAULT:
				return getTotal_pgfault();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE:
				return getTotal_active_file();
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_ANON:
				return getActive_anon();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON:
				return getTotal_active_anon();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT:
				return getTotal_pgpgout();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_CACHE:
				return getTotal_cache();
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_ANON:
				return getInactive_anon();
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_FILE:
				return getActive_file();
			case DockerPackage.CONTAINER_MEMORY_STATS__PGFAULT:
				return getPgfault();
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_FILE:
				return getInactive_file();
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGIN:
				return getTotal_pgpgin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT:
				setTotal_pgmajfault((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__CACHE:
				setCache((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__MAPPED_FILE:
				setMapped_file((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE:
				setTotal_inactive_file((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGOUT:
				setPgpgout((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS:
				setRss((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE:
				setTotal_mapped_file((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__WRITEBACK:
				setWriteback((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__UNEVICTABLE:
				setUnevictable((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGIN:
				setPgpgin((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE:
				setTotal_unevictable((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGMAJFAULT:
				setPgmajfault((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS:
				setTotal_rss((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE:
				setTotal_rss_huge((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK:
				setTotal_writeback((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON:
				setTotal_inactive_anon((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS_HUGE:
				setRss_huge((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT:
				setHierarchical_memory_limit((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGFAULT:
				setTotal_pgfault((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE:
				setTotal_active_file((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_ANON:
				setActive_anon((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON:
				setTotal_active_anon((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT:
				setTotal_pgpgout((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_CACHE:
				setTotal_cache((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_ANON:
				setInactive_anon((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_FILE:
				setActive_file((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGFAULT:
				setPgfault((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_FILE:
				setInactive_file((Integer)newValue);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGIN:
				setTotal_pgpgin((Integer)newValue);
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
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT:
				setTotal_pgmajfault(TOTAL_PGMAJFAULT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__CACHE:
				setCache(CACHE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__MAPPED_FILE:
				setMapped_file(MAPPED_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE:
				setTotal_inactive_file(TOTAL_INACTIVE_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGOUT:
				setPgpgout(PGPGOUT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS:
				setRss(RSS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE:
				setTotal_mapped_file(TOTAL_MAPPED_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__WRITEBACK:
				setWriteback(WRITEBACK_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__UNEVICTABLE:
				setUnevictable(UNEVICTABLE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGIN:
				setPgpgin(PGPGIN_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE:
				setTotal_unevictable(TOTAL_UNEVICTABLE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGMAJFAULT:
				setPgmajfault(PGMAJFAULT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS:
				setTotal_rss(TOTAL_RSS_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE:
				setTotal_rss_huge(TOTAL_RSS_HUGE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK:
				setTotal_writeback(TOTAL_WRITEBACK_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON:
				setTotal_inactive_anon(TOTAL_INACTIVE_ANON_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS_HUGE:
				setRss_huge(RSS_HUGE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT:
				setHierarchical_memory_limit(HIERARCHICAL_MEMORY_LIMIT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGFAULT:
				setTotal_pgfault(TOTAL_PGFAULT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE:
				setTotal_active_file(TOTAL_ACTIVE_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_ANON:
				setActive_anon(ACTIVE_ANON_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON:
				setTotal_active_anon(TOTAL_ACTIVE_ANON_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT:
				setTotal_pgpgout(TOTAL_PGPGOUT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_CACHE:
				setTotal_cache(TOTAL_CACHE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_ANON:
				setInactive_anon(INACTIVE_ANON_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_FILE:
				setActive_file(ACTIVE_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGFAULT:
				setPgfault(PGFAULT_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_FILE:
				setInactive_file(INACTIVE_FILE_EDEFAULT);
				return;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGIN:
				setTotal_pgpgin(TOTAL_PGPGIN_EDEFAULT);
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
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGMAJFAULT:
				return total_pgmajfault != TOTAL_PGMAJFAULT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__CACHE:
				return cache != CACHE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__MAPPED_FILE:
				return mapped_file != MAPPED_FILE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_FILE:
				return total_inactive_file != TOTAL_INACTIVE_FILE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGOUT:
				return pgpgout != PGPGOUT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS:
				return rss != RSS_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_MAPPED_FILE:
				return total_mapped_file != TOTAL_MAPPED_FILE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__WRITEBACK:
				return writeback != WRITEBACK_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__UNEVICTABLE:
				return unevictable != UNEVICTABLE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGPGIN:
				return pgpgin != PGPGIN_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_UNEVICTABLE:
				return total_unevictable != TOTAL_UNEVICTABLE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGMAJFAULT:
				return pgmajfault != PGMAJFAULT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS:
				return total_rss != TOTAL_RSS_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_RSS_HUGE:
				return total_rss_huge != TOTAL_RSS_HUGE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_WRITEBACK:
				return total_writeback != TOTAL_WRITEBACK_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_INACTIVE_ANON:
				return total_inactive_anon != TOTAL_INACTIVE_ANON_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__RSS_HUGE:
				return rss_huge != RSS_HUGE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__HIERARCHICAL_MEMORY_LIMIT:
				return hierarchical_memory_limit != HIERARCHICAL_MEMORY_LIMIT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGFAULT:
				return total_pgfault != TOTAL_PGFAULT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_FILE:
				return total_active_file != TOTAL_ACTIVE_FILE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_ANON:
				return active_anon != ACTIVE_ANON_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_ACTIVE_ANON:
				return total_active_anon != TOTAL_ACTIVE_ANON_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGOUT:
				return total_pgpgout != TOTAL_PGPGOUT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_CACHE:
				return total_cache != TOTAL_CACHE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_ANON:
				return inactive_anon != INACTIVE_ANON_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__ACTIVE_FILE:
				return active_file != ACTIVE_FILE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__PGFAULT:
				return pgfault != PGFAULT_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__INACTIVE_FILE:
				return inactive_file != INACTIVE_FILE_EDEFAULT;
			case DockerPackage.CONTAINER_MEMORY_STATS__TOTAL_PGPGIN:
				return total_pgpgin != TOTAL_PGPGIN_EDEFAULT;
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
		result.append(" (total_pgmajfault: ");
		result.append(total_pgmajfault);
		result.append(", cache: ");
		result.append(cache);
		result.append(", mapped_file: ");
		result.append(mapped_file);
		result.append(", total_inactive_file: ");
		result.append(total_inactive_file);
		result.append(", pgpgout: ");
		result.append(pgpgout);
		result.append(", rss: ");
		result.append(rss);
		result.append(", total_mapped_file: ");
		result.append(total_mapped_file);
		result.append(", writeback: ");
		result.append(writeback);
		result.append(", unevictable: ");
		result.append(unevictable);
		result.append(", pgpgin: ");
		result.append(pgpgin);
		result.append(", total_unevictable: ");
		result.append(total_unevictable);
		result.append(", pgmajfault: ");
		result.append(pgmajfault);
		result.append(", total_rss: ");
		result.append(total_rss);
		result.append(", total_rss_huge: ");
		result.append(total_rss_huge);
		result.append(", total_writeback: ");
		result.append(total_writeback);
		result.append(", total_inactive_anon: ");
		result.append(total_inactive_anon);
		result.append(", rss_huge: ");
		result.append(rss_huge);
		result.append(", hierarchical_memory_limit: ");
		result.append(hierarchical_memory_limit);
		result.append(", total_pgfault: ");
		result.append(total_pgfault);
		result.append(", total_active_file: ");
		result.append(total_active_file);
		result.append(", active_anon: ");
		result.append(active_anon);
		result.append(", total_active_anon: ");
		result.append(total_active_anon);
		result.append(", total_pgpgout: ");
		result.append(total_pgpgout);
		result.append(", total_cache: ");
		result.append(total_cache);
		result.append(", inactive_anon: ");
		result.append(inactive_anon);
		result.append(", active_file: ");
		result.append(active_file);
		result.append(", pgfault: ");
		result.append(pgfault);
		result.append(", inactive_file: ");
		result.append(inactive_file);
		result.append(", total_pgpgin: ");
		result.append(total_pgpgin);
		result.append(')');
		return result.toString();
	}

} //ContainerMemoryStatsImpl
