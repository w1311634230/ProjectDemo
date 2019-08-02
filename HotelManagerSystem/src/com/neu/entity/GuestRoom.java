package com.neu.entity;

public class GuestRoom {
private Integer id;
private String roomid;
private String roomtype;
private String storey;
private Double price;
private Double dis;
private Double vipdis;
private Double svipdis;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public String getStorey() {
	return storey;
}
public void setStorey(String storey) {
	this.storey = storey;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public Double getDis() {
	return dis;
}
public void setDis(Double dis) {
	this.dis = dis;
}
public Double getVipdis() {
	return vipdis;
}
public void setVipdis(Double vipdis) {
	this.vipdis = vipdis;
}
public Double getSvipids() {
	return svipdis;
}
public void setSvipids(Double svipids) {
	this.svipdis = svipdis;
}
public GuestRoom(Integer id, String roomid, String roomtype, String storey, Double price, Double dis, Double vipdis,
		Double svipids) {
	super();
	this.id = id;
	this.roomid = roomid;
	this.roomtype = roomtype;
	this.storey = storey;
	this.price = price;
	this.dis = dis;
	this.vipdis = vipdis;
	this.svipdis = svipdis;
}
public GuestRoom() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "GuestRoom [id=" + id + ", roomid=" + roomid + ", roomtype=" + roomtype + ", storey=" + storey + ", price="
			+ price + ", dis=" + dis + ", vipdis=" + vipdis + ", svipids=" + svipdis + "]";
}

}
