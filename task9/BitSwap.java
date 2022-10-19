package task9;

import java.util.*;

public class BitSwap {

    static List<Integer> bit=new LinkedList<Integer>();
    // static int[] binary = new int[100];
    // static int index = 0;

    public static void DeciToBinary(int n) {
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        for (int i = 0; i < bin.length(); i++) {
            char ch = bin.charAt(i);
            if (ch == '1')
                bit.add(1);
            else
                bit.add(0);
        }
    }
    
    public static int Swap() {
        String swappedSting="";
        if (bit.size() % 2 != 0) {
            bit.add(0, 0);
        }
        System.out.println(bit);
        for (int i = 1; i < bit.size(); i += 2) {
            swappedSting += bit.get(i);
            swappedSting += bit.get(i-1);
        }
        System.out.println(swappedSting);
        return Integer.parseInt(swappedSting, 2);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        DeciToBinary(n);
        System.out.println(Swap());
    }
    
}
