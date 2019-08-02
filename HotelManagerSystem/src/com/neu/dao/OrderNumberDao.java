package com.neu.dao;

import com.neu.entity.OrderNumber;

public interface OrderNumberDao {
	public int update(OrderNumber orderNumber) throws Exception;
	public OrderNumber get() throws Exception;
}
