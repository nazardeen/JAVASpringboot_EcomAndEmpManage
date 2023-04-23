package com.techmart.sales;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.techmart.sales.model.Admin;
import com.techmart.sales.model.CartItem;
import com.techmart.sales.model.Customer;

import static org.assertj.core.api.Assertions.assertThat;
import com.techmart.sales.model.Stock;
import com.techmart.sales.repository.CartItemRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CartItemRepoTest {

	@Autowired
	private CartItemRepo cartRepo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testAddOneCart() {
		
		Stock stock = entityManager.find(Stock.class, (long) 1);
		Admin admin = entityManager.find(Admin.class,(long) 1);
		
		CartItem newItem = new CartItem();
		newItem.setAdmin(admin);
		newItem.setStock(stock);
		newItem.setQty(1);
		
		CartItem saveCartItem = cartRepo.save(newItem);
		
		assertTrue(saveCartItem.getCart_id()>0);
		
	}
	
	@Test
	public void testGetCartItemByCustomer() {
		Admin admin = new Admin();
		admin.setAdmin_id((long) 3);
		
		List<CartItem> cartItems = cartRepo.findByAdmin(admin);
		
		assertEquals(3, cartItems.size());
	}
	
	
}
