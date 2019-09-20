package qn12;

import java.util.Scanner;

public class Boxingteam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size,i,j;
		int temp;
		int[] fouls,new1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of players");
		size=s.nextInt();
		System.out.println("Enter the fouls");
		fouls=new int[size];
		for(i=0;i < size;i++)
		{
			fouls[i]=s.nextInt();
		}
		new1=new int[size];
		for(i=0;i < size;i++)
		{
			new1[i]=fouls[i];
			
		}
		for(i=0;i < size;i++)
		{
		for(j=i+1;j<size;j++)
		{
			if (fouls[i]>fouls[j])
			{
				temp=fouls[i];
				fouls[i]=fouls[j];
				fouls[j]=temp;
				
			}
		}
		}
		for(i=0;i < size;i++)
		{
		if(new1[i]==fouls[0])
		{
			System.out.println("the eligible player no:"+ (i+1));
		}
	}}


	}


