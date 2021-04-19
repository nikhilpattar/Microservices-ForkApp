package com.forkapp.cartservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.forkapp.cartservice.model.Cart;


@Repository
public interface CartRepository extends MongoRepository<Cart, Integer>{

	List<Cart> findByUsername(String username);
	
	void deleteById(String id);
}
