package codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sol = 0;
		List<String> list = new ArrayList<>();		
		in.nextLine();
		for(int i = 0; i < n;i++){
			String tmp = in.nextLine();
			list.add(tmp);
		}
		for(String str : list){
			int dup = 0;
			for(Character c : str.toCharArray()){
				if(c == '1') dup++;
			}
			if(dup > 1) sol++;
		}
		System.out.println(sol);
	}
}