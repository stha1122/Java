package Problems;

public class findString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
	
		subString("hello");
		//System.out.println(palindrom("anana"));
		String str1="hello";
		String str2=str1;
		str1=str1+"p";
		System.out.println(str1);
		System.out.println(str2);
	}
	public static void find(String str) {
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				System.out.println(i);
		}
	}
	}
	public static boolean palindrom(String str) {
	int i=0,j=str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}
		i++;
		j--;
	}
		return true;
	}
	public static void subString(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				//to print only substing
				if(palindrom(str.substring(i, j))) {
				System.out.println(str.substring(i, j));
				count++;
			}
			}
		}
		System.out.println(count);
	}
}
