package com.neu.entity;

public class Storey {
private String storey;
private String storeyname;
public String getStorey() {
	return storey;
}
public void setStorey(String storey) {
	this.storey = storey;
}
public String getStoreyname() {
	return storeyname;
}
public void setStoreyname(String storeyname) {
	this.storeyname = storeyname;
}
public Storey(String storey, String storeyname) {
	super();
	this.storey = storey;
	this.storeyname = storeyname;
}
public Storey() {
	super();
}
@Override
public String toString() {
	return "Storey [storey=" + storey + ", storename=" + storeyname + "]";
}

}
