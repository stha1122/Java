package Problems;

public class arryaQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		//print(arr);
		//reverse(arr);
		//Reverse(arr);
		//System.out.println();
		print(arr);
		System.out.println();
		rotate_clockwise(arr,1);
		print(arr);
		
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void reverseprint(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}}
		
	public static int Max(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				}
		}
		return max;
		}
	public static int find(int[] arr) {
		int alli=99;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==alli) {
				return i;
			}
		}
		return -1;
	}
 public static void Reverse(int[] arr,int l,int r) {
		while(l<r) {
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
			l++;r--;
		}
	}
	public static void rotate_clockwise(int[] arr,int rot) {
		rot=rot%arr.length;
		if(rot<0) {
			rot+=arr.length;
		}
		//for(int j=0;j<rot;j++) {
		//int jeb=arr[arr.length-1];
		//for(int i=arr.length-1;i>0;i--) {
			//arr[i]=arr[i-1];
		//}
		//arr[0]=jeb;
		//}
		//more efficient one wihtout many loops
		Reverse(arr,0,arr.length-1);
		Reverse(arr,0,rot-1);
		Reverse(arr,rot,arr.length-1);
	}
	public static void rotate_anticlockwise(int[] arr,int rot) {
		//anticlockwise rotation means rot will be equal to negative number inorder to get suitable +tive add it with arr.length 
		rot=rot%arr.length;
		for(int j=0;j<rot;j++) {
		int jeb=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=jeb;
		}
	}
	public static void reverse1(int[] arr) {
		for(int i=arr.length-1,j=0;j<i;i--,j++) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
	}
}
}
	
	


