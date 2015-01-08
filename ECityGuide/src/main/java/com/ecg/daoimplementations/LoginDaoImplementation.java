package com.ecg.daoimplementations;

import com.ecg.beans.LoginBean;
import com.ecg.daointerface.LoginDao;
import com.ecg.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDaoImplementation implements LoginDao {
public String validateUser(LoginBean login) throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("select role from role_check where UserId1=? and password=?");
        psmt.setInt(1, login.getUserId());
        psmt.setString(2, login.getPassword());
        
        ResultSet rs = psmt.executeQuery();
        
        if(rs.next())
        {
        	System.out.println(rs.getString("ROLE"));
        	return rs.getString("role");
        }
        else
        	return "invalid";
        
}
        


}

