package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
String str =s.nextLine();
System.out.println(reverse(str));

	}

	private static String reverse(String str) {
		String[] words =str.split(" +");
		StringBuilder sb=new StringBuilder() ;
		for(int i=words.length-1;i>=0;i--) {
			sb.append(words[i]);
			sb.append(' ');
		}
		return sb.toString().trim();	
	}

}
