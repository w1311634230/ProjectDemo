package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.GoodsType;
import com.neu.util.DBUtil;

public class GoodsTypeDaoImpl implements GoodsTypeDao {
	private static DBUtil db = new DBUtil();
	@Override
	public int insert(GoodsType goodstype) throws Exception {
		String sql = "insert into goodstype values(0,?,?,?)";
		Object[] params = {
				goodstype.getGoodtype(),
				goodstype.getTypename(),
				goodstype.getNotes()
		};
		int n = db.executeUpdate(sql, params);
		return n;
	}

	@Override
	public int update(GoodsType goodstype) throws Exception {
		String sql = "update goodstype set typename = ?,notes = ? where goodtype = ?";
		Object[] params = {
				goodstype.getTypename(),
				goodstype.getNotes(),
				goodstype.getGoodtype()
		};
		int n = db.executeUpdate(sql, params);
		return n;
	}

	@Override
	public int delete(String goodtype) throws Exception {
		String sql = "delete from goodtype where goodtype = ?";
		int n = db.executeUpdate(sql, goodtype);
		return n;
	}

	@Override
	public List<GoodsType> getAll(int pageSize,int pageNum) throws Exception {
		String sql = "select * from goodstype order by goodtype limit ?,?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(sql, connection, (pageNum-1)*pageSize,pageSize);
		List<GoodsType> list = new ArrayList<GoodsType>();
		GoodsType goodstype = null;
		String goodtype;
		String typename;
		String notes;
		while(rs.next()) {
			goodtype = rs.getString("goodtype");
			typename = rs.getString("typename");
			notes = rs.getString("notes");
			goodstype = new GoodsType(0, goodtype, typename, notes);
			list.add(goodstype);
		}
		db.closeConnection(connection);
		return list.size()==0?null:list;
	}

	@Override
	public GoodsType getById(String goodtype) throws Exception {
		String sql = "select * from goodstype where goodtype = ?";
		Connection connection = db.getConnection();
		ResultSet rs = db.executeQuery(sql, connection, goodtype);
		GoodsType goodstype = null;
		String typename;
		String notes;
		if(rs.next()) {
			typename = rs.getString("typename");
			notes = rs.getString("notes");
			goodstype = new GoodsType(0, goodtype, typename, notes);
		}
		return goodstype;
	}

}
