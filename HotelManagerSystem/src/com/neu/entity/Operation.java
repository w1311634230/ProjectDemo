package com.neu.entity;

import java.util.Date;

public class Operation {
	/*create table operation (
	id int primary key auto_increment,
	username varchar(30) not null,
	optype varchar(30) not null,
	orderid varchar(30) not null,
	notetype varchar(30) not null,
	noteline varchar(30) not null,
	time Date not null
	);*/
	private Integer id;
	private String username;
	private String optype;
	private String orderid;
	private String notetype;
	private String noteline;
	private Date time;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOptype() {
		return optype;
	}
	public void setOptype(String optype) {
		this.optype = optype;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getNotetype() {
		return notetype;
	}
	public void setNotetype(String notetype) {
		this.notetype = notetype;
	}
	public String getNoteline() {
		return noteline;
	}
	public void setNoteline(String noteline) {
		this.noteline = noteline;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	public Operation(Integer id, String username, String optype, String orderid, String notetype, String noteline,
			Date time) {
		super();
		this.id = id;
		this.username = username;
		this.optype = optype;
		this.orderid = orderid;
		this.notetype = notetype;
		this.noteline = noteline;
		this.time = time;
	}
	public Operation() {
		super();
	}
	
	@Override
	public String toString() {
		return "Operation [id=" + id + ", username=" + username + ", optype=" + optype + ", orderid=" + orderid
				+ ", notetype=" + notetype + ", noteline=" + noteline + ", time=" + time + "]";
	}
	
	
	
}
