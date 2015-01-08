package com.ecg.daointerface;
import java.sql.SQLException;
import com.ecg.beans.GuideBean;

public interface GuideRegistrationDao {
	
	public abstract int registerGuide(GuideBean guideInfo)throws ClassNotFoundException, SQLException;
	
	
}
