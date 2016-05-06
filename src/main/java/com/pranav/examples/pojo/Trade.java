/**
 * 
 */
package com.pranav.examples.pojo;

/**
 * @author chikodipranav@gmail.com
 *
 */
public class Trade {

	private String status;

	private String scriptName;

	public Trade() {

	}

	public Trade(String status, String scriptName) {
		this.status = status;
		this.scriptName = scriptName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	@Override
	public String toString() {
		return "Trade [status=" + status + ", scriptName=" + scriptName + "]";
	}

}
