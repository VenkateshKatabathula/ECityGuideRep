package com.ecg.test;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.ecg.beans.LoginBean;
import com.ecg.beans.QuestionBean;
import com.ecg.daoimplementations.LoginDaoImplementation;
import com.ecg.daoimplementations.ViewQuestionDaoImplementation;

public class ViewQuestionTest {


	int questionId=29;
	String question="Where is 1000 pillers temple?";
	String city="Warangal";
	@Test
	public void viewQuestion() throws ClassNotFoundException, SQLException
	{
	QuestionBean qb=new QuestionBean();
	qb.setQuestionId(questionId);
	qb.setQuestion(question);
	qb.setCity(city);
    ViewQuestionDaoImplementation ldi=new ViewQuestionDaoImplementation();
    ResultSet rs=null;
    rs=ldi.viewQuestion(qb);
    if(rs.next())
    {
    	assertEquals(rs.getString(2),question);
    	System.out.println("successful");
	}
	
	}

}
