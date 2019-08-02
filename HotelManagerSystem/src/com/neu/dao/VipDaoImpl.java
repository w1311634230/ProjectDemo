package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Vip;
import com.neu.util.DBUtil;

public class VipDaoImpl implements VipDao {
	private static DBUtil db = new DBUtil();
	@Override
	public int insert(Vip vip) throws Exception {
		String sql = "insert into vip values(null,?,?,?,?,?,?,?,?,?,?,?)";
		Object[] params = {
				vip.getVipid(),
				vip.getGuest(),
				vip.getIdcard(),
				vip.getGender(),
				vip.getPassword(),
				vip.getTel(),
				vip.getAddress(),
				vip.getEmail(),
				vip.getPoint(),
				vip.getGrade(),
				vip.getVip_note()		
		};
		int n = db.executeUpdate(sql, params);
		return n;
	}

	@Override
	public int update(Vip vip) throws Exception {
		String sql = "update vip set guest = ?,idcard=?,gender=?,password=?,tel=?,address=?,email=?,point=?,grade=?,notes=? where vipid=?";
		Object[] params = {
				vip.getGuest(),
				vip.getIdcard(),
				vip.getGender(),
				vip.getPassword(),
				vip.getTel(),
				vip.getAddress(),
				vip.getEmail(),
				vip.getPoint(),
				vip.getGrade(),
				vip.getVip_note(),
				vip.getVipid()
		};
		int n = db.executeUpdate(sql, params);
		return n;
	}

	@Override
	public int delete(String vipid) throws Exception {
		String sql = "delete from vip where vipid = ?";
		int n = db.executeUpdate(sql, vipid);
		return n;
	}

	@Override
	public List<Vip> getByName(String guest,int pageSize,int pageNum) throws Exception {
		String sql = "select * from vip where guest = ? order by vipid limit ?,?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(sql, connection, guest,(pageNum-1)*pageSize,pageSize);
		Vip vip = null;
		List<Vip> list = new ArrayList<Vip>();
		String vipid;
		String idcard;
		String gender;
		String password;
		String tel;
		String address;
		String email;
		double point;
		String grade;
		String vip_note;
		while(rs.next()) {
			vipid = rs.getString("vipid");
			idcard = rs.getString("idcard");
			gender = rs.getString("gender");
			password = rs.getString("password");
			tel = rs.getString("tel");
			address = rs.getString("address");
			email = rs.getString("email");
			point = rs.getDouble("point");
			grade = rs.getString("grade");
			vip_note = rs.getString("notes");
			vip = new Vip(0, vipid, guest, idcard, gender, password, tel, address, email, point, grade, vip_note);
			list.add(vip);
		}
		db.closeConnection(connection);
		return list.size()==0?null:list;
	}

	@Override
	public Vip getById(String vipid) throws Exception {
		String sql = "select * from vip where vipid = ?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(sql, connection, vipid);
		Vip vip = null;
		String guest;
		String idcard;
		String gender;
		String password;
		String tel;
		String address;
		String email;
		double point;
		String grade;
		String vip_note;
		if(rs.next()) {
			guest = rs.getString("guest");
			idcard = rs.getString("idcard");
			gender = rs.getString("gender");
			password = rs.getString("password");
			tel = rs.getString("tel");
			address = rs.getString("address");
			email = rs.getString("email");
			point = rs.getDouble("point");
			grade = rs.getString("grade");
			vip_note = rs.getString("notes");
			vip = new Vip(0, vipid, guest, idcard, gender, password, tel, address, email, point, grade, vip_note);
		}
		db.closeConnection(connection);
		return vip;
	}

	@Override
	public int count(String guest) throws Exception {
		String sql = "select count(*) from vip where guest=? ";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(sql, connection, guest);
		int count = 0;
		if(rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}

	@Override
	public Vip getByIdName(String vipid, String guest) throws Exception {
		String sql = "select * from vip where vipid = ? and guest = ?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(sql, connection, vipid,guest);
		Vip vip = null;
		String idcard;
		String gender;
		String password;
		String tel;
		String address;
		String email;
		double point;
		String grade;
		String vip_note;
		if(rs.next()) {
			idcard = rs.getString("idcard");
			gender = rs.getString("gender");
			password = rs.getString("password");
			tel = rs.getString("tel");
			address = rs.getString("address");
			email = rs.getString("email");
			point = rs.getDouble("point");
			grade = rs.getString("grade");
			vip_note = rs.getString("notes");
			vip = new Vip(0, vipid, guest, idcard, gender, password, tel, address, email, point, grade, vip_note);
		}
		db.closeConnection(connection);
		return vip;
	}

}
