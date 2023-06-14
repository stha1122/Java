package Problems;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int n = 5;
		int r = 0;
		int tots_sp = (n-1)*2;
		// step 1
		int tots_st = n;
		int cnt_sp =0;
		while (r < n) {
			
			while (cnt_sp < tots_sp) {
				cnt_sp =  r*2;
				System.out.print(" ");
				r++;
			}
			
			// step 2
			int cnt_str = 0;
			while (cnt_str < tots_st) {
				System.out.println("* ");
				cnt_str++;
			}
			cnt_str = cnt_str - r;
			r++;
			
		}

	}

}
