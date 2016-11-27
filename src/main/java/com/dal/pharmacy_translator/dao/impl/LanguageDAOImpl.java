package com.dal.pharmacy_translator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dal.pharmacy_translator.dao.LanguageDAO;
import com.dal.pharmacy_translator.model.Language;
import com.dal.pharmacy_translator.model.Patient;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository("languageDao")
public class LanguageDAOImpl extends CustomHibernateDaoSupport implements LanguageDAO {
	
	private SessionFactory sessionFactory;

	public LanguageDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
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
	
	@Override
	@Transactional
	public List<Language> getList() {
		@SuppressWarnings("unchecked")
		List<Language> listUser = (List<Language>) sessionFactory.getCurrentSession()
				.createCriteria(Language.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}
	
}
