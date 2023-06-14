package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class sortJustzeroesAndOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			arr[i]=0;
		}
		for(int i=count;i<n;i++) {
			arr[i]=1;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
