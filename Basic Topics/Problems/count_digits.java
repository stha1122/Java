package Problems;

import java.util.Scanner;

public class count_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		int numb=s.nextInt();
	
			long integer = n;
			int count = 0;
			while (integer > 0) {
			 long digit = integer % 10;
				if (numb == digit) {
					count++;
				}
				integer = integer / 10;
			}
		
			if (count > 1) {
				System.out.println(count);
			}

		
	}

}
