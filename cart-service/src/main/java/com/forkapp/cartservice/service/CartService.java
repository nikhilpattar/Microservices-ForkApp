package com.forkapp.cartservice.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forkapp.cartservice.model.Cart;
import com.forkapp.cartservice.repository.CartRepository;

@Service
public class CartService 
{
	@Autowired
	private CartRepository cartRepository;
	
	public List<Cart> getCartItemsFromDb(String username){
		return cartRepository.findByUsername(username);
	}
	
	public String addCartItemToDb(Cart cart) {
		String id = cart.getUsername() + new Date().getTime();
		cart.setId(id);
		cartRepository.save(cart);
		return "Cart with Id: "+cart.getId()+" added successfully";
	}
	
	public String deleteCartItemFromDb(String id) {
		cartRepository.deleteById(id);
		return "Cart with Id: "+id+" deleted successfully";
	}
}
