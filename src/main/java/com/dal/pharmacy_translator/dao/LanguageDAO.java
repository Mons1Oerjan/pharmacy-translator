package com.dal.pharmacy_translator.dao;

import java.util.List;

import com.dal.pharmacy_translator.model.Language;

public interface LanguageDAO {
	public void addLanguage(Language language);
	public void updateLanguage(Language language);
	public void deleteLanguage(Language language);
	public Language findById(int id);
	public List<Language> getList();
}
