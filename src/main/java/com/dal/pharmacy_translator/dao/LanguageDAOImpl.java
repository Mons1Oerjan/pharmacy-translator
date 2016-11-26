package com.dal.pharmacy_translator.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dal.pharmacy_translator.model.Language;

@Repository
public class LanguageDAOImpl implements LanguageDAO {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	public void addLanguage(Language l){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(l);
		System.out.println("added language " + l + "to the DB.");
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Language> listLanguages(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Language> languages = session.createQuery("from Language").list();
		for (Language l : languages){
			System.out.println("languages: "+l);
		}
		return languages;
	}
	
}
