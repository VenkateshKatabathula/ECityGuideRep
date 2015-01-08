package com.ecg.beans;

import java.io.Serializable;

public class GuideBean implements Serializable
{
		
		private String guideName;
		private String password;
		private String mobileNumber;
		private String city;
		private String bankName;
		private String accountNum;
		private String memberShip;
		private int amount;
		

		
		
		public String getGuideName() 
		{
			return guideName;
		}
		public void setGuideName(String guideName) 
		{
			this.guideName = guideName;
		}
		
		public String getPassword() 
		{
			return password;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getAccountNum() {
			return accountNum;
		}
		public void setAccountNum(String accountNum) {
			this.accountNum = accountNum;
		}
		public String getMemberShip() {
			return memberShip;
		}
		public void setMemberShip(String memberShip) {
			this.memberShip = memberShip;
		}
		public int getAmount() {
			return amount;
		}
		public void setAmount(int amount) {
			this.amount = amount;
		}
		
		
}
