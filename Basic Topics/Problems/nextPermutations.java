package Problems;

import java.util.Scanner;

public class nextPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			int size=s.nextInt();
			int arr[]=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=s.nextInt();
			}
			
			n--;
		}
	}
	public static int[] nextPermuataion(int arr[]) {
		int i=arr.length;
		while(i>0) {
			if(arr[i--]>arr[i]) {
				
			}
			
		}
		return arr;
	}

}
