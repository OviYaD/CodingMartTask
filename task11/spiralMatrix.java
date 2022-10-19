package task11;

import java.util.*;

public class spiralMatrix {
    
    static int row,col;
    public static int[][] ans;
    
    public static void printSpiral(int[][] matrix, int row, int col) {
        int left = 0, right = col - 1, top = 0, bottom = row - 1, dir = 0;
        int r1 = 0, c1 = 0;
        ans= new int[row][col];
        while (top <= bottom && left <= right) {
            if (dir == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(matrix[top][i] + " ");
                    ans[r1][c1] = matrix[top][i];
                    c1++;
                    if (c1 == col) {
                        r1++;
                    }
                    c1 %= col;
                }
                top += 1;
            }
            if (dir == 1) {
                for (int i = top; i <= bottom; i++) {
                    System.out.print(matrix[i][right] + " ");
                    ans[r1][c1] = matrix[i][right];
                    c1++;
                    if (c1 == col) {
                        r1++;
                    }
                    c1 %= col;
                }
                right -= 1;

            }
            if (dir == 2) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                    ans[r1][c1] = matrix[bottom][i];
                    c1++;
                    if (c1 == col) {
                        r1++;
                    }
                    c1 %= col;
                }
                bottom -= 1;
            }
            if (dir == 3) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                    ans[r1][c1] = matrix[i][left];
                    c1++;
                    if (c1 == col) {
                        r1++;
                    }
                    c1 %= col;
                }
                left += 1;
            }
            dir += 1;
            dir %= 4;
        }
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        row = s.nextInt();
        col = s.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = s.nextInt();
            }
        }

        // int matrix[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
        //         { 21, 22, 23, 24, 25 } };
        printSpiral(matrix, 5, 5);
        System.out.println("");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(ans[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
