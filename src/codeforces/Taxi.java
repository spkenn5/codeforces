package codeforces;

import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int curr = 0;
		int trips = 1;
		int groups = in.nextInt();
		in.nextLine();
		for(int i = 1; i <= groups;i++){
			int batch = in.nextInt();
			if(curr+batch >= 3) {
				curr=0;
				trips++;
			}else{
				curr+=batch;
			}
		}				
		System.out.println(trips);
	}
}
