package Problems;

import java.util.Scanner;

public class BuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int price[]=new int[n];
		for(int i=0;i<n;i++) {
			price[i]=s.nextInt();
		}
		int leastpri=Integer.MAX_VALUE;
		int profit=0;
		int profit_sofar=0;
		for(int i=0;i<n;i++) {
			if(price[i]<leastpri) {
				leastpri=price[i];
			}
			profit_sofar=price[i]-leastpri;
			if(profit<profit_sofar) {
				profit=profit_sofar;
			}
		}
		System.out.println(profit);
	}

}
