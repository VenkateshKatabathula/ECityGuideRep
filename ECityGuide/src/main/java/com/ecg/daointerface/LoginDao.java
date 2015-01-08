package com.ecg.daointerface;

import com.ecg.beans.LoginBean;
import java.sql.SQLException;


public interface LoginDao 
{
public abstract String validateUser(LoginBean login ) 
								throws ClassNotFoundException, SQLException;

}
