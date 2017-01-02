package codeforces;

import java.util.Scanner;

public class Expression {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
				
		int total = a+b*c;
		if(total < a*(b+c)) total = a*(b+c);
		if(total < a*b*c) total = a*b*c;
		if(total < (a+b)*c) total = (a+b)*c;
		
		System.out.println(total);
	}
}
