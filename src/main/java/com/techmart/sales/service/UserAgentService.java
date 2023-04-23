package com.techmart.sales.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.techmart.sales.CustomUserDetails;
import com.techmart.sales.model.Admin;
import com.techmart.sales.model.UserSalesAgent;
import com.techmart.sales.repository.UserAgentRepo;


@Service
public class UserAgentService {
	
	@Autowired
	private UserAgentRepo agentRepo;
	
    @Autowired
    private UserAgentRepo userAgentRepository;    
	
	
	// CREATE 
	public UserSalesAgent createEmployee(UserSalesAgent emp) {
	    return userAgentRepository.save(emp);
	}
	
	// READ
	public List<UserSalesAgent> getEmployees() {
	    return userAgentRepository.findAll();
	}
	
	// DELETE
	public void deleteEmployee(Long empId) {
		userAgentRepository.deleteById(empId);
	}
	
	// UPDATE
	public UserSalesAgent updateEmployee(Long empId, UserSalesAgent agentDetails) {
			UserSalesAgent emp = userAgentRepository.findById(empId).get();
	        emp.setFirstName(agentDetails.getFirstName());
	        emp.setLastName(agentDetails.getLastName());
	        emp.setUserName(agentDetails.getUserName());
	        
	        return userAgentRepository.save(emp);  
		
	
	}
	
	
	
	
	
	//findByBranch
	public List<UserSalesAgent> getAgentByBranch(String branch)
	{
		return userAgentRepository.findByBranch(branch);
	}
	
	
	  public void changeEmail(Long id, String email)
	    {
		  UserSalesAgent p = new UserSalesAgent();
	    	p = userAgentRepository.findById(id).get();
	    	p.setEmail(email);
	    	userAgentRepository.save(p);  
	    }

	    
		// DELETE
		public void deleteUser(Long id) {
			userAgentRepository.deleteById(id);
		}
		
		
		
		  public void changeFAName(Long id ,String faName)
		    {
			  UserSalesAgent p = new UserSalesAgent();
		    	p = userAgentRepository.findById(id).get();
		    	p.setFirstName(faName);
		    	userAgentRepository.save(p);    
		    }
		

		    public void changeLAName(Long id , String lName)
		    {
		    	UserSalesAgent p = new UserSalesAgent();
		    	p = userAgentRepository.findById(id).get();
		    	p.setLastName(lName);
		    	userAgentRepository.save(p);  
		    }
}
