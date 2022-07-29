package com.app.dao.impl;

import java.util.Scanner;

public class Payment {
	public Payment() {
	int mode ;
	int id = 0,amt = 0;
	String name = null;
	String cho;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Select Payment Option:");
	System.out.println("1.UPI" +"\n" + "2.Debit Card" +"\n" + "3.Credit Card" +"\n" );
	System.out.println("Select Payment Option:");
	int choice=sc.nextInt();
		
		
		switch(choice)
		{
		
		case 1: 
	System.out.println("Payment ID");
	 id=1;
	 System.out.println(id);
	System.out.println("Enter UPI NO");
	 name=sc.next();
	System.out.println("Payment amt");
	 amt=sc.nextInt();
	break;
	
		case 2:	 
			System.out.println("Payment ID");
		     id=2;
		     System.out.println(id);
			System.out.println("Enter Debit Card No");
			 name=sc.next();
			System.out.println("Payment amt");
			 amt=sc.nextInt();			
			break;
	
		case 3:	 
			System.out.println("Payment ID");
		     id=3;
		     System.out.println(id);
			System.out.println("Enter Credit Card No");
			 name=sc.next();
			System.out.println("Payment amt");
			 amt=sc.nextInt();			
			break;
		 }
		System.out.println("Hotel Booked Successfully");
		

}
}

