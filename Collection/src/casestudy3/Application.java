package casestudy3;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner s=new Scanner(System.in);
		//LinkedHashSet<String> list=new LinkedHashSet();
		ArrayList<String> list=new ArrayList<String>();
		for(int i=0;i<25;i++) {
		System.out.println("1.Display installed applications");
		System.out.println("2.Install an applications");
		System.out.println("3.Uninstall an applications");
		System.out.println("4.Quit");
		int n=s.nextInt();
		if(n==1) {
			if(list.isEmpty())
				System.out.println("There is no application installed.");
			else {
				Iterator itr1=list.iterator();
			System.out.println("Installed applications are:");
			int j=0;
			while(itr1.hasNext())
			{ 
				j++;
				System.out.println(j+" "+itr1.next());
				
			}
		}}
		
	    if(n==2) {
	    	System.out.println("Enter the name:");
	    name=s.next();
	    list.add(name);
	    System.out.println("Application installed successfuly.");
	    }
	    if(n==3) {
	    	Iterator itr1=list.iterator();
			System.out.println("Installed applications are:");
			int j=0;
			while(itr1.hasNext())
			{
				j++;
				System.out.println(j+""+itr1.next());
				
			}
			System.out.println("Enter the application number :");
			int l=list.size();
			int no=s.nextInt();
			if(no>l)
				System.out.println("Application not found");
			else {
				
			
			list.remove(no-1);
			System.out.println("Application uninstalled successfully.");}
	    }
	    if(n==4)
	    	System.exit(0);

	}
	}
}
