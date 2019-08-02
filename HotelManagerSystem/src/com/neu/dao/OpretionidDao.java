package com.neu.dao;

import java.util.List;

import com.neu.entity.Opretionid;

public interface OpretionidDao {
	List<Opretionid> select(int pageSize,int pageNum) throws Exception;
}
