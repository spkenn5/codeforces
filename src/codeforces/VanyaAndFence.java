package codeforces;

import java.util.Scanner;

public class VanyaAndFence {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] nh = in.nextLine().split(" ");
		int n = Integer.valueOf(nh[0]);
		int h = Integer.valueOf(nh[1]);
		String[] kids = in.nextLine().split(" ");
		int total = 0;

		for (String kid : kids) {
			if (Integer.valueOf(kid) > h) {
				total += 2;
			} else {
				total += 1;
			}
		}

		System.out.println(total);
	}
}
