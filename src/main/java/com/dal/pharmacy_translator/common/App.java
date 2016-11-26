package com.dal.pharmacy_translator.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dal.pharmacy_translator.model.Patient;



public class App {
	public static void main(String[] args){
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
		Patient patient1 = (Patient)appContext.getBean("patient");
		
		System.out.println(patient1.getAddress());
	}
}
