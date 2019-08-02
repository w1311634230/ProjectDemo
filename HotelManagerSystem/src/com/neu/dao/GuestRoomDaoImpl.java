package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.neu.entity.GuestRoom;
import com.neu.util.DBUtil;

public class GuestRoomDaoImpl implements GuestRoomDao {
	DBUtil util = new DBUtil();
	@Override
	public List<GuestRoom> getAll(int pageSize,int pageNum) throws Exception {
		Connection connection = util.getConnection();
      String sql="select *from guestroom"
    		  +"limit?,?";
      int index=(pageNum-1)*pageSize;
      ResultSet rs = util.executeQuery(sql, connection, index,pageSize);
         Integer id;
		 String  roomid;
		 String roomtype;
		 String storey;
		 Double price;
		 Double dis;
		 Double vipdis;
		 Double svipdis;
		 GuestRoom quset=null;
		 List<GuestRoom> list = new ArrayList<>();
		 while(rs.next()) {
			 id=rs.getInt("id");
			 roomid=rs.getString("roomid");
			 roomtype=rs.getString("roomtype");
			 storey=rs.getString("storey");
			 price=rs.getDouble("price");
				dis=rs.getDouble("dis");
				vipdis=rs.getDouble("vipdis");
				svipdis=rs.getDouble("svipdis");
				quset=new GuestRoom(id, roomid, roomtype, storey, price, dis, vipdis, svipdis);
			 list.add(quset);
			 
		 }
         util.closeConnection(connection);		
		return list.size()==0?null:list;
	}
    
	@Override
	public int insert(GuestRoom guest) throws Exception {
        String sql="insert into guestroom where id=null,roomid=?,roomtype=?,storey=?";
        
		
		int executeUpdate =util.executeUpdate(sql,guest.getRoomtype(),guest.getRoomid(),guest.getStorey());
		
		return executeUpdate;
	
	}

	@Override
	public int update(GuestRoom guest) throws Exception {
		String sql="update guestroom set roomtype=?,storey=? where roomid = ? ";
		int executeUpdate = util.executeUpdate(sql, guest.getRoomtype() , guest.getStorey() , guest.getRoomid() );
		return executeUpdate;
	}

	@Override
	public int delete(GuestRoom guest) throws Exception {
	  String sql="delete from guestroom where roomid=?, storey=?";
	  int executeUpdate = util.executeUpdate(sql,guest.getRoomid(),guest.getStorey() );
		return executeUpdate;
	}

	@Override
	public GuestRoom getById(String roomid, int pageSize,int pageNum) throws Exception {
		Connection connection = util.getConnection();
		String sql="select * from guestroom where roomid=?  "
				+ "limit?,?";
		int index=(pageNum-1)*pageSize;
		ResultSet rs = util.executeQuery( sql,connection, roomid,index,pageSize);
		GuestRoom quset = null;
		
		 Integer id;
		 String roomtype;
		 String storey;
		 Double price;
		 Double dis;
		 Double vipdis;
		 Double svipdis;
		if(rs.next()) {
		id=rs.getInt("id");
		roomtype =rs.getString("roomtype");
		storey=rs.getString("storey");
		price=rs.getDouble("price");
		dis=rs.getDouble("dis");
		vipdis=rs.getDouble("vipdis");
		svipdis=rs.getDouble("svipdis");
		quset=new GuestRoom(id, roomid, roomtype, storey, price, dis, vipdis, svipdis);
		}
        util.closeConnection(connection);
		return quset;
	}

	@Override
	public List<GuestRoom> getByType(String roomtype ,int pageSize,int pageNum) throws Exception {
		Connection connection = util.getConnection();
		String sql="select * from guestroom where roomtype=?"
				+ "limit?,?";
		int index=(pageNum-1)*pageSize;
		ResultSet rs = util.executeQuery( sql,connection, roomtype,index,pageSize);
		GuestRoom quset = null;
		
		 Integer id;
		 String  roomid;
		 String storey;
		 Double price;
		 Double dis;
		 Double vipdis;
		 Double svipdis;
		 
		 List<GuestRoom> list = new ArrayList<>();
		 while(rs.next()) {
			 id=rs.getInt("id");
			 roomid=rs.getString("roomid");
			 roomtype=rs.getString("roomtype");
			 storey=rs.getString("storey");
			 price=rs.getDouble("price");
				dis=rs.getDouble("dis");
				vipdis=rs.getDouble("vipdis");
				svipdis=rs.getDouble("svipdis");
				quset=new GuestRoom(id, roomid, roomtype, storey, price, dis, vipdis, svipdis);
			 list.add(quset);
			 
		 }
        util.closeConnection(connection);
		return list.size()==0?null:list;
	}

	@Override
	public List<GuestRoom> getByStorey(String storey, int pageSize,int pageNum) throws Exception {
		Connection connection = util.getConnection();
		String sql="select * from guestroom where storey=?"
				+ "limit?,?";
		int index=(pageNum-1)*pageSize;
		ResultSet rs = util.executeQuery( sql,connection, storey,index,pageSize);
		GuestRoom quset = null;
		
		 Integer id;
		 String  roomid;
		 String roomtype;
		 Double price;
		 Double dis;
		 Double vipdis;
		 Double svipdis;
		 List<GuestRoom> list = new ArrayList<>();
		 while(rs.next()) {
			 id=rs.getInt("id");
			 roomid=rs.getString("roomid");
			 roomtype=rs.getString("roomtype");
			 storey=rs.getString("storey");
			 price=rs.getDouble("price");
				dis=rs.getDouble("dis");
				vipdis=rs.getDouble("vipdis");
				svipdis=rs.getDouble("svipdis");
				quset=new GuestRoom(id, roomid, roomtype, storey, price, dis, vipdis, svipdis);
			 list.add(quset);
			 
		 }
        util.closeConnection(connection);
		return list.size()==0?null:list;
	}

}
