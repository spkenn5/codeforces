package codeforces;

import java.util.Scanner;

public class Elephant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] steps = {1,2,3,4,5};
		int step = 0;
		int n = in.nextInt();
		for(int i = (steps.length-1); i >= 0;i--){
			if(n > 0){
				System.out.println(n);
				n%=steps[i]; 
				step++;
			}else 
				break;
		}
		System.out.println(step);
	}
}
