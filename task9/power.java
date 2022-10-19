package task9;

import java.util.*;

public class power {

    static int findPower(int a, int n) {
        int last_bit = 0;
        int ans = 1;
        while (n > 0) {
            last_bit = n & 1;
            if (last_bit > 0) {
                ans *= a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int n = s.nextInt();
        System.out.println(a+ "^"+n+" = "+findPower(a,n));
    }
    
}
