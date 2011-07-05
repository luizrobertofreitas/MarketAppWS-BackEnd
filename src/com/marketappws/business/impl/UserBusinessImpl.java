package com.marketappws.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.marketappws.business.UserBusiness;
import com.marketappws.model.dao.UserDao;
import com.marketappws.model.entity.User;

@Component
public class UserBusinessImpl implements UserBusiness
{
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao)
	{
		this.userDao = userDao;
	}
	
	@Override
	public List<User> findAll()
	{
		return userDao.findAll();
	}

	@Override
	public User findById(Integer id)
	{
		return userDao.findById(id);
	}
}
