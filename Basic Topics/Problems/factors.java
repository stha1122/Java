package Problems;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int divident= s.nextInt();
		
		for(int divisor=2;divisor<=divident;divisor++) {
			if(divident==1) {
				break;
			}
			{
				if(divident%divisor==0) {
					System.out.print(divisor+" ");
					divident=divident/divisor;
					divisor=1;
				}
			}
		}
		

	}

}
