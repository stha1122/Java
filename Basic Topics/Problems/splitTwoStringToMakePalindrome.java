package Problems;

import java.util.Scanner;

public class splitTwoStringToMakePalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			System.out.println("Test case "+i+" :");
			String a=s.next();
			String b=s.next();
			System.out.println("Test Case 1 output");
			System.out.println(palindrome(a,b));
			
			i++;
		}
			
	}
	
	public static boolean palindrome(String a,String b) {
		int i=0;
		int j=b.length()-1;
		int count=-1;
		while(i<a.length() && j>0) {
			if(a.charAt(i)==b.charAt(j)) {
				count ++;
				}
			else {
				break;
			}
		}
		String aprefix=a.substring(0,count);
		String asuffix=a.substring(count+1, a.length()-1);
		String bprefix=b.substring(0,count);
		String bsuffix=b.substring(count+1, b.length()-1);
		String afinal=aprefix.concat(bsuffix);
		String bfinal=bprefix.concat(asuffix);
		if(palindromefinal(afinal,0,afinal.length()-1)) {
			return true;
		}
		else if(palindromefinal(bfinal,0,bfinal.length()-1)){
			return true;
		}
		else {
			return false;
		}
		 
	}
	

	public static boolean palindromefinal(String str,int start,int end) {
	
		while(start<end) {
			if(str.charAt(start)==str.charAt(end)) {
				start++;
				end --;
			}
			else {
			
				return false;
				
			}
			
		}
		return true;
	
	}

}
