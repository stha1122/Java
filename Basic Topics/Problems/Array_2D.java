package Problems;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[5][3];
		int num=0;
		num=0;
		for(int i=0;i<5;i++) {
			for(int k=0;k<3;k++) {
				num++;
				arr[i][k]=num;
			}
		}
		for(int[] i:arr) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		int temp=0;
	for(int i=0;i<3;i++) {
	if(i%2==0){
		for(int j=0;j<5;j++) {
			System.out.print(arr[j][i]+" ");
			}
	
	}
	else{
		for(int j=4;j>=0;j--) {
			System.out.print(arr[j][i]+" ");
			}
		
			}
	}
	System.out.println();
	for(int i=0,j=0;i<5;i++) {
		System.out.print(arr[i][j]+" ");
	}
	
	
	
	
	
		}
		
	}


