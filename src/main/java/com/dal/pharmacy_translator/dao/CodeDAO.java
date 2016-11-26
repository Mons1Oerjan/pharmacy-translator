package com.dal.pharmacy_translator.dao;

import java.util.List;

import com.dal.pharmacy_translator.model.Code;

public interface CodeDAO {
	public void addCode(Code code);
	public void updateCode(Code code);
	public void deleteCode(Code code);
	public Code findById(int id);
}
