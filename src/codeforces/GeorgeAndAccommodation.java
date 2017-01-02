package codeforces;

import java.util.Scanner;

public class GeorgeAndAccommodation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int totalRoom = 0;
		int n = in.nextInt(); in.nextLine();
		for(int i = 0; i < n;i++){
			String[] line = in.nextLine().split(" ");
			int occ = Integer.valueOf(line[0]);
			int cap = Integer.valueOf(line[1]);
			if(occ < cap && (cap-occ) >= 2){				
				totalRoom++;
			}
		}
		System.out.println(totalRoom);			
	}
}
