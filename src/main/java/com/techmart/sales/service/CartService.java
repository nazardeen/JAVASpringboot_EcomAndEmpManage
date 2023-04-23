package com.techmart.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techmart.sales.model.Admin;
import com.techmart.sales.model.CartItem;
import com.techmart.sales.model.Customer;
import com.techmart.sales.repository.CartItemRepo;

@Service
public class CartService {

	
	@Autowired
	private CartItemRepo cartRepo;
	
	public List<CartItem> listCartItems(Admin admin) {
		return cartRepo.findByAdmin(admin);
	}
	
}
