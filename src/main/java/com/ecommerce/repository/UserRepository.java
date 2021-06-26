package com.ecommerce.repository;
import java.sql.Date;
import java.util.List;

import com.ecommerce.model.Product;
import com.ecommerce.model.User;

public interface UserRepository {
	
	int save(User user);

    int update(User user);

    int deleteById(int id);

    List<User> findAll();

}
