package Problems;

import java.util.Scanner;

public class f_c {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int min=s.nextInt();
	int max=s.nextInt(),f=s.nextInt(),c;
		
		for(int j=min;j<=max;j+=f) {
			c =(int)((5.0/9)*(j-32));
			System.out.println(j+" "+c);
		}
	
	}

}
