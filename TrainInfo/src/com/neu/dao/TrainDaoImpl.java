package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.neu.entity.Traininfo;

public class TrainDaoImpl implements TrainDao {
	DBUtils util = new DBUtils();
	@Override
	public List<Traininfo> getAll() throws Exception {
		String sql = "select * from train_info";
		Connection connection = util.getConnection();
		ResultSet re = util.executeQuery(connection, sql);
		Traininfo train = null;
		List<Traininfo> list = new ArrayList<>();
		String trainno;
		String startstation;
		String arrivalstation;
		String starttime;
		String arrivaltime;
		String type;
		String runtime;
		Double mile;
		while(re.next()) {
			 trainno = re.getString("train_no");
			 startstation = re.getString("start_station");
			 arrivalstation = re.getString("arrival_station");
			 starttime = re.getString("start_time");
			 arrivaltime = re.getString("arrival_time");
			 type = re.getString("type");
			 runtime = re.getString("runtime");
			 mile = re.getDouble("mile");
			
			 train = new Traininfo(trainno, startstation, arrivalstation, starttime, arrivaltime, type, runtime, mile);
			 list.add(train);
		}
		util.closeConnection(connection);
		return list;
	}

	@Override
	public int del(String[] trainnos) throws Exception {
		//String s = Arrays.toString(trainnos).replace("[","(").replace("]",")");
		StringBuilder stb = new StringBuilder();
		for(String trainno : trainnos) {
			stb.append("'"+trainno+"',");
		}
		String s = stb.toString().substring(0,stb.toString().length()-1);
		String sql = "delete from train_info where train_no in ("+s+")";
		
		int n = util.executeUpdate(sql);
		
		return n;
	}

	@Override
	public Traininfo getById(String trainno) throws Exception {
		String sql = "select * from train_info where train_no = ?" ;
		Connection connection = util.getConnection();
		ResultSet re = util.executeQuery(connection, sql,trainno);
		Traininfo train = null;
		String startstation;
		String arrivalstation;
		String starttime;
		String arrivaltime;
		String type;
		String runtime;
		Double mile;
		if(re.next()) {
			 startstation = re.getString("start_station");
			 arrivalstation = re.getString("arrival_station");
			 starttime = re.getString("start_time");
			 arrivaltime = re.getString("arrival_time");
			 type = re.getString("type");
			 runtime = re.getString("runtime");
			 mile = re.getDouble("mile");
			
			 train = new Traininfo(trainno, startstation, arrivalstation, starttime, arrivaltime, type, runtime, mile);
			
		}
		util.closeConnection(connection);
		return train;
	}

	@Override
	public List<Traininfo> getPaged(int pageSize, int pageNum) throws Exception {
		String sql = "select * from train_info order by train_no limit ?,?";
		Connection connection = util.getConnection();
		ResultSet re = util.executeQuery(connection, sql,(pageNum-1)*pageSize,pageSize);
		Traininfo train = null;
		List<Traininfo> list = new ArrayList<>();
		String trainno;
		String startstation;
		String arrivalstation;
		String starttime;
		String arrivaltime;
		String type;
		String runtime;
		Double mile;
		while(re.next()) {
			 trainno = re.getString("train_no");
			 startstation = re.getString("start_station");
			 arrivalstation = re.getString("arrival_station");
			 starttime = re.getString("start_time");
			 arrivaltime = re.getString("arrival_time");
			 type = re.getString("type");
			 runtime = re.getString("runtime");
			 mile = re.getDouble("mile");
			
			 train = new Traininfo(trainno, startstation, arrivalstation, starttime, arrivaltime, type, runtime, mile);
			 list.add(train);
		}
		util.closeConnection(connection);
		return list;
	}

	@Override
	public int count() throws Exception {
		Connection connection = util.getConnection();
		String sql = "select count(*) from train_info";
		ResultSet re = util.executeQuery(connection, sql);
		
		int count = 0;
		if(re.next()) {
			count = re.getInt(1);
		}
		util.closeConnection(connection);
		return count;
	}

}



















