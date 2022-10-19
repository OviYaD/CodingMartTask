package task10;

import java.util.*;

public class HuffMan {

    static class MyComparator implements Comparator<HuffMan.Node>{
        
        @Override
        public int compare(Node x, Node y) {
            // TODO Auto-generated method stub
            return x.frq-y.frq;
        }
    }

    static class Node {
        char ch;
        int frq;
        Node left, right;

        Node(char ch, int frq) {
            this.ch = ch;
            this.frq = frq;
            left = null;
            right = null;
        }
    }
    
    public static void printCode(Node root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.ch)) {
            System.out.println(root.ch + "  " + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char[] data = new char[n];
        int[] frq = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = s.next().charAt(0);
            frq[i] = s.nextInt();
        }

        PriorityQueue<Node> queue = new PriorityQueue<Node>(n, new MyComparator());
        for (int i = 0; i < n; i++) {
            Node newNode = new Node(data[i], frq[i]);
            newNode.left = null;
            newNode.right = null;
            queue.add(newNode);
        }

        while (queue.size() > 1) {
            Node p = queue.peek();
            queue.poll();
            Node q = queue.peek();
            queue.poll();

            int newFrq = p.frq + q.frq;
            Node newRoot = new Node('-', newFrq);
            newRoot.left = p;
            newRoot.right = q;
            queue.add(newRoot);
        }
        Node root = queue.peek();
        System.out.println("Encoded Result:");
        printCode(root, "");
    }
    
}
