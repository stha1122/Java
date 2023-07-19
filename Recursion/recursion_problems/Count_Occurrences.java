package recursion_problems;

import java.util.Scanner;

public class Count_Occurrences {
static int count=0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char c = s.next().charAt(0);   
		System.out.println(	printCount(str,c));
	}

	private static int printCount(String str,char s) {
		if(str.isEmpty()) {
			return count;
		}
		if(str.charAt(0)==s) {
			count++;
		}
		
		printCount(str.substring(1),s);
		return count;
		
	}

}
