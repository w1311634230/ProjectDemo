package com.neu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;






public class DBUtil {
	private String sql = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/hotelmanagersystem?useUnicode=true&characterEncoding=UTF-8";
	private String user = "root";
	private String password = "root";
	
	
	
	public Connection getConnection() throws ClassNotFoundException, SQLException, NamingException {
		/*Class.forName(sql);
		return DriverManager.getConnection(url, user, password);*/
		
		Context context = new InitialContext();
		
		DataSource ds = (DataSource)context.lookup("java:comp/env/jdbc/mydatasource");
		
		Connection c = ds.getConnection();
		
		return c;
		
	}
	
	public void closeConnection(Connection c) throws SQLException {
		c.close();
	}
	
	public int executeUpdate(String sql , Object... params) throws ClassNotFoundException, SQLException, NamingException {
		Connection c = getConnection();
		PreparedStatement ps = c.prepareStatement(sql);
		if(params != null) {
			for(int i = 0 ; i < params.length ; i++) {
				ps.setObject(i+1 , params[i]);
			}
		}
		int a = ps.executeUpdate();
		return a;
	}
	
	
	public ResultSet executeQuery (String sql , Connection c ,Object... params) throws SQLException {
		PreparedStatement ps = c.prepareStatement(sql);
		if(params != null ) {
			for(int i = 0 ; i < params.length ; i++) {
				ps.setObject(i+1 , params[i]);
			}
		}
		ResultSet r = ps.executeQuery();
		return r;
	}
	
	
	
	/*public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String sql = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "root";
		Class.forName(sql);
		
		Connection c = DriverManager.getConnection(url, user, password);
		System.out.println(1);
		
	}*/
	
	
}
