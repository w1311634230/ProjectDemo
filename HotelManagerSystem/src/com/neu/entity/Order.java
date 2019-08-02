package com.neu.entity;

import java.util.Date;

public class Order {
	/*create table ordernote (
	id int primary key auto_increment,
	orderid varchar(30) not null,
	roomid varchar(30) not NULL,
	roomtype varchar(30) not NULL,
	orderstate varchar(30) not null,
	optype varchar(30) not null,
	guest varchar(30) not null,
	idcard varchar(30) not null,
	vipid varchar(30),
	tel varchar(30),
	time Date not null, 
	newstate varchar(30)
	);*/
	private Integer id; 
	private String orderid;
	private String roomid;
	private String roomtype;
	private String orderstate;
	private String optype;
	private String guest;
	private String idcard;
	private String vipid;
	private String tel;
	private Date time;
	private String newstate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getRoomid() {
		return roomid;
	}
	public void setRoomid(String roomid) {
		this.roomid = roomid;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	public String getOptype() {
		return optype;
	}
	public void setOptype(String optype) {
		this.optype = optype;
	}
	public String getGuest() {
		return guest;
	}
	public void setGuest(String guest) {
		this.guest = guest;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getVipid() {
		return vipid;
	}
	public void setVipid(String vipid) {
		this.vipid = vipid;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public String getNewstate() {
		return newstate;
	}
	public void setNewstate(String newstate) {
		this.newstate = newstate;
	}
	
	public Order(Integer id, String orderid, String roomid, String roomtype, String orderstate, String optype,
			String guest, String idcard, String vipid, String tel, Date time, String newstate) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.roomid = roomid;
		this.roomtype = roomtype;
		this.orderstate = orderstate;
		this.optype = optype;
		this.guest = guest;
		this.idcard = idcard;
		this.vipid = vipid;
		this.tel = tel;
		this.time = time;
		this.newstate = newstate;
	}
	public Order() {
		super();
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderid=" + orderid + ", roomid=" + roomid + ", roomtype=" + roomtype
				+ ", orderstate=" + orderstate + ", optype=" + optype + ", guest=" + guest + ", idcard=" + idcard
				+ ", vipid=" + vipid + ", tel=" + tel + ", time=" + time + ", newstate=" + newstate + "]";
	}
	
	
	
	
	
	
}
