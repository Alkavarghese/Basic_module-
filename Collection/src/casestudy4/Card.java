package casestudy4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
Map<String,Integer> hm=new HashMap<String,Integer>();
for(int i=0;i<n;i++) {
	String a=s.next();
	int b=s.nextInt();
hm.put(a, b);

}

	}

}
