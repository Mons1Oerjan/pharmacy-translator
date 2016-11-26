package com.dal.pharmacy_translator.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dal.pharmacy_translator.model.Code;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository
public class CodeDAOImpl extends CustomHibernateDaoSupport implements CodeDAO {

	public void addCode(Code code) {
		getHibernateTemplate().save(code);
	}


	public void updateCode(Code code) {
		getHibernateTemplate().update(code);
	}


	public void deleteCode(Code code) {
		getHibernateTemplate().delete(code);
	}


	public Code findById(int id) {
		List l = getHibernateTemplate().find("from Code where c_id=?", id);
		return (Code)l.get(0);
	}
	
	
}
