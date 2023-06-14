package Problems;

import java.util.Scanner;

public class murthalParantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int p= s.nextInt();
		int c=s.nextInt();
		int rank[]= new int[c];
		for(int i=0;i<c;i++) {
			rank[i]=s.nextInt();
		}
		int mid=0;
		int min=0,ans=-1;
		int max=Integer.MAX_VALUE;
		while(min<=max) {
			mid = min+(max-min)/2;
			if(isvalid(mid,p,rank)) {
				ans =mid;
				max=mid-1;
			}
			else {
				min=mid+1;
			}
		}
		System.out.println(ans);
	}

	public static boolean isvalid(int mid, int p, int[] rank) {
		// TODO Auto-generated method stub
		int countp=0;
		for(int i=0;i<rank.length;i++) {
			int time=rank[i];
			int j=2;
			while(time<=mid) {
				countp++;
				time+=(j*rank[i]);
				j++;
			}
			if(countp>=p) {
				//System.out.println(countp);
				return true;
			}
		}
		return false;
	}

}
