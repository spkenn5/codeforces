package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] girl = in.nextLine().toCharArray();
		Set<Character> girls = new HashSet<>();
		for(Character c : girl) girls.add(c);
		if(girls.size()%2 == 0){
			System.out.println("CHAT WITH HER!");
		}else{
			System.out.println("IGNORE HIM!");
		}
	}
}
