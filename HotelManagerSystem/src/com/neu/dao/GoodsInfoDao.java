package com.neu.dao;

import java.util.List;

import com.neu.entity.GoodsInfo;

public interface GoodsInfoDao {
	int insert(GoodsInfo goodsinfo) throws Exception;
	int update(GoodsInfo goodsinfo) throws Exception;
	int delete(String goodid) throws Exception;
	List<GoodsInfo> getByType(String goodtype,int pageSize,int pageNum) throws Exception;
}
