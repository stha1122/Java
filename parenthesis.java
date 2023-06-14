package recursion;

public class parenthesis {

	public static void main(String[] args) {
		permutation("(((","",")))");
//		String ch="abcdefgh";
//	System.out.println(ch.substring(1));	
	}

	private static void permutation(String open, String ans, String close) {
		// TODO Auto-generated method stub
		if(open.length()==0 & close.length()==0) {
			System.out.println(ans);
			return;
		}
		if(open.length()>close.length()) {
			return;
		}
		if(open.length()!=0) {
			String leftover=open.substring(1);
			char ch=open.charAt(0);
			permutation(leftover,ans+ch,close);
			
		}
		if(close.length()!=0) {
			String leftover=close.substring(1);
			char ch=close.charAt(0);
			permutation(open,ans+ch,leftover);
			
		}
		return;
	}
}
