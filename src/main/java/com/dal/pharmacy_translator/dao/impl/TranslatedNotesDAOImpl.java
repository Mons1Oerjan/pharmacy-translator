package com.dal.pharmacy_translator.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dal.pharmacy_translator.dao.TranslatedNotesDAO;
import com.dal.pharmacy_translator.model.Code;
import com.dal.pharmacy_translator.model.TranslatedNotes;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository
public class TranslatedNotesDAOImpl extends CustomHibernateDaoSupport implements TranslatedNotesDAO {

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
		List l = getHibernateTemplate().find("from TranslatedNotes where tn_id=?", id);
		return (TranslatedNotes)l.get(0);
	}

}
