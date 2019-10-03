package qn6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  List size");
		int n=s.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter  List index["+i+"]");
			String word=s.next();
			list.add(word);
		}
		LinkedList list2=new LinkedList();
		list2=(LinkedList)list.clone();
		Iterator itr1=list.iterator();
		System.out.println("Actual List:");
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		Iterator itr=list2.iterator();
		System.out.println("Cloned List:");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
