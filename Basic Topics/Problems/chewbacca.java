package Problems;

import java.util.Scanner;

public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long n=s.nextInt();
		long temp=n,i=1,rem;
		while(temp!=0) {
			rem=temp%10;
			if(((9-rem)*i) <= (rem*i)) {
				n-=rem*i;
				n+=(9-rem)*i;
						}
			temp=temp/10;
			i*=10;
		}
		System.out.println(n);

	}

}
