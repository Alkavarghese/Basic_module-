package qn4;

import java.io.IOException;
import java.util.Scanner;

public class Students {
	public static void main(String[] args)
	{
		int size,i,j;
		int temp;
		int[] marks;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students");
		size=s.nextInt();
		System.out.println("Enter the marks of students");
		marks=new int[size];
		for(i=0;i < size;i++)
		{
			marks[i]=s.nextInt();
		}
		for(i=0;i < size;i++)
		{
		for(j=i+1;j<size;j++)
		{
			if (marks[i]<marks[j])
			{
				temp=marks[i];
				marks[i]=marks[j];
				marks[j]=temp;
			}
		}
		}
      for( i=0;i<size;i++)
      {
    	  System.out.println(marks[i]);
      }
}
}

