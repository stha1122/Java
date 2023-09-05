package recursion_problems;

import java.util.Scanner;

public class ReplaceAllPie {

	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int count=s.nextInt();
			for(int i=1;i<=count;i++) {
				String str = s.next();
				StringBuilder sb = new StringBuilder(str);
				int start=0;
				System.out.println(generate(sb,start));

			}
		}

		private static StringBuilder generate(StringBuilder sb, int start) {
			if(start>=sb.length()) {
				return sb;
			}
			if(start+1<sb.length()) {
			if(sb.substring(start, start+2).equals("pi")){
				sb=sb.replace(start,start+2,"3.14");
				}
			}
			generate(sb, start+1);
			return sb;
		}

}
