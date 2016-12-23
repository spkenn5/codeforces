package codeforces;

import java.util.Scanner;

public class Taxi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] batch = new int[4];
		int curr = 0;
		int trips = 0;
		int twos;
		int groups = in.nextInt();
		in.nextLine();
		
		for(int i = 0; i < groups;i++)
			batch[in.nextInt()-1]++;
		
		// take care of fours
		trips = batch[3];
		
		// take care of 3 and 1
		curr = Math.min(batch[2],batch[0]);
		trips+=curr;
		batch[2]-=curr;
		batch[0]-=curr;
		trips+=batch[2];
		
		// take care of 2s
		twos = batch[1]/2;
		trips+=twos;
		batch[1] = batch[1]%2;
		
		if(batch[1] == 1){
			int min = Math.min(batch[0], 2);
			batch[0]-=min;
			trips++;
		}
		
		// take care of rest
		
		while(batch[0] > 0){
			batch[0]-=4;
			trips++;
		}
				
		System.out.println(trips);
							
		
	}
}

