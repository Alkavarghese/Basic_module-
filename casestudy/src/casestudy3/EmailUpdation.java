package casestudy3;

import java.util.Scanner;

public class EmailUpdation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,a,b,c;
		String address;
		String contactNo;
		String emailID;
		String proofType;
		String proofID;
		Scanner s=new Scanner(System.in);
		System.out.println("Registration");
		System.out.println("Enter your Name");
		name=s.nextLine();
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
		System.out.println("Thank you for registering. Your id is 1." );
		System.out.println("Do you want to continue registration (y/n)?");
		 c= s.nextLine();
		 if(c.equalsIgnoreCase("y"))
		 {
		 System.out.println("Do you want to update the email id?(yes/no)");
		 a= s.nextLine();
		 if(a.equalsIgnoreCase("yes"))
		 {
			 System.out.println("Update email");
			 System.out.println("Enter new emailID");
			 b= s.nextLine();
			 System.out.println("Email updated");
			 System.out.println("Your details are as follows");
			 System.out.println("Name:" +name);
			 System.out.println("Address:" +address);
			 System.out.println("Contact Number:" +contactNo);
			 System.out.println("E-Mail ID:" +b);
			 System.out.println("Proof type:" +proofType);
			 System.out.println("Proof ID:" +proofID);
		 }
		 else
		 {
			 System.out.println("Your details are as follows");
			 System.out.println("Name:" +name);
			 System.out.println("Address:" +address);
			 System.out.println("Contact Number:" +contactNo);
			 System.out.println("E-Mail ID:" +emailID);
			 System.out.println("Proof type:" +proofType);
			 System.out.println("Proof ID:" +proofID);
		 }}
		 else
		 {
			 System.out.println("Your details are as follows");
			 System.out.println("Name:" +name);
			 System.out.println("Address:" +address);
			 System.out.println("Contact Number:" +contactNo);
			 System.out.println("E-Mail ID:" +emailID);
			 System.out.println("Proof type:" +proofType);
			 System.out.println("Proof ID:" +proofID);
		 }
	

}}
