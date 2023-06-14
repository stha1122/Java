package Problems;

import java.util.Scanner;

public class painterpartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k=s.nextInt();
		int n=s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int low=getmax(arr);
		int high=getsum(arr);
		int res =-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(paintersnum(mid,arr)>k) {
				low=mid+1;
			}
			else {
				high=mid-1;
				res=mid;
			}
		}
		System.out.println(res);
	}

	private static int paintersnum(int mid, int[] arr) {
		// TODO Auto-generated method stub
		int time=0,i=0,painter=1;
		while(i<arr.length) {
			time+=arr[i];
			if(time>mid) {
				painter++;
				time=arr[i];
			}
			i++;
		}
		return painter;
	}

	private static int getsum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	private static int getmax(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}

}
