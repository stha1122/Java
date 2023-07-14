package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class FormBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int cases = s.nextInt();
while(cases>0) {
	int size=s.nextInt();
	String arr[]=new String[size];
	for(int i=0;i<size;i++) {
		arr[i]=s.next();
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(compare(i,j,arr)) {
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
//				System.out.println("=======================");
			}
//			System.out.println(Arrays.toString(arr));
			
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	cases--;
}

	}

	private static boolean compare(int i, int j, String[] arr) {
		// TODO Auto-generated method stub
		String ij=arr[i]+arr[j];
		String ji=arr[j]+arr[i];
		if(ij.compareTo(ji)<0) {
			return true;
		}
		return false;
	}

}
