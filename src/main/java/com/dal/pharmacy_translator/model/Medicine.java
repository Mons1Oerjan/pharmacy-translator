package com.dal.pharmacy_translator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Medicine")
public class Medicine {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int m_id;
	
	private String name;
	
	private int fk_patientId;
	
	public Medicine(){}

	public Medicine(int m_id, String name, int fk_patientId) {
		this.m_id = m_id;
		this.name = name;
		this.fk_patientId = fk_patientId;
	}

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFk_patientId() {
		return fk_patientId;
	}

	public void setFk_patientId(int fk_patientId) {
		this.fk_patientId = fk_patientId;
	}

	@Override
	public String toString() {
		return "Medicine [m_id=" + m_id + ", name=" + name + ", fk_patientId=" + fk_patientId + "]";
	}
	
	
	
	
}
