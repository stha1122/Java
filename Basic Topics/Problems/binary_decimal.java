package Problems;

import java.util.Scanner;

public class binary_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int N = s.nextInt(),i=-1;
		int Dnum=0;
		while(N!=0) {
			int digit=N%10;
			i++;
			N=N/10;
			if(digit==0) {
				
				continue;
			}
			Dnum+=digit*Math.pow(2,i);
			
			}
		System.out.println(Dnum);

	}

}
