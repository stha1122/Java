package recursion_problems;

public class nQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean board[][]= new boolean[4][4];
		for (int r=0;r<board.length;r++) {
			for(int c=0;c<board[0].length;c++) {
				board[r][c]=false;
			}
		}

		placeQueens(0,0,board,4);
		
		
	}
	public static void printboard(boolean board[][]) {
		for (int r=0;r<board.length;r++) {
			for(int c=0;c<board[0].length;c++) {
				if (board[r][c]==true) {
					System.out.print("x");
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	public static void placeQueens(int r,int c,boolean board[][],int queens) {
		if(queens==0) {
			printboard(board);
			System.out.println("====");
			return;
		}
		if(c==board[0].length) {
			r+=1;
			c=0;
		}
		if(r==board.length) {
			return;
		}
		
		if(issafe(r,c,board)) {
			board[r][c]=true;
			placeQueens(r,c+1,board,queens-1);
			board[r][c]=false;
		}
		
		placeQueens(r,c+1,board,queens);
		
	}
	private static boolean issafe(int r, int c, boolean[][] board) {
		// TODO Auto-generated method stub
		for(int R=0;R<r;R++) {
			if(board[R][c]==true) {
				return false;
			}
		}
		for(int C=0;C<c;C++) {
			if(board[r][C]==true) {
				return false;
			}
		}
		int R=r;
		int C=c;
		while(R>=0 && C>=0) {
			if(board[R][C]==true) {
				return false;
			}
			R--;C--;
		}
		R=r;
		C=c;
		while(R>=0 && C<board[0].length) {
			if(board[R][C]==true) {
				return false;
			}
			R--;C++;
		}
		return true;
	}

}
