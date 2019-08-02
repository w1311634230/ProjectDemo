package com.neu.entity;

import java.util.Date;

public class Bill {
	/*create table bill(
	id int primary key auto_increment,
	orderid varchar(30) not null,
	roomid varchar(30) not NULL,
	idcard varchar(30) not null,
	vipid varchar(30),
	goodtype varchar(30) not NULL,
	num int not null,
	total int not null,
	tel varchar(30) not null,
	time Date not null
	);*/
	
	private Integer id;
	private String orderid;
	private String roomid;
	private String idcard;
	private String vipid;
	private String goodtype;
	private String num;
	private String total;
	private String tel;
	private Date time;
	
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
	public String getGoodtype() {
		return goodtype;
	}
	public void setGoodtype(String goodtype) {
		this.goodtype = goodtype;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
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
	
	public Bill(Integer id, String orderid, String roomid, String idcard, String vipid, String goodtype, String num,
			String total, String tel, Date time) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.roomid = roomid;
		this.idcard = idcard;
		this.vipid = vipid;
		this.goodtype = goodtype;
		this.num = num;
		this.total = total;
		this.tel = tel;
		this.time = time;
	}
	public Bill() {
		super();
	}
	
	@Override
	public String toString() {
		return "Bill [id=" + id + ", orderid=" + orderid + ", roomid=" + roomid + ", idcard=" + idcard + ", vipid="
				+ vipid + ", goodtype=" + goodtype + ", num=" + num + ", total=" + total + ", tel=" + tel + ", time="
				+ time + "]";
	}
	
	
	
}
