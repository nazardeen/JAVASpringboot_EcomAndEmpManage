package com.techmart.sales.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.techmart.sales.model.Stock;
import com.techmart.sales.service.StockService;

@Controller
public class IndexController {
	@Autowired
	private StockService stockService;
	
//	public String showIndex(Model model) {
//		model.addAttribute("stock", stockService.getAllProduct());
//		return "index";
//	}
//	@RequestMapping(value = "/search", method = RequestMethod.GET)
//	@ResponseBody
//	public ModelAndView search(@RequestParam("value") String value) {
//		ModelAndView mv = new ModelAndView();;
//		mv.setViewName("fragments/searchFragment");
//		List<Stock> stock = stockService.searchProductByNameLike(value);
//		mv.addObject("stock", stock);
//		return mv;
//	}
}
