package Problems;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,r=1,totl_st=1,cnt_st=0;
		while(r<= 2*n-1) {
			cnt_st=0;
			while(cnt_st<totl_st) {
				System.out.print("* ");
				cnt_st++;
			}
			System.out.println();
			r++;
			if(r<=n) {
				totl_st++;
			}
			else {
				totl_st--;
			}
			
		}
	}

}
