package com.ecg.services;

import java.sql.SQLException;

import com.ecg.beans.AnswerBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.GuideDao;

public class GuideService 
{
	public static Boolean postAnswer(AnswerBean answerBean)throws ClassNotFoundException,SQLException
	{
		GuideDao guideDao = DaoFactory.getGuideDao();
        return guideDao.postAnswer(answerBean);
	}
}
