
package org.openecomp.ncomp.servers.docker.logging;

import com.att.eelf.i18n.EELFResourceManager;
import org.openecomp.logger.EcompMessageEnum;

public enum DockerAdaptorMessageEnum implements EcompMessageEnum {

  dummy;

	static {
		EELFResourceManager.loadMessageBundle("org/openecomp/ncomp/servers/docker/logging/DockerAdaptor");
	}
}
