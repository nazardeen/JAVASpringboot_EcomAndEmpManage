//package com.techmart.sales.TestDrivenDev;
//
////import static org.junit.jupiter.api.Assertions.assertTrue;
//
////import org.junit.jupiter.api.Test;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
////import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
////import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
////import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
////import org.springframework.test.annotation.Rollback;
//
//import com.techmart.sales.model.CartItem;
////import com.techmart.sales.model.Customer;
//import com.techmart.sales.model.Stock;
////import com.techmart.sales.repository.CartItemRepo;
//
////@DataJpaTest
////@AutoConfigureTestDatabase(replace = Replace.NONE)
////@Rollback(false)
////public class CartTest {
////	
//	//@Autowired
////	private CartItemRepo cartRepo;
//	
////	@Autowired
//	private TestEntityManager entityManager;
//	
//	@Test
//	public void testAddOneCartItem() {
//		
//	
//		 Stock stock = entityManager.find(Stock.class,(long)1);
//		// Customer customer = entityManager.find(Customer.class,(long)2);
//		 
//		 CartItem newItem = new CartItem();
//		// newItem.setCustomer(customer);
//		 newItem.setStock(stock);
//		 newItem.setQty(1);
//		 
//		// CartItem savedCartItem = cartRepo.save(newItem);
//		 
//		// assertTrue(savedCartItem.getCart_id() >0);
//		 
//		 
//		 
//		 
//		 
//	}
//}
