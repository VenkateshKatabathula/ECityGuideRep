package com.ecg.daointerface;

import java.sql.SQLException;

import com.ecg.beans.FeedbackBean;

public interface FeedBackDao {
	 public abstract boolean postFeedback(FeedbackBean feedBack)
			 throws ClassNotFoundException,SQLException;
}

