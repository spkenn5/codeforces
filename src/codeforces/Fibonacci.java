package codeforces;

import java.util.Scanner;

public class Fibonacci {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line = in.nextLine().split(" ");
		int n = Integer.valueOf(line[0]);
		int k = Integer.valueOf(line[1]);
		
		int[] fibos = new int[n];
		
		for(int i = 0; i < n;i++){
			if(i > 1){
				fibos[i] = fibos[i-1] + fibos[i-2];
			}else{
				fibos[i] = i;
			}			
		}
		System.out.println(fibos[k]);
	}
	
}

/*
F0 = 0
F1 = 1
Fn = Fn-1 + Fn-2

*/