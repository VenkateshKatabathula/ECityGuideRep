package com.ecg.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ecg.beans.QuestionBean;
import com.ecg.daointerface.ViewQuestionDao;
import com.ecg.util.DBUtility;

public class ViewQuestionDaoImplementation implements ViewQuestionDao{
	public ResultSet viewQuestion(QuestionBean questionbean) throws ClassNotFoundException, SQLException{
		
			
			Connection con=DBUtility.getConnection();
			
			
			PreparedStatement pstmt=con.prepareStatement("select * from question_table1 where city=?");
			pstmt.setString(1, questionbean.getCity());
			ResultSet rs=pstmt.executeQuery();
			return rs;
}

	}