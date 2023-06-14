package Problems;

import java.util.Scanner;

public class rainWatertrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		while(m>0) {
		int n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int watertrapped=0;
		for(int i=0;i<arr.length;i++) {
			int left=0,right=0;
			for(int j=0;j<=i;j++) {
				left=Math.max(left, arr[j]);
			}
			for(int j=i;j<arr.length;j++) {
				right=Math.max(right, arr[j]);
			}
			watertrapped+=Math.min(left, right)-arr[i];
			
		}
		System.out.println(watertrapped);
		m--;
		}
	}

}
