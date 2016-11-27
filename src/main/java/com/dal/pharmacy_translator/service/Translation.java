package com.dal.pharmacy_translator.service;

import java.util.List;

public interface Translation {
	
	public List<String> getTranslatedNote(String code, String language);
	
}
