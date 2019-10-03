package qn4;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				Scanner s=new Scanner(System.in);
				System.out.println("Enter the  List size");
				int n=s.nextInt();
				
				LinkedList<String> list=new LinkedList<String>();
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter List index["+i+"]");
					String no=s.next();
					list.add(no);
					
				}
				list.remove(4);
				list.add(2,"Welcome");
				Iterator itr1=list.iterator();
				while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}
		

	}

}
