package com.app.dto;

import java.util.Scanner;

import com.app.model.User;

public class InputRequest {
	static  Scanner sn=new Scanner(System.in);
 public static User register() {
	
	 System.out.println("-----------Welcome To Registration Page-----------");
	 
	 System.out.println("\n\nPlease Enter Your Details");
	 System.out.println("\nEnter Your first name:");
	 String fname=sn.next();
	 System.out.println("Enter Your last name:");
	 String lname=sn.next();
	 System.out.println("Enter Your address:");
	 String address=sn.next();
	 System.out.println("Enter Your mobile number:");
	 long mob=sn.nextLong();
	 System.out.println("Create username:");
	 String uname=sn.next();
	 System.out.println("Create password:");
	 String pass=sn.next();
	 //System.out.println("Enter user Age:");
	 //String role=sn.next();
	return addUser(fname, lname, address, mob, uname, pass, "user");
	 
 }
public static UserRequest login() {
	System.out.println("1. For User Login\n2. For Admin Login");
	int n=sn.nextInt();
	if(n==1) {
	System.out.println("Enter user  name:");
	 String uname=sn.next();
	 System.out.println("Enter user password:");
	 String pass=sn.next();
	 //System.out.println("If your are User Please Enter user");
	 //String role=sn.next();
	 return new UserRequest(uname,pass,"user");
	} 
	else
	{
	System.out.println("Enter user  name:");
	 String uname=sn.next();
	 System.out.println("Enter user password:");
	 String pass=sn.next();
	 //System.out.println("If your are User Please Enter user");
	 //String role=sn.next();
	 return new UserRequest(uname,pass,"admin");
	}
 }


private static User addUser(String fname, String lname, String address, long mob, String uname, String pass,
		String role) {
	User user=new User();
	 user.setAddress(address);
	 user.setFisrtName(fname);
	 user.setLastName(lname);
	 user.setMobile(mob);
	 user.setPassword(pass);
	 user.setRole(role);
	 user.setUname(uname);
	 return user;
}
/*public static User hotregister() {
	// TODO Auto-generated method stub
	System.out.println("Enter User Details:");
	 System.out.println("Enter Your name:");
	 String fname=sn.next();
	 System.out.println("Enter Your Email:");
	 String lname=sn.next();
	 System.out.println("Enter Your address:");
	 String address=sn.next();
	 System.out.println("Enter Your mobile:");
	 long mob=sn.nextLong();
	 System.out.println("Enter Your Addhar No:");
	 String uname=sn.next();
	 System.out.println("Enter user Age:");
	 String role=sn.next();
	return addUser(fname, lname, address, mob, uname, role,"Yes");
}*/
}