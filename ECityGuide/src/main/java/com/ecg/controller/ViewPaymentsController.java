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

import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.ViewPaymentsService;

/**
 * Servlet implementation class ViewPaymentsController
 */
@WebServlet("/ViewPaymentsController")
public class ViewPaymentsController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
	    PrintWriter out=response.getWriter();
	    ResultSet rs=null;
	    ResultSet rs1=null;
	    ViewPaymentsService vps=ServiceFactory.getviewPaymentsService();
	    try
		{
			rs=vps.viewPayments();
			rs1=vps.viewPayments1();
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		request.setAttribute("resultset", rs);
		request.setAttribute("resultset1", rs1);
		RequestDispatcher rd=request.getRequestDispatcher("ViewPayments.jsp");
		rd.forward(request, response);
		
	}
	
	


}

