package com.neu.dao;

import java.util.List;

import com.neu.entity.Traininfo;

public interface TrainDao {
	List<Traininfo> getAll() throws Exception;
	
	int del(String[] trainnos) throws Exception;
	
	Traininfo getById(String trainno) throws Exception;
	
	//��ҳ pageSizeÿҳ����ж����У�pageNum��Ҫ�ڼ�ҳ����
	List<Traininfo> getPaged(int pageSize,int pageNum) throws Exception;
	
	int count() throws Exception;//�õ�һ���ж�����
	
}

























