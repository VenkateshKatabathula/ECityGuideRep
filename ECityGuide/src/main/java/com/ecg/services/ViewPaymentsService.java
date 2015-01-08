package com.ecg.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecg.beans.AwardsBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.ViewAwardsDao;
import com.ecg.daointerface.ViewPaymentsDao;

public class ViewPaymentsService {

	public static ResultSet viewPayments() throws ClassNotFoundException, SQLException
	{
		ViewPaymentsDao paymentsDao=DaoFactory.getPaymentsDao();
		return paymentsDao.viewPayments();
	}
	public static ResultSet viewPayments1() throws ClassNotFoundException, SQLException
	{
		ViewPaymentsDao paymentsDao=DaoFactory.getPaymentsDao();
		return paymentsDao.viewPayments1();
	}
}




