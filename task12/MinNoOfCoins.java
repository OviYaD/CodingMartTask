package task12;

import java.util.*;
public class MinNoOfCoins {
    
    static int[][] dp;

    static int getMinNoCoins(int[] coins, int n, int weight) {
        for(int[] row:dp){
            Arrays.fill(row,0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= weight; j++) {
                if (i == 0) {
                    if (j%coins[i] == 0) {
                        dp[i][j] = j / coins[i];
                    } else {
                        dp[i][j] = 0;
                    }
                    continue;
                }
                if (j < coins[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i]]);
                }

            }

        }
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= weight; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[n-1][weight];
        
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = 4;
        // int[] coins = new int[n];
        int[] coins={1,5,6,9};
        // int weight=s.nextInt();
        int weight = 10;
        // for (int i = 0; i < n; i++) {
        //     coins[i] = s.nextInt();
        // }
        dp = new int[n][weight + 1];
        System.out.println(getMinNoCoins(coins, n,weight));

    }
}