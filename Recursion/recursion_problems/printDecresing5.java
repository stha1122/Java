package recursion_problems;

public class printDecresing5 {
	public static void main(String[] args) {
		pd(10);
	}
	
	public static void pd(int n) {
	
		if(n==0) {
			return;
		}
			
			pd(n-1);
			System.out.println(n);
	}
	}
