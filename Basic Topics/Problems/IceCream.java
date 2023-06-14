package Problems;

import java.util.Scanner;

public class IceCream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int arr[]=new int[n+1];
	        for(int i =1;i<=n;i++){
	            arr[i]=s.nextInt();
	        }
	        int min=arr[1];
	        for(int i=1;i<=n;i++){
	            if(arr[i]<min){
	                min=arr[i];
	            }
	        }
	        for(int i=1;i<=n;i++){
	            if(arr[i]==min){
	                System.out.println(i);
	            }
	        }
	}

}
