package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BitPlusPlus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<String> text = new ArrayList<>();
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n;i++){
			String tmp = in.nextLine();
			text.add(tmp);
		}
		
		int total = 0;
		for(String str : text){
			if(str.charAt(0) == '+'){
				++total;
			}else if(str.charAt(0) == '-'){
				--total;
			}else if(str.charAt(1) == '+'){
				total++;
			}else if(str.charAt(1) == '-'){
				--total;
			}
		}
		
		System.out.println(total);
	}
}