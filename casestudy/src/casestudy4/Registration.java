package casestudy4;

import java.util.Scanner;

public class Registration {
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,a,b,c;
		String address;
		String contactNo;
		String emailID;
		String proofType;
		String proofID;
		int i,count=0;
		String d[]=new String[100];
		i=0;
		Scanner s=new Scanner(System.in);
		do
		{
			
		System.out.println("Registration");
		System.out.println("Enter your Name");
		d[i]=s.nextLine();
		System.out.println("Enter your address");
		address=s.nextLine();
		System.out.println("contactnumber");
		contactNo=s.nextLine();
		System.out.println("EmailID");
		emailID=s.nextLine();
		System.out.println("Enter proof Type");
		proofType=s.nextLine();
		System.out.println("Enter proofID");
		proofID=s.nextLine();
		++count;
		System.out.println("Thank you for registering. Your id is " +count);
		System.out.println("Do you want to continue registration (y/n)?");
		 c= s.nextLine();
		 i++;
		}while(c.equalsIgnoreCase("y"));
		 
		System.out.println("Customers list");
		System.out.println("The registered customers are");
		System.out.println("Customer ID Customer name");
		for(int j=0;j<i;j++)
		{
			System.out.println(j+"     "+d[j]);
		}
		System.out.println("Thank You");
}
	}
