package com.ecg.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecg.beans.AnswerBean;
import com.ecg.beans.AwardsBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.ViewAnswerDao;
import com.ecg.daointerface.ViewAwardsDao;

public class ViewAwardsService 
{
	public static ResultSet viewAward(AwardsBean awardBean) throws ClassNotFoundException, SQLException
	{
		ViewAwardsDao viewAwardDao=DaoFactory.getAwardDao();
		return viewAwardDao.viewAwards(awardBean);
	}
}
