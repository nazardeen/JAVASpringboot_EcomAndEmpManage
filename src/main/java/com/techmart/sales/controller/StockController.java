package com.techmart.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.techmart.sales.model.Stock;
import com.techmart.sales.repository.StockRepo;
import com.techmart.sales.service.StockService;




@Controller

public class StockController {

	
	
		        @Autowired
		        private StockService stockService;
		                
	     
		        @GetMapping("/listProducts.html")
		        public String showStock(Model model)
		        {
		        	List<Stock> stock = stockService.getAllProduct();
		        	model.addAttribute("stock", stock);
		        	return "/listProducts.html";
		        }
		        
		        @GetMapping("/addProduct")
		        public String showAddProduct()
		        {
		        	return "addProduct";
		        }
		        
		        
		        
		        
		        @PostMapping("/addP")
		        public String saveStock(@RequestParam("file") MultipartFile file,
		        		@RequestParam("sname") String name,
		        		@RequestParam("sdesc") String description,
		        		@RequestParam("sprice") int price,
		        		@RequestParam("stype") String type
		        		)
		        {
		        	stockService.saveProductTODb(file, name, type, description, price);
		        	return "redirect:/listProducts.html";
		        }

		        
		        @GetMapping("/deleteStock/{id}")
		        public String deleteStock(@PathVariable("id") Long id) {
		        	stockService.deleteStock(id);
		        	return "redirect:/listProducts.html";
		        }
		        
		        
		        
		        
		        @PostMapping("/changeName")
		        public String changePname(@RequestParam("id") Long id,
		        		@RequestParam("newPname") String stockName)
		        {
		        	stockService.chageStocktName(id, stockName);
		        	return "redirect:/listProducts.html";
		        }
		        @PostMapping("/changeDescription")
		        public String changeProductDescription(@RequestParam("id") Long id ,
		        		@RequestParam("newDescription") String description)
		        {
		        	stockService.changeStockDescription(id, description);
		        	return "redirect:/listProducts.html";
		        }
		        
		        @PostMapping("/changePrice")
		        public String changeStockPrice(@RequestParam("id") Long id ,
		        		@RequestParam("newPrice") int price)
		        {
		        	stockService.changeStockPrice(id, price);
		        	return "redirect:/listProducts.html";
		        }
		        
		        @PostMapping("/changeType")
		        public String changeStockType(@RequestParam("id") Long id ,
		        		@RequestParam("newType") String type)
		        {
		        	stockService.changeStockType(id, type);
		        	return "redirect:/listProducts.html";
		        }
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        

	
	}
		

	
	
	

