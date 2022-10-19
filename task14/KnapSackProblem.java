package task14;

import java.util.*;
public class KnapSackProblem {

    public static int knapsack(int[] W, int[] P, int weight, int n) {
        int[][] knap = new int[n + 1][weight + 1];
        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= weight; w++) {
                if (i == 0 || w == 0) {
                    knap[i][w] = 0;
                } else if (W[i - 1] <= w) {
                    knap[i][w] = Math.max(knap[i - 1][w], knap[i - 1][w - W[i - 1]] + P[i - 1]);
                } else {
                    knap[i][w] = knap[i - 1][w];
                }
            }
        }
        // for (int i = 0; i <= n; i++) {
        //     for (int w = 0; w <= weight; w++) {
        //         System.out.print(knap[i][w] + " ");
        //     }
        //     System.out.println();
        // }
        return knap[n][weight];

    }
    

    
    public static void main(String agrs[]) {
        Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        // int[] W = new int[n];
        // int[] P = new int[n];
        int n = 4,weight=50;
        int[] W = { 20, 40, 10,30};
        int[] P = { 80, 50, 60, 100 };
        System.out.println(knapsack(W, P,weight, n));
    }
    
}
