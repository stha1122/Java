package Problems;

import java.util.Scanner;

public class tabl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int x=s.nextInt();
		int y=s.nextInt();
        
        if(x < 0 || x >= 10000 || y < 0 || y >= 10000)
		{
			System.out.println("Invalid input.");
		
		}
        int value=0,i=1;
        while(i<=y) {
        	value=i*x;
        	System.out.println(value);
        	i++;
        }
	}

}
