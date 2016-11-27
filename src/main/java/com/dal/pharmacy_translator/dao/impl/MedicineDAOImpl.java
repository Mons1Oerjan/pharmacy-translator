package com.dal.pharmacy_translator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dal.pharmacy_translator.dao.MedicineDAO;
import com.dal.pharmacy_translator.model.Medicine;
import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository("medicineDao")
public class MedicineDAOImpl extends CustomHibernateDaoSupport implements MedicineDAO {

	private SessionFactory sessionFactory;

	public MedicineDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
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
	
	@Override
	@Transactional
	public List<Medicine> getList() {
		@SuppressWarnings("unchecked")
		List<Medicine> listUser = (List<Medicine>) sessionFactory.getCurrentSession()
				.createCriteria(Medicine.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}

}
