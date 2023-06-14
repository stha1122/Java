package recursion;

public class maxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,36,12,48,23};
int s=0;
System.out.println(maxvalue(arr,0));
	}
	public static int maxvalue(int arr[],int s) {
		if(s==arr.length) {
			return Integer.MIN_VALUE;
		}
		int sp=maxvalue(arr,s+1);
		return Math.max(arr[s],sp);
	}

}
