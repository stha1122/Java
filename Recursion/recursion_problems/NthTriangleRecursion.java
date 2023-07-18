package recursion_problems;

import java.util.Scanner;

public class NthTriangleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int sum=0;
		System.out.println(ntriangle(n,sum));
	}

	private static int ntriangle(int n, int sum) {
		if(n<=0) {
			return sum;
		}
		sum+=n;
		sum=ntriangle(n-1,sum);
		return sum;
	}

}
