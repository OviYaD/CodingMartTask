package task9;

import java.util.Scanner;

public class onesComplement {
    public static int findComplement(int num) {
        int num1 = 1;
        String s = Integer.toBinaryString(num);
        for (int i = 0; i < s.length(); i++) {
            num = num ^ num1;
            num1 = num1 << 1;
        }
        return num;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(findComplement(n));
    }
    
}
