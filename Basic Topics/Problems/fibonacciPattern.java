package Problems;

import java.util.Scanner;

public class fibonacciPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int a=0,b=1,i=1,c=a;
		while(i<=N) {
			int j=1;
			while(j<=i) {
				System.out.print(a+"\t");
				j++;
				c=a+b;
				b=a;
				a=c;
				}
			System.out.println();
			 i++;
			
		}
	}

}
