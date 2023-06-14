package Problems;

import java.util.Scanner;

public class arrayBinarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m=s.nextInt();
		int start=0,end=n;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]<m) {
				start=mid+1;
			}
			else if (arr[mid]>m) {
				end=mid-1;
			}
			else{
				System.out.println(mid);
				return;
			}
		}
		System.out.println("-1");
	}

}
