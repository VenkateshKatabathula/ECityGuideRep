package com.ecg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecg.beans.AnswerBean;
import com.ecg.beans.QuestionBean;
import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.GuideService;
import com.ecg.services.UserService;

/**
 * Servlet implementation class AnswerController
 */
@WebServlet("/PostAnswerController")
public class PostAnswerController extends HttpServlet 
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		AnswerBean answerBean = new AnswerBean();
		
		try
		{
			answerBean.setAnswer(request.getParameter("answer"));
			answerBean.setQuestionId(Integer.parseInt(request.getParameter("questionId")));
			answerBean.setGuideId(Integer.parseInt(request.getParameter("guideId")));
			
			GuideService guideService = ServiceFactory.getGuideService();
			Boolean role=false;
			try
			{
				role = guideService.postAnswer(answerBean);
				if(role==true)
				{
					out.println("Answer posted");
				}
				else
				{
					out.println("not posted");
				}
			}
				catch(ClassNotFoundException ce)
				{
					ce.printStackTrace();
				}
				catch(SQLException se)
				{
					se.printStackTrace();
				}
		}
		
			finally
			{
				out.close();
			}
	}
}
		
	
	
