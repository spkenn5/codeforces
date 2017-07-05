package codeforces;

import java.util.Scanner;

public class KefaAndFirstSteps {
	public static void main(String[] args) {
		int num,prev = 0,max = 0,temp = 1;
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = 0; i < n ;i++) {
			num = in.nextInt();
			
			if (prev > num) {
				temp = 1;
			}else {
				if(i > 0) {
					temp++;
				}
			}
			
			if(temp > max) {
				max = temp;
			}
			prev = num;
		}
		
		System.out.println(max);
	}
}
