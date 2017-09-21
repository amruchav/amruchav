package com.cg.mobile.service;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;

public interface IMobileService {
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException ; //ABSTRACT METHOD

	public boolean validateName(String cName);
	public boolean validateEmail(String mailId);
	public boolean validatePhoneNo(String phoneNo);
	public boolean validateMobileId(String mobileId);
}
