package com.marketappws.service;

import java.util.List;

import javax.jws.WebService;

import com.marketappws.model.entity.User;

@WebService
public interface UserService
{
	public List<User> findAllUsers();
	public User findUserById(Integer id);
}
