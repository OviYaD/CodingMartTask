package task9;

import java.util.*;

public class LsbMsb {

    public static void findLsb(int n) {
        if (n % 2 == 0)
            System.out.println("LSB of " + n + " is : " + n % 2);
        else
            System.out.println("LSB of " + n + " is : " + n % 2);

    }
    
    public static void findMsb(int n) {
        System.out.println("MSB of " + n + " is : 1 at the index "+(int)(Math.log(n)/Math.log(2)+1)+" from right.");
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        findLsb(n);
        findMsb(n);
    }
    
}
