package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.RoomType;
import com.neu.util.DBUtil;

public class RoomTypeDaoImpl implements RoomTypeDao {
	
	DBUtil u = new DBUtil();
	
	@Override
	public List<RoomType> getAll() throws Exception {
		String sql = "select * from roomtype ";
		Connection c = u.getConnection();
		
		ResultSet r = u.executeQuery(sql, c);
		
		if(!r.next()) {
			u.closeConnection(c);
			return null;
		}
		
		List<RoomType> list = new ArrayList<>();
		
		do {
			int id = r.getInt("id");
			String roomtype = r.getString("roomtype");
			String typename = r.getString("typename");
			
			RoomType rt = new RoomType(id, roomtype, typename);
			list.add(rt);
		}
		while(r.next());
		
		return list;
	}

}
