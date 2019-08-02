package com.neu.entity;

public class OrderNumber {
	private String date;
	private Integer num;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	
	public OrderNumber(String date, Integer num) {
		super();
		this.date = date;
		this.num = num;
	}
	public OrderNumber() {
		super();
	}
	
	@Override
	public String toString() {
		return "OrderNumber [date=" + date + ", num=" + num + "]";
	}
	
	
}
