package com.ecg.daoimplementations;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ecg.beans.GuideBean;
import com.ecg.daointerface.GuideRegistrationDao;
import com.ecg.util.DBUtility;

public class GuideRegistrationDaoImplementation  implements GuideRegistrationDao{
	public int registerGuide( GuideBean guideInfo) throws ClassNotFoundException, SQLException{
		
        Connection con = DBUtility.getConnection();
        
        
        ResultSet rs=null;
        Statement stmt=null;
        int registrationId=0;
        
        PreparedStatement psmt = con.prepareStatement("insert into guide_table1 values(guide1_id.nextval,?,?,?,?,?,?,?,sysdate,add_months(sysdate,1),?)");
        psmt.setString(1, guideInfo.getGuideName());
        psmt.setString(2, guideInfo.getPassword());
        psmt.setString(3, guideInfo.getMobileNumber());
        psmt.setString(4, guideInfo.getCity());
        psmt.setString(5, guideInfo.getBankName());
        psmt.setString(6, guideInfo.getAccountNum());
        psmt.setString(7, guideInfo.getMemberShip());
        psmt.setInt(8, guideInfo.getAmount());
        psmt.executeUpdate();
        PreparedStatement psmt1=con.prepareStatement("insert into role_check values('guide',guide1_id.currval,?)");
        psmt1.setString(1,guideInfo.getPassword());  
        psmt1.executeUpdate();
        stmt=con.createStatement();
        rs=stmt.executeQuery("select guide1_id.currval as regid from dual");
        if(rs.next())
        registrationId=rs.getInt("regid");
        return registrationId;
       
        
    }


}
