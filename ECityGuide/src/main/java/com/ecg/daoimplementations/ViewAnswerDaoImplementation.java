package com.ecg.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecg.beans.AnswerBean;
import com.ecg.daointerface.ViewAnswerDao;
import com.ecg.util.DBUtility;


public class ViewAnswerDaoImplementation implements ViewAnswerDao
{
	public ResultSet viewAnswer(AnswerBean answerBean) throws ClassNotFoundException, SQLException
	{
		Connection con=DBUtility.getConnection();
		
		PreparedStatement psmt = con.prepareStatement("select * from answer_table1 where question_id=?");
		psmt.setInt(1, answerBean.getQuestionId());
		ResultSet rs = psmt.executeQuery();
		
		return rs;
	}
		
}
