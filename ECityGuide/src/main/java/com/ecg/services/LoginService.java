package com.ecg.services;

import com.ecg.beans.LoginBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.LoginDao;
import java.sql.SQLException;



public class LoginService {
public String validateUser(LoginBean login) throws ClassNotFoundException, SQLException{
        LoginDao loginDao = DaoFactory.getLoginDao();
        return loginDao.validateUser(login);
    } 


}

