package codeforces;

import java.util.Scanner;

public class Football {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int dup = 0;
		boolean done = false;
		Character test = ' ';
		for(Character c : str.toCharArray()){
			if(test == ' '){
				test = c;
			}else{
				if(test == c){					
					dup++;
					if(dup == 6){
						System.out.println("YES");
						done = true;
						break;
					}
				}else{
					dup = 0;
				}
				test = c;
			}
		}
		if(!done){
			System.out.println("NO");
		}				
	}
}