package recursion_problems;

import java.util.Scanner;

public class Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int num=s.nextInt();
		int index=-1;
		int start=0;
		System.out.println(find(start,arr,num,index));
		
	}

	private static int find(int start, int[] arr, int num, int index) {
		// TODO Auto-generated method stub
		if(start>=arr.length) {
			return index;
		}
		if(num==arr[start]) {
			index=start;
		}
		index=find(start+1,arr,num,index);
		return index;
		
	}

}
