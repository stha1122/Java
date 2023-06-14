package Problems;

import java.util.Scanner;

public class primeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 
	       int dividend= s.nextInt();
		for(int divisor=2;divisor<=dividend;divisor++) {
				if( dividend==1 || dividend>100000) {

					break;
				}
				{
					if(dividend%divisor==0) {
						int fact_count=0,n=divisor,d = 1, reminder = 0;
						while (d<= n) {
							reminder = n % d;
							if (reminder == 0) {
								fact_count++;
							}
							d++;
						}
						if (fact_count == 2) {
							System.out.println(n);
						} 
					
	                   
						dividend=dividend/divisor;
						divisor=1;
					}
				}
	        
		
	}

}
}