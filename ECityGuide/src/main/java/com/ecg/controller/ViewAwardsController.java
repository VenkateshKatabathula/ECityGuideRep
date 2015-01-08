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

import com.ecg.beans.AnswerBean;
import com.ecg.beans.AwardsBean;
import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.ViewAnswerService;
import com.ecg.services.ViewAwardsService;

/**
 * Servlet implementation class ViewAwardsController
 */
@WebServlet("/ViewAwardsController")
public class ViewAwardsController extends HttpServlet 
{
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ResultSet result= null;
		try
		{
			AwardsBean awardBean = new AwardsBean();
			awardBean.setGuideId(Integer.parseInt(request.getParameter("guideId")));
			
			ViewAwardsService viewAwardService = ServiceFactory.getAwardService();
			System.out.println("Ready to dispatch");
			try
			{
				result = ViewAwardsService.viewAward(awardBean);
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
				out.println("No Awards");
			}
			else
			{
		          request.setAttribute("Result", result);
				RequestDispatcher rd = request.getRequestDispatcher("Awards.jsp");
				rd.forward(request, response);
			}
		}
		finally
		{
			out.close();
		}
	}
		
	}

