package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

	public static void main(String[] args) {
		// ODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
	 int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
	
		int start=arr[0];
		int end=arr[n-1];
		
		int id=arr[0];
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(ispossible(mid,arr,c)) {

				id=mid;
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
	System.out.println(id);
			
		}
	public static boolean ispossible(int idx,int arr[],int totlc) {
		int prev=arr[0];
		int c=1;
		for(int pos : arr) {
			if(prev+idx<=pos) {
				c++;
				prev=pos;
				
			}
		
		}
//		System.out.println("done");
		if(c==totlc) {
			return true;
		}
		return false;
	}
	
		
}	



