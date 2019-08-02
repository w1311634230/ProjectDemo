package com.neu.entity;

public class Usertype {
	public String typeid;
	public String usertype;
	public String getTypeid() {
		return typeid;
	}
	public void setTypeid(String typeid) {
		this.typeid = typeid;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public Usertype(String typeid, String usertype) {
		super();
		this.typeid = typeid;
		this.usertype = usertype;
	}
	public Usertype() {
		super();
	}
	@Override
	public String toString() {
		return "usertype [typeid=" + typeid + ", usertype=" + usertype + "]";
	}
	
	
}
