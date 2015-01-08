package com.ecg.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ecg.beans.FeedbackBean;
import com.ecg.servicefactory.ServiceFactory;
import com.ecg.services.FeedbackService;

/**
 * Servlet implementation class FeedBackController
 */
@WebServlet("/FeedbackController")
public class FeedBackController extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
{
  response.setContentType("text/html");
  PrintWriter out=response.getWriter();
  try
  {
      FeedbackBean feedback=new FeedbackBean();
      feedback.setGuideId(request.getParameter("guideId"));
      feedback.setQuestionId(Integer.parseInt(request.getParameter("questionId")));
      feedback.setRating(request.getParameter("rating"));
      FeedbackService feedbackService=ServiceFactory.getFeedBackService();
      System.out.println("ready to dispatch");
      Boolean status;
      try{
    	  
    	  status=feedbackService.postFeedback(feedback);
    	  
    	  if(status==true)
    	  {
             out.println("Feedback posted");
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