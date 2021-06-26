package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.User;
import com.ecommerce.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository ur; 
	
	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return ur.update(user);
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return ur.deleteById(id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}


}
