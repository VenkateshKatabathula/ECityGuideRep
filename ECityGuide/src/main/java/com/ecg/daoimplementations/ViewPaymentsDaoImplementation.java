package com.ecg.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecg.beans.GuideBean;
import com.ecg.beans.LoginBean;
import com.ecg.beans.UserBean;
import com.ecg.daointerface.ViewPaymentsDao;
import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.LoginService;
import com.ecg.util.DBUtility;

public class ViewPaymentsDaoImplementation implements ViewPaymentsDao
{
	public ResultSet viewPayments() throws ClassNotFoundException, SQLException
	{
		
       Connection con = DBUtility.getConnection();
        
      Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select userId,amount from user_table1");
        return rs;	
     }
	
	public ResultSet viewPayments1() throws ClassNotFoundException, SQLException
	{
		
       Connection con = DBUtility.getConnection();
        
      Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select guideId,amount from guide_table1");
        return rs;	
     }
}


