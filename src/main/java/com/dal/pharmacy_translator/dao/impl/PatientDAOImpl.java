package com.dal.pharmacy_translator.dao.impl;

import com.dal.pharmacy_translator.dao.PatientDAO;
import com.dal.pharmacy_translator.model.Patient;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;


@Repository("patientDao")
public class PatientDAOImpl extends CustomHibernateDaoSupport implements PatientDAO {

	private SessionFactory sessionFactory;

	public PatientDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Patient> getList() {
		@SuppressWarnings("unchecked")
		List<Patient> listUser = (List<Patient>) sessionFactory.getCurrentSession()
				.createCriteria(Patient.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listUser;
	}

	@Override
	public void add(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Patient findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
