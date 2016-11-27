package com.dal.pharmacy_translator.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Language")
public class Language {
	
	@Id
	@Column(name="l_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int l_id;
	
	private String name;

	public Language(){}

	public Language(int l_id, String name) {
		this.l_id = l_id;
		this.name = name;
	}

	public int getId() {
		return l_id;
	}

	public void setId(int id) {
		this.l_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Language [id=" + l_id + ", language=" + name + "]";
	}
	
	
}
