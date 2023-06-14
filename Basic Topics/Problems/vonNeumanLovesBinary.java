package Problems;

import java.util.Scanner;

public class vonNeumanLovesBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt(),m=1;
		while(m<=n) {
			int num=s.nextInt();
			int temp=num,count=0;
			while(temp>0) {
				temp/=10;
				count++;
			}
			int Dnum=0,i=0;
			while(i<count ) {
				int rem=num%10;
				Dnum+=(rem*(int) Math.pow(2,i));
				num=num/10;
				i++;
			}
			System.out.println(Dnum);
			m++;
		}
	}

}
