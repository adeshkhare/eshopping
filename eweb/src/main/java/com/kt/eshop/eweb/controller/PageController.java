package com.kt.eshop.eweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kt.eshop.ecommon.dao.CategoryDAO;
import com.kt.eshop.ecommon.domain.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "Home Page");
		mv.addObject("userClickHome", true);
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "Contacts");
		mv.addObject("userClickContacts", true);
		return mv;
	}
	
	@RequestMapping(value="/show/all/products", method = RequestMethod.GET)
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("title", "All Products");
		mv.addObject("userClickAllProducts", true);
		mv.addObject("categories", categoryDAO.list());
		return mv;
	}
	
	
	@RequestMapping(value="/show/category/{id}/product", method = RequestMethod.GET)
	public ModelAndView showProduct(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("home");
		Category category  = categoryDAO.get(id);
		mv.addObject("title", category.getName());
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("category", category);

		mv.addObject("userClickCategoryProduct", true);
		return mv;
	}
}
