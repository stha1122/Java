package Problems;

import java.util.Scanner;

public class formMinimumNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String arr[]=new String[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.next();
		}
		for(int i=0;i<arr.length;i++) {
			int count1=arr[i].length();
			char first=arr[i].charAt(0);
			int num=0;
			int count=count1+1;
			if(first=='I') {
				 num=1;
				while(num<=count) {
					System.out.print(num);
					num++;
				}
			}
			else {
				num=count;
				while(num>0) {
					System.out.print(num);
					num--;
				}
			}
			System.out.println();
		}
		
	}

}
