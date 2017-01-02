package codeforces;

import java.util.Scanner;

public class PoliceRecruits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int untreated = 0;
		int occured = 0;
		for(int i = 0 ; i < n;i++){
			int tmp = in.nextInt();
			untreated+=tmp;
			if(untreated < 0) {
				occured++;
				untreated = 0;
			}
		}
		System.out.println(occured);
	}
}
