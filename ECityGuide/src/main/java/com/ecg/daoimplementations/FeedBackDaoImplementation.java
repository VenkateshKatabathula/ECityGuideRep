package com.ecg.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ecg.beans.FeedbackBean;
import com.ecg.daointerface.FeedBackDao;
import com.ecg.util.DBUtility;

public class FeedBackDaoImplementation implements FeedBackDao{
  
	public boolean postFeedback(FeedbackBean feedBack)throws ClassNotFoundException,SQLException
	{
		
	 Connection con=DBUtility.getConnection();
	 PreparedStatement pstmt=con.prepareStatement("insert into feedback_table1 values(?,?,?)");
	 pstmt.setString(1, feedBack.getGuideId());
	 pstmt.setInt(2, feedBack.getQuestionId());
	 pstmt.setString(3, feedBack.getRating());
	 pstmt.executeUpdate();
	 	 
		 return true;
	
		
	}

	
	
}
