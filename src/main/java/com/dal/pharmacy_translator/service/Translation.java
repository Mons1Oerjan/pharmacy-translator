package com.dal.pharmacy_translator.service;

import java.util.List;

import com.dal.pharmacy_translator.model.*;

public interface Translation {
	
	public List<TranslatedNotes> getTranslatedNote(Code c, Language l);
	
}
