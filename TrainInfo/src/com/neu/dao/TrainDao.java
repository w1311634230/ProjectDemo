package com.neu.dao;

import java.util.List;

import com.neu.entity.Traininfo;

public interface TrainDao {
	List<Traininfo> getAll() throws Exception;
	
	int del(String[] trainnos) throws Exception;
	
	Traininfo getById(String trainno) throws Exception;
	
	//分页 pageSize每页最多有多少行，pageNum需要第几页数据
	List<Traininfo> getPaged(int pageSize,int pageNum) throws Exception;
	
	int count() throws Exception;//得到一共有多少行
	
}

























