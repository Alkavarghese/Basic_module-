package qn3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Araylist {
public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the First List size");
		int n=s.nextInt();
		System.out.println("Enter the Second List size");
		int m=s.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list1=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter First List index["+i+"]");
			String no=s.next();
			list.add(no);
			
		}
		for(int i=0;i<m;i++)
		{
			System.out.println("Enter Second List index["+i+"]");
			String no=s.next();
			list1.add(no);
			
		}
		list.addAll(list1);
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
	}

}

