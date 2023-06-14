package Problems;

public class hcf_gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor = 52;
		int divident = 74, rem = -1;
		while (true) {
			rem = divident % divisor;
			if (rem == 0) {
				break;
			}
			divident = divisor;
			divisor = rem;
		}
		System.out.println(divisor);

	}

}
