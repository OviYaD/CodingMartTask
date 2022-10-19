package task2;

import java.util.*;
public class Palindrome {
    static Node head;
    static class Node{
        char data;
        Node next;
        Node prev;
        Node(char d){
            data=d;
            next=null;
            prev=null;
        }
    }
    
    static void insert(char data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newnode;
            newnode.prev=current;
        }
    }
    
    static void checkPalindrome(){
        int i=-1;
        Node slow=head,fast=head.next;
        while( true ){
            if(fast==null)
            {
                i=1;
                break;
            }
            else if(fast.next==null){
                i=0;
                break;
            }
            slow=slow.next;
            fast=fast.next.next;
            i++;
        }
        if(i==0)
        fast=slow.next;
        else
        fast=slow;
    while (fast != null) {
        if (fast.data != slow.data) {
            System.out.println("Not Palindrome");
            return;
        }
        slow = slow.prev;
        fast = fast.next;
    }
    if (i == 0)
        System.out.println("even Palindrome");
    else
        System.out.println("odd Palindrome");
    }
    static void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = s.next().toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            insert(input.charAt(i));
        }
        System.out.println("\nChecking for the palindrome........");
        System.out.print("\nGiven string is : ");
        checkPalindrome();
	}
}