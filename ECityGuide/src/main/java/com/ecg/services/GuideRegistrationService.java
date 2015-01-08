package com.ecg.services;

import com.ecg.beans.GuideBean;
import com.ecg.daofactory.DaoFactory;
import java.sql.SQLException;


import com.ecg.daointerface.GuideRegistrationDao;


public class GuideRegistrationService {
	
	public int registerGuide(GuideBean guideInfo) throws ClassNotFoundException, SQLException{
		 GuideRegistrationDao guideRegistrationDao = DaoFactory.getGuideRegistrationDao();
	        return guideRegistrationDao.registerGuide(guideInfo);			
	}

}
