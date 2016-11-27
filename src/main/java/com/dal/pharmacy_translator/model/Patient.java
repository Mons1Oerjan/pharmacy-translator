package com.dal.pharmacy_translator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int p_id;
	
	private String name;
	private String language;
	private String address;
	private String birthdate;
	private String phonenumber;
	
	public Patient(){}
	
	public Patient(int p_id, String name, String language, String address, String birthdate, String phonenumber,
			String email, String emergencyContactName, String emergencyContactPhoneNumber) {
		this.p_id = p_id;
		this.name = name;
		this.language = language;
		this.address = address;
		this.birthdate = birthdate;
		this.phonenumber = phonenumber;
		this.email = email;
		this.emergencyContactName = emergencyContactName;
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	private String email;
	private String emergencyContactName;
	private String emergencyContactPhoneNumber;

	public int getId() {
		return p_id;
	}

	public void setId(int id) {
		this.p_id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactPhoneNumber() {
		return emergencyContactPhoneNumber;
	}

	public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
		this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	}

	@Override
	public String toString() {
		return "Patient [id=" + p_id + ", name=" + name + ", language=" + language + ", address=" + address
				+ ", birthdate=" + birthdate + ", phonenumber=" + phonenumber + ", email=" + email
				+ ", emergencyContactName=" + emergencyContactName + ", emergencyContactPhoneNumber="
				+ emergencyContactPhoneNumber + "]";
	}
		
}
