package codeforces;

import java.util.Scanner;

public class WordCapitalization {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char [] lol = str.toCharArray();
		if(Character.isLowerCase(str.charAt(0))){			
			lol[0] = Character.toUpperCase(lol[0]);
		}
		System.out.println(String.valueOf(lol));
	}
}
