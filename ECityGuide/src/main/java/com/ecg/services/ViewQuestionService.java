package com.ecg.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.ecg.beans.QuestionBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.ViewQuestionDao;

public class ViewQuestionService {
	public ResultSet viewQuestion(QuestionBean questionBean)throws ClassNotFoundException,SQLException
	{
		ViewQuestionDao viewQuestionDao=DaoFactory.getViewQuestionDao();
		return viewQuestionDao.viewQuestion(questionBean);
	}
	}

