package task5;

public class paintHouse {
    static void minCost(int costs[][], int N)
    {
        if (N == 0)
            return;
        int dp[][] = new int[N][3];
        dp[0][0] = costs[0][0];
        dp[0][1] = costs[0][1];
        dp[0][2] = costs[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + costs[i][0];
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + costs[i][1];
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + costs[i][2];
        }
        System.out.println(
                Math.min(dp[N - 1][0],
                        Math.min(dp[N - 1][1], dp[N - 1][2])));
    }
        
    public static void main(String[] args) {
        int costs[][] = { { 14, 2, 11 },
					{ 11, 14, 5 },
                { 14, 3, 10 } };
        int N = costs.length;
        minCost(costs, N);
    }
}