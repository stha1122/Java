package Problems;

import java.util.Scanner;

public class ShortestPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cases=s.nextInt();
		while(cases>0) {
		String str=s.next();
		System.out.println(shortestpalin(str));
		
		cases--;
		}
	}

	private static String shortestpalin(String str) {
		// TODO Auto-generated method stub
		String rev=new StringBuilder(str).reverse().toString();
		String l=str+"#"+rev;
		int[]p=new int[l.length()];
		for(int i=1;i<l.length();i++) {
			int j=p[i-1];
			while(j>0 && l.charAt(i)!=l.charAt(j))
			{
				j=p[j-1];
			}
			
			if(l.charAt(i)==l.charAt(j)) {
				p[i]=j+1;
			}
		}
		return rev.substring(0,str.length()-p[l.length()-1])+str;
	}
}
