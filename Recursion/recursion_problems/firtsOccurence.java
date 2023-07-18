package recursion_problems;

import java.util.Scanner;

public class firtsOccurence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[]= {1,2,3,2,4,5,6};
		System.out.println(	firstOccurence(arr,2,0));
		int num=s.nextInt();
		int index=-1;
		int start=0;
		System.out.println(findfirst(start,arr,num,index));
	
	}
	public static int firstOccurence(int arr[],int num ,int index) {
		
		if(index>arr.length-1) {
			return -1;
		}
		if(num==arr[index]) {
			return index;
			}
		return firstOccurence(arr,num,index+1);
	   
		
	}
	private static int findfirst(int start, int[] arr, int num, int index) {
		if(start>=arr.length) {
			return index;
		}
		if(num==arr[start]) {
			index=start;
			return index;
		}
		index=findfirst(start+1,arr,num,index);
		return index;
	}
}
