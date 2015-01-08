package com.ecg.daoimplementations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.PrintWriter;
import com.ecg.beans.UserBean;
import com.ecg.daointerface.RegistrationDao;
import com.ecg.util.DBUtility;

public class RegistrationDaoImplementation  implements RegistrationDao{
	public int registerUser( UserBean userInfo) throws ClassNotFoundException, SQLException{
		int row=0;
        Connection con = DBUtility.getConnection();
        String role="user";
        ResultSet rs=null;
        Statement stmt=null;
        int registrationId=0;
        if (userInfo.getMemberShip().equals("FREE"))
        {
        	int amount=0;
        PreparedStatement psmt = con.prepareStatement("insert into user_table1 values(user1_id.nextval,?,?,?,?,?,?,?,sysdate,sysdate+1,?)");
        psmt.setString(1, userInfo.getUserName());
        psmt.setString(2, userInfo.getPassword());
        psmt.setString(3, userInfo.getMobileNumber());
        psmt.setString(4, userInfo.getCity());
        psmt.setString(5, userInfo.getBankName());
        psmt.setString(6, userInfo.getAccountNum());
        psmt.setString(7, userInfo.getMemberShip());
        psmt.setInt(8, amount);
        row = psmt.executeUpdate();
        PreparedStatement psmt1=con.prepareStatement("insert into role_check values(?,user1_id.currval,?)");
       
        psmt1.setString(1, role);
        psmt1.setString(2,userInfo.getPassword());
        System.out.println(userInfo.getPassword());
       
        psmt1.executeUpdate();
        }
        else 
        {
        	PreparedStatement psmt = con.prepareStatement("insert into user_table1 values(user1_id.nextval,?,?,?,?,?,?,?,sysdate,add_months(sysdate,1),?)");
            psmt.setString(1, userInfo.getUserName());
            psmt.setString(2, userInfo.getPassword());
            psmt.setString(3, userInfo.getMobileNumber());
            psmt.setString(4, userInfo.getCity());
            psmt.setString(5, userInfo.getBankName());
            psmt.setString(6, userInfo.getAccountNum());
            psmt.setString(7, userInfo.getMemberShip());
            psmt.setInt(8, userInfo.getAmount());
            row = psmt.executeUpdate();
            PreparedStatement psmt1=con.prepareStatement("insert into role_check values(?,user1_id.currval,?)");
            psmt1.setString(1, role);
            psmt1.setString(2,userInfo.getPassword());  
           psmt1.executeUpdate();
           
        }
        stmt=con.createStatement();
        rs=stmt.executeQuery("select user1_id.currval as regid from dual");
        if(rs.next())
        registrationId=rs.getInt("regid");
        return registrationId;
	
    }


}
