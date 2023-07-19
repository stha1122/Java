package recursion_problems;

import java.util.Scanner;

public class Recursion_Subsequences {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String str= s.next();
String team="";

printsubstring(str,team);
System.out.println();
System.out.println(count);
	}

	private static void printsubstring(String str, String team) {
		if(str.isEmpty()) {
			System.out.print(team+" ");
			count++;
			return;
					}
	String nstr=str.substring(1);
	char c = str.charAt(0);
	printsubstring(nstr,team+"");
	printsubstring(nstr,team+c);
}

}
