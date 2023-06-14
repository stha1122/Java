package Problems;

import java.util.Scanner;

public class patternNumberLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int N=s.nextInt(),i=0,num=0;
		while(i<=N) {
			for(int j=1;j<=i;j++) {
				num++;
				System.out.print(num+"\t");
			}
			System.out.println();
			i++;
		}
	}

}
