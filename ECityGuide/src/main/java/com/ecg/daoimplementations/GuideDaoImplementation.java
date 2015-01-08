package com.ecg.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ecg.beans.AnswerBean;
import com.ecg.daointerface.GuideDao;
import com.ecg.util.DBUtility;

public class GuideDaoImplementation implements GuideDao
{
	public Boolean postAnswer(AnswerBean answer) throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("insert into answer_table1  values(answer1_id.nextval,?,?,?)");
        psmt.setString(1, answer.getAnswer());
        psmt.setInt(2, answer.getQuestionId());
        psmt.setInt(3, answer.getGuideId());      
        psmt.executeUpdate();
        int amount=50;
        PreparedStatement pstmt = con.prepareStatement("insert into awards1  values(?,?)");
        pstmt.setInt(1, answer.getGuideId());
        pstmt.setInt(2, amount);
        pstmt.executeUpdate();
        return true;
       
}
}
