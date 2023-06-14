package Problems;

import java.util.Scanner;

public class bookAllocationproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			int size=s.nextInt();
			int student=s.nextInt();
			int arr[]=new int [size];
			int total=0;
			for(int i=0;i<size;i++) {
				arr[i]=s.nextInt();
			}
			int min=arr[size-1];
			int max=getsum(arr),ans=-1;
			while(min<=max) {
				int mid=(min+max)/2;
				if(isallo(mid,arr,student)) {
					max=mid-1;
					ans=mid;
				}
				else {
					min=mid+1;
				}
			}
			System.out.println(ans);
			n--;
		}

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
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}

	private static boolean isallo(int mid, int[] arr, int student) {
		// TODO Auto-generated method stub
		int k=1,b=0,i=0;
		int pages=0;
	while(i<arr.length) {
		pages+=arr[i];
		 if(pages>mid) {
					k++;
					pages=arr[i];
				}
		 if(k>student) {
				return false;
				}
			i++;
			}
	
		return true;
	}

}
