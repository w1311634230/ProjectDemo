package com.neu.dao;

import java.util.List;

import com.neu.entity.GoodsType;

public interface GoodsTypeDao {
	int insert(GoodsType goodstype) throws Exception;
	int update(GoodsType goodstype) throws Exception;
	int delete(String goodtype) throws Exception;
	List<GoodsType> getAll(int pageSize,int pageNum) throws Exception;
	GoodsType getById(String goodtype) throws Exception;
}
