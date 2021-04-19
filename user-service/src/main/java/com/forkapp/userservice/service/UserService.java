package com.forkapp.userservice.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forkapp.userservice.model.User;
import com.forkapp.userservice.repository.UserRepository;

@Service
public class UserService 
{
	@Autowired
	private UserRepository userRepository;
	
	public User getUserFromDb(User user) {
		return userRepository.findByuUsername(user.getuUsername());
	}
	
	public String addUserToDb(User user) {
		
		String id = user.getuUsername()+new Date().getTime();
		user.setuId(id);
		
		userRepository.save(user);
		return "User with Id: "+user.getuId()+" addedd successfully";
	}
}
