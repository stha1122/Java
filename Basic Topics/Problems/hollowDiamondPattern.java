package Problems;

import java.util.Scanner;

public class hollowDiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
	int cntstr=1,totlstr=n/2,cntsp=1,totlsp=1,rowcnt=1;
	while(rowcnt<=n) {
		if(rowcnt==1||rowcnt==n) {
			for(int i=1;i<=n;i++) {
				System.out.print("*\t");
				}
		}
		
		else {
			cntstr=1;
			while(cntstr<=totlstr) {
				System.out.print("*\t");
				cntstr++;
			}
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
			if(rowcnt>=n/2+1){
				totlstr++;
				totlsp-=2;
			}
			else {
				totlstr--;
				totlsp+=2;
			}
			}
		System.out.println();
		rowcnt++;
	}

}
}