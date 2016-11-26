package com.dal.pharmacy_translator.dao;

import java.util.List;

import com.dal.pharmacy_translator.model.Code;

public interface CodeDAO {
	public void addNewCode(Code code);
	public List<Code> listCodes();
}
