package com.forkapp.orderservice.controller;

import java.util.List;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.forkapp.orderservice.model.Book;

@RestController
public class OrderController 
{
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("books")
	public List<Book> getBooks(){
		return restTemplate.getForObject("http://book-service/books", List.class);
	}
	
	@GetMapping("laptops")
	public List<Book> getLaptops(){
		return restTemplate.getForObject("http://laptop-service/laptops", List.class);
	}
	
	@GetMapping("mobiles")
	public List<Book> getMobiles(){
		return restTemplate.getForObject("http://mobile-service/mobiles", List.class);
	}
	
	@GetMapping("users")
	public User getUser(){
		List<User> ul = restTemplate.getForObject("http://user-service/users", List.class);
		return ul.get(0);
	}
}
