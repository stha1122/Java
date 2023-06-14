package Problems;

import java.util.Scanner;

public class conversionAnytoAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int sb=s.nextInt(),db=s.nextInt();
		int num=s.nextInt();
		int Dnum=0,i=0;
		while(num>0) {
			int rem=num%10;
			Dnum+=(int)(rem*Math.pow(sb, i));
			num/=10;
			i++;
		}
		int dbnum=0;
		i=0;
		while(Dnum>0) {
			int rem=Dnum%db;
			dbnum+=(int)(rem*Math.pow(10, i));
			Dnum/=db;
			i++;
		}
		System.out.println(dbnum);
		
	}

}
