package com.ecg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.ecg.beans.QuestionBean;
import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.ViewQuestionService;



@WebServlet("/ViewQuestionController")
public class ViewQuestionController extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	ResultSet result=null;;
	try
	{
      QuestionBean questionBean=new QuestionBean();
      questionBean.setCity(request.getParameter("city"));
      System.out.println("ready to dispatch");
      ViewQuestionService viewQuestionService=ServiceFactory.getViewQuestionService();
	  try
	  {
		result=viewQuestionService.viewQuestion(questionBean); 
	  }
	 catch(ClassNotFoundException ce)
	 {
	    ce.printStackTrace();
	}
       catch(SQLException se)
       {
            se.printStackTrace();
       }
          if(result==null)
          {
        	  out.println("There are no questions available");
          }
          else
          {
        	 HttpSession session=request.getSession();
        	 session.setAttribute("Result", result);
        	RequestDispatcher rd= request.getRequestDispatcher("Questions.jsp");
        	 rd.forward(request,response);
          }
	}
	
	finally
	{
		out.close();
	}
	}
	
        	 
          }
	
	