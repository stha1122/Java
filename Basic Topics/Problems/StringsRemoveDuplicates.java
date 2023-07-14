package Problems;

import java.util.Scanner;

public class StringsRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)!=str.charAt(i+1)) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println("=============================");
		if(str.charAt(str.length()-2)==str.charAt(str.length()-1)) {
			System.out.println(str.charAt(str.length()-1));

			System.out.println("=============================");
		}
		else {
			System.out.println(str.charAt(str.length()-1));
		}
	}//dude try recursion approach //stack

}
