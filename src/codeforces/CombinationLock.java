package codeforces;

import java.util.Scanner;

public class CombinationLock {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		char[] init = in.nextLine().toCharArray();
		char[] key = in.nextLine().toCharArray();
		int total = 0;
		
		for (int i = 0; i < n; i++) {
			int temp = 0;
			if (init[i] == '9' || init[i] == '1' || init[i] != '0' || key[i] != '0') {
				if(Character.getNumericValue(init[i]) < Character.getNumericValue(key[i])){
					total += Math.abs((10 + Character.getNumericValue(init[i])) - Character.getNumericValue(key[i]));
				}else
					total += Math.abs((Character.getNumericValue(init[i])) - (Character.getNumericValue(key[i])+10));								
			} else {
				total += Math.abs(Character.getNumericValue(init[i]) - Character.getNumericValue(key[i]));				
			}
		}
		System.out.println(total);
	}
}
