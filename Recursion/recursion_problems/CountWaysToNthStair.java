package recursion_problems;
import java.util.ArrayList;
import java.util.Scanner;

public class CountWaysToNthStair {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		System.out.print(ways2(n));
		
	}
	public static int ways2(int n) {
		return n/2+1;
	}
	
	
	
//	public static int ways1(int currdist,int totaldist,int count,String path) {
//		if(currdist==totaldist) {
////		System.out.println(path);
//			return count+=1;
//		}
//		if(currdist>totaldist) {
//			return count;
//		}
//		if(path.startsWith("2")) {
//			return count;
//		}
//		
//		count=ways1(currdist+1,totaldist,count,path+'1');
//		count=ways1(currdist+2,totaldist,count,path+'2');
//		
//		
//		return count;
//	
//	}

}
