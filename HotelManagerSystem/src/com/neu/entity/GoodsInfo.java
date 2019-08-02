package com.neu.entity;

public class GoodsInfo {
	private int id;
	private String goodid;
	private String goodname;
	private GoodsType goodstype;
	private double price;
	private String unit;
	private String notes;
	public GoodsInfo(int id, String goodid, String goodname, GoodsType goodstype, double price, String unit,
			String notes) {
		super();
		this.id = id;
		this.goodid = goodid;
		this.goodname = goodname;
		this.goodstype = goodstype;
		this.price = price;
		this.unit = unit;
		this.notes = notes;
	}
	public GoodsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGoodid() {
		return goodid;
	}
	public void setGoodid(String goodid) {
		this.goodid = goodid;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public GoodsType getGoodstype() {
		return goodstype;
	}
	public void setGoodstype(GoodsType goodstype) {
		this.goodstype = goodstype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	@Override
	public String toString() {
		return "GoodsInfo [id=" + id + ", goodid=" + goodid + ", goodname=" + goodname + ", goodstype=" + goodstype
				+ ", price=" + price + ", unit=" + unit + ", notes=" + notes + "]";
	}
	
}
