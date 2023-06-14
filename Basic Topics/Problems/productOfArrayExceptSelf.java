package Problems;

import java.util.Scanner;

public class productOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int output[]=new int[n];
		for(int i=0;i<n;i++) {
			output[i]=1;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					continue;
				}
				output[i]*=arr[j];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(output[i]+" ");
		}
	}

}
