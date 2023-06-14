package Problems;

import java.util.ArrayList;

public class arrayListaddtwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {9,9,1,0,2};
		int[] arr2= {9,2,1};
		System.out.println(add(arr1,arr2));
	}
	public static ArrayList<Integer> add(int[] arr1,int[] arr2){
		ArrayList<Integer> res=new ArrayList();
		int i =arr1.length-1;
		int j=arr2.length-1;
		int carry=0,digit=0;
		
		while(i>=0 || j>=0){
			int sum=carry;
			if(i>=0) {
				sum+=arr1[i];
			}
			if(j>=0) {
				sum+=arr2[j];
			}
			if(sum>9 && sum!=0) {
				digit=sum%10;
				carry=(sum/10);
				res.add(0,digit);
			}
			else {
				res.add(0,sum);
				carry=0;
			}
			
			i--;j--;
		}
		
		
//		while(i>=0) {
//			int sum =arr1[i]+carry;
//	
//			if(sum>9) {
//				digit=sum%10;
//				carry=(sum/10);
//			
//				res.add(0,digit);
//			}else {
//				res.add(0,sum);
//				carry=0;
//			}
//		
//			i--;
//		
//		}
//		while(j>=0) {
//			int sum =arr2[j]+carry;
//			if(sum>9 && sum!=0) {
//				digit=sum%10;
//				carry=(sum/10);
//				res.add(0,digit);
//		}else {
//				res.add(0,sum);
////				carry=0;
//			}
//		
//			j--;}
//		
		if(carry>0) {
			res.add(0,carry);
		}
		
		return res;
	}
}
