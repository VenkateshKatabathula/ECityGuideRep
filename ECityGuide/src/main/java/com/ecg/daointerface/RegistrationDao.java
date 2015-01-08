package com.ecg.daointerface;
import java.sql.SQLException;
import com.ecg.beans.UserBean;

public interface RegistrationDao 
{
	public abstract int registerUser(UserBean userInfo)
						throws ClassNotFoundException, SQLException;
}
