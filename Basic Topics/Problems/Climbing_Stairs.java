package Problems;

public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		climb(4,"",0);

	}
	public static void climb(int n,String path,int currDis) {
		if(n==currDis) {
			System.out.println(path);
			return;
		}
		if(currDis>n) {
			return;
		}
		climb(n,path+1,currDis+1);
		climb(n,path+2,currDis+2);
		return;
		
	}
	

}
