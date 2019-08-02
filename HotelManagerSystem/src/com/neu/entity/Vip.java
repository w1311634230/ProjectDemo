package com.neu.entity;

public class Vip {
	private int id;
	private String vipid;
	private String guest;
	private String idcard;
	private String gender;
	private String password;
	private String tel;
	private String address;
	private String email;
	private double point;
	private String grade;
	private String vip_note;
	
	
	public Vip(int id, String vipid, String guest, String idcard, String gender, String password, String tel,
			String address, String email, double point, String grade, String vip_note) {
		super();
		this.id = id;
		this.vipid = vipid;
		this.guest = guest;
		this.idcard = idcard;
		this.gender = gender;
		this.password = password;
		this.tel = tel;
		this.address = address;
		this.email = email;
		this.point = point;
		this.grade = grade;
		this.vip_note = vip_note;
	}


	public Vip() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getVipid() {
		return vipid;
	}


	public void setVipid(String vipid) {
		this.vipid = vipid;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public double getPoint() {
		return point;
	}


	public void setPoint(double point) {
		this.point = point;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public String getVip_note() {
		return vip_note;
	}


	public void setVip_note(String vip_note) {
		this.vip_note = vip_note;
	}


	@Override
	public String toString() {
		return "Vip [id=" + id + ", vipid=" + vipid + ", guest=" + guest + ", idcard=" + idcard + ", gender=" + gender
				+ ", password=" + password + ", tel=" + tel + ", address=" + address + ", email=" + email + ", point="
				+ point + ", grade=" + grade + ", vip_note=" + vip_note + "]";
	}
	
	
}
