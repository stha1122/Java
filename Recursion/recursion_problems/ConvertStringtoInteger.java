package recursion_problems;

import java.util.Scanner;

public class ConvertStringtoInteger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		generate(str,0,0);
		}

	private static void generate(String str, int i, int value) {
		if(i>=str.length()) {
			System.out.println(value);
			return;
		}
		int num=str.charAt(i);
		num=num-48;
	
		value=(value*10)+num;

		generate(str, i+1, value);
	}

}
