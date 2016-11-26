package com.dal.pharmacy_translator.controllers;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GeneralController {
	
	String message = "Welcome to Spring MVC!";

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "inputcode", required = false, defaultValue = "") String inputcode,
			@RequestParam(value = "language", required = false, defaultValue = "") String language){
		
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", "dsdsds");
		
		Map<String,String> languages = new HashMap<String,String>(); 
		languages.put("1", "English");
		languages.put("2", "Fench");
		mv.addObject("languages", languages);
		
		if(!inputcode.equals("")) {
			mv.addObject("note","Note");
			mv.addObject("translatednote", "Translated Note");
		}
		
		
		return mv;
	}
}
