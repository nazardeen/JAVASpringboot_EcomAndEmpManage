package com.techmart.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.techmart.sales.model.Admin;
import com.techmart.sales.model.CartItem;
import com.techmart.sales.repository.AdminRepo;
import com.techmart.sales.service.CartService;
import com.techmart.sales.service.CustomUserService;
import com.techmart.sales.service.CustomerService;

@Controller
public class CartController {

	@Autowired
	private AdminRepo adminRepo;
	
	
	@Autowired
	private CartService cartService;
	
	
	@Autowired
	private CustomerService customerServices;
	
	@GetMapping("/cart")
	public String showShoppingCart(Model model, 
			@AuthenticationPrincipal Authentication authentication) {
		
		Admin admin = customerServices.getLoggedUser(authentication);
				
		
		List<CartItem> cartItems = cartService.listCartItems(admin);
		
		model.addAttribute("cartItems",cartItems);
		model.addAttribute("pageTitle", "Shopping Cart");
		
		
		return "shopping_cart";
		
		
	}
}

