package task12;

import java.util.*;
public class coinChangeNoOfWays {
    
    static int NoOfWays(int[] coins, int weight, int size) {
        
        int[][] dp = new int[size][weight + 1];
        for (int[] row : dp)
        Arrays.fill(row, 1);
    for (int i = 0; i < size; i++) {
        for (int j = 1; j <= weight; j++) {
            if (i == 0) {
                if (j % coins[i] == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = 0;
                continue;
            }
            if (j<coins[i]) {
                dp[i][j] = dp[i - 1][j];
            } else {
                dp[i][j] = dp[i - 1][j] + dp[i][j-coins[i]];
            }
        }
    }
        
    for (int i = 0; i < size; i++) {
        for (int j = 0; j <= weight; j++) {
            System.out.print(dp[i][j] + " ");
        }
        System.out.println();
    }
        return dp[size - 1][weight];
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int size   = s.nextInt();
        int[] coins = new int[size];
        for (int i = 0; i < size; i++) {
            coins[i] = s.nextInt();
        }
        int weight = s.nextInt();
        System.out.println(NoOfWays(coins, weight,size));
    }
}
