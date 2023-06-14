package Problems;

import java.util.Scanner;

public class incr_decr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int count=s.nextInt();
		int cnt=0,pre=-1;
		while(count>0) {
			pre=cnt;
			cnt=s.nextInt();
			boolean result=true;
			if(cnt>pre){
				pre=cnt;
				result=true;
				}
			else if (cnt<pre){
				result=true;
			}
			
			}
		}
	}


