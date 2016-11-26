package com.dal.pharmacy_translator.dao;

import com.dal.pharmacy_translator.model.Patient;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.dal.pharmacy_translator.util.CustomHibernateDaoSupport;

@Repository("patientDao")
public class PatientDAOImpl extends CustomHibernateDaoSupport implements PatientDAO {

	public void add(Patient patient) {
		getHibernateTemplate().save(patient);
	}

	public void update(Patient patient) {
		getHibernateTemplate().update(patient);
	}

	public void delete(Patient patient) {
		getHibernateTemplate().delete(patient);
		
	}

	public Patient findById(int id) {
		List list = getHibernateTemplate().find("from Patients where p_id=?",id);
		return (Patient)list.get(0);
	}
	
}
