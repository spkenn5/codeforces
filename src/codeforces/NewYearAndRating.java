package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NewYearAndRating {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int maximum = 100000000;
		int minimum = -100000000;
		List<Integer> pts = new ArrayList<>();		
		List<Integer> div = new ArrayList<>();
		
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n;i++){
			String line[] = in.nextLine().split(" ");
			pts.add(Integer.parseInt(line[0]));
			div.add(Integer.parseInt(line[1]));
		}
		
		if(Collections.max(div) == 1){
			System.out.println("Infinity");
			System.exit(0);
		}else{			
			for(int i = 0; i < n;i++){				
				if(div.get(i) == 2){
					if(maximum > 1899){
						maximum = 1899;
					}
				}else if(div.get(i) == 1){
					if(minimum < 1900){
						minimum = 1900;
					}
				}				
				if(maximum < minimum){
					System.out.println("Impossible");
					System.exit(0);
				}
				maximum+=pts.get(i);
				minimum+=pts.get(i);
			}
			System.out.println(maximum);	
		}
					
	}
}
