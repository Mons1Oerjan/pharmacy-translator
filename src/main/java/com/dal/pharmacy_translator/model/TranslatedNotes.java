package com.dal.pharmacy_translator.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TranslatedNotes")
public class TranslatedNotes {


	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int tn_id;
	
	private String note;
	
	private int fk_languageId;
	
	private int fk_codeId;

	public int getTn_id() {
		return tn_id;
	}

	public void setTn_id(int tn_id) {
		this.tn_id = tn_id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getFk_languageId() {
		return fk_languageId;
	}

	public void setFk_languageId(int fk_languageId) {
		this.fk_languageId = fk_languageId;
	}

	public int getFk_codeId() {
		return fk_codeId;
	}

	public void setFk_codeId(int fk_codeId) {
		this.fk_codeId = fk_codeId;
	}

	@Override
	public String toString() {
		return "TranslatedNotes [tn_id=" + tn_id + ", note=" + note + ", fk_languageId=" + fk_languageId
				+ ", fk_codeId=" + fk_codeId + "]";
	}
	
}
