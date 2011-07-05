package com.marketappws.model.dao;

import java.util.List;

import com.marketappws.model.entity.User;

public interface UserDao
{
	public List<User> findAll();
	public User findById(Integer id);
}
