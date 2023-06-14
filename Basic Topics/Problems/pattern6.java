package Problems;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5,r=1,totl_st=n,cnt_st=0;
			while(r<=n) {
				cnt_st=0;
				while(cnt_st<totl_st) {
					if(r==n || r==1||cnt_st==n-1||cnt_st==0) {
					System.out.print("*");}
					else {
						System.out.print(" ");
					}
					cnt_st++;
				}
			
				
				
				System.out.println();
				r++;
			}
	}

}
