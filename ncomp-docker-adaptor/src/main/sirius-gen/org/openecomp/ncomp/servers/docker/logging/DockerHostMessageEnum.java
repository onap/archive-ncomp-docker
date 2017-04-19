
package org.openecomp.ncomp.servers.docker.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum DockerHostMessageEnum implements EcompMessageEnum {

  dummy,
  REQUEST_FAILED_poll,
  REQUEST_FAILED_startContainer,
  REQUEST_FAILED_stopContainer,
  REQUEST_FAILED_restartContainer,
  REQUEST_FAILED_pauseContainer,
  REQUEST_FAILED_unpauseContainer,
  REQUEST_FAILED_removeContainer,
  REQUEST_FAILED_inspectContainer,
  REQUEST_FAILED_killContainer,
  REQUEST_FAILED_dockerRun,
  REQUEST_FAILED_dockerRunWithName,
  REQUEST_FAILED_dockerRunWithOptions,
  REQUEST_FAILED_containerStats,
  REQUEST_FAILED_containerProcesses,
  REMOTE_CALL_FAILED_poll,
  REMOTE_CALL_FAILED_startContainer,
  REMOTE_CALL_FAILED_stopContainer,
  REMOTE_CALL_FAILED_restartContainer,
  REMOTE_CALL_FAILED_pauseContainer,
  REMOTE_CALL_FAILED_unpauseContainer,
  REMOTE_CALL_FAILED_removeContainer,
  REMOTE_CALL_FAILED_inspectContainer,
  REMOTE_CALL_FAILED_killContainer,
  REMOTE_CALL_FAILED_dockerRun,
  REMOTE_CALL_FAILED_dockerRunWithName,
  REMOTE_CALL_FAILED_dockerRunWithOptions,
  REMOTE_CALL_FAILED_containerStats,
  REMOTE_CALL_FAILED_containerProcesses;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/servers/docker/logging/DockerHost");
	}
}
