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

public class DButils {
	private String driverClassname = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/hotelmanagersystem?useUnicode=true&characterEncoding=UTF-8";
	private String username =  "root";
	private String password =  "root";
	
	public Connection getConnection() throws SQLException, ClassNotFoundException, NamingException {//得到连接
		/*Class.forName(driverClassname);
		Connection connection =  DriverManager.getConnection(url, username, password);*/
		//创建一个上下文对象
		Context context = new InitialContext();
		//在context查找外部资源
		DataSource ds  = (DataSource)context.lookup("java:comp/env/jdbc/mydatasource");
		
		Connection connection =  ds.getConnection();
		return connection;
	}
	
	public void closeConnection(Connection connection) throws SQLException {//关闭连接
		connection.close();
	}									//代表SQL语句中所有问号						
	public int executeUpdate(String sql,Object... params) throws SQLException, ClassNotFoundException, NamingException {//执行SQL语句命令	
		Connection connection = getConnection();
		
		PreparedStatement statement = connection.prepareStatement(sql);
		if(params != null) {
			//把params中的每一个值，赋值给SQL语句中的占位符（？）
			for(int i =0;i< params.length;i++) {
				statement.setObject(i+1, params[i]);
			}
		}
		int n = statement.executeUpdate();
		
		statement.close();
		
		closeConnection(connection);
		
		return n;
	}
		
		public ResultSet executeQuery(Connection connection,String sql,Object...deptno) throws SQLException {//执行SQL语句命令
			
			PreparedStatement statement = connection.prepareStatement(sql);
			if(deptno != null) {
				//把params中的每一个值，赋值给SQL语句中的占位符（？）
				for(int i =0;i< deptno.length;i++) {
					statement.setObject(i+1, deptno[i]);
				}
			}
			ResultSet rs = statement.executeQuery();
			
			//statement.close();
			
			return rs;	
	}
}
