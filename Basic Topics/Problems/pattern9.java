package Problems;

public class pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int r=1,totl_st=n,totl_sp=0;
		while(r<=n*2-1) {
			int cnt_sp=0;
			while(cnt_sp<totl_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
			
			
			int cnt_st=0;
			while(cnt_st<totl_st) {
			System.out.print("* ");
				cnt_st++;
			}
			
			if(r<n) {
				totl_sp+=2;
				totl_st--;
			}
			else {
				totl_sp-=2;
				totl_st++;
			}
			
			System.out.println();
			r++;
			

	}

}
}