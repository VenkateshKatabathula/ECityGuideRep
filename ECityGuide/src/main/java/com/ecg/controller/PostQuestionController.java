package com.ecg.controller;

import com.ecg.beans.QuestionBean;
import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.UserService;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostQuestionController
 */
@WebServlet("/PostQuestionController")
public class PostQuestionController extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html");
       PrintWriter out=response.getWriter();
       try
       {  
       QuestionBean questionInfo=new QuestionBean();
       questionInfo.setQuestion(request.getParameter("question"));
       questionInfo.setCity(request.getParameter("city"));
       UserService userservice=ServiceFactory.getUserService();
       Integer qid=new Integer(-1);
       try
       {
    	qid=userservice.postQuestion(questionInfo);
    	System.out.println(qid);
       }
       catch(ClassNotFoundException ce)
       {
           ce.printStackTrace();
       }
       catch(SQLException se)
       {
           se.printStackTrace( );
           
       }
       request.setAttribute("QuestionId", qid);
       RequestDispatcher rd = request.getRequestDispatcher("questionstatus.jsp");
       System.out.println("Ready to dispatch");
       rd.forward(request, response);
       }
      finally
      {
       out.close();
       }
	}
       public String getServletInfo() {
           return "Short description";
       }
}