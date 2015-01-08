package com.ecg.services;

import java.sql.SQLException;

import com.ecg.beans.FeedbackBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.FeedBackDao;

public class FeedbackService {
       public boolean postFeedback(FeedbackBean feedBack) throws ClassNotFoundException, SQLException
       {
		 FeedBackDao feedBackDao=DaoFactory.getFeedBackDao();
    	   return feedBackDao.postFeedback(feedBack);

       }
}