package codeforces;

import java.util.Scanner;

public class Tram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int max = 0,pass = 0;
		for(int i = 0; i < n;i++){
			String str = in.nextLine();		
			pass-= Integer.valueOf(str.split(" ")[0]);
			pass+= Integer.valueOf(str.split(" ")[1]);
			if(pass > max) max = pass;
		}
		System.out.println(max);
	}
}
