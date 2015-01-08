package com.ecg.daofactory;

import com.ecg.beans.AwardsBean;
import com.ecg.daointerface.FeedBackDao;
import com.ecg.daointerface.GuideDao;
import com.ecg.daointerface.LoginDao;
import com.ecg.daointerface.RegistrationDao;
import com.ecg.daointerface.UserDao;
import com.ecg.daointerface.ViewAnswerDao;
import com.ecg.daointerface.ViewAwardsDao;
import com.ecg.daointerface.ViewPaymentsDao;
import com.ecg.daointerface.ViewQuestionDao;

import com.ecg.daointerface.GuideRegistrationDao;
import com.ecg.daoimplementations.FeedBackDaoImplementation;
import com.ecg.daoimplementations.GuideDaoImplementation;
import com.ecg.daoimplementations.LoginDaoImplementation;
import com.ecg.daoimplementations.RegistrationDaoImplementation;
import com.ecg.daoimplementations.GuideRegistrationDaoImplementation;
import com.ecg.daoimplementations.UserDaoImplementation;
import com.ecg.daoimplementations.ViewAnswerDaoImplementation;
import com.ecg.daoimplementations.ViewAwardsDaoImplementation;
import com.ecg.daoimplementations.ViewPaymentsDaoImplementation;
import com.ecg.daoimplementations.ViewQuestionDaoImplementation;


public class DaoFactory {

	private static LoginDao loginDao=null;
	private static RegistrationDao registrationDao=null;
	private static GuideRegistrationDao guideRegistrationDao=null;
    private static UserDao userDao=null;
    private static ViewQuestionDao viewQuestionDao=null;
    private static ViewAnswerDao viewAnswerDao=null;
    private static GuideDao guideDao=null;
    private static FeedBackDao feedBackDao=null;
    private static ViewAwardsDao awardDao=null;
    private static  ViewPaymentsDao paymentsDao=null;
    public static LoginDao getLoginDao( ){
        if(loginDao==null){
            loginDao=new LoginDaoImplementation( );
        }
        else{
            return loginDao;
        }
        return loginDao;

    }
    public static RegistrationDao getRegistrationDao( ){
        if(registrationDao==null){
            registrationDao =new RegistrationDaoImplementation( );
        }
        else{
            return registrationDao;
        }
        return registrationDao;

    }

    
    
    public static GuideRegistrationDao getGuideRegistrationDao( ){
        if(guideRegistrationDao==null){
            guideRegistrationDao = new GuideRegistrationDaoImplementation();
        }
        else{
            return guideRegistrationDao;
        }
        return guideRegistrationDao;

    }
    
    public static UserDao getUserDao()
    {
        if(userDao==null)
        {
            userDao = new UserDaoImplementation();
        }
        else{
            return userDao;
        }
        return userDao;

    }
    public static ViewQuestionDao getViewQuestionDao()
    {
    if( viewQuestionDao==null)
    {
   	 viewQuestionDao = new ViewQuestionDaoImplementation();
    }
    else
    {
   	  return  viewQuestionDao; 
    }
	return viewQuestionDao;
    }
    
    public static ViewAnswerDao getViewAnswerDao()
    {
    	if(viewAnswerDao==null)
    	{
    		viewAnswerDao = new ViewAnswerDaoImplementation();
    	}
    	else
    	{
    		return viewAnswerDao;
    	}
    	return viewAnswerDao;
    }
    
    public static GuideDao getGuideDao()
    {
    	if(guideDao==null)
    	{
    		guideDao=new GuideDaoImplementation();
    	}
    	else
    	{
    		return guideDao;
    	}
    	return guideDao;
    }
    public static FeedBackDao getFeedBackDao()
    {
  	  if(feedBackDao==null)
  	  {
           feedBackDao=new FeedBackDaoImplementation();
  	  }
  	  else
  	  {
  		  return feedBackDao;
  	  }
          return feedBackDao;
    }
    public static ViewAwardsDao getAwardDao()
    {
    	if(awardDao==null)
    	{
    		awardDao=new ViewAwardsDaoImplementation();
    	}
    	else
    	{
    		return awardDao;
       	}
    		return awardDao;
    }
    public static ViewPaymentsDao getPaymentsDao()
    {
		
    	if(paymentsDao==null)
    	{
    		paymentsDao=new ViewPaymentsDaoImplementation();
    	}
    	else
    	{
    		return paymentsDao;
       	}
    		return paymentsDao;	
    
    }

}   

