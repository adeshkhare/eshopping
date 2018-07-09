package com.kt.eshop.eweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("home"); 
		mv.addObject("msg", "First Message");
		return mv;
	}
	
	@RequestMapping(value="/xyz", method = RequestMethod.GET)
	public ModelAndView xyz() {
		ModelAndView mv = new ModelAndView("home"); 
		mv.addObject("msg", "Through xyz message");
		return mv;
	}
	
	@RequestMapping("/abc")
	public ModelAndView first(@RequestParam("name") String nm, @RequestParam("name1") String nm1) {
		ModelAndView mv = new ModelAndView("home"); 
		String nms = nm + " " + nm1;
		mv.addObject("msg", nms);
		return mv;		
	}
}
