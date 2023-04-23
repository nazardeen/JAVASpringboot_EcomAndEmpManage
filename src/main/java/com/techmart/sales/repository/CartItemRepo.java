package com.techmart.sales.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techmart.sales.model.Admin;
import com.techmart.sales.model.CartItem;
import com.techmart.sales.model.Customer;



public interface CartItemRepo extends JpaRepository<CartItem, Long>{
	
	public List<CartItem> findByAdmin(Admin admin);

}
