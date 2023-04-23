package com.techmart.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techmart.sales.model.Admin;
import com.techmart.sales.model.UserSalesAgent;
import com.techmart.sales.repository.AdminRepo;
import com.techmart.sales.service.CustomUserService;

@Controller

public class AdminController {
	
	@Autowired
	private AdminRepo adminRepo;
	
	@Autowired
	private CustomUserService adminService;
	
	
	
	@GetMapping("")
	public String viewHomepage() {
		return "index";
		
	}
	
	
	@GetMapping("/register")
	public String showSignUpForm(Model model) {
		
		model.addAttribute("admin", new Admin());
		return "signup_form";
		
	}
	@PostMapping("/process_register")
	public String processRegistration(Admin admin) {
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(admin.getPassword());
		admin.setPassword(encodedPassword);
		
		
		
		adminRepo.save(admin);
		
		return "register_success";
	}
	
	@GetMapping("/list_users")
	public String viewUserList(Model model) {
		List<Admin> listUsers = adminRepo.findAll();
		model.addAttribute("listUsers", listUsers);
		
		return "users";
	}
	
	
    @RequestMapping(value="/admin/{empId}", method=RequestMethod.PUT)
    public Admin readAdmin(@PathVariable(value = "empId") Long id, @RequestBody Admin empDetails) {
        return adminService.updateadmin(id, empDetails);
    }
    
    
    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
    	adminService.deleteUser(id);
    	return "redirect:/list_users";
    }

    
    @PostMapping("/changeFAName")
    public String changePname(@RequestParam("id") Long id,
    		@RequestParam("newFname") String faName)
    {
    	adminService.changeFAName(id, faName);
    	return "redirect:/list_users";
    }
	
    @PostMapping("/changeLAName")
    public String changeCname(@RequestParam("id") Long id,
    		@RequestParam("newLname") String faName)
    {
    	adminService.changeLAName(id, faName);
    	return "redirect:/list_users";
    }
    
    @PostMapping("/changeEmail")
    public String changeEmail(@RequestParam("id") Long id,
    		@RequestParam("newEmail") String email)
    {
    	adminService.changeEmail(id, email);
    	return "redirect:/list_users";
    }
	
}
