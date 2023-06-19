package recursion_problems;

import java.util.Scanner;

public class OddEvenUsingRecursion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		// printOddEven(N);
        printOddEven1(N);
	}
	private static void printOddEven(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
		}
		printOddEven(n-1);
		if(n%2==0) {
			System.out.println(n);
		}
	}
	private static void printOddEven1(int n) {
	
		odd(n,0);

		even(1,n);
	}

	private static void even(int m, int n) {
	
		if(m>n) {
			return;
		}
		if(m%2==0) {
			System.out.println(m);
		}
		even(m+1,n);
		return;
	}

	private static void odd(int n, int m) {
	
		if(n<=m) {
			return;
		}
		if(n%2!=0) {
			System.out.println(n);
			}
		odd(n-1,m);
		return;
	}

}
