package task16;

public class BuySell {
    int func(int ind,int profit,int canBuy,int[] arr,int currTrans,int k,int[][][] dp) {
        if(ind == arr.length) return 0;
        if(currTrans == k) return 0;
        
        if(dp[ind][canBuy][currTrans] != -1) return dp[ind][canBuy][currTrans];
        if(canBuy == 1) {
            profit = Math.max( -arr[ind] + func(ind+1,profit,0,arr,currTrans,k,dp), func(ind+1,profit,1,arr,currTrans,k,dp));
        }
        else {
            profit = Math.max(arr[ind] + func(ind+1,profit,1,arr,currTrans+1,k,dp) , func(ind+1,profit,0,arr,currTrans,k,dp));
        }
        return dp[ind][canBuy][currTrans] = profit;
        //return  profit;
    }
    
    public int maxProfit(int k, int[] prices) {
        int[][][] dp = new int[prices.length+1][2][k];
        for(int i = 0;i <= prices.length;i++) {
            for(int j = 0;j < 2;j++) {
                for(int z = 0;z < k;z++) {
                    dp[i][j][z] = -1;
                }
            }
        }
        return func(0,0,1,prices,0,k,dp);
    }
    
}
