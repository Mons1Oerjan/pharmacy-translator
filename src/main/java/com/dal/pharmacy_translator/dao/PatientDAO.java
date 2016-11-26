package com.dal.pharmacy_translator.dao;

import com.dal.pharmacy_translator.model.Patient;

public interface PatientDAO {

	void add(Patient patient);
	void update(Patient patient);
	void delete(Patient patient);
	
	Patient findById(int id);
}
