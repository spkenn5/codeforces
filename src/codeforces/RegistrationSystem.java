package codeforces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RegistrationSystem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String,Integer> names = new LinkedHashMap<>();
		int n = in.nextInt(); in.nextLine();
		int i = 0;
		while (i < n){
			String name = in.nextLine();
			if(names.containsKey(name)){
				int val = names.get(name);
				names.put(name, (val+1));
				System.out.println(name+val);
			}else{
				names.put(name, 1);
				System.out.println("OK");
			}
			i++;
		}			
	}
}
