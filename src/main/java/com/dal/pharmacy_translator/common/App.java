package com.dal.pharmacy_translator.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dal.pharmacy_translator.dao.PatientDAO;
import com.dal.pharmacy_translator.model.Patient;



public class App {
	public static void main(String[] args){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		//Patient patient1 = (Patient)appContext.getBean("patient");
		PatientDAO patientDAO = (PatientDAO)appContext.getBean("patientDAO");
	
		/*insert*/
		Patient patient1 = new Patient();
		patient1.setName("Test User");
		patient1.setLanguage("Spanish");
		patient1.setAddress("123 Memory Lane");
		patient1.setBirthdate("01/01/1969");
//		patient1.setPhonenumber("902-555-5555");
		patient1.setEmail("TestUser@Test.com");
		patient1.setEmergencyContactName("Emergency User");
		patient1.setEmergencyContactPhoneNumber("902-444-4444");
		patientDAO.add(patient1);
		
		/*select*/
		Patient patient2 = patientDAO.findById(1);
		
		/*update*/
		patient2.setName("Updated Test User");
		patientDAO.update(patient2);
		
		/*delete*/
		patientDAO.delete(patient2);
		
		//System.out.println(patient1.getAddress());
	}
}
