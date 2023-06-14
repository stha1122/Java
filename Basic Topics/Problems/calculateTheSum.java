package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class calculateTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int arrnew[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m=s.nextInt();
		while(m>0) {
		int x=s.nextInt();

		for(int i=0;i<n;i++) {
			if(i<x) {
				arrnew[i]=arr[i]+arr[n-x];
			}
			else {
				arrnew[i]=arr[i]+arr[i-x];
			}
		}
		for(int i=0;i<n;i++) {
			arr[i]=arrnew[i];
		}
		System.out.println(Arrays.toString(arr));
		m--;
	}
	int sum=0;
	
	for(int i=0;i<n;i++) {
	sum+=arr[i];
	}
	System.out.println(sum);
	System.out.println(sum %((int) Math. pow(10, 9)+7));
	}
}
