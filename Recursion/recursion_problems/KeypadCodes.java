package recursion_problems;

import java.util.Scanner;

import Problems.count_digits;

public class KeypadCodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String arr[] = {"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
	
		generate(arr,str,"");
		System.out.println();
		System.out.println(count(arr,str,"",0));
	}

	private static void generate(String[] arr, String str, String string) {
		if(str.length()==0) {
			System.out.print(string+" ");
			
			return;
		}
		int btnnum=str.charAt(0);
		btnnum=btnnum-48;
		str=str.substring(1);
		String code=arr[btnnum];
		for(int i=0;i<code.length();i++) {
			char ch = code.charAt(i);
			generate(arr, str, string+ch);
		}
		
	}
	
	private static int count(String[] arr, String str, String string, int count) {
		if(str.length()==0) {
			
			count++;
			return count;
		}
		int btnnum=str.charAt(0);
		btnnum=btnnum-48;
		str=str.substring(1);
		String code=arr[btnnum];
		for(int i=0;i<code.length();i++) {
			char ch = code.charAt(i);
			 count =count(arr, str, string+ch, count);
		}
		return count;
	}

}
