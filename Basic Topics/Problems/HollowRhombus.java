package Problems;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		int row_cnt=0,totl_sp=n-1,totl_str=n;
		while(row_cnt<n) {
			int spc_cnt=0;
			while(spc_cnt<totl_sp) {
				System.out.print(" ");
				spc_cnt++;
			}
			if(row_cnt==0 || row_cnt==n-1) {
				int str_cnt=0;
				while(str_cnt<totl_str) {
					System.out.print("*");
					str_cnt++;
				}
			}
			else {
				System.out.print("*");
				int sp_cnt1=0,totl_sp1=n-2;
				while(sp_cnt1<totl_sp1) {
					System.out.print(" ");
					sp_cnt1++;
				}
				System.out.print("*");
			}
			totl_sp--;
			System.out.println();
			row_cnt++;
			
		}
	}

}
