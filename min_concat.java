package cb;

import java.util.ArrayList;
import java.util.HashMap;

public class min_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "catsanddogs";
		String t = "cadacadag";
		solve(s,t);
	}
	
	public static void solve (String s, String t) {
		HashMap<Character,ArrayList<Integer>> HM = new HashMap<>();
		for(int idx=0;idx<s.length();idx++) {
			ArrayList<Integer> AL = HM.getOrDefault(s.charAt(idx), new ArrayList<>());
			AL.add(idx);
			HM.put(s.charAt(idx), AL);
			}
		int last_char_idx= -1;
		int ans = 1;
		System.out.println(HM);
		for(int idx=0;idx<t.length();idx++) {
			char ch = t.charAt(idx);
			ArrayList<Integer> AL = HM.get(ch);
			if(AL == null) {
				return;
			}
//			apply BS and get the number just bigger than ans
			boolean flag = false;
			int start = 0;
			int end = AL.size()-1;
			int sol =-1;
			while (start <= end) {
				int mid = (start+end)/2;
				if(AL.get(mid)<last_char_idx) {
					start = mid+1;
				}
				else {
					sol = AL.get(mid);
					end = mid-1;
				}
			}
			if(sol == -1) {
				last_char_idx = AL.get(0);
				ans++;
			}
			else {
				last_char_idx = sol;
			}
	System.out.println(ch + " - "+ last_char_idx);
		}
		System.out.println("ans = "+ ans);
	}	
	

}
