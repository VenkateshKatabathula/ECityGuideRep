package com.ecg.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecg.beans.QuestionBean;
import com.ecg.daointerface.UserDao;
import com.ecg.util.DBUtility;

public class UserDaoImplementation implements UserDao{
 public int postQuestion(QuestionBean questionInfo)throws ClassNotFoundException,SQLException
 {
	Connection con=DBUtility.getConnection();
	ResultSet rs=null;
	Statement stmt=null;
	int questionId=0;
	PreparedStatement psmt=con.prepareStatement("insert into question_table1 values(question1_id.nextval,?,?,sysdate)" );
	psmt.setString(1,questionInfo.getQuestion());
	psmt.setString(2,questionInfo.getCity());
	int row=0;
	row=psmt.executeUpdate();
	System.out.println(row);
	stmt=con.createStatement();
	rs=stmt.executeQuery("select question1_id.currval as qid from dual");
	 
	if(rs.next())
        questionId=rs.getInt("qid");
        return questionId;
}
}
	 


