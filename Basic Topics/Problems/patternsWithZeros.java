package Problems;

import java.util.Scanner;

public class patternsWithZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int j=0,i=0;
		while(j<=N) {
			i=1;
			while(i<=j) {
				if(i==1||i==j) {
				System.out.print(j+"\t");}
				else {
					System.out.print("0\t");
				}
				i++;
			}
			System.out.println();
			j++;
		}
	}

}
