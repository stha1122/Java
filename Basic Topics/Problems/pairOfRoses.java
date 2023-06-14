package Problems;

import java.util.Scanner;

public class pairOfRoses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),a=0,b=0;
		while(n>0) {
			int m=s.nextInt();
			int[] arr=new int[m];
			for(int i=0;i<m;i++) {
				arr[i]=s.nextInt();
			}
			int sum=s.nextInt();
			int diff=arr[0]-arr[1];
			for(int i=0;i<m;i++) {
				for(int j=0;j<m;j++) {
					if(arr[i]+arr[j]==sum) {
						if(arr[i]-arr[j]<=diff) {
							 a=arr[i];
							 b=arr[j];
						}
					}
				}
			}
			System.out.println("Deepak should buy roses whose prices are "+a+" and "+b);
			System.out.println();
			n--;
			
		}
	}

}
