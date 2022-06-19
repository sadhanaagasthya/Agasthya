package com.sadhana.service;

import java.util.Random;
import com.sadhana.model.Employee;

public class Credentials {
	public String generateEmailAddress(Employee emp, String dept)
	{
		return emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+dept+"abc.com";
		
	}

	public String generatePassword()
	{
		int length=8;
		String chars= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%";
		Random rnd=new Random();
		StringBuilder sb=new StringBuilder(length);
		for(int i=0;i<length;i++)
		{
			sb.append(chars.charAt(rnd.nextInt(chars.length())));
		
		}
		return sb.toString();
		
	}
	
	public void showCredentials(Employee emp,String email)
	{
		System.out.println("Dear"+emp.getFirstName()+"your generated credentials are as follows");
		System.out.println("Email--->"+email);
		System.out.println("Password--->"+generatePassword());
	}
}
