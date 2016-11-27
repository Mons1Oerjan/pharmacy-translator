package com.dal.pharmacy_translator.dao;

import java.util.List;

import com.dal.pharmacy_translator.model.TranslatedNotes;

public interface TranslatedNotesDAO {
	void save(TranslatedNotes tn);
	
	void update(TranslatedNotes tn);
	
	void delete(TranslatedNotes tn);
	
	public TranslatedNotes findById(int id);
	
	public List<TranslatedNotes> getList();
}
