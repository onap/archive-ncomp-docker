
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
	

package org.openecomp.ncomp.servers.docker.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerHostOperationEnum implements EcompOperationEnum {

  poll,
  startContainer,
  stopContainer,
  restartContainer,
  pauseContainer,
  unpauseContainer,
  removeContainer,
  inspectContainer,
  killContainer,
  dockerRun,
  dockerRunWithName,
  dockerRunWithOptions,
  containerStats,
  containerProcesses,
  pullImage,
  REMOTE_poll,
  REMOTE_startContainer,
  REMOTE_stopContainer,
  REMOTE_restartContainer,
  REMOTE_pauseContainer,
  REMOTE_unpauseContainer,
  REMOTE_removeContainer,
  REMOTE_inspectContainer,
  REMOTE_killContainer,
  REMOTE_dockerRun,
  REMOTE_dockerRunWithName,
  REMOTE_dockerRunWithOptions,
  REMOTE_containerStats,
  REMOTE_containerProcesses,
  REMOTE_pullImage;
}
