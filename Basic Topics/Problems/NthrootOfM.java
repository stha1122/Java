package Problems;

import java.util.Scanner;

public class NthrootOfM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		while(num>0) {
			int N =s.nextInt();
			int M=s.nextInt();
//			System.out.println(Math.pow(9,(1.0/3)));
            double res=Math.pow(M,(1.0/N));
            if(res-(int)res >=0.5000) {
            	res+=1;
            }
            else if(res-(int)res !=0){
            	res=-1;
            }
            System.out.println();
            System.out.println((int)res);
			num--;
		}
	}

}
