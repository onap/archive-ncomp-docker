
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

import org.openecomp.ncomp.core.NamedEntity;
import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * docker container process table json
 * 
 * {
 *   "Titles" : [
 *     "USER","PID","%CPU","%MEM","VSZ","RSS","TTY","STAT","START","TIME","COMMAND"
 *   ]
 *   "Processes" : [
 *     [
 *       "root","13642","0.0","0.1","18172","3184","pts/0","Ss","17:03","0:00","/bin/bash"
 *     ],
 *     [
 *       "root","13895","0.0","0.0","4348","692","pts/0","S+","17:15","0:00","sleep 10"
 *     ]
 *  ],
 * }
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getPid <em>Pid</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getMem <em>Mem</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getVsz <em>Vsz</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getRss <em>Rss</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getTty <em>Tty</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getStat <em>Stat</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getStart <em>Start</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getTimeElapsed <em>Time Elapsed</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.DockerProcess#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess()
 * @model
 * @generated
 */
public interface DockerProcess extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_User()
	 * @model unique="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Pid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pid</em>' attribute.
	 * @see #setPid(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Pid()
	 * @model unique="false"
	 * @generated
	 */
	long getPid();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getPid <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pid</em>' attribute.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(long value);

	/**
	 * Returns the value of the '<em><b>Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cpu</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu</em>' attribute.
	 * @see #setCpu(double)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Cpu()
	 * @model unique="false"
	 * @generated
	 */
	double getCpu();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getCpu <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu</em>' attribute.
	 * @see #getCpu()
	 * @generated
	 */
	void setCpu(double value);

	/**
	 * Returns the value of the '<em><b>Mem</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mem</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mem</em>' attribute.
	 * @see #setMem(double)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Mem()
	 * @model unique="false"
	 * @generated
	 */
	double getMem();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getMem <em>Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mem</em>' attribute.
	 * @see #getMem()
	 * @generated
	 */
	void setMem(double value);

	/**
	 * Returns the value of the '<em><b>Vsz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vsz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vsz</em>' attribute.
	 * @see #setVsz(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Vsz()
	 * @model unique="false"
	 * @generated
	 */
	long getVsz();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getVsz <em>Vsz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vsz</em>' attribute.
	 * @see #getVsz()
	 * @generated
	 */
	void setVsz(long value);

	/**
	 * Returns the value of the '<em><b>Rss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rss</em>' attribute.
	 * @see #setRss(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Rss()
	 * @model unique="false"
	 * @generated
	 */
	long getRss();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getRss <em>Rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rss</em>' attribute.
	 * @see #getRss()
	 * @generated
	 */
	void setRss(long value);

	/**
	 * Returns the value of the '<em><b>Tty</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tty</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tty</em>' attribute.
	 * @see #setTty(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Tty()
	 * @model unique="false"
	 * @generated
	 */
	String getTty();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getTty <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tty</em>' attribute.
	 * @see #getTty()
	 * @generated
	 */
	void setTty(String value);

	/**
	 * Returns the value of the '<em><b>Stat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stat</em>' attribute.
	 * @see #setStat(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Stat()
	 * @model unique="false"
	 * @generated
	 */
	String getStat();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getStat <em>Stat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stat</em>' attribute.
	 * @see #getStat()
	 * @generated
	 */
	void setStat(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Start()
	 * @model unique="false"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>Time Elapsed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Elapsed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Elapsed</em>' attribute.
	 * @see #setTimeElapsed(long)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_TimeElapsed()
	 * @model unique="false"
	 * @generated
	 */
	long getTimeElapsed();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getTimeElapsed <em>Time Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Elapsed</em>' attribute.
	 * @see #getTimeElapsed()
	 * @generated
	 */
	void setTimeElapsed(long value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(String)
	 * @see org.openecomp.ncomp.docker.DockerPackage#getDockerProcess_Command()
	 * @model unique="false"
	 * @generated
	 */
	String getCommand();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.docker.DockerProcess#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(String value);

} // DockerProcess
