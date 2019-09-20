package qn7;

import java.util.Scanner;

public class JumpledLetters {

	public static void main(String[] args) {
		int num,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of letters in your name");
		num=s.nextInt();
		for(int i=1;i<=num;i++)
		{
			fact=i*fact;
		}
		System.out.println("the number of combination is "+fact);
	}

}
