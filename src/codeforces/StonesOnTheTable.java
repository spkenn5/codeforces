package codeforces;

import java.util.Scanner;

public class StonesOnTheTable {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		char[] input = in.nextLine().toCharArray();
		char tmp = ' ';
		int stones = 0;
		for(int i = 0; i < input.length;i++){			
			if(input[i] == tmp){
				stones++;
				tmp = input[i];
			}else{
				tmp = input[i];
			}
		}
		System.out.println(stones);
	}
}
