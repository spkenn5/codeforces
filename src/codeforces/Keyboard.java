package codeforces;

import java.util.Scanner;

public class Keyboard {
	final static String lib = "qwertyuiopasdfghjkl;zxcvbnm,./";
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String clue = in.nextLine().toLowerCase();
		char[] line = in.nextLine().toCharArray();
		int pointer = 0;
		if(clue.equals("l")){
			pointer+=1;
		}else{
			pointer-=1;
		}		
		for(Character c : line){					
			System.out.print(lib.charAt(lib.indexOf(c)+pointer));
		}								
	}
}
