package recursion_problems;

import java.util.Scanner;

public class String_reverse {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str=s.nextLine();
	System.out.println(str);
	printreverse(str);
}

private static void printreverse(String str) {
	// TODO Auto-generated method stub
	if(str.isEmpty()) {
		return;
	}
	
		System.out.print(str.charAt(str.length()-1));
		printreverse(str.substring(0,str.length()-1 ));
		return;
	
}
}
