package codeforces;

import java.util.Scanner;

public class Translation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		int total = 0;
		if(a.length() == b.length()){
			for(int i = 0; i < a.length();i++){
				if(a.charAt(i) == b.charAt((b.length()-1)-i)) 
					total++;
			}
			if(total == a.length())
				System.out.println("YES");
			else
				System.out.println("NO");
		}else{
			System.out.println("NO");
		}
	}
}
