package Problems;

import java.util.Scanner;

public class maximum_sum_path_in_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			int m=s.nextInt();
			int o=s.nextInt();
			int[] arr=new int[m];
			for(int i=0;i<m;i++) {
				arr[i]=s.nextInt();
			}
			int[] arr2=new int[o];
			for(int i=0;i<o;i++) {
				arr2[i]=s.nextInt();
			}
			int sum=0,sum1=0,sum2=0,i=0,j=0,res=0;
			while(i<arr.length && j<arr2.length) {
				if(arr[i]<arr2[j]) {
					sum1+=arr[i];
					i++;
				}
				else if(arr[i]>arr2[j]) {
					sum2+=arr2[j];
					j++;
				}
				else {
					res+=Math.max(sum1, sum2);
					sum1=0;
					sum2=0;
					while(arr[i]==arr2[j] && i<arr.length && j<arr2.length) {
						res+=arr[i];
						i++;j++;
					}
					
				}
			}
			
			while(i<arr.length) {
				sum1+=arr[i];
				i++;
			}
			

			while(j<arr2.length) {
				sum2+=arr2[j];
				j++;
			}
			
			res+=Math.max(sum1, sum2);

			System.out.println(res);
			n--;
	}
	}

}
