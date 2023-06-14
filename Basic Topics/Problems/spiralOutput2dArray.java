package Problems;

public class spiralOutput2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{1,12,11,10},
				{2,13,16,9},
				{3,14,15,8},
				{4,5,6,7}
		};
		int rs=0,cs=0,re=arr.length-1,ce=arr.length-1;
		while(rs<re) {
		for(int i=rs;i<=re;i++) {
			System.out.println(arr[i][cs]);
		}
		for(int i=cs+1;i<=ce;i++) {
			System.out.println(arr[re][i]);
		}
		for(int i=re-1;i>=rs;i--) {
			System.out.println(arr[i][ce]);
		}
		for(int i=ce-1;i>cs;i--) {
			System.out.println(arr[rs][i]);
		}
		rs++;re--;
		cs++;ce--;
		}
	}

}
