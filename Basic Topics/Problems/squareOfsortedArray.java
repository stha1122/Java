package Problems;

import java.util.Scanner;

public class squareOfsortedArray {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int arr[]=new int[n];
	        if(n>=1 || n<= 10000){
	        for(int i =0;i<n;i++){
	            arr[i]=s.nextInt();
	        }
	        for(int i =0;i<n;i++){
	            arr[i]=(arr[i]*arr[i]);
	        }
	        for(int i=0;i<n;i++) {
				for(int j=i;j<n;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
	        
	        for(int i=0;i<n;i++) {
	        	System.out.println(arr[i]);
	        }
	    }
        
	}

}
