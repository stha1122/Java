package recursion_problems;

import java.util.Scanner;

public class WhatIsInTheParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		generate(str,0,-1);
	}

	private static void generate(String str, int i, int initial) {
		if(i>str.length()) {
			return;
		}
		if(str.charAt(i)==')') {
			System.out.println(str.subSequence(initial+1, i));
			return;
		}
		if(str.charAt(i)=='(') {
			initial=i;
		}
		generate(str, i+1, initial);
	}

}
