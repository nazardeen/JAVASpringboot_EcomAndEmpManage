package com.techmart.sales.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.techmart.sales.model.Customer;
import com.techmart.sales.model.Stock;
import com.techmart.sales.service.CustomerService;




@RestController
@RequestMapping("/api")
public class CustomerController {
	
	
	 @Autowired
     CustomerService customerService;
     

    @GetMapping("/aa")
    public ModelAndView showAddProduct()
    {
    	ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("customer.html");
        return modelAndView;
    	
    }
	 
     
     @RequestMapping(value="/customer", method=RequestMethod.POST)
     public Customer createCustomer(@RequestBody Customer cus) {
         return customerService.createCustomer(cus);
     }
     
     @RequestMapping(value="/customer", method=RequestMethod.GET)
     public List<Customer> readCustomers() {
         return customerService.getCustomers();
     }
     
     @RequestMapping(value="/customer/{id}", method=RequestMethod.GET)
     public Optional<Customer> readOneCustomers(@PathVariable Long id) {
         return customerService.getOneCustomers(id);
     }

     @RequestMapping(value="/customer/{cusID}", method=RequestMethod.PUT)
     public Customer readCustomer(@PathVariable(value = "cusID") Long id, @RequestBody Customer cusDetails) {
         return customerService.updateCustomer(id, cusDetails);
     }

     @RequestMapping(value="/customer/{cusID}", method=RequestMethod.DELETE)
     public void deleteCustomer(@PathVariable(value = "cusID") Long id) {
    	 customerService.deleteCustomer(id);
     }


	

}
