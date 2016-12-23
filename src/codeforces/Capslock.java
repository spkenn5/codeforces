package codeforces;

import java.util.Scanner;

public class Capslock {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int upped = 0;
		char[] chars = str.toCharArray();
		for(int i = 0; i < chars.length;i++){
			if(Character.isUpperCase(chars[i])){
				upped++;
			}
		}
		if(upped == chars.length){
			for(int i = 0; i < chars.length;i++){
				chars[i] = Character.toLowerCase(chars[i]);							
			}
		}else if(upped == (chars.length-1) && Character.isLowerCase(chars[0])){
			for(int i = 0; i < chars.length;i++){
				if(i == 0) chars[i] = Character.toUpperCase(chars[i]);
				if(i > 0) chars[i] = Character.toLowerCase(chars[i]);				
			}
		}
		System.out.println(String.valueOf(chars));
	}
}