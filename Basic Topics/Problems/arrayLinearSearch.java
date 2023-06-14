package Problems;

import java.util.Scanner;

public class arrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m =s.nextInt();
		System.out.println(search(m,arr));
	}
	public static int search(int m,int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==m) {
				return i;
			}
			}
		return -1;
	}

}
