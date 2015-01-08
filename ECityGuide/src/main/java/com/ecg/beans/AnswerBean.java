package com.ecg.beans;
import java.io.Serializable;

public class AnswerBean implements Serializable 
{	
	private int answerId;
	private String answer;
	private int questionId;
	private int guideId;
	
	public int getAnswerId() 
	{
		return answerId;
	}
	public void setAnswerId(int answerId) 
	{
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getGuideId() {
		return guideId;
	}
	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}

}
