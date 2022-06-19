package com.sadhana.main;
import java.util.Scanner;

import com.sadhana.model.Employee;
import com.sadhana.service.Credentials;


public class Driverclass {
	
	public static void main(String[] args) {
		int ch;
		String dept="";
		String email="";
		Employee emp= new Employee("Sadhana", "Sridhar");
		System.out.println("Please enter the department from the following");
		System.out.println("1.technical\n2.admin\n3.hr\n4.legal");
		System.out.println("Enter your choice");
		Scanner sc =new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: dept="technical";
		break;
		case 2: dept="admin";
		break;
		case 3: dept="hr";
		break;
		case 4: dept="legal";
		break;
		}
		Credentials cs=new Credentials();
		email=cs.generateEmailAddress(emp, dept);
		cs.showCredentials(emp, email);
	}

}
