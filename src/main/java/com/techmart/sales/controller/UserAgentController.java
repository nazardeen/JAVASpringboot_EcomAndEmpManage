package com.techmart.sales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.techmart.sales.model.Admin;
import com.techmart.sales.model.Customer;
import com.techmart.sales.model.UserSalesAgent;
import com.techmart.sales.repository.UserAgentRepo;
import com.techmart.sales.service.UserAgentService;


@RestController

public class UserAgentController {
			@Autowired
			private UserAgentRepo agentRepo;
	
	
	        @Autowired
	        UserAgentService useragentService;
	        

	        @GetMapping("/bb")
	        public ModelAndView showAddProduct()
	        {
	        	ModelAndView modelAndView = new ModelAndView();
	            modelAndView.setViewName("users.html");
	            return modelAndView;
	        	
	        }

	        
	   
	        
	        @RequestMapping(value="/useragent", method=RequestMethod.POST)
	        public UserSalesAgent createAgent(@RequestBody UserSalesAgent emp) {
	            return useragentService.createEmployee(emp);
	        }
	        
	        @RequestMapping(value="/useragent", method=RequestMethod.GET)
	        public List<UserSalesAgent> readEmployees() {
	            return useragentService.getEmployees();
	        }

	        @RequestMapping(value="/useragent/{empId}", method=RequestMethod.PUT)
	        public UserSalesAgent readEmployees(@PathVariable(value = "empId") Long id, @RequestBody UserSalesAgent empDetails) {
	            return useragentService.updateEmployee(id, empDetails);
	        }

	        @RequestMapping(value="/useragent/{empId}", method=RequestMethod.DELETE)
	        public void deleteEmployees(@PathVariable(value = "empId") Long id) {
	        	useragentService.deleteEmployee(id);
	        }
	        
	        @RequestMapping(value="/useragent/{branch}", method=RequestMethod.GET)
	        public List<UserSalesAgent> getAgentByBranch(@PathVariable String branch) {
	        	return useragentService.getAgentByBranch(branch);
	        }
	}
	


