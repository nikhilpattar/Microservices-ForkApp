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

	public User getUserFromDb(String username, String password) {
		User uname = userRepository.findByUsername(username);
		User upass = userRepository.findByPassword(password);
		if(uname.getuId().equals(upass.getuId())) {
			return uname;
		}else {
			return null;
		}
	}
	
	public String addUserToDb(User user) {
		user.setuId(user.getSecondName() + new Date().getTime());
		userRepository.save(user);
		return "User with Id: "+user.getuId()+" addedd successfully"; 
	}
}
