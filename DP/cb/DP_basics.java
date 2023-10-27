package cb;

public class DP_basics {
	public static void main(String[] args) {
		int n=40;
		System.out.println(Fibo(n));
		System.out.println(Fibo_TD(n,new Integer[n+1]));
		System.out.println(Fibo_BU(n));
	}
//Recursive approach
	public static int Fibo(int n) {
		if(n<2) {
			return n;
		}
		int sp1 = Fibo(n-1);
		int sp2 = Fibo(n-2);
		
		return sp1 + sp2;
	}
//	Top Down approch,memoization
	public static int Fibo_TD(int n , Integer arr[]) {
		
		if(n<2) {
			return n;
		}
		if(arr[n]!=null) {
			return arr[n];
		}
		int sp1 = Fibo(n-1);
		int sp2 = Fibo(n-2);
		arr[n] = sp1 + sp2;
		return sp1 + sp2;
	}
//	Bottoms up approach,Tabulation
	public static int Fibo_BU(int N) {
		int[] dp = new int[N+1];
		dp[1]=1;
		for(int n=2;n<=N;n++) {
			int sp1 = dp[n-1];
			int sp2 = dp[n-2];
			dp[n] = sp1 + sp2;
		}
		return dp[N];
	}

	public static int BUSE(int N) {
		if(N<=1) {
			return N;
		}
		
		int sp1 = 0;
		int sp2 = 1;
		
		for(int n=2;n<=N;n++) {
			int curr = sp1+sp2;
			sp1 = sp2;
			sp2 = curr;
		}
		return sp2;
	}

}
