package com.neu.service;

import java.util.List;

import com.neu.entity.Storey;

public interface StoreyService {
	int add(Storey sto) throws Exception;
	int modify(Storey sto) throws Exception;
	int remove(String storey) throws Exception;
	List<Storey> getStorey() throws Exception;
}
