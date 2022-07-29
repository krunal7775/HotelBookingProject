package com.app.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class HotelList {
	public HotelList() {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Select Your Location:");
	System.out.println();
	System.out.println("------------------------");
	System.out.println("Sr.no           Location");
	System.out.println("------------------------");
	System.out.println("1.              Mumbai" +
				"\n" + "2.              Pune" +
				"\n" + "3.              Nagpur" +
				"\n" + "4.              Delhi" +
				"\n" + "5.              Banglore" +"\n" );
	System.out.println("Enter you choice");
	int location=sc.nextInt();
	String loc= null;
	String rt= null;
	String ho= null;
	int price=0;
	switch(location)
	{
	case 1:
	{
		loc="Mumbai";

		
		System.out.println("Select Hotel:");
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("Sr.no              Hotels  ");
		System.out.println("-------------------------------");
		System.out.println("1.                 Taj Hotel" +
		"\n" +             "2.                 Oberoi Hotel" 
				+"\n" +    "3.                 JW Marriot" +
		"\n" +             "4.                 Le Meridian" +
				    "\n"  +"5.                 Hotel Citrus" 
		            +"\n" +"6.                 The Conrad");
		System.out.println("\n" +"Enter you choice");
		int choice=sc.nextInt();
		int n;
		switch(choice)
		{
		case 1:
		System.out.println("\n------------Welcome to Taj Hotel-------------");
	ho="Taj Hotel";
		  System.out.println();
		  System.out.println("Select Room Type");
		  System.out.println();
		  System.out.println("-----------------------------------");
		  System.out.println("Sr.No  Type             Price/day  ");
		  System.out.println("-----------------------------------");
		  System.out.println("1.     Normal           3000\n"
		  		+            "2.     Deluxe           4000\n"
		  		+            "3.     Luxury           5000");
		  int n1=sc.nextInt();
		  switch(n1)
		  {
		  case 1:
			rt="Normal";
	  price=3000;
		  break;
		  case 2:
			 rt="Deluxe";
	  price=4000;
		  break;
		  case 3:
			rt="Luxury";
	  price=5000;
		  break;
		  }
		  
		System.out.println("Per day charges "+price);
		break;

		case 2:
		System.out.println("\n------------Welcome to Oberoi Hotel-------------");
	ho="Oberoi Hotel";
		 System.out.println("Select Room Type");
		  System.out.println();
		  System.out.println("-----------------------------------");
		  System.out.println("Sr.No  Type             Price/day  ");
		  System.out.println("-----------------------------------");
		  System.out.println("1.     Normal           2000\n"
		  		+            "2.     Deluxe           3000\n"
		  		+            "3.     Luxury           3500");
		   n1=sc.nextInt();
		  switch(n1)
		  {
		  case 1:
			rt="Normal";
	  price=2000;
		  break;
		  case 2:
			 rt="Deluxe";
	  price=3000;
		  break;
		  case 3:
			  
	rt="Luxury";
	price=3500;
		  break;
		  }

		System.out.println("Per day charges "+price);
		break;

		case 3:
		System.out.println("\n----------------Welcome To JW Marriot---------------");
	ho="JW Marriot";
		 System.out.println("Select Room Type");
		  System.out.println();
		  System.out.println("-----------------------------------");
		  System.out.println("Sr.No  Type             Price/day  ");
		  System.out.println("-----------------------------------");
		  System.out.println("1.     Normal           2500\n"
		  		+            "2.     Deluxe           3000\n"
		  		+            "3.     Luxury           5000");
		   n1=sc.nextInt();
		  switch(n1)
		  {
		  case 1:
			rt="Normal";
	  price=2500;
		  break;
		  case 2:
			 rt="Deluxe";
	  price=3000;
		  break;
		  case 3:
			rt="Luxury";
	  price=5000;
		  break;
		  }

		System.out.println("Per day charges "+price);
		break;

		case 4:
		System.out.println("\n--------------Welcome To Le Meridian-----------------");
	ho="Le Meridian";
		 System.out.println("Select Room Type");
		  System.out.println();
		  System.out.println("-----------------------------------");
		  System.out.println("Sr.No  Type             Price/day  ");
		  System.out.println("-----------------------------------");
		  System.out.println("1.     Normal           2000\n"
		  		+            "2.     Deluxe           4000\n"
		  		+            "3.     Luxury           6000");
		   n1=sc.nextInt();
		  switch(n1)
		  {
		  case 1:
			rt="Normal";
	  price=2000;
		  break;
		  case 2:
			 rt="Deluxe";
	  price=4000;
		  break;
		  case 3:
			rt="Luxury";
	  price=6000;
		  break;
		  }

		System.out.println("Per day charges "+price);
		break;

		case 5:
		System.out.println("\n-------------Welcome To Hotel Citrus---------------");
	ho="Hotel Citrus";
		 System.out.println("Select Room Type");
		  System.out.println();
		  System.out.println("-----------------------------------");
		  System.out.println("Sr.No  Type             Price/day  ");
		  System.out.println("-----------------------------------");
		  System.out.println("1.     Normal           4000\n"
		  		+            "2.     Deluxe           5000\n"
		  		+            "3.     Luxury           6000");
		  n1=sc.nextInt();
		  switch(n1)
		  {
		  case 1:
			 rt="Normal";
	 price=4000;
		  break;
		  case 2:
			 rt="Deluxe";
	  price=5000;
		  break;
		  case 3:
			rt="Luxury";
	  price=6000;
		  break;
		  }

		System.out.println("Per day charges "+price);
		break;

		case 6:
		System.out.println("\n---------------Welcome To The Ritz-Carlton---------------");
	ho="The Ritz-Carlton";
		 System.out.println("Select Room Type");
		  System.out.println();
		  System.out.println("-----------------------------------");
		  System.out.println("Sr.No  Type             Price/day  ");
		  System.out.println("-----------------------------------");
		  System.out.println("1.     Normal           5000\n"
		  		+            "2.     Deluxe           6000\n"
		  		+            "3.     Luxury           8000");
		  n1=sc.nextInt();
		  switch(n1)
		  {
		  case 1:
			rt="Normal";
	  price=5000;
		  break;
		  case 2:
			 rt="Deluxe";
	  price=6000;
		  break;
		  case 3:
			rt="Luxury";
	  price=8000;
		  break;
		  }
	 
		System.out.println("Per day charges "+price);
		break;
		
		default:
		System.out.println("Selection invalid");
		break;
		}
		}
		break;
		case 2:
		{
			loc="Pune";

			System.out.println("Select Hotel:");
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println("Sr.no              Hotels  ");
			System.out.println("-------------------------------");
			System.out.println("1.                 Orchid Hotel" 
			+"\n" +            "2.                 Singhania Hotel" 
					+"\n" +    "3.                 Hotel Palace"
			+"\n" +            "4.                 Sai Leela" 
					+"\n" +    "5.                 Hotel Maniac" +
			"\n" +             "6.                 Victory Hotel");
			System.out.println("\n" +"Enter you choice");
			int choice1=sc.nextInt();
			int n2;
			switch(choice1)
			{
			case 1:
			System.out.println("\n-----------------Welcome To Orchid Hotel--------------");
	ho="Orchid Hotel";
			  System.out.println("Select Room Type");
			  System.out.println();
			  System.out.println("-----------------------------------");
			  System.out.println("Sr.No  Type             Price/day  ");
			  System.out.println("-----------------------------------");
			  System.out.println("1.     Normal           3000\n"
			  		+            "2.     Deluxe           4000\n"
			  		+            "3.     Luxury           5000");
			  n2=sc.nextInt();
			  switch(n2)
			  {
			  case 1:
				rt="Normal";
	  price=3000;
			  break;
			  case 2:
				 rt="Deluxe";
	  price=4000;
			  break;
			  case 3:
				rt="Luxury";
	  price=5000;
			  break;
			  }
			  
			System.out.println("Per day charges"+price);
			break;

			case 2:
			System.out.println("\n---------------Welcome To Singhania Hotel-----------------");
	ho="Singhania Hotel";
			 System.out.println("Select Room Type");
			 System.out.println();
			  System.out.println("-----------------------------------");
			  System.out.println("Sr.No  Type             Price/day  ");
			  System.out.println("-----------------------------------");
			  System.out.println("1.     Normal           2000\n"
			  		+            "2.     Deluxe           3000\n"
			  		+            "3.     Luxury           4000");
			   n2=sc.nextInt();
			  switch(n2)
			  {
			  case 1:
				rt="Normal";
	  price=2000;
			  break;
			  case 2:
				 rt="Deluxe";
	  price=3000;
			  break;
			  case 3:
				rt="Luxury";
	  price=4000;
			  break;
			  }

			System.out.println("Per day charges "+price);
			break;

			case 3:
			System.out.println("\n------------------Welcome To Hotel Palace---------------");
	ho="Hotel Palace";
			 System.out.println("Select Room Type");
			 System.out.println();
			 System.out.println("-----------------------------------");
			  System.out.println("Sr.No  Type             Price/day  ");
			  System.out.println("-----------------------------------");
			  System.out.println("1.     Normal           1500\n"
			  		+            "2.     Deluxe           2000\n"
			  		+            "3.     Luxury           3000");
			   n2=sc.nextInt();
			  switch(n2)
			  {
			  case 1:
				  rt="Normal";
	price=1500;
			  break;
			  case 2:
				 rt="Deluxe";
	  price=2000;
			  break;
			  case 3:
				rt="Luxury";
	  price=3000;
			  break;
			  }

			System.out.println("Per day charges "+price);
			break;

			case 4:
			System.out.println("\n---------------Welcome To Sai Leela--------------");
	ho="Sai Leela";
			 System.out.println("Select Room Type");
			 System.out.println();
			 System.out.println("-----------------------------------");
			  System.out.println("Sr.No  Type             Price/day  ");
			  System.out.println("-----------------------------------");
			  System.out.println("1.     Normal           3000\n"
			  		+            "2.     Deluxe           4000\n"
			  		+            "3.     Luxury           5000");
			   n2=sc.nextInt();
			  switch(n2)
			  {
			  case 1:
				 rt="Normal";
	 price=3000;
			  break;
			  case 2:
				  rt="Deluxe";
	 price=4000;
			  break;
			  case 3:
				rt="Luxury";
	  price=5000;
			  break;
			  }

			System.out.println("Per day charges"+price);
			break;

			case 5:
			System.out.println("\n-----------------Welcome to Hotel Maniac-------------");
	ho="Hotel Maniac";
			 System.out.println("Select Room Type");
			 System.out.println();
			 System.out.println("-----------------------------------");
			  System.out.println("Sr.No  Type             Price/day  ");
			  System.out.println("-----------------------------------");
			  System.out.println("1.     Normal           5000\n"
			  		+            "2.     Deluxe           7000\n"
			  		+            "3.     Luxury           8000");
			  n2=sc.nextInt();
			  switch(n2)
			  {
			  case 1:
				rt="Normal";
	  price=5000;
			  break;
			  case 2:
				 rt="Deluxe";
	  price=7000;
			  break;
			  case 3:
				 rt="Luxury";
	 price=8000;
			  break;
			  }

			System.out.println("Per day charges "+price);
			break;

			case 6:
			System.out.println("\n----------------Welcome To Victory Hotel---------------");
	ho="Victory Hotel";
			 System.out.println("Select Room Type");
			 System.out.println();
			 System.out.println("-----------------------------------");
			  System.out.println("Sr.No  Type             Price/day  ");
			  System.out.println("-----------------------------------");
			  System.out.println("1.     Normal           1000\n"
			  		+            "2.     Deluxe           2000\n"
			  		+            "3.     Luxury           3000");
			  n2=sc.nextInt();
			  switch(n2)
			  {
			  case 1:
				rt="Normal";
	  price=1000;
			  break;
			  case 2:
				 rt="Deluxe";
	  price=2000;
			  break;
			  case 3:
				rt="Luxury";
	  price=3000;
			  break;
			  }
		 
			System.out.println("Per day charges "+price );
			break;
			
			default:
			System.out.println("Selection invalid");
			break;
			}
		}
		break;
			case 3:
			{
				loc="Nagpur";

				System.out.println("Select Hotel:");
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println("Sr.no              Hotels  ");
				System.out.println("-------------------------------");
				System.out.println("1.                 Raddison Blu" +
							"\n" + "2.                 Le Meridien" +"\n"
								 + "3.                 Hotel Centre Point"
							+"\n" +"4.                 The Pride Hotel" +
							"\n"  +"5.                 Regenta" 
							+"\n" +"6.                 Tuli Imperial");
				System.out.println("\n" +"Enter you choice");
				int choice2=sc.nextInt();
				
				switch(choice2)
				{
				case 1:
				System.out.println("\n----------------Welcome To Raddison Blu--------------");
	ho="Raddison Blu";
				  System.out.println("Select Room Type");
				  System.out.println();
				  System.out.println("-----------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           5000");
				  int n3=sc.nextInt();
				  switch(n3)
				  {
				  case 1:
	rt="Normal";
					  price=3000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=4000;
				  break;
				  case 3:
					rt="Luxury";
	  price=5000;
				  break;
				  }
				  
				System.out.println("Per day charges "+price);
				break;

				case 2:
				System.out.println("\n----------------Welcome to Le Meridien--------------");
	ho="Le Meridien";
				 System.out.println("Select Room Type");
				 System.out.println();
				 System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           4000\n"
				  		+            "2.     Deluxe           5000\n"
				  		+            "3.     Luxury           6000");
				   n3=sc.nextInt();
				  switch(n3)
				  {
				  case 1:
					rt="Normal";
	  price=4000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=5000;
				  break;
				  case 3:
					rt="Luxury";
	  price=6000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 3:
				System.out.println("\n---------------Welcome To Hotel Centre Point--------------");
	ho="Hotel Centre Point";
				 System.out.println("Select Room Type");
				 System.out.println();
				 System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           2000\n"
				  		+            "2.     Deluxe           3000\n"
				  		+            "3.     Luxury           4000");
				   n3=sc.nextInt();
				  switch(n3)
				  {
				  case 1:
					rt="Normal";
	  price=2000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=3000;
				  break;
				  case 3:
					rt="Luxury";
	  price=4000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 4:
				System.out.println("\n-------------------Welcome To The Pride Hotel------------------");
	ho="The Pride Hotel";
				 System.out.println("Select Room Type");
				 System.out.println();
				 System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           6000\n"
				  		+            "2.     Deluxe           8000\n"
				  		+            "3.     Luxury           10000");
				   n3=sc.nextInt();
				  switch(n3)
				  {
				  case 1:
					rt="Normal";
	  price=6000;
				  break;
				  case 2:
					  price=8000;
				  break;
				  case 3:
					rt="Luxury";
	  price=10000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 5:
				System.out.println("\n--------------------Welcome To Regenta-------------------");
	ho="Regenta";
				 System.out.println("Select Room Type");
				 System.out.println();
				 System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           5000");
				  n3=sc.nextInt();
				  switch(n3)
				  {
				  case 1:
					rt="Normal";
	  price=3000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=4000;
				  break;
				  case 3:
					rt="Luxury";
	  price=5000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 6:
				System.out.println("\n-------------Welcome To Tuli Imperial-------------");
	ho="Tuli Imperial";
				 System.out.println("Select Room Type");
				  System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           5000\n"
				  		+            "2.     Deluxe           6000\n"
				  		+            "3.     Luxury           7000");
				  n3=sc.nextInt();
				  switch(n3)
				  {
				  case 1:
					rt="Normal";
	  price=5000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=6000;
				  break;
				  case 3:
					rt="Luxury";
	  price=7000;
				  break;
				  }
			 
				System.out.println("Per day charges "+price);
				break;
				
				default:
				System.out.println("Selection invalid");
				break;
				}
			}
			break;
			case 4:
			{
				loc="Delhi";

				System.out.println("Select Hotel:");
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println("Sr.no              Hotels  ");
				System.out.println("-------------------------------");
				System.out.println("1.                 The Imperial"
						   +"\n" + "2.                 Delhi Darbar" 
						   +"\n" + "3.                 The Oak" +"\n"
						   		  +"4.                 Roseate" +"\n"
						   		  +"5.                 Vivanta" +
						   	 "\n" +"6.                 Hotel Pullman");
				System.out.println("\n" +"Enter you choice");
				int choice3=sc.nextInt();
				int n4;
				switch(choice3)
				{
				case 1:
				System.out.println("\n--------------Welcome To The Imperial--------------");
	ho="The Imperial";
				  System.out.println("Select Room Type");
				  System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           5000");
				  n4=sc.nextInt();
				  switch(n4)
				  {
				  case 1:
					rt="Normal";
	  price=3000;
				  break;
				  case 2:
					  rt="Deluxe";
	 price=4000;
				  break;
				  case 3:
	rt="Luxury";
					  price=5000;
				  break;
				  }
				  
				System.out.println("Per day charges "+price);
				break;

				case 2:
				System.out.println("\n----------------Welcome To Delhi Darbar---------------");
	ho="Delhi Darbar";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           1000\n"
				  		+            "2.     Deluxe           1500\n"
				  		+            "3.     Luxury           2000");
				   n4=sc.nextInt();
				  switch(n4)
				  {
				  case 1:
					rt="Normal";
	  price=1000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=1500;
				  break;
				  case 3:
					rt="Luxury";
	  price=2000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 3:
				System.out.println("\n------------Welcome To The Oak--------------");
	ho="The Oak";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           6000");
				   n4=sc.nextInt();
				  switch(n4)
				  {
				  case 1:
					rt="Normal";
	  price=3000;
				  break;
				  case 2:
					  rt="Deluxe";
	 price=4000;
				  break;
				  case 3:
	rt="Luxury";
					  price=6000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 4:
				System.out.println("\n-----------------Welcome To Roseate--------------");
	ho="Roseate";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           8000\n"
				  		+            "2.     Deluxe           10000\n"
				  		+            "3.     Luxury           15000");
				   n4=sc.nextInt();
				  switch(n4)
				  {
				  case 1:
					rt="Normal";
	  price=8000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=10000;
				  break;
				  case 3:
					 rt="Luxury";
	 price=15000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 5:
				System.out.println("\n--------------Welcome To Vivanta---------------");
	ho="Vivanta";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           5000");
				  n4=sc.nextInt();
				  switch(n4)
				  {
				  case 1:
					rt="Normal";
	  price=3000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=4000;
				  break;
				  case 3:
					rt="Luxury";
	  price=5000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 6:
				System.out.println("\n----------------Welcome To Hotel Pullman---------------");
	ho="Hotel Pullman";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           8000");
				  n4=sc.nextInt();
				  switch(n4)
				  {
				  case 1:
					 rt="Normal";
	 price=3000;
				  break;
				  case 2:
					  rt="Deluxe";
	 price=4000;
				  break;
				  case 3:
					rt="Luxury";
	  price=8000;
				  break;
				  }
			 
				System.out.println("Per day charges "+price);
				break;
				
				default:
				System.out.println("Selection invalid");
				break;
				}
			}
			break;
			case 5:
			{
				loc="Banglore";

				System.out.println("Select Hotel:");
				System.out.println();
				System.out.println("-------------------------------");
				System.out.println("Sr.no              Hotels  ");
				System.out.println("-------------------------------");
				System.out.println("1.                 The Park" +
							"\n" + "2.                 ITC Windsor" 
						   +"\n" + "3.                 Hotel Atithi"
							+"\n" +"4.                 Novotel" +"\n"
						   +       "5.                 Conrad" 
							+"\n" +"6.                 La Marvella");
				System.out.println("\n" +"Enter you choice");
				int choice4=sc.nextInt();
				int n5;
				switch(choice4)
				{
				case 1:
				System.out.println("\n---------------------Welcome To The Park-----------------");
	ho="The Park";
				  System.out.println("Select Room Type");
				  System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           5000");
				  n5=sc.nextInt();
				  switch(n5)
				  {
				  case 1:
					rt="Normal";
	  price=3000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=4000;
				  break;
				  case 3:
					
	rt="Luxury";
	  price=5000;
				  break;
				  }
				  
				System.out.println("Per day charges "+price);
				break;

				case 2:
				System.out.println("\n----------------Welcome To ITC Windsor--------------");
	ho="ITC Windsor";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           4000\n"
				  		+            "2.     Deluxe           7000\n"
				  		+            "3.     Luxury           10000");
				   n5=sc.nextInt();
				  switch(n5)
				  {
				  case 1:
					 rt="Normal";
	 price=4000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=7000;
				  break;
				  case 3:
					rt="Luxury";
	  price=10000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 3:
				System.out.println("\n-----------------Welcome To Hotel Atithi----------------");
	ho="Hotel Atithi";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           4000\n"
				  		+            "3.     Luxury           5000");
				   n5=sc.nextInt();
				  switch(n5)
				  {
				  case 1:
					 rt="Normal";
	 price=3000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=4000;
				  break;
				  case 3:
	rt="Luxury";
					  price=5000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 4:
				System.out.println("\n------------------Welcome To Novotel----------------");
	ho="Novotel";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           3000\n"
				  		+            "2.     Deluxe           6000\n"
				  		+            "3.     Luxury           7000");
				   n5=sc.nextInt();
				  switch(n5)
				  {
				  case 1:
					  rt="Normal";
	price=3000;
				  break;
				  case 2:
					   rt="Deluxe";
	price=4000;
				  break;
				  case 3:
	rt="Luxury";
					  price=7000;
				  break;
				  }

				System.out.println("Per day charges"+price);
				break;

				case 5:
				System.out.println("\n----------------------Welcome To Conrad------------------");
	ho="Conrad";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           5000\n"
				  		+            "2.     Deluxe           8000\n"
				  		+            "3.     Luxury           10000");
				  n5=sc.nextInt();
				  switch(n5)
				  {
				  case 1:
					 rt="Normal";
	 price=5000;
				  break;
				  case 2:
					 rt="Deluxe";
	  price=8000;
				  break;
				  case 3:
	rt="Luxury";
					  price=10000;
				  break;
				  }

				System.out.println("Per day charges "+price);
				break;

				case 6:
				System.out.println("\n--------------------Welcome To La Marvella-------------------");
	ho="La Marvella";
				 System.out.println("Select Room Type");
				 System.out.println();
				  System.out.println("------------------------------------");
				  System.out.println("Sr.No  Type             Price/day  ");
				  System.out.println("-----------------------------------");
				  System.out.println("1.     Normal           10000\n"
				  		+            "2.     Deluxe           15000\n"
				  		+            "3.     Luxury           20000");
				  n5=sc.nextInt();
				  switch(n5)
				  {
				  case 1:

					 
	rt="Normal";
	 price=10000;
				  break;
				  case 2:
					 rt="Deluxe";
	 price=15000;
				  break;
				  case 3:
	rt="Luxury";
					  price=20000;
				  break;
				  }
			 
				System.out.println("Per day charges "+price);
				break;
				
				default:
				System.out.println("Selection invalid");
				break;
				}
			
			break;
	}
	}
	
	System.out.println("1.Book Hotel \n2.Cancel Booking");
	int book=sc.nextInt();
	
	if(book==1)
	{
	System.out.println("\n Please Add Your Details to Book The Room..\n");
	
	System.out.println("Enter your name:");
	String bname=sc.next();			
	System.out.println("Enter your Mobile Number:");
	long bmob=sc.nextLong();
	System.out.println("Enter your email:");
	String bmail=sc.next();
	System.out.println("Enter the number of days:");
	int bdays=sc.nextInt();
	System.out.println("Enter your Check in date (Please enter Date in dd/mm/yyyy format):");
	String cin=sc.next();
	System.out.println("Enter your Check out date (Please enter Date in dd/mm/yyyy format):");
	String cout=sc.next();
	System.out.println("Enter Total Number of Persons:");
	int bperson=sc.nextInt();
	

	//System.out.println("1.Continued Booking.\n2. Cancel");
	//int n1=sc.nextInt();
	
	int btotal=bdays*price;
	System.out.println("Your Total Bill Is "+btotal);
	
		int mode ;
		int id = 0,amt = 0;
		String uId = null;
		String deNo= null;
		String crNo= null;
		String pass= null;
		String cho;		
		System.out.println("Select Payment Option:\n");
		System.out.println("1.    UPI" 
				   +"\n" + "2.    Debit Card" +"\n" 
				   		 + "3.    Credit Card" +"\n" );
		System.out.println("Select Payment Option:");
		int choice=sc.nextInt();
		String pay= null;
			switch(choice)
			{
			
			case 1: 
		 id=1;
		 pay="UPI";
		 //System.out.println(id);
		System.out.println("Enter UPI NO");
		 uId=sc.next();
		 System.out.println("Enter Payment Password");
		 pass=sc.next();
		//System.out.println("Payment amt is "+btotal);
		 //amt=sc.nextInt();
		break;
		
			case 2:	 
			     id=2;
			     pay="Debit Card";
			     //System.out.println(id);
				System.out.println("Enter Debit Card No");
				 deNo=sc.next();
				 System.out.println("Enter Payment Password");
				 pass=sc.next();
				//System.out.println("Payment amt is "+btotal);
				 //amt=sc.nextInt();			
				break;
		
			case 3:	 
			     id=3;
			     pay="Credit Card";
			     //System.out.println(id);
				System.out.println("Enter Credit Card No");
				 crNo=sc.next();
				 System.out.println("Enter Payment Password");
				 pass=sc.next();
				//System.out.println("Payment amt is "+btotal);
				 //amt=sc.nextInt();			
				break;
			 }
			if(book==1)
			{
			System.out.println("Hotel Booked Successfully");
			}
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sda2","root","");
		PreparedStatement st=con.prepareStatement("insert into hotel1 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
		st.setString(1,loc);
		st.setString(2, ho);
		st.setString(3, rt);
		st.setInt(4, price);
		st.setString(5, bname);
		st.setLong(6,bmob);
		st.setString(7, bmail);
		st.setInt(8,bdays);
		st.setString(9, cin);
		st.setString(10, cout);
		st.setInt(11, bperson);
		st.setInt(12, btotal);
		st.setString(13, uId);
		st.setString(14, crNo);
		st.setString(15, deNo);		
		st.setInt(16, id);
		st.setString(17, pass);
		st.executeUpdate();
		System.out.println("Press 1. For Generate Invoice\nPress 2. For Exit");
		int n8=sc.nextInt();
		if(n8==1)
		{
			//System.out.println("------------------------------------------------INVOICE--------------------------------------------------");
			System.out.println();
			//System.out.println("---------------------------------------------------------------------------------------------------------");
			//System.out.println("Customer Name     Hotel Name     Room Type     Price     No. of Days     Check in Date     Check Out Date");
			//System.out.println("---------------------------------------------------------------------------------------------------------");
			//System.out.println(bname+"             "+bhotel+"         "+rt+"             "+price+"     "+bdays+"           "+cin+"               "+cout);
			System.out.println("------------------------Invoice------------------------");
			System.out.println();
			System.out.print("--------------------------------------------------------");
			System.out.println("\nSr.No.  Data                         Customer Details");
			System.out.println("--------------------------------------------------------");
			System.out.println("\n1.      Customer Name          :     "+bname+
							   "\n2.      Hotel Name             :     "+ho+
							   "\n3.      Room Type              :     "+rt+
							   "\n4.      Price                  :     "+price+
							   "\n5.      Days of Living         :     "+bdays+
							   "\n6.      Number of Persons      :     "+bperson+
							   "\n7.      Check In Date          :     "+cin+
							   "\n8.      Check Out Date         :     "+cout+
							   "\n9.      Payment Type           :     "+pay);
			System.out.println("--------------------------------------------------------");
			System.out.println(  "        Total                  :     "+btotal);
			System.out.println();
			System.out.println("---------------------Thank You---------------------------");


}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("Do You Want Give Feedback\n 1. Yes\n 2. No");
	int f=sc.nextInt();
	if(f==1)
	{
		
	
	try
	{
		System.out.println("Give Your Feedback To Our Service");
		System.out.println("1.      Very Good\n"
				+ 		   "2.      Good\n"
				+ 		   "3.      Normal\n"
				+  		   "4.      Poor\n"
				+ 		   "5.      Very Poor");
		String fd=null;
		int fdb=sc.nextInt();
		switch (fdb)
		{
		case 1:
			fd="Very Good";
			break;
		case 2:
			fd="Good";
			break;
		case 3:
			fd="Normal";
			break;
		case 4:
			fd="Poor";
			break;
		case 5:
			fd="Very Poor";
			break;
			default:
				System.out.println("Thank You");
				break;
				
				
		}
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sda2","root","");
		PreparedStatement st=con.prepareStatement("insert into feedback values(?,?,?,?)");
		st.setString(1, bname);
		st.setString(2, ho);
		st.setString(3, rt);
		st.setString(4, fd);
		st.executeUpdate();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	}
	
	else {
		System.out.println("Thank you for Visiting..!!");
		}
	}


}

