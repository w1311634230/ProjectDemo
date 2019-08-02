package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.neu.entity.Operation;
import com.neu.util.DBUtil;

public class OperationDaoImpl implements OperationDao {
	
	DBUtil u = new DBUtil();
	
	@Override
	public int insert(Operation operation) throws Exception {
		
		int id = operation.getId();
		String username = operation.getUsername();
		String optype = operation.getOptype();
		String orderid = operation.getOrderid();
		String notetype = operation.getNotetype();
		String noteline = operation.getNoteline();
		Date time = operation.getTime();
		
		String sql = "insert into operation "
				+ "value(0,?,?,?,?,?,?)";
		int n = u.executeUpdate(sql, username , optype , orderid , notetype , noteline , time);
		
		return n;
	}

	@Override
	public int delete(int id) throws Exception {
		String sql = "delete from operation "
				+ "where id = ?";
		int n = u.executeUpdate(sql, id);
		
		return n;
	}

	@Override
	public int deleteByDate(Date start, Date end) throws Exception {
		String sql = "delete from opration "
				+ "where time >= ? and time < ?";
		int n = u.executeUpdate(sql, start ,end);
		return n;
	}

	@Override
	public List<Operation> getAllByPage(int pageNum, int pageSize) throws Exception {
		String sql = "select * from operation "
				+ "limit ?,?";
		
		int index = (pageNum-1)*pageSize;
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , index , pageSize);
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<Operation> list = new ArrayList<>();
		
		do {
			int id = r.getInt("id");
			String username = r.getString("username");
			String optype = r.getString("optype");
			String orderid = r.getString("orderid");
			String notetype = r.getString("notetype");
			String noteline = r.getString("noteline");
			Date time = r.getDate("time");
			
			Operation op = new Operation(id, username, optype, orderid, notetype, noteline, time);
			
			list.add(op);
		}
		while(r.next());
		
		u.closeConnection(c);
		return list;
	}

	@Override
	public List<Operation> getByDateByPage(Date start, Date end, int pageNum, int pageSize) throws Exception {
		String sql = "select * from operation "
				+ "where time >= ? and time < ? "
				+ "limit ?,?";
		
		int index = (pageNum-1)*pageSize;
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c , start , end , index , pageSize);
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<Operation> list = new ArrayList<>();
		
		do {
			int id = r.getInt("id");
			String username = r.getString("username");
			String optype = r.getString("optype");
			String orderid = r.getString("orderid");
			String notetype = r.getString("notetype");
			String noteline = r.getString("noteline");
			Date time = r.getDate("time");
			
			Operation op = new Operation(id, username, optype, orderid, notetype, noteline, time);
			
			list.add(op);
		}
		while(r.next());
		
		u.closeConnection(c);
		return list;
	}

	@Override
	public int getPageNumAll() throws Exception {
		String sql = "select count(*) num from operation ";
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c );
		
		r.next();
		int n = r.getInt("num");
		
		u.closeConnection(c);
		return n;
	}

	@Override
	public int getPageNumByDate(Date start ,Date end) throws Exception {
		String sql = "select count(*) num from operation "
				+ "where time >= ? and time < ? ";
		
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c );
		
		r.next();
		int n = r.getInt("num");
		
		u.closeConnection(c);
		return n;
	}

}
