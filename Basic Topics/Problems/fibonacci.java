package Problems;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=5,i=0;
		while(i<=m) {
		int n=i,a=0,b=1,cnt=0,c=0;
		while(cnt<n) {
			c=a+b;
			a=b;
			b=c;
			cnt++;
		}
		System.out.println(a);
		i++;
		}
	}

}
