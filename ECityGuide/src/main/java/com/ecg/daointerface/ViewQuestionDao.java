package com.ecg.daointerface;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ecg.beans.QuestionBean;

public interface ViewQuestionDao {
	public abstract ResultSet viewQuestion(QuestionBean questionBean)
			throws ClassNotFoundException, SQLException;
}
