
package org.openecomp.ncomp.servers.docker.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerHostOperationEnum implements EcompOperationEnum {

  DockerHost_poll("DockerHost@poll"),
  DockerHost_startContainer("DockerHost@startContainer"),
  DockerHost_stopContainer("DockerHost@stopContainer"),
  DockerHost_restartContainer("DockerHost@restartContainer"),
  DockerHost_pauseContainer("DockerHost@pauseContainer"),
  DockerHost_unpauseContainer("DockerHost@unpauseContainer"),
  DockerHost_removeContainer("DockerHost@removeContainer"),
  DockerHost_inspectContainer("DockerHost@inspectContainer"),
  DockerHost_killContainer("DockerHost@killContainer"),
  DockerHost_dockerRun("DockerHost@dockerRun"),
  DockerHost_dockerRunWithName("DockerHost@dockerRunWithName"),
  DockerHost_dockerRunWithOptions("DockerHost@dockerRunWithOptions"),
  DockerHost_containerStats("DockerHost@containerStats"),
  DockerHost_containerProcesses("DockerHost@containerProcesses") ; 


	private String n;
	
	private DockerHostOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
