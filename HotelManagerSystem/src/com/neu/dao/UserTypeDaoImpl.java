package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Usertype;
import com.neu.util.DButils;

public class UserTypeDaoImpl implements UserTypeDao {
	DButils util = new DButils();
	@Override
	public List<Usertype> select() throws Exception {
		String sql ="select * from usertype";
		Connection connection = util.getConnection();
		ResultSet re = util.executeQuery(connection, sql);
		List<Usertype> list = new ArrayList<Usertype>();
		Usertype utype = null;
		while(re.next()) {
			String typeid = re.getString("typeid");
			String usertype = re.getString("usertype");
			utype = new Usertype(typeid, usertype);
			list.add(utype);
		}
		util.closeConnection(connection);
		return list.size()==0?null:list;
	}
	
}
