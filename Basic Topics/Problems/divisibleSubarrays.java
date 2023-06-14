package Problems;

import java.util.Scanner;

public class divisibleSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int m=s.nextInt();
		
		while(m>0) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int sum=0,count=0,ans=0;
			int res[]=new int[n];
			for(int i=0;i<n;i++) {
				sum+=arr[i];
				int idx=sum%n;
				if(idx<0) {
					idx+=n;
				}

				ans+=res[idx];
				if(idx==0) {
					ans++;
				}
				res[idx]++;
			
			}	
//			for(int i=0;i<n;i++) {
//				System.out.println(res[i]);
//			}
			
//			System.out.println("==================================");
			System.out.println(ans);
			m--;
		}
	}

}
