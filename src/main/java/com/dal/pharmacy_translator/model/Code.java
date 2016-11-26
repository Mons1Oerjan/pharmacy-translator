package com.dal.pharmacy_translator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Code")
public class Code {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int c_id;
	
	private String code;
	
	private String definition;
	
	private int fk_medicineId;

	

	public int getId() {
		return c_id;
	}

	public void setId(int id) {
		this.c_id = id;
	}
	public int getFk_medicineId() {
		return fk_medicineId;
	}

	public void setFk_medicineId(int fk_medicineId) {
		this.fk_medicineId = fk_medicineId;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	@Override
	public String toString() {
		return "Code [c_id=" + c_id + ", code=" + code + ", definition=" + definition + ", fk_medicineId="
				+ fk_medicineId + "]";
	}

	
}
