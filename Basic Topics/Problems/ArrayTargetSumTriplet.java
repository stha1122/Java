package Problems;

import java.util.Scanner;

public class ArrayTargetSumTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();}
		int target=s.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==target) {
						System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
					}
				}
			}
		

	}
	}
}
