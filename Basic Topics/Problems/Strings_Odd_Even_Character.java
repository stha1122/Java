package Problems;

import java.util.Scanner;

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.next();
		int k=1;
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				int h=str.charAt(i);
				int res=h+k;
				str=str.substring(0, i) + (char)res
			              + str.substring(i+ 1);
			}
			else {
				int h=str.charAt(i);
				int res=h-k;
				str=str.substring(0, i) + (char)res
			              + str.substring(i+ 1);
			}
		}
		System.out.println(str);
	}

}
