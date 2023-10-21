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
		int prev = -1;
		int ans = 1;
		System.out.println(HM);
		for(int idx=0;idx<t.length();idx++) {
			char ch = t.charAt(idx);
			ArrayList<Integer> AL = HM.get(ch);
//			apply BS and get the number just bigger than ans
		for(int i:AL) {
			if(i>prev) {
				prev=i;
				break;
			}
		}
		}
	}	
	

}
