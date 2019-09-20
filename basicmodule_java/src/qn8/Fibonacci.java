package qn8;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		//int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		n=s.nextInt();
		int a=0;
		int b=1;
		System.out.println("" +a);
		for(i=0;i<=n;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println("" +sum);
		}
		
		
	}

}
