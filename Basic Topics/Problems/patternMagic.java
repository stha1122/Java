package Problems;

import java.util.Scanner;

public class patternMagic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int m=(n*2)-1;
	int cntstr=1,totlstr=n-1,cntsp=1,totlsp=1,rowcnt=1;
	while(rowcnt<=m) {
		if(rowcnt==1||rowcnt==m) {
			for(int i=1;i<=m;i++) {
				System.out.print("*");
				}
		}
		
		else {
			cntstr=1;
			while(cntstr<=totlstr) {
				System.out.print("*");
				cntstr++;
			}
			cntsp=1;
			while(cntsp<=totlsp) {
				System.out.print(" ");
				cntsp++;
			}
			cntstr=1;
			while(cntstr<=totlstr) {
				System.out.print("*");
				cntstr++;
			}
			if(rowcnt>=n){
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
