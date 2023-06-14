package Problems;

public class arrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40};
		int[] arr2= {1,2,3,4};
		System.out.println(arr1[0]+ " "+arr2[0]);
		swap(arr1,arr2,0);
		System.out.println(arr1[0]+ " "+ arr2[0]);
		}
	public static void swap(int[]arr1,int[]arr2,int c) {
		//int[] temp=arr1;
		//arr1=arr2;
		//arr2=temp;
		int d=arr1[c];
		arr1[c]=arr2[c];
		arr2[c]=d;
		
	}
	}


