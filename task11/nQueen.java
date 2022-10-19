package task11;

import java.util.*;

public class nQueen {
    
    static class Positions {
        int row;
        int col;

        Positions(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static void solveNQueen(int n) {
        Positions positions[] = new Positions[n];
        boolean hasSolution = solveQueen(n, 0, positions);
        if (hasSolution) {

        } else {

        }
    }
    
    public static boolean solveQueen(int n, int r, Positions[] positions) {
        if (n == r) {
            return true;
        }
        else {
            for (int c = 0; c < n; c++) {
                boolean isSafe = true;
                for (int queen = 0; queen < r; queen++) {
                    if (queen == c || r - c == positions[queen].row - positions[queen].col
                            || r + c == positions[queen].row + positions[queen].col) {
                        isSafe = false;
                        break;
                    }
                }
                if (isSafe) {
                    positions[r] = new Positions(r, c);
                    if (solveQueen(n, r + 1, positions)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        solveNQueen(n);

    }
}
