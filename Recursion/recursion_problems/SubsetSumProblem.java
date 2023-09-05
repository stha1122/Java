package recursion_problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int size=s.nextInt();

int arr[]= new int[size];
for(int i=0;i<arr.length;i++) {
	arr[i]=s.nextInt();
}
int output[]=new int[size];
int value=s.nextInt();
//Arrays.sort(arr);
//reverse(arr);
generate(0,arr,output,value,0);

	}

	private static void generate(int i, int[] arr, int[] output, int value, int sum) {
		
		if(sum==value) {
			for(int k=output.length-1;k>=0;k--) {
				if(output[k]==1) {
					System.out.print(arr[k]+" ");
				}
			}
			System.out.println();
			return;
		}
		if(i>arr.length-1 || sum>value) {
			return;
		}
		generate(i+1,arr,output,value,sum);
		output[i]=1;
		generate(i+1,arr,output,value,sum+arr[i]);
		output[i]=0;

		
		
		return;
	}
	public static void reverse(int[] array)
    {
 
   
        int n = array.length;
 
       
        for (int i = 0; i < n / 2; i++) {
 
            
            int temp = array[i];
 
          
            array[i] = array[n - i - 1];
 
           
            array[n - i - 1] = temp;
        }
}
}