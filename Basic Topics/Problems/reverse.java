package Problems;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long number=s.nextLong();
		long reverse=0;
		while(number != 0)   
		{  
		long remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println(reverse);
		}
	
	}



