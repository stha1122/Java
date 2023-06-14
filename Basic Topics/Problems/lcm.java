package Problems;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int divisor = num1;
		int divident =num2, rem = -1;
		while (true) {
			rem = divident % divisor;
			if (rem == 0) {
				break;
			}
			divident = divisor;
			divisor = rem;
		}
		System.out.println((num1*num2)/divisor);
	}

}
