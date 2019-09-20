package qn11;

import java.util.Scanner;

public class auction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,j;
		int temp;
		int[] amt;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of applications");
		size=s.nextInt();
		System.out.println("Enter the amounts");
		amt=new int[size];
		for(i=0;i < size;i++)
		{
			amt[i]=s.nextInt();
		}
		for(i=0;i < size;i++)
		{
		for(j=i+1;j<size;j++)
		{
			if (amt[i]>amt[j])
			{
				temp=amt[i];
				amt[i]=amt[j];
				amt[j]=temp;
				
			}
		}
		}
		System.out.println(""+amt[size-1]);
	}

}
