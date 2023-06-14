package Problems;

import java.util.Scanner;

public class mirrorStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int totlstr=1,totlsp=n/2,cntstr=1,cntsp=1,rowcnt=1;
		while(rowcnt<=n) {
			cntsp=1;
			while(cntsp<=totlsp) {
				System.out.print("\t");
				cntsp++;
			}
			cntstr=1;
			while(cntstr<=totlstr) {
				System.out.print("*\t");
				cntstr++;
			}
			if(rowcnt<n/2+1) {
				totlsp--;
				totlstr+=2;
			}
			else {
				totlsp++;
				totlstr-=2;
			}
			System.out.println();
			rowcnt++;
		}
	}

}
