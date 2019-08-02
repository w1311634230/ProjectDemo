package com.neu.dao;

import java.util.List;

import com.neu.entity.Bill;

public interface BillDao {
	public int insert(Bill bill) throws Exception; 
	public int update(Bill bill) throws Exception; 
	public int delete(int id) throws Exception; 
	public List<Bill> getAllByPage(int pageNum , int pageSize) throws Exception;  
	public List<Bill> getByOrderidByPage(String orderid , int pageNum , int pageSize ) throws Exception;
	public int getPageNumAll() throws Exception;  
	public int getPageNumByOrderid(String orderid ) throws Exception;
	
}
