package Problems;

import java.util.Scanner;

public class lower_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch=(char)s.nextInt();
		if(ch>='a' &&  ch <='z') {
			System.out.println("chotu");
		}
		else if (ch>='A' &&  ch <='Z'){
			System.out.println("baddu");
		}
		else {
			System.out.println("pata nahi");
		}
	}

}
