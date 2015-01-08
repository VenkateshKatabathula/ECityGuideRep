package com.ecg.beans;

import java.io.Serializable;

public class AwardsBean implements Serializable{
	
	private int guideId;
	private int amount;
	
	public int getGuideId() {
		return guideId;
	}
	public void setGuideId(int guideId) {
		this.guideId = guideId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}


}

