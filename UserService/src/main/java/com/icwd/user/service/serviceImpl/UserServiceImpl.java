package com.icwd.user.service.serviceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icwd.user.service.entities.User;
import com.icwd.user.service.exception.ResourceNotFoundException;
import com.icwd.user.service.repositories.UserRepo;
import com.icwd.user.service.services.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
		//genrate unique user id.
		String rendomUserId=UUID.randomUUID().toString();
		user.setId(rendomUserId);
		return this.userRepo.save(user);
		
	}

	@Override
	public List<User> getAllUser() {
		List<User> users=this.userRepo.findAll();
		return users;
	}

	@Override
	public User getUser(String userId) {
		
		return this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User is not found with given Id on server: "+userId));
	}

	@Override
	public User updateUser(String userId, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
