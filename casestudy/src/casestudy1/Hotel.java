package casestudy1;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rNo,i,j=1 ;
		int b,c,d,e,f,total;
		int roomNo=0;
		int[] booked=new int[26];
		String ac,cot,cable,wifi,laundry,proceed;
		Scanner s=new Scanner(System.in);
		for( i=0;i<25;i++)
		{
		System.out.println("Menu");
		System.out.println("1.Book");
		System.out.println("2.Check Status");
		System.out.println("3.Exit");
		System.out.println("Enter your choice");
		n=s.nextInt();
		s.nextLine();
		if(n==1)
		{
			System.out.println("booking");
			System.out.println("Please choose the service required");
			System.out.println("AC/non-AC");
			ac=s.nextLine();
			if (ac.equalsIgnoreCase("ac"))
				b=750;
			else 
				b=0;
			System.out.println("cot(single/double)");
			cot=s.nextLine();
			if (cot.equalsIgnoreCase("single"))
					c=350;
				else 
					c=700;
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable=s.nextLine();
			if (cable.equalsIgnoreCase("c"))
					d=50;
				else 
					d=0;
			System.out.println("Wi-Fi needed or not(W/nW)");
			wifi=s.nextLine();
			if (wifi.equalsIgnoreCase("w"))
					e=100;
				else 
					e=0;
			System.out.println("Laundry service needed or not(L/nL)");
			laundry=s.nextLine();
			if (laundry.equalsIgnoreCase("l"))
					f=100;
				else 
					f=0;
			System.out.println("the services chosen are:");
			total=b+c+d+e+f;
			System.out.println("The total charge is Rs."+total);
			System.out.println(""+cot+ " cot " +ac +" room");
			if(cable.equals("C")||cable.equals("C"))
			 System.out.println("cable connection enabled");
			else
				 System.out.println("cable connection not enabled");
			if(wifi.equals("W")||wifi.equals("w"))
				 System.out.println("WiFi enabled");
				else
					 System.out.println("wifi not enabled");
			if(laundry.equals("L")||laundry.equals("l"))
				 System.out.println("with laundry service");
				else
					 System.out.println("without laundry service");
			System.out.println("Do you want to proceed?(yes/no)");
			proceed=s.nextLine();
			if( proceed.equalsIgnoreCase("yes"))
			{
			booked[j]=1;
			System.out.println("Thank you for booking.Your room number is:" +j);
			j=j+1;
			}
			
			else
				System.out.println("Thanks for visiting our site");
	}
  if (n==2)
  {
	  System.out.println("Check Status:");
	  System.out.println("enter room mumber:");
	  rNo=s.nextInt();
	  s.nextLine();
	  if(booked[rNo]==1)
		  System.out.println("Room no "+rNo+ "is booked");
	  else
		  System.out.println("Room no "+rNo+ "is not booked");
  }
  if (n==3) {
	  System.exit(0);
	  }
}
		}}
