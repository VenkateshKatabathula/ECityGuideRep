package com.ecg.services;

import java.sql.SQLException;

import com.ecg.beans.QuestionBean;
import com.ecg.daofactory.DaoFactory;
import com.ecg.daointerface.UserDao;

public class UserService {
public int postQuestion(QuestionBean questionInfo)throws ClassNotFoundException,SQLException
{
UserDao userDao=DaoFactory.getUserDao();
return userDao.postQuestion(questionInfo);
}

}
