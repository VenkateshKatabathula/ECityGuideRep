package com.ecg.beans;

	

import java.io.Serializable;

public class FeedbackBean implements Serializable {

	private String guideId;
	private int questionId;
	private String rating;
	
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getRating() {
		return rating;
	}
	public String getGuideId() {
		return guideId;
	}
	public void setGuideId(String guideId) {
		this.guideId = guideId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	
}
