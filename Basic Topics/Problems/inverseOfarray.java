package Problems;

import java.util.Scanner;

public class inverseOfarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int narr[]=new int[n];
		for(int i =0;i<n;i++) {
			int d=arr[i];
			narr[d]=i;
			}
		for(int i =0;i<n;i++) {
			System.out.print(narr[i]+" ");
		}
	}

}
