
package com.ecg.controller;

import com.ecg.beans.GuideBean;
import com.ecg.services.GuideRegistrationService;
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
@WebServlet("/GuideRegistrationController") 
public class GuideRegistrationController extends HttpServlet 
{
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    														throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try 
        {
        String guideName = request.getParameter("guideName");
        String password = request.getParameter("password");
        String mobilenum = request.getParameter("mobilenum");
        String city=request.getParameter("city");
        String bankName= request.getParameter("bank");
        String accountNumber=request.getParameter("accountnum");
        String memberShip=request.getParameter("membership");
        int amount =Integer.parseInt(request.getParameter("amount"));
        
        GuideBean  guideInfo = new GuideBean();
        guideInfo.setGuideName(guideName);
        guideInfo.setPassword(password);
        guideInfo.setMobileNumber(mobilenum);
        guideInfo.setCity(city);
        guideInfo.setBankName(bankName);
        guideInfo.setAccountNum(accountNumber);
        guideInfo.setMemberShip(memberShip);
        guideInfo.setAmount(amount);
        GuideRegistrationService guideRegistrationService = ServiceFactory.getGuideRegistrationService();
        Integer regid=new Integer(-1);
        try{
         regid= guideRegistrationService.registerGuide(guideInfo);
        }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
           
        }
        catch(SQLException se){
            se.printStackTrace( );
            
        }
        
        request.setAttribute("registrationId", regid);
        RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
        System.out.println("Ready to dispatch");
        rd.forward(request, response);
        }

         finally { 
            out.close();
        }
    } 

    
   


    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
