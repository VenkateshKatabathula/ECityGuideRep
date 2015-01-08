package com.ecg.daointerface;

import java.sql.SQLException;

import com.ecg.beans.AnswerBean;

public interface GuideDao 
{
	public abstract Boolean postAnswer(AnswerBean answerBean)
								throws ClassNotFoundException, SQLException;
}
