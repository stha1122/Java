package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class minimumSwaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int j=0;j<n-1;j++) {
			int min=arr[j];
			int indx=j;
			for(int i=j+1;i<n;i++) {
				if(min>arr[i]){
					min=arr[i];
					indx=i;
					}
			}
			System.out.println(Arrays.toString(arr));
				arr[indx]=arr[j];
				arr[j]=min;
				count++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

}
