package com.neu.dao;

import com.neu.entity.Sysuser;

public interface SysuserDao {
	int update(Sysuser sys) throws Exception;
	int insert(Sysuser sys) throws Exception;
	int delete(int id) throws Exception;
	Sysuser select(String userid,String username) throws Exception;
}
