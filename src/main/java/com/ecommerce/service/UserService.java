package com.ecommerce.service;

import java.util.List;

import com.ecommerce.model.User;

public interface UserService {
	int save(User user);

    int update(User user);

    int deleteById(int id);

    List<User> findAll();
}
