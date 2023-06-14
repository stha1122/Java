package Problems;

public class rotateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=14325,rot=2,i=0,new_num=0,temp=num;
		while(i<rot) {
			
			int digit=temp%10;
			while(temp>0) {
			int k=temp%10;
			temp=temp/10;
			new_num=new_num*10+(k);
			}
			System.out.println(new_num);
			i++;
			
			temp=new_num;
			new_num=0;
		}
		
	}

}
