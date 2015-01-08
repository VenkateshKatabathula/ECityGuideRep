package com.ecg.test;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;


import com.ecg.beans.AnswerBean;
import com.ecg.daoimplementations.LoginDaoImplementation;
import com.ecg.daoimplementations.ViewAnswerDaoImplementation;
import com.ecg.daoimplementations.ViewQuestionDaoImplementation;

public class ViewAnswerTest {
	 int answerId=23;
	 String answer="It is in Warangal.";
	 int questionId=29;
      int guideId=5063;

	
	@Test
	public void viewAnswer() throws ClassNotFoundException, SQLException
	{
	AnswerBean ab=new AnswerBean();
	ab.setAnswerId(answerId);
     ab.setAnswer(answer);
   ab.setQuestionId(questionId);
   ab.setGuideId(guideId);
    ViewAnswerDaoImplementation ldi=new ViewAnswerDaoImplementation();
    ResultSet rs=null;
    rs=ldi.viewAnswer(ab);
    if(rs.next())
    {
    	assertEquals(rs.getString(2),answer);
    	System.out.println("successful");
	}
	
	}

}
