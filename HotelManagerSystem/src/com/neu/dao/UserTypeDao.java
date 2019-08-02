package com.neu.dao;

import java.util.List;

import com.neu.entity.Usertype;

public interface UserTypeDao {
	List<Usertype> select() throws Exception;
}
