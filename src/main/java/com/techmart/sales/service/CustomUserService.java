package com.techmart.sales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.techmart.sales.CustomUserDetails;
import com.techmart.sales.model.Admin;
import com.techmart.sales.model.Stock;
import com.techmart.sales.model.UserSalesAgent;
import com.techmart.sales.repository.AdminRepo;


@Service
public class CustomUserService implements UserDetailsService {

	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		Admin admin = adminRepo.findByEmail(email);
		if(admin == null) {
			throw new UsernameNotFoundException("User not found");
		}
		
		
		return new CustomUserDetails(admin);
	}
	
	
	
	public static Admin getLoggedUser(Authentication authentication) {
		
		if (authentication == null) return null;
		
		Admin admin = null;
		Object principal = authentication.getPrincipal();
		
		if (principal instanceof CustomUserDetails) {
			admin = ((CustomUserDetails) principal).getAdmin();
		}
			
		return admin;
		
	}
	
	

	    public void changeEmail(Long id, String email)
	    {
	      	Admin p = new Admin();
	    	p = adminRepo.findById(id).get();
	    	p.setEmail(email);
	    	adminRepo.save(p);  
	    }

	    
		// DELETE
		public void deleteUser(Long id) {
			adminRepo.deleteById(id);
		}
		
		
		
		  public void changeFAName(Long id ,String faName)
		    {
		    	Admin p = new Admin();
		    	p = adminRepo.findById(id).get();
		    	p.setFirstName(faName);
		    	adminRepo.save(p);    
		    }
		

		    public void changeLAName(Long id , String lName)
		    {
		      	Admin p = new Admin();
		    	p = adminRepo.findById(id).get();
		    	p.setLastName(lName);
		    	adminRepo.save(p);  
		    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
	// UPDATE
	public Admin updateadmin(Long empId, Admin adminDetails) {
			Admin emp = adminRepo.findById(empId).get();
	        emp.setFirstName(adminDetails.getFirstName());
	        emp.setLastName(adminDetails.getLastName());
	        emp.setEmail(adminDetails.getEmail());
	        
	        
	        return adminRepo.save(emp);  
		
	
	}	
		
	}


