package com.dal.pharmacy_translator.dao;

import java.util.List;

import com.dal.pharmacy_translator.model.Medicine;

public interface MedicineDAO {

	void save(Medicine m);
	
	void update(Medicine m);
	
	void delete(Medicine m);
	
	public Medicine findById(int id);
	
	public List<Medicine> getList();
}
