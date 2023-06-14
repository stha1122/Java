package Problems;

import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x=s.next().charAt(0);
		if(x>'a' && x<'z') {
			System.out.println("lowercase");
		}
		else if(x>'A' && x<'Z') {
			System.out.println("UPPERCASE");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
