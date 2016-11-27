package com.dal.pharmacy_translator.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dal.pharmacy_translator.dao.MedicineDAO;
import com.dal.pharmacy_translator.model.Medicine;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository
public class MedicineDAOImpl extends CustomHibernateDaoSupport implements MedicineDAO {

	public void save(Medicine m) {
		getHibernateTemplate().save(m);
	}

	public void update(Medicine m) {
		getHibernateTemplate().update(m);
	}

	public void delete(Medicine m) {
		getHibernateTemplate().delete(m);
	}

	public Medicine findById(int id) {
		List<Object> l = getHibernateTemplate().find("from Medicine where m_id=?", id);
		return (Medicine)l.get(0);
	}

}
