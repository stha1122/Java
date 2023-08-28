package Problems;

import java.util.Scanner;

public class PowerOlogn {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int x=s.nextInt();
	int n=s.nextInt();
	System.out.println(power(x,n));
}

private static int power(int x, int n) {
	if(n==0) {
		return 1;
	}
	if(n==1) {
		return x;
	}
	int temp=power(x,n/2);
	if(n%2==0) {
		return temp*temp;
	}
	else {
		return temp*temp*x;
	}

}
}
