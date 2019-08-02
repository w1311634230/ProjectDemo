package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.Order;
import com.neu.util.DBUtil;

public class OrderDaoImpl implements OrderDao {
	
	DBUtil u = new DBUtil();
	
	@Override
	public int insert(Order order) throws Exception {
		int id = order.getId(); 
		String orderid = order.getOrderid();
		String roomid = order.getRoomid();
		String roomtype = order.getRoomtype();
		String orderstate = order.getOrderstate();
		String optype = order.getOptype();
		String guest = order.getGuest();
		String idcard = order.getIdcard();
		String vipid = order.getVipid();
		String tel = order.getTel();
		Date time = order.getTime();
		String newstate = order.getNewstate();
		
		String sql = "insert into ordernote "
				+ "value (0,?,?,?,?,?,?,?,?,?,?,?)";
		
		int n = u.executeUpdate(sql,orderid,roomid,roomtype,orderstate,optype,guest,idcard,vipid,tel,time,newstate);
		
		return n;
	}

	@Override
	public int updateState(String orderid) throws Exception {
		String sql = "update ordernote "
				+ "set newstate = 'false' "
				+ "where orderid = ? ";
		int n = u.executeUpdate(sql, orderid);
		return n;
	}

	@Override
	public List<Order> getAllByPage(int pageNum, int pageSize) throws Exception {
		String sql = "select * from order "
				+ "limit ?,?";
		
		int index = (pageNum-1)*pageSize;
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , index , pageSize);
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<Order> list = new ArrayList<>();
		
		do {
			int id = r.getInt("id"); 
			String orderid = r.getString("orderid");
			String roomid = r.getString("roomid");
			String roomtype = r.getString("roomtype");
			String orderstate = r.getString("orderstate");
			String optype = r.getString("optype");
			String guest = r.getString("guest");
			String idcard = r.getString("idcard");
			String vipid = r.getString("vipid");
			String tel = r.getString("tel");
			Date time = r.getDate("time");
			String newstate = r.getString("newstate");
			
			Order order = new Order(id, orderid, roomid, roomtype, orderstate, optype, guest, idcard, vipid, tel, time, newstate);
			
			list.add(order);
		}
		while(r.next());
		
		u.closeConnection(c);
		return list;
	}

	@Override
	public List<Order> getByNewstateByPage(String newstate, int pageNum, int pageSize) throws Exception {
		String sql = "select * from order "
				+ "where newstate = ? "
				+ "limit ?,?";
		
		int index = (pageNum-1)*pageSize;
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , newstate , index , pageSize);
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<Order> list = new ArrayList<>();
		
		do {
			int id = r.getInt("id"); 
			String orderid = r.getString("orderid");
			String roomid = r.getString("roomid");
			String roomtype = r.getString("roomtype");
			String orderstate = r.getString("orderstate");
			String optype = r.getString("optype");
			String guest = r.getString("guest");
			String idcard = r.getString("idcard");
			String vipid = r.getString("vipid");
			String tel = r.getString("tel");
			Date time = r.getDate("time");
			newstate = r.getString("newstate");
			
			Order order = new Order(id, orderid, roomid, roomtype, orderstate, optype, guest, idcard, vipid, tel, time, newstate);
			
			list.add(order);
		}
		while(r.next());
		
		u.closeConnection(c);
		return list;
	}

	@Override
	public int getPageNumAll() throws Exception {
		String sql = "select count(*) num from order ";
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c );
		
		r.next();
		int n = r.getInt("num");
		
		u.closeConnection(c);
		return n;
	}

	@Override
	public int getPageNumByNewstate(String newstate) throws Exception {
		String sql = "select count(*) num from order "
				+ "where newstate = ? ";
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , newstate);
		
		r.next();
		int n = r.getInt("num");
		
		u.closeConnection(c);
		return n;
	}

}
