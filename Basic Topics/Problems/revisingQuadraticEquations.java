package Problems;

import java.util.Scanner;

public class revisingQuadraticEquations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		int root1= (int)((-b + Math.sqrt((b*b)-(4*a*c)))/(2*a));
		int root2=(int)((-b - Math.sqrt((b*b)-(4*a*c)))/(2*a));
		int d =b^2 -(4*a*c);
		if(d>0) {
			System.out.println("Real and Distinct");
			if(root1<root2) {
			System.out.print(root1+" "+root2);}
			else {
				System.out.print(root2+" "+root1);
			}
		}
		else if(d==0) {
			System.out.println("Real and Equal");
			if(root1<root2) {
				System.out.print(root1+" "+root2);}
				else {
					System.out.print(root2+" "+root1);
				}
		}
	}
	

}
