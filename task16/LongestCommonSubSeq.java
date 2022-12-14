package task16;

import java.util.*;

public class LongestCommonSubSeq {
    public static int lcs(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++){
            for (int j = 1; j <= len2; j++){
                char c1 = text1.charAt(i - 1);
                char c2 = text2.charAt(j - 1);
                if (c1 == c2){
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text1 = s.next();
        String text2 = s.next();

		System.out.println("lcs: "+lcs(text1,text2));
	}
}