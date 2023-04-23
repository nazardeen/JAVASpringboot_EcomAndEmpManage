package com.techmart.sales.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.techmart.sales.CustomUserDetails;
import com.techmart.sales.model.Admin;
import com.techmart.sales.model.Customer;
import com.techmart.sales.repository.CustomerRepo;


@Service
public class CustomerService {

	@Autowired
    CustomerRepo customerRepository;    
	
	
	// CREATE 
	public Customer createCustomer(Customer cus) {
	    return customerRepository.save(cus);
	}
	
	// READ
	public List<Customer> getCustomers() {
	    return customerRepository.findAll();
	}
	
	// READOne
	public Optional<Customer> getOneCustomers(Long id) {
	    return customerRepository.findById(id);
	}
	
	
	// DELETE
	public void deleteCustomer(Long cus) {
		customerRepository.deleteById(cus);
	}
	
	// UPDATE
	public Customer updateCustomer(Long cusID, Customer customerDetails) {
			Customer cus = customerRepository.findById(cusID).get();
			cus.setFirstName(customerDetails.getFirstName());
			cus.setLastName(customerDetails.getLastName());
			cus.setUserName(customerDetails.getUserName());
			cus.setEmail(customerDetails.getEmail());
			cus.setPassword(customerDetails.getPassword());
	        
	        return customerRepository.save(cus);  
		
	
	/*public Customer getCurrentlyLoggedInCustomer(Authentication authentication) {
		if(authentication == null) return null;
		
		Customer customer = null;
		Object principal = authentication.getPrincipal();
		
		if(principal instanceof CustomerUserDetails) {
			customer = ((CustomerUserDetails) principal).getCustomer();
		} else if (principal instanceof CustomOAuth2User) {
			String email = ((CustomOAuth2User) principal).getEmail();
			customer = getCustomerByEmail(email);
		}
		
	return customer;
	}*/
	}
	
	
	
	public Admin getLoggedUser(Authentication authentication) {
		
		if (authentication == null) return null;
		
		Admin admin = null;
		Object principal = authentication.getPrincipal();
		
		if (principal instanceof CustomUserDetails) {
			admin = ((CustomUserDetails) principal).getAdmin();
		}
			
		return admin;
		
	}
}
