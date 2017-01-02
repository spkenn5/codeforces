package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Set<Character> charsets = new HashSet<>();
		int y = in.nextInt();
		
		while(charsets.size() < 4){
			y++;
			charsets = new HashSet<>();
			for(Character ch : String.valueOf(y).toCharArray()){					
				charsets.add(ch);
			}						
		}
		System.out.println(y);
	}
}
