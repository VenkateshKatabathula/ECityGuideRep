package com.ecg.daointerface;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecg.beans.AnswerBean;

public interface ViewAnswerDao 
{
	public abstract ResultSet viewAnswer(AnswerBean answerBean) 
									throws ClassNotFoundException, SQLException;
}
