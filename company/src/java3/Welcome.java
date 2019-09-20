package java3;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);




	      System.out.println("enter the  String :");
	      
	     String str= sc.next();

	     int v=0,c=0;;
	     for(int i=0;i<str.length();i++)
	     {
	     char ch = str.charAt(i);
	     if(ch =='A' || ch=='a'|| ch == 'E'||ch=='e' || ch == 'I'
	                   ||ch=='i' || ch == 'O' ||ch=='o'||ch=='u'|| ch == 'U') {

	                   v++;
	                   for(int j=0;j<v;j++)
	                   {

	       System.out.print("*");
	                   }
	                   System.out.print(ch);
	                   for(int j=0;j<v;j++)
	                   {
	       System.out.print("*");
	                   }
	                
	                  
	                
	                }
	     else
	     {

	     System.out.print(ch);
	     //c++;
	     }
	     }

	}

	}