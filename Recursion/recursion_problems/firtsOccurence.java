package recursion_problems;

public class firtsOccurence {

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,5,6};
		System.out.println(	firstOccurence(arr,2,0));
	
	}
	public static int firstOccurence(int arr[],int num ,int index) {
		
		if(index>arr.length-1) {
			return -1;
		}
		if(num==arr[index]) {
			return index;
			}
		return firstOccurence(arr,num,index+1);
	   
		
	}

}
