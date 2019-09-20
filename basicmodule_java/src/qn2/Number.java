package qn2;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int num,power;
		int res;
		int rem;
		res=0;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int count=0;
		int temp=num;
		int a=num;
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		while(temp!=0)
		{
			rem=temp%10;
			power=(int) Math.pow(rem, count);
			res= res+power;
			temp=temp/10;
			
		}
		if(res==a)
		 System.out.println("The given number is Armstrong");
	
		else
			System.out.println("The given number is not Armstrong");
	}
}
