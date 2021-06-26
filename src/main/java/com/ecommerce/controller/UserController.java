package com.ecommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.model.User;
import com.ecommerce.service.UserService;

@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public @ResponseBody User insertUser(@RequestBody User U) {
		us.save(U);
		return U;
		
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public @ResponseBody int deleteUser(@PathVariable int id) {
		
		return us.deleteById(id);
		
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody User updateUser(@RequestBody User U) {
		us.update(U);
		return U;
		
	}
	@RequestMapping(value = "/listall", method = RequestMethod.POST)
	public @ResponseBody List<User> listAllProducts(){
		return us.findAll();
		
	}
}
