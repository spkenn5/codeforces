package codeforces;

import java.util.Scanner;

public class NextRound {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] line = in.nextLine().split(" ");
		int n = Integer.valueOf(line[0]);
		int k = Integer.valueOf(line[1]);
		int total = 0;
		line = in.nextLine().split(" ");
		for (int i = 0; i < line.length; i++) {
			if (Integer.valueOf(line[i]) >= Integer.valueOf(line[k-1]) && Integer.valueOf(Integer.valueOf(line[i])) > 0) {
				total++;
			}
		}
		System.out.println(total);
	}
}
