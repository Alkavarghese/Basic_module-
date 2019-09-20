package qn6;

import java.util.Scanner;

public class Retest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,j;
		int count=0;
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
		for(j=0;j<size;j++)
		{
			if(marks[j]<50)
				count++;
		}
		System.out.println("the no.of students appearing for retest is "+count);
	}

}
