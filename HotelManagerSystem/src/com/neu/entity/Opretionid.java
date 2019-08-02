package com.neu.entity;

public class Opretionid {
	public Integer id;
	public String optype;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOptype() {
		return optype;
	}
	public void setOptype(String optype) {
		this.optype = optype;
	}
	public Opretionid(Integer id, String optype) {
		super();
		this.id = id;
		this.optype = optype;
	}
	public Opretionid() {
		super();
	}
	@Override
	public String toString() {
		return "Opretionid [id=" + id + ", optype=" + optype + "]";
	}
	
	
}
