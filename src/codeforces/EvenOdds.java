package codeforces;

import java.util.Scanner;

public class EvenOdds{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long n = in.nextLong(), k = in.nextLong();
				
		if(k%2==0)k++;
		if(k<=n/2) System.out.print(1 + (k-1) *2);
		else System.out.print(2 + (k-n/2-1)*2);
				
	}
}
