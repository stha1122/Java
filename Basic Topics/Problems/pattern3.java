package Problems;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,r=1,cnt_str=1,totl_str;
		totl_str=n;
		while(r<=n) {
			cnt_str=1;
			while(cnt_str<=totl_str) {
				System.out.print("* ");
				cnt_str--;
			}
			totl_str++;
			System.out.println();
			r++;
		}
		

	}

}
