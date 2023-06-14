package Problems;
import java.util.Scanner;

public class sorting_in_linear_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();}
		
		for(int i=0;i<arr.length-1;i++) {
			int idx=i;
			while(idx>=0 && arr[idx]>arr[idx+1]) {
				int temp=arr[idx];
				arr[idx]=arr[idx+1];
				arr[idx+1]=temp;
				idx--;
			}
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");}
	}

}
