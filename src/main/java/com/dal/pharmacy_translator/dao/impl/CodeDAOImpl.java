package com.dal.pharmacy_translator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dal.pharmacy_translator.dao.CodeDAO;
import com.dal.pharmacy_translator.model.Code;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository("codeDao")
public class CodeDAOImpl extends CustomHibernateDaoSupport implements CodeDAO {

	private SessionFactory sessionFactory;

	public CodeDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
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
		List<Object> l = getHibernateTemplate().find("from Code where c_id=?", id);
		return (Code)l.get(0);
	}
	
	@Override
	@Transactional
	public List<Code> getList() {
		@SuppressWarnings("unchecked")
		List<Code> listUser = (List<Code>) sessionFactory.getCurrentSession()
				.createCriteria(Code.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}
	
}
