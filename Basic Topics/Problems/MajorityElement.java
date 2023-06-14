package Problems;

import java.util.Scanner;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int j=0;j<n;j++) {
			int m=arr[j],count=0;
		for(int i=j;i<n;i++) {
			if(m==arr[i]) {
			count++;	
			}
		}
		if(count>n/2) {
			System.out.println(arr[j]);
		}
		}
	}

}
