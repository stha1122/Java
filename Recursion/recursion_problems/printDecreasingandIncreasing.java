package recursion_problems;

public class printDecreasingandIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		pd(1,5);
		pid(5);
	}

	public static void pd(int s,int e) {
		if(s>e) {
			return;
		}
		System.out.println(s);
		pd(s+1,e);
		System.out.println(s);
		
	}
	public static void pid(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		pid(n-1);
		System.out.println(n);
	}

}
