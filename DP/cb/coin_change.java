package cb;

public class coin_change {

	public static void main(String[] args) {
	int A=6;
	int[] arr = {2,3,4};
	System.out.println(CoinC2(A,0,"",arr,new Integer [A+1][arr.length]));

	}
	
	public static void CoinC1(int A,int idx, String str,int[] coins) {
		if(A==0) {
			System.out.println(str);
			return;
		}
		if(A<0 || idx==coins.length) {
			return;
		}
		CoinC(A-coins[idx],idx,str+coins[idx],coins);//Include
		CoinC(A,idx+1,str,coins);//Exclude
		}
	
	public static int CoinC(int A,int idx, String str,int[] coins) {
		if(A==0) {
//			System.out.println(str);
			return 1;
		}
		if(A<0 || idx==coins.length) {
			return 0;
		}
		int sp1 = CoinC(A-coins[idx],idx,str+coins[idx],coins);//Include
		int sp2 = CoinC(A,idx+1,str,coins);//Exclude
		return sp1 + sp2; 
		}
	
	
	
	public static int CoinC2(int A,int idx, String str,int[] coins,Integer[][] dp) {
		if(A==0) {
//			System.out.println(str);
			return 1;
		}
		if(A<0 || idx==coins.length) {
			return 0;
		}
		if(dp[A][idx]!=null) {
			return dp[A][idx];
		}
		int sp1 = CoinC2(A-coins[idx],idx,str+coins[idx],coins,dp);//Include
		int sp2 = CoinC2(A,idx+1,str,coins,dp);//Exclude
		dp[A][idx] = sp1+sp2;
		return sp1 + sp2;
		}
	

	public static int BU(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 10][coins.length + 10];

		for (int A = 0; A <= Amount; A++) {
			for (int idx = coins.length; idx >= 0; idx--) {
//				dp[A][idx] !!
				if(A==0) {
					dp[A][idx] = 1;
					continue;
				}
				if(idx == coins.length) {
					dp[A][idx] = 0;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];// Include
				}
				int sp2 = dp[A][idx + 1];// Exclude
				dp[A][idx] = sp1 + sp2;
			}

		}

		return dp[Amount][0];
	}
	
	
}
