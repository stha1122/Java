package recursion_problems;

import java.util.Scanner;

public class RecursionDuplicateCharacterFormatting {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
//	System.out.println("Enter a String");
	String str=s.next();
    formate(0,1,str);
		
	}
	public static void formate(int curr,int next,String str) {
		if(curr==str.length()-1) {
		System.out.println(str);
		return;}
		if(str.charAt(curr)==str.charAt(next)) {
			str=str.substring(0, next)+"*"+str.substring(next);
			next++;
			
		}
		formate(next,next+1,str);
		
	}

}
