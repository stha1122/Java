package recursion_problems;

import java.util.Scanner;

public class Rat_In_Maze {

	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        char[][] maze = new char[m][n];
	        for (int i = 0; i < m; i++) {
	            String data = "";
	            if (sc.hasNext()) { // input from user 
	                data = sc.next();
	            } else {
	                break;
	            }
	            for (int j = 0; j < n; j++) {
	                maze[i][j] = data.charAt(j);
	            }
	        }
	        int[][] sol = new int[m][n];

	        if (ratInMaze(maze, sol, 0, 0, m - 1, n - 1) == true) {
	            display(sol, m - 1, n - 1);
	        } else {
	            System.out.println(-1);
	        }
	    }

	    public static void display(int[][] sol, int m, int n) {
	        for (int i = 0; i <= m; i++) {
	            for (int j = 0; j <= n; j++) {
	                System.out.print(sol[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static boolean ratInMaze(char[][] maze, int[][] sol, int i, int j, int m, int n) {
	        //base case
	        if (i == m && j == n) {
	            sol[m][n] = 1;
	            return true;
	        }

	        //rat should be inside grid
	        if (i > m || j > n) {
	            return false;
	        }

	        //dead end
	        if (maze[i][j] == 'X') {
	            return false;
	        }

	        //Assume sol exists through cell
	        sol[i][j] = 1;
	        boolean rightsuccess = ratInMaze(maze, sol, i, j + 1, m, n);

	        //backtracking
	        if (rightsuccess) {
	            return true;
	        }
	        boolean downsuccess = ratInMaze(maze, sol, i + 1, j, m, n);
	        if (downsuccess) {
	            return true;
	        }
	        sol[i][j] = 0;
	        return false;
	    }

}
