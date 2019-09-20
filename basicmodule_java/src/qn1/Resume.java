package qn1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Resume {
	
	public static void main(String[] args) throws IOException
	{
		String name;
		String age;
		String degree;
		String branch;
		String contactNumber;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		name=br.readLine();
		System.out.println("Enter your age");
		age=br.readLine();
		System.out.println("Enter your degree");
		degree=br.readLine();
		System.out.println("Enter your branch");
		branch=br.readLine();
		System.out.println("Enter your contact number");
		contactNumber=br.readLine();
		Student a=new Student(name, age, degree, branch, contactNumber);
		a.register(name, age, degree, branch, contactNumber);

	}

}
