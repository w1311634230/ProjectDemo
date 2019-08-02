package com.neu.entity;

public class GoodsType {
	private int id;
	private String goodtype;
	private String typename;
	private String notes;
	public GoodsType(int id, String goodtype, String typename, String notes) {
		super();
		this.id = id;
		this.goodtype = goodtype;
		this.typename = typename;
		this.notes = notes;
	}
	public GoodsType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodtype() {
		return goodtype;
	}
	public void setGoodtype(String goodtype) {
		this.goodtype = goodtype;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "GoodsType [id=" + id + ", goodtype=" + goodtype + ", typename=" + typename + ", notes=" + notes + "]";
	}

}
