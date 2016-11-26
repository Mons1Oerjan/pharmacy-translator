package com.dal.pharmacy_translator.model;

public class TranslatedNotes {
	public int Id;
	public int LanguageId;
	public int CodeId;
	public String Notes;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getLanguageId() {
		return LanguageId;
	}
	public void setLanguageId(int languageId) {
		LanguageId = languageId;
	}
	public int getCodeId() {
		return CodeId;
	}
	public void setCodeId(int codeId) {
		CodeId = codeId;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
}
