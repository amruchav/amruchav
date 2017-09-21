package com.cg.mobile.DTO;

import java.time.LocalDate;

public class PurchaseDetails {
	
	private int purchesId;
	private String cName;
	private String mailId;
	private long phoneNo;
	private LocalDate purchaseDate;
	private int mobileId;
	
	//default constructor from superclass
	public PurchaseDetails() {
		
	}
	
	//constructer using fields
	public PurchaseDetails(String cName, String mailId,long phoneNo, int mobileId){
		super();
		this.cName = cName;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.mobileId = mobileId;
	}
	
	//Getters and setters for variables
	public int getPurchesId() {
		return purchesId;
	}
	public void setPurchesId(int purchesId) {
		this.purchesId = purchesId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	
	//toString 
	@Override
	public String toString() {
		return "PurchaseDetails [purchesId=" + purchesId + ", cName=" + cName
				+ ", mailId=" + mailId + ", phoneNo=" + phoneNo + ", mobileId="
				+ mobileId + "]";
	}
	
	
	

}
