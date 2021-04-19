package com.forkapp.cartservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forkapp.cartservice.model.Cart;
import com.forkapp.cartservice.service.CartService;

@CrossOrigin
@RestController
public class CartController 
{
	@Autowired
	private CartService cartService;
	
	@GetMapping("cart/{username}")
	public List<Cart> getCartItems(@PathVariable String username){
		return cartService.getCartItemsFromDb(username);
	}
	
	@PostMapping("cart")
	public String addCartItem(@RequestBody Cart cart) {
		return cartService.addCartItemToDb(cart);
	}
	
	@DeleteMapping("cart/{id}")
	public String deleteCartItem(@PathVariable String id) {
		return cartService.deleteCartItemFromDb(id);
	}
}
