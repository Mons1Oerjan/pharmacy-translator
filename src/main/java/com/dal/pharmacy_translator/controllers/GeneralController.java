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
		Medicine m2 = new Medicine(2, "Tablet", 1);
		Medicine m3 = new Medicine(3, "Eye Drops",2);
		Medicine m4 = new Medicine(4,"Capsules",2);
		medicines.add(m1);
		medicines.add(m2);
		medicines.add(m3);
		medicines.add(m4);
		
		List<TranslatedNotes> notes = translatednotesDao.getList();
		TranslatedNotes tn1 = new TranslatedNotes(1, "Toma una tableta al día", 1, 1); //id, translation, foreign key language, foreign key code
		TranslatedNotes tn2 = new TranslatedNotes(2, "تناول قرص واحد يوميا", 4, 1); //id, translation, foreign key language, foreign key code
		TranslatedNotes tn3 = new TranslatedNotes(3, "Ta en tablett om dagen", 3, 1);
		TranslatedNotes tn4 = new TranslatedNotes(3, "Isang tableta araw-araw", 5, 1);
		notes.add(tn1);
		notes.add(tn2);
		notes.add(tn3);
		notes.add(tn4);
				
		List<Code> codes = codeDao.getList();
		Code c1 = new Code(1, "T 1 T 1D", "Take 1 tablet daily", 1); //id (unique), code, definition, foreign key to medicine
		Code c2 = new Code(2, "T 1 T BID", "Take 1 tablet twice daily", 1);
		Code c3 = new Code(3, "T 2 CAP HS", "Take 1 tablet twice daily", 1);
		Code c4 = new Code(4, "INH 2 PUFFS BID", "Take 1 tablet twice daily", 1);
		Code c5 = new Code(5, "INS 1 GTT IN OU", "Take 1 tablet twice daily", 1);
		Code c6 = new Code(6, "T 1 CAP Q8H", "Take 1 tablet twice daily", 1);
		codes.add(c1);
		codes.add(c2);
		codes.add(c3);
		codes.add(c4);
		codes.add(c5);
		codes.add(c6);
		
		//add to ModelAndView:
		mv.addObject("patients", patients);
		mv.addObject("languages", languages);
		mv.addObject("codes", codes);
		mv.addObject("translatednotes", notes);
		mv.addObject("medicines", medicines);
		
		if(!inputcode.equals("")) {
			mv.addObject("note", c1.getDefinition());
			mv.addObject("translatednote", tn1.getNote());
		}
		
		
		return mv;
	}
}
