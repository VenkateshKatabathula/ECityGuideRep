package com.ecg.services;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecg.beans.AnswerBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.ViewAnswerDao;
import com.ecg.daointerface.ViewQuestionDao;

public class ViewAnswerService 
{
	public static ResultSet viewAnswer(AnswerBean answerBean) throws ClassNotFoundException, SQLException
	{
		ViewAnswerDao viewAnswerDao=DaoFactory.getViewAnswerDao();
		return viewAnswerDao.viewAnswer(answerBean);
	}
		
}

