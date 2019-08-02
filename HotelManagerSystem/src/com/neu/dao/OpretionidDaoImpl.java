package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Opretionid;
import com.neu.util.DButils;

public class OpretionidDaoImpl implements OpretionidDao {
	DButils util = new DButils();
	@Override
	public List<Opretionid> select(int pageSize, int pageNum) throws Exception {
		String sql = "select * from opretionid order by id limit ?,? ";
		Connection connection = util.getConnection();
		ResultSet re = util.executeQuery(connection, sql, (pageNum-1)*pageSize,pageSize);
		List<Opretionid> list = new ArrayList<Opretionid>();
		Opretionid op = null;
		
		while(re.next()) {
			int id = re.getInt("id");
			String optype = re.getString("optype");
			op = new Opretionid(id, optype);
			list.add(op);
		}
		util.closeConnection(connection);
		return list.size()==0?null:list;
	}

}
