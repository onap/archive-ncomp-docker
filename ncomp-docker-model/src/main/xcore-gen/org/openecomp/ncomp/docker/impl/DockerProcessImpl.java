
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

import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.openecomp.ncomp.docker.DockerPackage;
import org.openecomp.ncomp.docker.DockerProcess;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getUser <em>User</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getPid <em>Pid</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getCpu <em>Cpu</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getMem <em>Mem</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getVsz <em>Vsz</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getRss <em>Rss</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getTty <em>Tty</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getStat <em>Stat</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getTimeElapsed <em>Time Elapsed</em>}</li>
 *   <li>{@link org.openecomp.ncomp.docker.impl.DockerProcessImpl#getCommand <em>Command</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DockerProcessImpl extends NamedEntityImpl implements DockerProcess {
	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected static final long PID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected long pid = PID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected static final double CPU_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCpu() <em>Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpu()
	 * @generated
	 * @ordered
	 */
	protected double cpu = CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMem() <em>Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem()
	 * @generated
	 * @ordered
	 */
	protected static final double MEM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMem() <em>Mem</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMem()
	 * @generated
	 * @ordered
	 */
	protected double mem = MEM_EDEFAULT;

	/**
	 * The default value of the '{@link #getVsz() <em>Vsz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsz()
	 * @generated
	 * @ordered
	 */
	protected static final long VSZ_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getVsz() <em>Vsz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVsz()
	 * @generated
	 * @ordered
	 */
	protected long vsz = VSZ_EDEFAULT;

	/**
	 * The default value of the '{@link #getRss() <em>Rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRss()
	 * @generated
	 * @ordered
	 */
	protected static final long RSS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getRss() <em>Rss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRss()
	 * @generated
	 * @ordered
	 */
	protected long rss = RSS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTty() <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTty()
	 * @generated
	 * @ordered
	 */
	protected static final String TTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTty() <em>Tty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTty()
	 * @generated
	 * @ordered
	 */
	protected String tty = TTY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStat() <em>Stat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStat()
	 * @generated
	 * @ordered
	 */
	protected static final String STAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStat() <em>Stat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStat()
	 * @generated
	 * @ordered
	 */
	protected String stat = STAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Date start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeElapsed() <em>Time Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeElapsed()
	 * @generated
	 * @ordered
	 */
	protected static final long TIME_ELAPSED_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getTimeElapsed() <em>Time Elapsed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeElapsed()
	 * @generated
	 * @ordered
	 */
	protected long timeElapsed = TIME_ELAPSED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMAND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected String command = COMMAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockerPackage.Literals.DOCKER_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPid(long newPid) {
		long oldPid = pid;
		pid = newPid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__PID, oldPid, pid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCpu() {
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpu(double newCpu) {
		double oldCpu = cpu;
		cpu = newCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__CPU, oldCpu, cpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMem() {
		return mem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMem(double newMem) {
		double oldMem = mem;
		mem = newMem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__MEM, oldMem, mem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getVsz() {
		return vsz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVsz(long newVsz) {
		long oldVsz = vsz;
		vsz = newVsz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__VSZ, oldVsz, vsz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getRss() {
		return rss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRss(long newRss) {
		long oldRss = rss;
		rss = newRss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__RSS, oldRss, rss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTty() {
		return tty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTty(String newTty) {
		String oldTty = tty;
		tty = newTty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__TTY, oldTty, tty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStat() {
		return stat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStat(String newStat) {
		String oldStat = stat;
		stat = newStat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__STAT, oldStat, stat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		Date oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeElapsed() {
		return timeElapsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeElapsed(long newTimeElapsed) {
		long oldTimeElapsed = timeElapsed;
		timeElapsed = newTimeElapsed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__TIME_ELAPSED, oldTimeElapsed, timeElapsed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(String newCommand) {
		String oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockerPackage.DOCKER_PROCESS__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DockerPackage.DOCKER_PROCESS__USER:
				return getUser();
			case DockerPackage.DOCKER_PROCESS__PID:
				return getPid();
			case DockerPackage.DOCKER_PROCESS__CPU:
				return getCpu();
			case DockerPackage.DOCKER_PROCESS__MEM:
				return getMem();
			case DockerPackage.DOCKER_PROCESS__VSZ:
				return getVsz();
			case DockerPackage.DOCKER_PROCESS__RSS:
				return getRss();
			case DockerPackage.DOCKER_PROCESS__TTY:
				return getTty();
			case DockerPackage.DOCKER_PROCESS__STAT:
				return getStat();
			case DockerPackage.DOCKER_PROCESS__START:
				return getStart();
			case DockerPackage.DOCKER_PROCESS__TIME_ELAPSED:
				return getTimeElapsed();
			case DockerPackage.DOCKER_PROCESS__COMMAND:
				return getCommand();
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
			case DockerPackage.DOCKER_PROCESS__USER:
				setUser((String)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__PID:
				setPid((Long)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__CPU:
				setCpu((Double)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__MEM:
				setMem((Double)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__VSZ:
				setVsz((Long)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__RSS:
				setRss((Long)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__TTY:
				setTty((String)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__STAT:
				setStat((String)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__START:
				setStart((Date)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__TIME_ELAPSED:
				setTimeElapsed((Long)newValue);
				return;
			case DockerPackage.DOCKER_PROCESS__COMMAND:
				setCommand((String)newValue);
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
			case DockerPackage.DOCKER_PROCESS__USER:
				setUser(USER_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__PID:
				setPid(PID_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__CPU:
				setCpu(CPU_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__MEM:
				setMem(MEM_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__VSZ:
				setVsz(VSZ_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__RSS:
				setRss(RSS_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__TTY:
				setTty(TTY_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__STAT:
				setStat(STAT_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__START:
				setStart(START_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__TIME_ELAPSED:
				setTimeElapsed(TIME_ELAPSED_EDEFAULT);
				return;
			case DockerPackage.DOCKER_PROCESS__COMMAND:
				setCommand(COMMAND_EDEFAULT);
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
			case DockerPackage.DOCKER_PROCESS__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case DockerPackage.DOCKER_PROCESS__PID:
				return pid != PID_EDEFAULT;
			case DockerPackage.DOCKER_PROCESS__CPU:
				return cpu != CPU_EDEFAULT;
			case DockerPackage.DOCKER_PROCESS__MEM:
				return mem != MEM_EDEFAULT;
			case DockerPackage.DOCKER_PROCESS__VSZ:
				return vsz != VSZ_EDEFAULT;
			case DockerPackage.DOCKER_PROCESS__RSS:
				return rss != RSS_EDEFAULT;
			case DockerPackage.DOCKER_PROCESS__TTY:
				return TTY_EDEFAULT == null ? tty != null : !TTY_EDEFAULT.equals(tty);
			case DockerPackage.DOCKER_PROCESS__STAT:
				return STAT_EDEFAULT == null ? stat != null : !STAT_EDEFAULT.equals(stat);
			case DockerPackage.DOCKER_PROCESS__START:
				return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
			case DockerPackage.DOCKER_PROCESS__TIME_ELAPSED:
				return timeElapsed != TIME_ELAPSED_EDEFAULT;
			case DockerPackage.DOCKER_PROCESS__COMMAND:
				return COMMAND_EDEFAULT == null ? command != null : !COMMAND_EDEFAULT.equals(command);
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
		result.append(" (user: ");
		result.append(user);
		result.append(", pid: ");
		result.append(pid);
		result.append(", cpu: ");
		result.append(cpu);
		result.append(", mem: ");
		result.append(mem);
		result.append(", vsz: ");
		result.append(vsz);
		result.append(", rss: ");
		result.append(rss);
		result.append(", tty: ");
		result.append(tty);
		result.append(", stat: ");
		result.append(stat);
		result.append(", start: ");
		result.append(start);
		result.append(", timeElapsed: ");
		result.append(timeElapsed);
		result.append(", command: ");
		result.append(command);
		result.append(')');
		return result.toString();
	}

} //DockerProcessImpl
