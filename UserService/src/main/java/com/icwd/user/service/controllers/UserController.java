package com.icwd.user.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icwd.user.service.entities.User;
import com.icwd.user.service.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//create 
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User user1=this.userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	
	// get single user
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId)
	{
		User user1=this.userService.getUser(userId);
		return ResponseEntity.status(HttpStatus.OK).body(user1);
	}
	
	//get all users
	@GetMapping("/allusers")
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> users= this.userService.getAllUser();
		return ResponseEntity.ok(users);
	}
	
}
