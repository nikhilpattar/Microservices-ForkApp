package com.forkapp.userservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.forkapp.userservice.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{
	User findByUsername(String username);
	User findByPassword(String password);
}
