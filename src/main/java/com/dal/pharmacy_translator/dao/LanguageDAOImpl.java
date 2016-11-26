package com.dal.pharmacy_translator.dao;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.dal.pharmacy_translator.model.Language;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository
public class LanguageDAOImpl extends CustomHibernateDaoSupport implements LanguageDAO {
	
	public void addLanguage(Language language){
		getHibernateTemplate().save(language);
	}
	
	public void updateLanguage(Language language) {
		getHibernateTemplate().update(language);
		
	}

	public void deleteLanguage(Language language) {
		getHibernateTemplate().delete(language);
		
	}

	public Language findById(int id){
		List l = getHibernateTemplate().find("from Language where l_id=?", id);
		return (Language)l.get(0);
		
	}
	
}
