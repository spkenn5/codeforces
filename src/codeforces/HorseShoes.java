package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HorseShoes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Integer> num = new HashSet<>();
		String[] s = in.nextLine().split(" ");
		for(String str : s){
			num.add(Integer.valueOf(str));
		}
		System.out.println(4-num.size());
	}
}
