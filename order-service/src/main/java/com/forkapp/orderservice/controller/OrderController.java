package com.forkapp.orderservice.controller;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.forkapp.orderservice.model.Book;
import com.forkapp.orderservice.model.Cart;

@RestController
public class OrderController 
{
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/cart/{username}")
	public List<Cart> getCartItems(@PathVariable String username){
		return restTemplate.getForObject("http://cart-service/cart/"+username, List.class);
	}
}
