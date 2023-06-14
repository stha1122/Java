package Problems;

public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13, fact_count = 0, divisor = 1, reminder = 0;
		while (divisor <= n) {
			reminder = n % divisor;
			if (reminder == 0) {
				fact_count++;
			}
			divisor++;
		}
		if (fact_count == 2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
