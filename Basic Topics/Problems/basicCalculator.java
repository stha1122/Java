package Problems;

import java.util.Scanner;

public class basicCalculator {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		while(true) {
		int ch=s.next().charAt(0);
		
		if(ch=='+') {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a+b);
		}
		else if(ch=='-') {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a-b);
		}
		else if(ch=='*') {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a*b);
		}
		else if(ch=='/') {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a/b);
		}
		else if(ch=='%') {
			int a=s.nextInt();
			int b=s.nextInt();
			System.out.println(a%b);
		}
		else if(ch>='a' &&  ch <='z'||ch>='A' &&  ch <='Z') {
			return;
		}
		else {
			System.out.println("Invalid operation,try again.");
		}
		}
	}

}
