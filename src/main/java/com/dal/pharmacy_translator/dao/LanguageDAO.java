package com.dal.pharmacy_translator.dao;

import java.util.List;

import com.dal.pharmacy_translator.model.Language;

public interface LanguageDAO {
	public void addLanguage(Language language);
	public List<Language> listLanguages();
}
