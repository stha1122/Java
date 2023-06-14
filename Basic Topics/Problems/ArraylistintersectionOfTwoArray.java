package Problems;

import java.util.ArrayList;

public class ArraylistintersectionOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {5,7,10,10,10,20,30,30,50,60,60,80};
		int[] arr2= {10,10,15,20,30,30,30,60,70,80,80,90};
		//System.out.println(Intersectionn(arr1,arr2));
		//System.out.println(Intersection(arr1,arr2));
		int sum=123;
	
	}
	public static ArrayList<Integer> Intersection(int[] arr1,int[] arr2){
		ArrayList<Integer> res=new ArrayList();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					res.add(arr1[i]);
					arr1[i]=-1;
					arr2[j]=-1;
				}
			}
		}
		return res;
	}
	public static ArrayList<Integer> Intersectionn(int[] arr1,int[] arr2){
		ArrayList<Integer> res=new ArrayList();
		int i=0,j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				res.add(arr1[i]);
				i++;
				j++;
				}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
		}
		return res;
	}
	
	

}
