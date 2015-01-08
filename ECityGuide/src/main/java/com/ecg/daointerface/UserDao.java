package com.ecg.daointerface;

import java.sql.SQLException;

import com.ecg.beans.QuestionBean;

public interface UserDao {
	public abstract int postQuestion(QuestionBean questionInfo)
			throws ClassNotFoundException, SQLException;
}
