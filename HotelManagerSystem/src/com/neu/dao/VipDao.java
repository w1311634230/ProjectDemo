package com.neu.dao;

import java.util.List;

import com.neu.entity.Vip;

public interface VipDao {
	int insert(Vip vip) throws Exception;
	int update(Vip vip) throws Exception;
	int delete(String vipid) throws Exception;
	
	List<Vip> getByName(String guest,int pageSize,int pageNum) throws Exception;
	int count(String guest) throws Exception;
	Vip getById(String vipid) throws Exception;
	Vip getByIdName(String vipid,String guest) throws Exception;
}
