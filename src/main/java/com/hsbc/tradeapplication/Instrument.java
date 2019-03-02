/*
 * This file will read the attributes of Instrument.txt
 */

package com.hsbc.tradeapplication;

public class Instrument{
	
	private String instid;
	private String instname;
	
	public String getInstid() {
		return instid;
	}
	public void setInstid(String instid) {
		this.instid = instid;
	}
	public String getInstname() {
		return instname;
	}
	public void setInstname(String instname) {
		this.instname = instname;
	}
	
	
	@Override
	public String toString() {
		return "[ instid="+this.instid+", instname="+this.instname+"]";
	}

	
	

}
