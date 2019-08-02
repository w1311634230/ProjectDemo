package com.neu.entity;

public class Sysuser {
	public Integer id;
	public String userid;
	public String usertype;
	public String username;
	public String password;
	public String note;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Sysuser(Integer id, String userid, String usertype, String username, String password, String note) {
		super();
		this.id = id;
		this.userid = userid;
		this.usertype = usertype;
		this.username = username;
		this.password = password;
		this.note = note;
	}
	public Sysuser() {
		super();
	}
	@Override
	public String toString() {
		return "sysuser [id=" + id + ", userid=" + userid + ", usertype=" + usertype + ", username=" + username
				+ ", password=" + password + ", note=" + note + "]";
	}
	
	
	
}
