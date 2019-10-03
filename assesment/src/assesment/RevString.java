package assesment;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


Scanner s=new Scanner(System.in);
//String rev;
String n=s.nextLine();
int a=n.length();
for(int i=a-1;i>=0;i--)
{
	System.out.print(n.charAt(i));	
}

	}

}
