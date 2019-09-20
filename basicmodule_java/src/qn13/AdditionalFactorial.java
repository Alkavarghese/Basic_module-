package qn13;

import java.util.Scanner;

public class AdditionalFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,add=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		num=s.nextInt();
		if(num<0)
		{
			System.out.println("Enter the number ");
		num=s.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			add=i+add;
		}
		System.out.println("the additional factorial is "+add);
	}
		
			
	}
}

