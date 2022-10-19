package task2;
import java.util.*;
public class Merge2LL{
    static Node head1;
    static Node head2;
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    
    static Node insert(int data,Node head){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newnode;
        }
        return head;
        
    }
    
    static void merge(){
        Node current=head1;
        while(current.next!=null){
            current=current.next;
        }
        current.next=head2;
        head2=null;
    }
    
    static void display(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data +" ");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ele;
        System.out.println("Enter the elements of list 1..... to quit enter -1");
        
        while (true) {
            ele = s.nextInt();
            if (ele == -1)
                break;
            head1 = insert(ele, head1);
        }
        
        System.out.println("Elements of LL1:");
        display(head1);
        System.out.println("Enter the elements of list 2..... to quit enter -1");
        while (true) {
            ele = s.nextInt();
            if (ele == -1)
                break;
            head2 = insert(ele, head2);
        }
        System.out.println("Elements of LL2:");
        display(head2);
        System.out.println("\nMerging the lists......");
        merge();
        System.out.println("Merged list:");
        display(head1);
        
	}
}