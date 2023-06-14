package Problems;

import java.util.Scanner;

public class runningSumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		int sum=0;
		for(int i =0;i<n;i++) {
			sum+=arr[i];
			System.out.print(sum+" ");
		}
	}

}
