package codeforces;

import java.util.Scanner;
import java.util.Stack;

public class CPlusPlusCalc {
	public static void main(String[] args) {
		Stack<String> stack = new Stack();
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		in.nextLine();
		String exp = in.nextLine();
		exp = exp.replace('a', String.valueOf(a).charAt(0));
		for(Character c : exp.toCharArray()){
			if(Character.isDigit(c)){				
				stack.push(String.valueOf(c));
			}else{				
			}
		}
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		
		
	}
}
// 5*a++-3*++a+a++
