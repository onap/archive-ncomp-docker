
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
	
package org.openecomp.ncomp.servers.docker;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.openecomp.ncomp.utils.CryptoUtils;
import org.openecomp.ncomp.utils.PropertyUtil;

public class DockerHttpClient extends DockerAbstractClient {
	
	public static final Logger logger = Logger.getLogger(DockerHttpClient.class);
	String authorization;
	String baseAddress;
	private boolean debug = true;
	private int responseCode;

	public int getResponseCode() {
		return this.responseCode;
	}
	
	private static void safeClose(final OutputStream out) {
    	if (out != null) {
    		try { 
    			out.close();
    		} catch(IOException e) {
    			logger.error("Failed to close stream " + e);
    		}
    	}
    }
	
	private static void safeClose(final InputStream in) {
    	if (in != null) {
    		try { 
    			in.close();
    		} catch(IOException e) {
    			logger.error("Failed to close stream " + e);
    		}
    	}
    }
	
	public DockerHttpClient(String fileName, String endpoint) {
		this.responseCode = 0;
		try {
			props = PropertyUtil.getPropertiesFromClasspath(fileName);
			setBaseAddress(props.getProperty(endpoint + ".endpoint"));
			if (getBaseAddress() == null) {
				logger.error("unable to determine baseAddress for endpoint: " + endpoint + " in " + fileName);
				throw new RuntimeException("unable to determine baseAddress for endpoint: " + endpoint + " in "
						+ fileName);
			}
			//String user = props.getProperty(endpoint + ".user");
			//String password = decryptPassword(props.getProperty(endpoint + ".password"));
			debug = Boolean.parseBoolean(props.getProperty(endpoint + ".debug", "false"));
			//authorization = "Basic " + Base64.encodeBase64String((user + ":" + password).getBytes());
			//authorization = authorization.trim();
		} catch (Exception e) {
			logger.error("creating client failed: " + e.getMessage());
		}
	}
	
	public byte[] httpBinaryTransaction(String path, String method, HashMap<String, String> headers, JSONObject body,
			Long timeout) {

		byte[] rawbody = null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		if ("DELETE".equals(method) || "GET".equals(method)) {
			body = null;
		}
		if (body != null) {
			rawbody = body.toString(2).getBytes();
			if (rawbody.length == 0) {
				rawbody = null;
			}
		}
		String url = getBaseAddress() + path;
		int tout = 60000;
		if (timeout != null) {
			// units? seconds or millis?
			tout = (int) timeout.longValue();
		}
		InputStream is = null;
		OutputStream os = null;
		try {
			URL u = new URL(url);
			HttpURLConnection uc = (HttpURLConnection) u.openConnection();
			uc.setConnectTimeout(tout);
			uc.setReadTimeout(tout);
			if (headers == null)
				headers = new HashMap<String, String>();

			if (body != null) {
				headers.put("Content-type", "application/json");
			}
			// headers.put("Authorization", authorization);
			for (String n : headers.keySet()) {
				uc.setRequestProperty(n, headers.get(n));
				if (debug) {
					System.err.println("HTTP REQUEST header: " + n + " " + headers.get(n));
				}
			}
			uc.setRequestMethod(method);
			if (debug)
				System.err.println("HTTP REQUEST method: " + method + " " + uc.getRequestMethod());

			if (rawbody != null && rawbody.length > 0) {
				uc.setRequestProperty("Content-Length", Integer.toString(rawbody.length));
				uc.setFixedLengthStreamingMode(rawbody.length);
				uc.setDoOutput(true);
				os = uc.getOutputStream();
				os.write(rawbody);
			}
			int rc = uc.getResponseCode();
			this.responseCode = rc;
			if (rc < 200 || rc >= 300) {
				// do not throw an error - log the failure
				// throw new DockerHttpClientException("HTTP Request Failed:
				// URL: " + url + " code:" + rc + " msg:"
				// + uc.getResponseMessage());
				throw new RuntimeException("Docker HTTP Request Failed. URL: " + url + " code: " + rc + " msg: "
						+ uc.getResponseMessage());
			}

			// ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int i;
			is = uc.getInputStream();
			byte[] buf = new byte[65536];
			while ((i = is.read(buf)) > 0) {
				baos.write(buf, 0, i);
			}
		} catch (RuntimeException re) {
			throw re;
		} catch (Exception e) {
			logger.error("Exception <- " + e + " " + e.getMessage());
			throw new RuntimeException("http error: " + e, e);
		} finally {
			safeClose(os);
			safeClose(is);
		}
		return baos.toByteArray();
	}

	public String getBaseAddress() {
		return baseAddress;
	}

	public void setBaseAddress(String baseAddress) {
		this.baseAddress = baseAddress;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public void httpBinaryTransaction(String path, String method, HashMap<String, String> headers, InputStream i, int j) {
		// TODO Auto-generated method stub

	}

	public void httpJsonTransaction(String path, String method, HashMap<String, String> headers, InputStream i, int j) {
		// TODO Auto-generated method stub

	}
}
