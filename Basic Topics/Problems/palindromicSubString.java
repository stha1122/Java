package Problems;

import java.util.Scanner;

public class palindromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=0;
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=i,k=i;j<str.length();j++) {
				
				int start=k;
				int end=j;
				if(start!=end) {
					int p=0;
				 p+=palindrome(str,start,end);
				 if(p>0) {
				n+=p;}
//				for(int g=start;g<=end;g++) {
//					System.out.print(str.charAt(g));
//					}
//			System.out.println("=============================================");
				}
			
				
				}
			
			
	}
		System.out.println(n);
			}
		

		
			
		
	
		
	
	public static int palindrome(String str,int start,int end) {
	
		while(start<end) {
			if(str.charAt(start)==str.charAt(end)) {
				start++;
				end --;
			}
			else {
			
				return 0;
			}
		}
		
		return 1;
	}

}

