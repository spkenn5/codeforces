package codeforces;

import java.util.Scanner;

public class PatrickAndShopping {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] distances = new int[3];
		int total = 0;
		for(int i = 0; i < distances.length;i++)
			distances[i] = in.nextInt();
		if(distances[0] + distances[1] > distances[2]){
			total+=(distances[0]+distances[1]) + distances[2];
		}else{
			total+=(distances[0]+distances[1])*2;
		}
		System.out.println(total);
	}
}
