package recursion_problems;

import java.util.Scanner;

public class RecursionAsciiSubsequences {
static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str=s.next();
		sub(0,str,"");
		System.out.println();
		System.out.println(count);
	}

	private static void sub(int i, String str, String res) {
		// TODO Auto-generated method stub
		if(i==str.length()) {
			
			System.out.print(res+" ");
			count++;
		return;	
		}
		char ch=str.charAt(i);
		sub(i+1,str,res);
		sub(i+1,str,res+ch);
		sub(i+1,str,res+(int)ch);
	}

}
