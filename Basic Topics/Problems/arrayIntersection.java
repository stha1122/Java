package Problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arr[]=new int[n];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=s.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=s.nextInt();
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
	int i=0,j=0;
	while(i<arr.length) {
		if(arr1[i]==arr2[i]) {
			arr[j]=arr1[i];
			j++;
			}
		i++;
		
	}
int count=0;
for(int k=0;k<arr.length;k++) {
	if(arr[k]!=0 ) {
		count++;
	}
	}
int ans[]=new int[count];
 i=0;j=0;
while(i<ans.length) {

		ans[i]=arr[i];
	
	i++;
}

	System.out.println(Arrays.toString(ans));
	}

}
