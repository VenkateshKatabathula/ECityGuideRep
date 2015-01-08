package com.ecg.daointerface;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ecg.beans.AwardsBean;

public interface ViewAwardsDao 
{
	public abstract ResultSet viewAwards(AwardsBean awardBean) 
													throws ClassNotFoundException, SQLException;
}
