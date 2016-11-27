package com.dal.pharmacy_translator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dal.pharmacy_translator.dao.TranslatedNotesDAO;
import com.dal.pharmacy_translator.model.TranslatedNotes;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository("translatednotesDao")
public class TranslatedNotesDAOImpl extends CustomHibernateDaoSupport implements TranslatedNotesDAO {

	private SessionFactory sessionFactory;

	public TranslatedNotesDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(TranslatedNotes tn) {
		getHibernateTemplate().save(tn);
	}

	public void update(TranslatedNotes tn) {
		getHibernateTemplate().update(tn);
	}

	public void delete(TranslatedNotes tn) {
		getHibernateTemplate().delete(tn);
	}

	public TranslatedNotes findById(int id) {
		List<Object> l = getHibernateTemplate().find("from TranslatedNotes where tn_id=?", id);
		return (TranslatedNotes)l.get(0);
	}
	
	@Override
	@Transactional
	public List<TranslatedNotes> getList() {
		@SuppressWarnings("unchecked")
		List<TranslatedNotes> listUser = (List<TranslatedNotes>) sessionFactory.getCurrentSession()
				.createCriteria(TranslatedNotes.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}
	

}
