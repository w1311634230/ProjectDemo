package com.neu.dao;

import java.util.Date;
import java.util.List;

import com.neu.entity.Operation;

public interface OperationDao {
	public int insert( Operation operation ) throws Exception;
	public int delete( int id ) throws Exception;
	public int deleteByDate(Date start ,Date end) throws Exception;
	public List<Operation> getAllByPage(int pageNum , int pageSize) throws Exception;
	public List<Operation> getByDateByPage(Date start ,Date end ,int pageNum , int pageSize ) throws Exception;
	public int getPageNumAll() throws Exception;
	public int getPageNumByDate(Date start ,Date end) throws Exception;
	
}
