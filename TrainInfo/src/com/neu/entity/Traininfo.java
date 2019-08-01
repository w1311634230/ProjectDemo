package com.neu.entity;
/**
 * @author Administrator
 *
 */
public class Traininfo {
	private String trainno;
	private String startstation;
	private String arrivalstation;
	private String starttime;
	private String arrivaltime;
	private String type;
	private String runtime;
	private Double mile;
	public String getTrainno() {
		return trainno;
	}
	public void setTrainno(String trainno) {
		this.trainno = trainno;
	}
	public String getStartstation() {
		return startstation;
	}
	public void setStartstation(String startstation) {
		this.startstation = startstation;
	}
	public String getArrivalstation() {
		return arrivalstation;
	}
	public void setArrivalstation(String arrivalstation) {
		this.arrivalstation = arrivalstation;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public Double getMile() {
		return mile;
	}
	public void setMile(Double mile) {
		this.mile = mile;
	}
	public Traininfo(String trainno, String startstation, String arrivalstation, String starttime, String arrivaltime,
			String type, String runtime, Double mile) {
		super();
		this.trainno = trainno;
		this.startstation = startstation;
		this.arrivalstation = arrivalstation;
		this.starttime = starttime;
		this.arrivaltime = arrivaltime;
		this.type = type;
		this.runtime = runtime;
		this.mile = mile;
	}
	public Traininfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Traininfo [trainno=" + trainno + ", startstation=" + startstation + ", arrivalstation=" + arrivalstation
				+ ", starttime=" + starttime + ", arrivaltime=" + arrivaltime + ", type=" + type + ", runtime="
				+ runtime + ", mile=" + mile + "]";
	}
	
}
