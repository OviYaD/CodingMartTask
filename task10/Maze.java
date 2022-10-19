package task10;

import java.util.*;

public class Maze {
    static int n;

    public static void printSolution(int[][] sol) {
        System.out.println("Posible Path:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(sol[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void solveMaze(int[][] maze) {
        int[][] solution = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                solution[i][j] =0;
            }
        }
        if (solvedMaze(maze, 0, 0, solution) == false) {
            System.out.println("No solution found");
            return;
        }
        printSolution(solution);
    }

    public static boolean solvedMaze(int[][] maze, int x, int y, int[][] solution) {
        if (x == n - 1 && y == n - 1) {
            solution[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y) == true) {
            solution[x][y] = 1;
            for (int i = 1; i <= maze[x][y] && i < n; i++) {
                if (solvedMaze(maze, x + i, y, solution) == true)
                    return true;
                if (solvedMaze(maze, x, y + i, solution) == true)
                    return true;
            }
            solution[x][y] = 0;
            return false;
        }
        return false;
    }
    
    public static boolean isSafe(int[][] maze, int x, int y) {
        if(x>=0 && x<n && y>=0 && y<n && maze[x][y]!=0)
            return true;
        return false;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[][] maze = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = s.nextInt();
            }
        }
        solveMaze(maze);
    }
}
