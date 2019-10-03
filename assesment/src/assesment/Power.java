package assesment;

import java.util.Scanner;

public class Power {
	public static void main(String[]args) {
		int n,a,b,c,d=1,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		while(n>0)
		{
			
			a=n%10;
			n=n/10;
			c=n%10;
			
			d=(int)Math.pow(c, a);
			sum+=d;
		}
		System.out.println(sum+1);
		
	}

}
