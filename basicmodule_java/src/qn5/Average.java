package qn5;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,i,j;
		int sum = 0;
		float avg;
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
			sum+=marks[j];
		}
avg=sum/size;
System.out.println("average:"+avg);

	}

}
