package com.neu.service;

import java.util.List;

import com.neu.dao.StoreyDao;
import com.neu.dao.StoreyDaoImpl;
import com.neu.entity.Storey;

public class StoreyServiceImpl implements StoreyService {
	StoreyDao sDao = new StoreyDaoImpl();
	
	
	@Override
	public int add(Storey sto) throws Exception {
		int n = sDao.insert(sto);
		return n;
	}

	@Override
	public int modify(Storey sto) throws Exception {
		int n = sDao.update(sto);
		return n;
	}

	@Override
	public int remove(String storey) throws Exception {
		int n = sDao.delete(storey);
		return n;
	}

	@Override
	public List<Storey> getStorey() throws Exception {
		List<Storey> list = sDao.getAll();
		return list;
	}

}
