package qn1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[]args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the  List size");
		int n=s.nextInt();
		
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter List index["+i+"]");
			String no=s.next();
			list.add(no);
			
		}
		
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
	}

}
