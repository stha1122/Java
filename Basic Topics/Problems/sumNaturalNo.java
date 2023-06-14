package Problems;
//program to find sum of n natural numbers
public class sumNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,sum=0,count=1;
		while(count<=n) {
			System.out.println(count);
			sum+=count;
			count++;
		}
		System.out.println(sum);

	}

}
