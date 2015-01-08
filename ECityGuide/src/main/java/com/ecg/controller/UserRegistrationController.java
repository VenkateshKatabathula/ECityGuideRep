/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ecg.controller;

import com.ecg.beans.UserBean;
import com.ecg.services.RegistrationService;
import com.ecg.servicefactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/UserRegistrationController") 
public class UserRegistrationController extends HttpServlet {
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
        String uName = request.getParameter("userName");
        String password = request.getParameter("password");
        String mobilenum = request.getParameter("mobilenum");
        String city=request.getParameter("city");
        String bankName= request.getParameter("bank");
        String accountNumber=request.getParameter("accountnum");
        String memberShip=request.getParameter("membership");
        int amount =Integer.parseInt(request.getParameter("amount"));
        
       
        UserBean  userInfo = new UserBean();
        
        userInfo.setUserName(uName);
        userInfo.setPassword(password);
        userInfo.setMobileNumber(mobilenum);
        userInfo.setCity(city);
        userInfo.setBankName(bankName);
        userInfo.setAccountNum(accountNumber);
        userInfo.setMemberShip(memberShip);
        userInfo.setAmount(amount);
        RegistrationService registrationService = ServiceFactory.getRegistrationService();
        Integer regid=new Integer(-1);

        try
        {
         regid = registrationService.registerUser(userInfo);
         System.out.println(regid);
        }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            
        }
        catch(SQLException se){
            se.printStackTrace( );
            
        }
        
        request.setAttribute("registrationId", regid);
        if(regid!=0){
        	RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
        	rd.forward(request, response);
        }
        
        
       
        }

         finally { 
            out.close();
        }
    } 

    
   

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
