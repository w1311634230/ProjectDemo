package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.Bill;
import com.neu.util.DBUtil;

public class BillDaoImpl implements BillDao {
	
	DBUtil u = new DBUtil();
	
	@Override
	public int insert(Bill bill) throws Exception {
		int id = bill.getId();
		String orderid = bill.getOrderid();
		String roomid = bill.getRoomid();
		String idcard = bill.getIdcard();
		String vipid = bill.getVipid();
		String goodtype = bill.getGoodtype();
		String num = bill.getNum();
		String total = bill.getTotal();
		String tel = bill.getTel();
		Date time = bill.getTime();
		
		String sql = "insert into bill "
				+ "value (0,?,?,?,?,?,?,?,?,?)";
		
		int n = u.executeUpdate(sql, orderid,roomid,idcard,vipid,goodtype,num,total,tel,time);
		
		return n;
	}

	@Override
	public int update(Bill bill) throws Exception {
		int id = bill.getId();
		String orderid = bill.getOrderid();
		String roomid = bill.getRoomid();
		String idcard = bill.getIdcard();
		String vipid = bill.getVipid();
		String goodtype = bill.getGoodtype();
		String num = bill.getNum();
		String total = bill.getTotal();
		String tel = bill.getTel();
		Date time = bill.getTime();
		
		String sql = "update bill "
				+ "set orderid = ? , "
				+ "roomid = ? , "
				+ "idcard = ? , "
				+ "vipid = ? , "
				+ "goodtype = ? , "
				+ "num = ? , "
				+ "total = ? , "
				+ "tel = ? , "
				+ "time = ? "
				+ "where id = ?";
		
		int n = u.executeUpdate(sql,orderid,roomid,idcard,vipid,goodtype,num,total,tel,time,id);
		
		return n;
	}

	@Override
	public int delete(int id) throws Exception {
		String sql = "delete from bill "
				+ "where id = ?";
		
		int n = u.executeUpdate(sql,id);
		
		return n;
	}

	@Override
	public List<Bill> getAllByPage(int pageNum, int pageSize) throws Exception {
		String sql = "select * from bill "
				+ "limit ?,?";
		
		int index = (pageNum-1)*pageSize;
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , index , pageSize);
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<Bill> list = new ArrayList<>();
		
		do {
			int id = r.getInt("id");
			String orderid = r.getString("orderid");
			String roomid = r.getString("roomid");
			String idcard = r.getString("idcard");
			String vipid = r.getString("vipid");
			String goodtype = r.getString("goodtype");
			String num = r.getString("num");
			String total = r.getString("total");
			String tel = r.getString("tel");
			Date time = r.getDate("time");
			
			Bill bill = new Bill(id, orderid, roomid, idcard, vipid, goodtype, num, total, tel, time);
			
			list.add(bill);
		}
		while(r.next());
		
		u.closeConnection(c);
		return list;
	}

	@Override
	public List<Bill> getByOrderidByPage(String orderid, int pageNum, int pageSize) throws Exception {
		String sql = "select * from bill "
				+ "where orderid = ? , "
				+ "limit ?,?";
		
		int index = (pageNum-1)*pageSize;
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , orderid , index , pageSize);
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<Bill> list = new ArrayList<>();
		
		do {
			int id = r.getInt("id");
			orderid = r.getString("orderid");
			String roomid = r.getString("roomid");
			String idcard = r.getString("idcard");
			String vipid = r.getString("vipid");
			String goodtype = r.getString("goodtype");
			String num = r.getString("num");
			String total = r.getString("total");
			String tel = r.getString("tel");
			Date time = r.getDate("time");
			
			Bill bill = new Bill(id, orderid, roomid, idcard, vipid, goodtype, num, total, tel, time);
			
			list.add(bill);
		}
		while(r.next());
		
		u.closeConnection(c);
		return list;
	}

	@Override
	public int getPageNumAll() throws Exception {
		String sql = "select count(*) num from bill ";
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c );
		
		r.next();
		int n = r.getInt("num");
		
		u.closeConnection(c);
		return n;
	}

	@Override
	public int getPageNumByOrderid(String orderid) throws Exception {
		String sql = "select count(*) num from bill "
				+ "where orderid = ?";
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , orderid );
		
		r.next();
		int n = r.getInt("num");
		
		u.closeConnection(c);
		return n;
	}

}
