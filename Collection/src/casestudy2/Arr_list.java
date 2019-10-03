package casestudy2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arr_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i;
		System.out.println("Enter the  List size");
		int n=s.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		for(i=0;i<n;i++) 
		{
			System.out.println("Enter  List index["+i+"]");
			String word=s.next();
			list.add(word);
		}
		ArrayList list2=new ArrayList();
		list2=(ArrayList)list.clone();
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
