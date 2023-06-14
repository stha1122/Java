package Problems;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int temp =N,count=0;
		while(temp>0) {
			count++;
			temp=temp/10;
			}
		int sum=0;
		temp=N;
		while(temp>0) {
			int digit=temp%10;
			sum+=Math.pow(digit, count);
			temp=temp/10;
		}
		if(sum==N) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
