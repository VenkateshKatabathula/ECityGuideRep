package com.ecg.test;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.ecg.beans.AwardsBean;
import com.ecg.beans.GuideBean;
import com.ecg.daoimplementations.ViewAwardsDaoImplementation;
import com.ecg.daoimplementations.ViewPaymentsDaoImplementation;

public class ViewPaymentsTest {
	int guideId=5061;
	int amount=0;
     @Test
     public void viewPayments1() throws ClassNotFoundException, SQLException
     {
    	 
    	    ViewPaymentsDaoImplementation ldi=new ViewPaymentsDaoImplementation();
    	    ResultSet rs=null;
    	    rs=ldi.viewPayments1();
    	    while(rs.next())
    	    {
    	    if(rs.getInt(1)==guideId)	
    	    	break;
    		}
    	    assertEquals(amount,rs.getInt(2));
    		} 
     }




