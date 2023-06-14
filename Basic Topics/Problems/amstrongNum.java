package Problems;

public class amstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllArm(1000);
	}
	public static void printAllArm(int n) {
		for(int num=1;num<=n;num++) {
			if(isArm(num)) {
				System.out.println(num);
			}
		}
	}
	public static boolean isArm(int num) {
		int sum=0,temp=num;;
		int count=numOfDigit(num);
		
		while(temp>0) {
			int digit=temp%10;
			sum+=Math.pow(digit, count);
			temp=temp/10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int numOfDigit(int num) {
		int temp =num,count=0;
		while(temp>0) {
			count++;
			temp=temp/10;
			}
		return count;
	}

}
