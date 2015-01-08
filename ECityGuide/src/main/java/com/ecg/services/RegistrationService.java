package com.ecg.services;

import com.ecg.beans.UserBean;
import com.ecg.daofactory.DaoFactory;
import java.sql.SQLException;
import com.ecg.daointerface.RegistrationDao;


public class RegistrationService {
	public int registerUser(UserBean userInfo) throws ClassNotFoundException, SQLException{
		 RegistrationDao registrationDao = DaoFactory.getRegistrationDao();
	        return registrationDao.registerUser(userInfo);
		
				
	}

}