package com.neu.entity;

public class RoomType {
private Integer id;
private String roomtype;
private String typename;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public String getTypename() {
	return typename;
}
public void setTypename(String typename) {
	this.typename = typename;
}
public RoomType(Integer id, String roomtype, String typename) {
	super();
	this.id = id;
	this.roomtype = roomtype;
	this.typename = typename;
}
public RoomType() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "GuestCut [id=" + id + ", roomtype=" + roomtype + ", typename=" + typename + "]";
}

}
