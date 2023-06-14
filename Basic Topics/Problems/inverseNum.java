package Problems;

import java.util.Scanner;

public class inverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int newnum=0,i=1;
		while(num>0) {
			int rem=num%10;
			int x=(int)Math.pow(10,rem-1);
			newnum+=(i*x);
			num=num/10;
			i++;
		}
		System.out.println(newnum);
	}

}
