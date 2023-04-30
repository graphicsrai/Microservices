package com.icwd.user.service.services;

import java.util.List;

import com.icwd.user.service.entities.User;

public interface UserService {
	
	
	//create user
	User saveUser(User user);
	
	//get all users
	List<User> getAllUser();
	
	//get single user
	User getUser(String userId);
	
	//update user
	User updateUser(String userId, User user);
	
	//Delete user
	String deleteUser(String userId);
}
