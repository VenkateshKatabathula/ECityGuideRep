package com.ecg.test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.ecg.beans.LoginBean;
import com.ecg.daoimplementations.LoginDaoImplementation;

public class LoginTest 
{
	int userId=1602;
	String password="sita1234";
	@Test
	public void validateUser() throws ClassNotFoundException, SQLException
	{
	LoginBean lb=new LoginBean();
	lb.setUserId(userId);
	lb.setPassword(password);
    LoginDaoImplementation ldi=new LoginDaoImplementation();
    String role=ldi.validateUser(lb);
	assertEquals("user",role);
	System.out.println("successful");
	}
	}

   

