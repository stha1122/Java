package Problems;

import java.util.Scanner;

public class anagrampalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cases=s.nextInt();
		while(cases>0) {
		String str=s.next();
		int arr[]=new int[26];
		for(int i=0;i<str.length();i++) {
			int index=str.charAt(i)-'a';
			arr[index]+=1;
		}
		int oddcount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddcount+=1;
			}
		}
		if(oddcount>1) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		cases--;
		}
		
	}

}
