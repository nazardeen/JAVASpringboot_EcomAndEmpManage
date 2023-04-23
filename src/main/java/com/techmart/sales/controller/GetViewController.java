package com.techmart.sales.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.techmart.sales.model.Stock;
import com.techmart.sales.repository.StockRepo;

@Controller
public class GetViewController {
	@Autowired 
	private StockRepo productRepo;
	
	@RequestMapping(value = "/addP",method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView returnAddProduct()
	{
	  ModelAndView mv = new ModelAndView();
	  mv.setViewName("addP");
	  //mv.addObject("var", "halim");
	  return mv;
	  
	}
	
	@RequestMapping(value = "/listProduct",method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView returnListProduct()
	{
	  ModelAndView mv = new ModelAndView();
	  List<Stock> product = productRepo.findAll();
	  mv.setViewName("listProducts");
	  mv.addObject("product", product);
	  return mv;
	  
	}

}
