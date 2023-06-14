package Problems;

import java.util.Scanner;

public class boston_numbers {
															
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
			int n=s.nextInt();
			int temp=n,i,sum=0,sum1=0;
		    if(n>1 && n<Integer.MAX_VALUE){
		      int dividend= n;
				for(int divisor=1;divisor<=dividend;divisor++) {
						if(dividend%divisor==0) {
		                        int fact_count=0,n1=divisor,d = 1, reminder = 0;
								while (d <= n1) {
									reminder = n1 % d;
									if (reminder == 0) {
										fact_count++;
									}
									d++;
								}
								int temp1=divisor;
								if (fact_count == 2) {
								  while(temp1>0) {
									  int rem =temp1%10;
									sum+=rem;
									temp1/=10;}
								}
								dividend=dividend/divisor;
								divisor=1;
							}
						
							}
		    }
		        
		            temp=n;
						while(temp!=0) {
							int rem=temp%10;
							sum1+=rem;
							temp=temp/10;
						}
					
				
						if(sum==sum1) {
							System.out.println("1");
						}
		                else{
		                    System.out.println("0");
		                }
	
	}
	}


