
package org.openecomp.ncomp.servers.docker.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum DockerAdaptorOperationEnum implements EcompOperationEnum {
 ; 


	private String n;
	
	private DockerAdaptorOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
