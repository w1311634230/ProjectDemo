package com.neu.dao;

import java.util.List;

import com.neu.entity.Storey;



public interface StoreyDao {
	int insert(Storey sto) throws Exception;
	int update(Storey sto) throws Exception;
	int delete(String storey) throws Exception;
	public List<Storey> getAll() throws Exception;
}
