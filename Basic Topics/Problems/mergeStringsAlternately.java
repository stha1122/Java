package Problems;

import java.util.Scanner;

public class mergeStringsAlternately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word1=s.next();
		String word2=s.next();
		String result=mergeAlternately(word1,word2);
		System.out.println(result);
	}

	private static String mergeAlternately(String word1, String word2) {
		int min=Math.min(word1.length(),word2.length());
		String result ="";
		for(int i=0;i<min;i++) {
			result+=(word1.charAt(i));
			result+=(word2.charAt(i));
		}
		if(min!=word1.length()) {
			result+=word1.substring(min,word1.length());
		}
		if(min!=word2.length()) {
			result+=word2.substring(min,word2.length());
		}
		return result;
	}

}
