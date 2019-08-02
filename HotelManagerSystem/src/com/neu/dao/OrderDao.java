package com.neu.dao;

import java.util.List;

import com.neu.entity.Order;

public interface OrderDao {
	public int insert(Order order) throws Exception; 
	public int updateState(String orderid) throws Exception; 
	public List<Order> getAllByPage(int pageNum , int pageSize) throws Exception;  
	public List<Order> getByNewstateByPage(String newstate , int pageNum , int pageSize ) throws Exception;
	public int getPageNumAll() throws Exception;  
	public int getPageNumByNewstate(String newstate ) throws Exception;
}
