package Problems;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int N=s.nextInt();
		if(N<=1000) {
			while(N>0) {
				int oddsum=0,evensum=0;
				int car_no=s.nextInt();
				while(car_no>0) {
					int rem=car_no%10;
					if(rem%2==0) {
						evensum+=rem;
					}
					else {
						oddsum+=rem;
					}
					car_no=car_no/10;
					}
				if(evensum%4==0) {
				System.out.println("Yes");}
				else if(oddsum%3==0) {
					System.out.println("Yes");
				}
				else {
					System.out.println("No");
				}
				N--;
			}
		}
	}

}
