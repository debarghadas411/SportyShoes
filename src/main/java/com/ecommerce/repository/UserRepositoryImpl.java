package com.ecommerce.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Product;
import com.ecommerce.model.User;

@Repository
public class UserRepositoryImpl implements  UserRepository{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		
		return jdbcTemplate.update(
                "insert into users (user_id, username,password,email,phno) values(?,?,?,?,?)",
                user.getUserId(),user.getUsername(),user.getPassword(),user.getEmail(),user.getPhnno());
	}

	@Override
	public int update(User user) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
                "update users set username = ?, password = ?, email = ?, phno = ?"
                + " where user_id = ?",user.getUsername(),user.getPassword(),user.getEmail(),user.getPhnno(),user.getUserId());
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update(
                "delete from users where user_id = ?",id);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(
                "select * from users",
                (rs, rowNum) ->
                        new User(
                                rs.getInt("user_id"),
                                rs.getString("username"),
                                rs.getString("password"),
                                rs.getString("email"),
                                rs.getString("phno")
                        )
        );
	}

}
