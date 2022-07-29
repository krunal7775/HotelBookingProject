package com.app.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Admin {
	public Admin() {
		try {
			String b;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con;
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sda2","root","");	
		System.out.println("Welcome Admin\n\n");
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Choose which action to be performed:");
		System.out.println(" 1. View Locations \n 2. View Hotels \n 3. View Bookings \n 4. View Feedbacks \n 5. View Invoice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		
		case 1: 
			String ch1;
			do {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from locatin");
			while(rs.next())
			{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2));}
		
		System.out.println("Do you want to add City:\nPress 1. For Yes\n2. For No");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("Enter City no");
			int cno=sc.nextInt();
		
			System.out.println("Enter City name");
			String cname=sc.next();
			PreparedStatement ps=con.prepareStatement("insert into locatin values(?,?)");
			ps.setInt(1, cno);
			ps.setString(2, cname);
			ps.executeUpdate();
			System.out.println("Record Inserted");
			
			
			}
		System.out.println("Do you want to add more cities ?\nType 'y' for Yes\nType 'n' For No");
		ch1=sc.next();
		
			}while(ch1.equalsIgnoreCase("y"));
			break;
			
			case 2: 
				String ch2;
				do {
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from hotel");
					while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
				}
				
				System.out.println("Do you want to add Hotel:\nPress 1. For Yes\n2. For No");
				int n=sc.nextInt();
				if(n==1)
				{
				System.out.println("Enter Hotel no");
				int hno=sc.nextInt();
				System.out.println("Enter Hotel name");
				String hname=sc.next();
				PreparedStatement ps=con.prepareStatement("insert into hotel values(?,?)");
				ps.setInt(1, hno);
				ps.setString(2, hname);
				ps.executeUpdate();
				
				System.out.println("Record Inserted");
				
				
				
				}
				System.out.println("Do you want to add more Hotels ?\nType 'y' for Yes\nType 'n' For No");
				 ch2=sc.next();
				}while(ch2.equalsIgnoreCase("y"));
				break;
			case 3: 
				String ch3;
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from hotel1");
				int i=1;
				while(rs.next()){
					System.out.println(i);
					System.out.println("Customer Name        :         "+rs.getString(5)+
							           "\nMobile No            :         "+rs.getLong(6)+
							           "\nHotel Location       :         "+rs.getString(1)+
							           "\nHotel Name           :         "+rs.getString(2)+
							           "\nRoom Type            :         "+rs.getString(3)+
							           "\nPrice                :         "+rs.getString(4)+
							           "\nCinDate              :         "+rs.getString(9)+
							           "\nCoutDate             :         "+rs.getString(10)+
							           "\nTotal Bill           :         "+rs.getInt(12));
			System.out.println();
			i++;
				}
				break;
			case 4:
				Statement st1=con.createStatement();
				ResultSet rs1=st1.executeQuery("select * from feedback");
				int i2=1;
				while(rs1.next())
				{
					System.out.println(i2);
					i2++;
					System.out.println("Customer Name         :       "+rs1.getString(1)+
									   "\nHotel Name            :       "+rs1.getString(2)+
									   "\nRoom Type             :       "+rs1.getString(3)+
									   "\nFeedback              :       "+rs1.getString(4));
				}
		break;
			case 5:
				Statement st2=con.createStatement();
				ResultSet rs2=st2.executeQuery("select * from hotel1");
				System.out.println("Enter Customer Name");
				String na=sc.next();
				int i1=1;
				while(rs2.next())
				{
				if(na.equals(rs2.getString(5)))
				{
				System.out.println(i1);
				System.out.println("------------------------Invoice------------------------");
				System.out.println();
				System.out.print("--------------------------------------------------------");
				System.out.println("\nSr.No.  Data                         Customer Details");
				System.out.println("--------------------------------------------------------");
				System.out.println("\n1.      Customer Name          :     "+rs2.getString(5)+
								   "\n2.      Hotel Name             :     "+rs2.getString(2)+
								   "\n3.      Room Type              :     "+rs2.getString(3)+
								   "\n4.      Price                  :     "+rs2.getInt(4)+
								   "\n5.      Days of Living         :     "+rs2.getInt(8)+
								   "\n6.      Number of Persons      :     "+rs2.getInt(11)+
								   "\n7.      Check In Date          :     "+rs2.getString(9)+
								   "\n8.      Check Out Date         :     "+rs2.getString(10));
				System.out.println("--------------------------------------------------------");
				System.out.println(  "        Total                  :     "+rs2.getInt(12));
				System.out.println();
				System.out.println("---------------------Thank You---------------------------");
				i1++;
		
		}
				}
		
		}
		System.out.println("Type 'y' for go to main menu\nElse Type 'n'");
		 b=sc.next();
		}while(b.equalsIgnoreCase("y"));
	
			
	} catch (Exception e) {
		e.printStackTrace();
	
	}

	}

}
