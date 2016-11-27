package com.dal.pharmacy_translator.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dal.pharmacy_translator.dao.LanguageDAO;
import com.dal.pharmacy_translator.dao.PatientDAO;
import com.dal.pharmacy_translator.model.Language;
import com.dal.pharmacy_translator.model.Patient;

@Controller
public class GeneralController {
	
	String message = "Welcome to Spring MVC!";
	
	@Autowired
	private PatientDAO patientDao;
	
	@Autowired
	private LanguageDAO languageDao;

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "inputcode", required = false, defaultValue = "") String inputcode,
			@RequestParam(value = "language", required = false, defaultValue = "") String language){
		
		System.out.println("in controller");
		
		List<Patient> patients = patientDao.getList();
		System.out.println(patients.toString());
		
		
		
		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", "dsdsds");
		
		List<Language> languages = languageDao.getList();
		mv.addObject("languages", languages);
		
		
//		Map<String,String> languages = new HashMap<String,String>(); 
//		languages.put("1", "English");
//		languages.put("2", "Fench");
//		mv.addObject("languages", languages);
		
		if(!inputcode.equals("")) {
			mv.addObject("note","Note");
			mv.addObject("translatednote", "Translated Note");
		}
		
		
		return mv;
	}
}
