package com.marketappws.business;

import java.util.List;

import com.marketappws.model.entity.User;

public interface UserBusiness
{
	public List<User> findAll();
	public User findById(Integer id);
}
