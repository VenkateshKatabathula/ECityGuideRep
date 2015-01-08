package com.ecg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecg.beans.AnswerBean;
import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.ViewAnswerService;

/**
 * Servlet implementation class ViewAnswerController
 */
@WebServlet("/ViewAnswerController")
public class ViewAnswerController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ResultSet result = null;
		try
		{
			AnswerBean answer = new AnswerBean();
			answer.setQuestionId(Integer.parseInt(request.getParameter("questionId")));
			
			ViewAnswerService viewAnswerService = ServiceFactory.getAnswerService();
			System.out.println("Ready to dispatch");
			try
			{
				result = ViewAnswerService.viewAnswer(answer);
				System.out.println(result);
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
				out.println("No answers available for this question");
			}
			else
			{
		          request.setAttribute("Result", result);
				RequestDispatcher rd = request.getRequestDispatcher("Answers.jsp");
				rd.forward(request, response);
			}
		}
		finally
		{
			out.close();
		}
	}

}
