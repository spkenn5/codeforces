package codeforces;

import java.util.Scanner;

public class NewYearAndHurry {
	public static void main(String[] args) {
		int max = 240;
		int problems = 0;
		int total = 0;
		Scanner in = new Scanner(System.in);
		String[] line = in.nextLine().split(" ");
		int n = Integer.parseInt(line[0]);
		int k = Integer.parseInt(line[1]);
		max-=k;
		
		for(int i = 1; i <= n;i++){
			total+=(i*5);			
			if(total<=max){				
				problems++;							
			}						
		}			
		System.out.println(problems);
	}
}
