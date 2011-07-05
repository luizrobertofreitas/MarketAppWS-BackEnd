package com.marketappws.service.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketappws.business.UserBusiness;
import com.marketappws.model.entity.User;
import com.marketappws.service.UserService;

@Service("userServiceImpl")
@WebService(endpointInterface="com.receitasappserver.service.UserService")
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserBusiness userBusiness;

	@SuppressWarnings("unused")
	@PostConstruct
    private void init() {
        System.out.println("PostConstruct userBusiness injected ==> " + (userBusiness != null));
    }
	
	public void setUserBusiness(UserBusiness userBusiness)
	{
		this.userBusiness = userBusiness;
	}
	
	@Override
	@WebMethod(operationName="findAllUsers")
	public List<User> findAllUsers()
	{
		System.out.println(" >> UserBusiness "  + userBusiness);
		
		if(userBusiness != null)
		{
			return userBusiness.findAll();
		}
		else
		{
			return null;
		}
	}

	@Override
	@WebMethod(operationName="findUserById")
	public User findUserById(Integer id)
	{
		return userBusiness.findById(id);
	}

}
