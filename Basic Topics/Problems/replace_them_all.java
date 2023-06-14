package Problems;

import java.util.Scanner;

public class replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n=s.nextLong();
		long rem=-1,i=1,temp=n;
		while(temp!=1) {
			rem=temp%10;
			if(rem==0) {
				n+=(i*5);
			}
			temp=temp/10;
			i*=10;
		}
		System.out.println(n);
	}

}
