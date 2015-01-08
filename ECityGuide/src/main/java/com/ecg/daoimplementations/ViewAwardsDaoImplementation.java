package com.ecg.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecg.beans.AnswerBean;
import com.ecg.beans.AwardsBean;
import com.ecg.daointerface.ViewAwardsDao;
import com.ecg.util.DBUtility;

public class ViewAwardsDaoImplementation implements ViewAwardsDao
{
	public ResultSet viewAwards(AwardsBean awardBean) throws ClassNotFoundException, SQLException
	{
		Connection con=DBUtility.getConnection();
		
		PreparedStatement psmt = con.prepareStatement("select * from awards1 where guideId=?");
		psmt.setInt(1, awardBean.getGuideId());
		ResultSet rs = psmt.executeQuery();
		
		return rs;
	}

	
		
}
