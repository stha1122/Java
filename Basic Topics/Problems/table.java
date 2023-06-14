package Problems;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int i=1;
		int value=n;
		while(value<m) {
		
			System.out.println(value);
			i=i+1;
			value=n*i;
			
		}
	}

}
