package qn9;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
Scanner s=new Scanner(System.in);
System.out.println("Enter a year");
num=s.nextInt();
if(num%4==0)
{
	if(num%100==0)
	{
		if(num%400==0)
		{
			System.out.println("it is a leap year");
		}
		else
		{
			System.out.println("it is not a leap year");
		}
	}
	else
	{
		System.out.println("it is  a leap year");
	}
}
else
{
	System.out.println("it is not a leap year");
}
	}

}
