package recursion_problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int fact=1;
		System.out.println(factoriall(num));
	}

	private static int factorial(int num,int fact) {
		if(num<=0 || num==1) {
			return fact;
		}
		else {
			fact*=num;
			fact=factorial(num-1,fact);
			return fact;
		}
	}
	private static int factoriall(int num) {
		if(num==0 || num==1) {
			return 1;
		}
	
		int n=factoriall(num-1);
		if(n==0) {
			n=1;
		}
		return num*n;
	}

}
