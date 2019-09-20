package qn3;

import java.util.Scanner;

public class height {
public static void main(String[] args) {
		int size,i,j;
		float temp;
		float[] height;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students");
		size=s.nextInt();
		System.out.println("Enter the heights of students");
		height=new float[size];
		for(i=0;i < size;i++)
		{
			height[i]=s.nextFloat();
		}
		for(i=0;i < size;i++)
		{
		for(j=i+1;j<size;j++)
		{
			if (height[i]>height[j])
			{
				temp=height[i];
				height[i]=height[j];
				height[j]=temp;
			}
		}
		}
      for( i=0;i<size;i++)
      {
    	  System.out.println(height[i]);
      }
}
}
