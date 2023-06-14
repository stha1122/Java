package Problems;

public class search_In_2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{11,12,13,14},
				{21,22,23,24},
				{31,32,33,34},
				{41,42,43,44}
		};
		int n=42;
		int r=arr.length-1;
		int c=0;
		//it takes r+c-1 moves to find a element
		while(c<arr[0].length-1 && r>=0) {
			if(arr[r][c]==n) {
				System.out.println("True");
				break;
			}
			else if(n>arr[r][c]){
				c++;
			}
			else {
				r--;
			}
		}
	}

}
