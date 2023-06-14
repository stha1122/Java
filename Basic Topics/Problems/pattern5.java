package Problems;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int n=5;
			int r=1,totl_sp=n-1,totl_st=1;
			while(r<=n) {
				int cnt_sp=0;
				while(cnt_sp<totl_sp) {
					System.out.print("  ");
					cnt_sp++;
				}
				int cnt_st=0;
				while(cnt_st<totl_st) {
					if(cnt_st%2 ==0) {
					System.out.print("* ");
					}
					else {
						System.out.print("! ");
					}
					cnt_st++;
				}
				
				totl_sp--;
				totl_st+=2;
				System.out.println();
				r++;
			}
	}

}
