package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;

import com.neu.entity.OrderNumber;
import com.neu.util.DBUtil;

public class OrderNumberDaoImpl implements OrderNumberDao {
	
	DBUtil u = new DBUtil();
	
	@Override
	public int update(OrderNumber orderNumber) throws Exception {
		String sql = "update ordernumber "
				+ "set date = ? , num = ? ";
		
		String date = orderNumber.getDate();
		int num = orderNumber.getNum();
		
		int n = u.executeUpdate(sql, date , num);
		
		return n;
	}

	@Override
	public OrderNumber get() throws Exception {
		String sql = "select * from ordernumber ";
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c);
		OrderNumber orderNum = null;
		
		if(r.next()) {
			String date = r.getString("date");
			int num = r.getInt("num");
			
			orderNum = new OrderNumber(date, num);
		}
		
		return orderNum;
	}

}
