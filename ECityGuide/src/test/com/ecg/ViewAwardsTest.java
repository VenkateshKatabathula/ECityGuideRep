package com.ecg.test;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;


import com.ecg.beans.AwardsBean;
import com.ecg.daoimplementations.ViewAwardsDaoImplementation;



public class ViewAwardsTest {
	 int guideId=5101;
     int amount=50;
	
	@Test
	public void viewAnswer() throws ClassNotFoundException, SQLException
	{
	AwardsBean ab=new AwardsBean();
	
   ab.setGuideId(guideId);
   ab.setAmount(amount);
    ViewAwardsDaoImplementation ldi=new ViewAwardsDaoImplementation();
    ResultSet rs=null;
    rs=ldi.viewAwards(ab);
    if(rs.next())
    {
    	assertEquals(rs.getInt(2),amount);
    	System.out.println("successful");
	}
	
	}

}
