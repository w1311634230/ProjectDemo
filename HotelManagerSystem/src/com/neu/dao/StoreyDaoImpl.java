package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Storey;
import com.neu.util.DBUtil;

public class StoreyDaoImpl implements StoreyDao {
	
	DBUtil u = new DBUtil();
	
	@Override
	public List<Storey> getAll() throws Exception {
		String sql = "select * from storey ";
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c);
		
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<Storey> list = new ArrayList<>();
		
		do {
			String storey = r.getString("storey");
			String storeyname = r.getString("storeyname");
			
			Storey st = new Storey(storey, storeyname);
			list.add(st);
		}
		while(r.next());
		
		return list;
	}

	@Override
	public int insert(Storey sto) throws Exception {
		String sql="insert into storey(storey,storeyname) values(?,?)";
		
		int n = u.executeUpdate(sql, sto.getStorey(),sto.getStoreyname());
		return n;
	}

	@Override
	public int update(Storey sto) throws Exception {
		String sql = "update storey set storename=? where storey = ? ";
		int n = u.executeUpdate(sql, sto.getStoreyname(),sto.getStorey());
		return n;
	}

	@Override
	public int delete(String storey) throws Exception {
		String sql ="delete from storey where storey=?";
		
		int n = u.executeUpdate(sql, storey);
		return n;
	}

}
