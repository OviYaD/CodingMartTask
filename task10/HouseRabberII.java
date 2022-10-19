package task10;

import java.util.*;

public class HouseRabberII {
    
    public static int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        return Math.max(
                robber(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                robber(Arrays.copyOfRange(nums, 1, nums.length)));

    }
    
    public static int robber(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return nums[0];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(n - 1, nums, dp);
    }

    public static int solve(int index, int[] nums, int[] dp) {
        if (index == 0)
            return nums[0];
        if (index < 0)
            return 0;
        if(dp[index]!=-1) return dp[index];
        int pick = nums[index] + solve(index - 2, nums, dp);
        int nonpick = solve(index - 1, nums, dp);
        
        return dp[index]=Math.max(pick,nonpick);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println(rob(a));
    }
}
