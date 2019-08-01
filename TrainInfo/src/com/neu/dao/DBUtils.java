package com.neu.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	private String driverClassName = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/mydb1?useUnicode=true&characterEncoding=UTF-8";
	private String username = "root";
	private String password = "root";
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
	
	public void closeConnection(Connection connection) throws SQLException {
		connection.close();
	}
	
	public int executeUpdate(String sql,Object...params) throws SQLException, ClassNotFoundException {
		Connection connection = getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		if(params != null) {
			//把params中每一个值，赋值给sql语句中的占位符（？）
			for(int i = 0;i < params.length;i++) {
				statement.setObject(i+1, params[i]);
			}
		}
		
		int n = statement.executeUpdate();
		
		statement.close();
		
		closeConnection(connection);
		
		return n;		
	}
	
	public ResultSet executeQuery(Connection connection, String sql,Object... params) throws SQLException {
		
		PreparedStatement statement = connection.prepareStatement(sql);
		if(params != null) {
			//把params中每一个值，赋值给sql语句中的占位符（？）
			for(int i = 0;i < params.length;i++) {
				statement.setObject(i+1, params[i]);
			}
		}
		
		ResultSet rs = statement.executeQuery();
		
		return rs;		
	}
}






