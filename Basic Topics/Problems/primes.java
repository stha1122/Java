package Problems;

import java.util.Scanner;

public class primes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		for (int i = 0; i < m; i++) {
			int fact_count = 0,n=i, divisor = 1, reminder = 0;
			while (divisor <= n) {
				reminder = n % divisor;
				if (reminder == 0) {
					fact_count++;
				}
				divisor++;
			}
			if (fact_count == 2) {
				System.out.println(n);
			} 
		}
	}
}
