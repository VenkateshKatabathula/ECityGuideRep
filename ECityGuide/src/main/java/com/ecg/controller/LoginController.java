package com.ecg.controller;

import com.ecg.beans.LoginBean;
import com.ecg.services.LoginService;
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
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException,NumberFormatException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
        int userId =Integer.parseInt(request.getParameter("userId"));
        String password = request.getParameter("password");
        String role="";
        LoginBean loginInfo = new LoginBean( );
        loginInfo.setUserId(userId);
        loginInfo.setPassword(password);
        LoginService loginService = ServiceFactory.getLoginService();
        HttpSession session=request.getSession();  
        session.setAttribute("uid",userId);  
      
        try{
         role = loginService.validateUser(loginInfo);
         if(role.equalsIgnoreCase("user"))
         {
        	 
        	RequestDispatcher rd = request.getRequestDispatcher("userhome.jsp");
         	rd.forward(request, response);
         }
         else if(role.equalsIgnoreCase("guide"))
         {
        	role=loginService.validateUser(loginInfo); 
        	RequestDispatcher rd = request.getRequestDispatcher("guidehome.jsp");
            rd.forward(request, response);
        }
        else if(role.equalsIgnoreCase("admin"))
        {
        	role=loginService.validateUser(loginInfo); 
        	RequestDispatcher rd = request.getRequestDispatcher("Adminhome.jsp");
            rd.forward(request, response);
        }
        	else
        	{
        		out.println("Invalid login");
         }
        }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
        }
        catch(SQLException se){
            se.printStackTrace( );
        }
        catch(NumberFormatException e){
        	out.println("Enter Valid Credentials");
        }
        
       
       }
       
         finally { 
            out.close();
        }
    } 
}
    