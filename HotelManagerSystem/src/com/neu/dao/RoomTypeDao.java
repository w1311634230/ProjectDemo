package com.neu.dao;

import java.util.List;

import com.neu.entity.RoomType;

public interface RoomTypeDao {
	public List<RoomType> getAll() throws Exception;
}
