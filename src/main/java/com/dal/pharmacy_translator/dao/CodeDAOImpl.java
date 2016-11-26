package com.dal.pharmacy_translator.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.dal.pharmacy_translator.model.Code;

@Repository
public class CodeDAOImpl implements CodeDAO {
	
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	
	public void addNewCode(Code c){
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(c);
		System.out.println("added code " + c + "to the DB.");
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Code> listCodes(){
		Session session = this.sessionFactory.getCurrentSession();
		List<Code> codes = session.createQuery("from Code").list();
		for (Code c : codes){
			System.out.println("codes: "+c);
		}
		return codes;
	}
	
	
}
