package codeforces;

import java.util.Scanner;

public class Chatroom {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int dup = 0;
		for(int i =0 ; i < str.length();i++){
			if(str.charAt(i) == 'h' && dup == 0){
				dup++;
			}else if(str.charAt(i) == 'e' && dup == 1){
				dup++;
			}else if(str.charAt(i) == 'l' && dup == 2){
				dup++;
			}else if(str.charAt(i) == 'l' && dup == 3){
				dup++;
			}else if(str.charAt(i) == 'o' && dup == 4){
				dup++;
			}
		}
		if(dup == 5){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
	}
}
