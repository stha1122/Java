package Problems;

import java.util.Scanner;

public class maxCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		while(n>0) {
			int size=s.nextInt();
			int arr[]=new int [size];
			int total=0;
			for(int i=0;i<size;i++) {
				arr[i]=s.nextInt();
				total+=arr[i];
				arr[i]=-arr[i];
			}
		
//			for(int i=0;i<arr.length;i++) {
//				min=Math.min(arr[i],min);
//			}
			int max_ending=0,max_so_far=0;
			for(int i=0;i<arr.length;i++) {
				max_ending+=arr[i];
				if(max_ending<=0) {
					max_ending=0;
				}
			   if(max_so_far<max_ending){
				max_so_far=max_ending;
				}
				
			}

		int sum=total -(-max_so_far);
			System.out.println(Math.max(total, sum));
			n--;
		}
	}

}
