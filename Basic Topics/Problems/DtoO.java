package Problems;

import java.util.Scanner;

public class DtoO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int Onum=0,i=1;
		while(num>0) {
			int rem =num%8;
			Onum+=rem*i;
			num=num/8;
			i=i*10;
		}
		System.out.println(Onum);
	}

}
