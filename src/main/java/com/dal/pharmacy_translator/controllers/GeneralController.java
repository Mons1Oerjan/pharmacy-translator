package com.dal.pharmacy_translator.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dal.pharmacy_translator.dao.CodeDAO;
import com.dal.pharmacy_translator.dao.LanguageDAO;
import com.dal.pharmacy_translator.dao.MedicineDAO;
import com.dal.pharmacy_translator.dao.PatientDAO;
import com.dal.pharmacy_translator.dao.TranslatedNotesDAO;
import com.dal.pharmacy_translator.model.Code;
import com.dal.pharmacy_translator.model.Language;
import com.dal.pharmacy_translator.model.Medicine;
import com.dal.pharmacy_translator.model.Patient;
import com.dal.pharmacy_translator.model.TranslatedNotes;

@Controller
public class GeneralController {
	
	@Autowired
	private PatientDAO patientDao;
	
	@Autowired
	private LanguageDAO languageDao;
	
	@Autowired
	private CodeDAO codeDao;
	
	@Autowired
	private MedicineDAO medicineDao;
	
	@Autowired
	private TranslatedNotesDAO translatednotesDao;

	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "inputcode", required = false, defaultValue = "") String inputcode,
			@RequestParam(value = "language", required = false, defaultValue = "") String language){
		
		ModelAndView mv = new ModelAndView("helloworld");
		
		List<Patient> patients = patientDao.getList();
		Patient p1 = new Patient(1, "Mons", "Norwegian", "1650 Walnut St", "10Nov1992", "9029892147", "mons@dal.ca", "Tor", "90047399");
		Patient p2 = new Patient(2, "name", "language", "address", "birthdate", "phone#", "email", "emergency contact", "emergency phone#");
		patients.add(p1);
		patients.add(p2);
		
		List<Language> languages = languageDao.getList();
		Language l1 = new Language(1, "Spanish");
		Language l2 = new Language(2, "Portuguese");
		Language l3 = new Language(3, "Norwegian");
		Language l4 = new Language(4, "Arabic");
		Language l5 = new Language(5, "Filipino");
		languages.add(l1);
		languages.add(l2);
		languages.add(l3);
		languages.add(l4);
		languages.add(l5);
		
		List<Medicine> medicines = medicineDao.getList();
		Medicine m1 = new Medicine(1, "Puffer", 1); //id (unique), name, foreign key to patient
		
		List<TranslatedNotes> notes = translatednotesDao.getList();
		TranslatedNotes tn1 = new TranslatedNotes(1, "Toma una tableta al día", 1, 1); //id, translation, foreign key language, foreign key code
		TranslatedNotes tn2 = new TranslatedNotes(2, "تناول قرص واحد يوميا", 4, 1); //id, translation, foreign key language, foreign key code
		
		List<Code> codes = codeDao.getList();
		Code c1 = new Code(1, "T1T1D", "Take 1 tablet daily", 1); //id (unique), code, definition, foreign key to medicine
		
		
		//add to ModelAndView:
		mv.addObject("patients", patients);
		mv.addObject("languages", languages);
		
		
		
		
		if(!inputcode.equals("")) {
			mv.addObject("note","Note");
			mv.addObject("translatednote", "Translated Note");
		}
		
		
		return mv;
	}
}
