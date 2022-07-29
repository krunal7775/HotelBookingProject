package com.app.test;

import java.util.List;

import java.util.Scanner;

import com.app.dao.USerDao;
import com.app.dao.impl.Admin;
import com.app.dao.impl.HotelList;
import com.app.dao.impl.Payment;

import com.app.dao.impl.Payment;
import com.app.factory.UserFactory;
import com.app.model.User;
import com.app.util.HibernateUtil;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sn=new Scanner(System.in);
USerDao dao=UserFactory.getUser();
String ch="";
do {
	System.out.println("Welcome To Hotel Booking App");
	System.out.println("Please Select Proper Option");
	System.out.println("1: For Register\n2: Login");
	System.out.println("-------------------------------");
	int choice=sn.nextInt();
	switch (choice) {
	case 1:
		int i=dao.register();
		if(i==1) {
			
			System.out.println("Successfully Register");
			
		}else {
			System.out.println("Something went wrong...!");
		}
		break;
	case 2:
		User user=dao.login();
		if(user!=null && user.getRole().equalsIgnoreCase("user")) {
			System.out.println("\n------------welcome to The Hotel Booking portal--------------\n");
			HotelList hl=new HotelList();
			//Payment pa=new Payment();
			break;

		}
		if(user!=null && user.getRole().equalsIgnoreCase("admin")) {
			System.out.println("welcome to Admin portal.");
			Admin ad=new Admin();
			break;
			
		}else {
			System.out.println("Invallid username and password");
		}
		break;
	/*case 3:
		List<User>list=dao.listOfUsers();
		list.stream().forEach(s->System.out.println(s.getId()+"\t"+s.getFisrtName()+" "+s.getLastName()+"\t"+s.getAddress()+"\t"+s.getMobile()));
	break;
	case 4:
		System.out.println("Enter your id for find user:");
		int id=sn.nextInt();
		User u1=dao.findById(id);
		System.out.println(u1);
		break;*/
	default:
		System.out.println("Invalid Request...!");
		break;
	}
	System.out.println("Do you want to continue...(y)");
	ch=sn.next();
}while(ch.equalsIgnoreCase("y"));
System.out.println("Thank you");
	}

}
