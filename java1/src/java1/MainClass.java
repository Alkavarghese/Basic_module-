package java1;
import java.util.Scanner;
public class MainClass {
	String name;
	String address;
	String contactNumber;
	String email;
	String proofType;
	String proofID;
	static int regID=0;
	public MainClass(String name,String address,String contactNumber,String email,String proofType,String proofID)
	{
      this.name=name;
	  this.address=address;
	  this.contactNumber=contactNumber;
	  this.email=email;
	  this.proofType=proofType;
	  this.proofID=proofID;
}
	public static void main(String[] args) {
		String name;
		String address;
		String contactNumber;
		String email;
		String proofType;
		String proofID;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
	    address=sc.nextLine();
		contactNumber=sc.nextLine();
		email=sc.nextLine();
		proofType=sc.nextLine();
		proofID=sc.nextLine();
	MainClass customer=new MainClass(name,address,contactNumber,email,proofType,proofID);
	 customer.register(name, address, contactNumber, email, proofType, proofID); 
		}
void register(String name,String address,String contactNumber,String email,String proofType,String proofID) 
{
	System.out.println(this.name);
	System.out.println(this.address);
	System.out.println(this.contactNumber);
	System.out.println(this.proofType);
	System.out.println(this.proofID);
	System.out.println("Thanks for regestering.Your regID is"+ ++regID);
}
}
