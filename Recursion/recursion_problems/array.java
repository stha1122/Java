package recursion_problems;

public class array {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int n=arr.length-1;
//		print(arr,n);
//		print3(arr,n);
		printreverse1(arr,0,4);
	}
	public static void print(int arr[],int n) {
		if(n==arr.length) {
			return;
		}
		System.out.println(arr[n]);
		print(arr,n+1);
	}
	
	public static void print2(int s,int e,int[] arr) {
		if(s>e) {
			return;
		}
		int mid=(s+e)/2;
		print2(s,mid-1,arr);
		System.out.println(arr[mid]);
		print2(mid+1,e,arr);
	}
	public static void printreverse(int arr[],int n) {
		if(n<0) {
			return;
		}
		System.out.println(arr[n]);
		printreverse(arr,n-1);
	}
	public static void printreverse1(int arr[],int s,int e) {
		if(s>e) {
			return;
		}
		int mid=(s+e)/2;
		printreverse1(arr,mid+1,e);
		System.out.println(arr[mid]);
		printreverse1(arr,s,mid-1);
	}
}
