package task1;

import java.util.*;

public class singlyLL {
    static Node head=null;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static void insert(int ele) {
        Node newnode = new Node(ele);
        if (head == null) {
            head = newnode;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    static void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "  ");
            current = current.next;
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ele ;
        while (true) {
            ele = s.nextInt();//-1
            if (ele == -1)
                break;
            insert(ele);
        }
        display();
    }
    
}
