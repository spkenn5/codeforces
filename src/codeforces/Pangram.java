package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Character> chars = new HashSet<>();
		int n = in.nextInt(); in.nextLine();
		String str = in.nextLine().toLowerCase();
		for(Character c : str.toCharArray()){
			chars.add(c);
		}
		if(chars.size() == 26){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}		
	}
}
