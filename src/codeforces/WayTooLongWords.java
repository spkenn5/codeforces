package codeforces;

import java.util.Scanner;

public class WayTooLongWords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] text = new String[999];
		int n = in.nextInt();		
		in.nextLine();
		int i = 0;
		while (i < n) {
			text[i] = in.nextLine();
			i++;
		}
		for (int j = 0; j < n; j++) {
			if(text[j].length() > 10){
				System.out.println(String.format("%s%d%s",text[j].charAt(0),(text[j].length() - 2), text[j].charAt(text[j].length()-1)));
			}else{
				System.out.println(text[j]);
			}
		}

	}
}