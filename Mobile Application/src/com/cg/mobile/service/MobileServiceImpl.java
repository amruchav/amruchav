package com.cg.mobile.service;

import java.util.regex.Pattern;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileServiceImpl implements IMobileService {
	
	IMobileDAO dao=null;

	@Override
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException {
		dao =new MobileDaoImpl();
		return dao.addPurchaseDetails(p);
		
		
		
		
		
	}
	public boolean validateName(String cName)
	{
		String namepattern="[A-Z]{1}[a-z]{2,19}";
		if(Pattern.matches(namepattern,cName))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter correct customer name");
			return false;
		}
	}
	
	public boolean validateEmail(String mailId)
	{
		String mailpattern="[?=.*A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,6}$";
		if(Pattern.matches(mailpattern, mailId))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter correct Email Id");
			return false;
		}
	}
	
	public boolean validatePhoneNo(String phoneNo)
	{
		
		String phonepattern="[0-9]{10}";
		if(Pattern.matches(phonepattern, phoneNo))
		{
			return true;
		}
		else
		{
			System.out.println("Please enter correct phone number");
			return false;
		}
	}
		
		public boolean validateMobileId(String mobileId)
		{
			
			String mobpattern="[0-9]{4}";
			if(Pattern.matches(mobpattern, mobileId))
			{
				return true;
			}
			else
			{
				System.out.println("Please enter correct mobile Id");
				return false;
			}
	}
}
