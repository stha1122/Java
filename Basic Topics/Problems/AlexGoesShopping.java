package Problems;

import java.util.Scanner;

public class AlexGoesShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			}
		int m=s.nextInt();
		for(int i=0;i<m;i++) {
			int amt=s.nextInt();
			int min=s.nextInt();
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(amt%arr[j]==0) {
					count++;
				}
			}
			if(count>=min) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		}
	}

}
