package com.marketappws.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.marketappws.model.dao.UserDao;
import com.marketappws.model.entity.User;

@Repository
public class UserDaoImpl implements UserDao
{
	@PersistenceContext
	private EntityManager entityManager;
	
	public void setEntityManager(EntityManager em)
	{
		System.out.println("UserDao - EntityManage " + em);
		entityManager = em;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<User> findAll()
	{
		return entityManager.createNamedQuery("User.findAll").getResultList();
	}

	@Override
	public User findById(Integer id)
	{
		return entityManager.find(User.class, id);
	}
}
