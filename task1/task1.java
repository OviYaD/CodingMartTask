package task1;
import java.util.*;
public class task1
{
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    static void deleteAtK(int k)
    {
        Node current=head,prev=current;
        int i=0;
        while(current!=null)
        {
            i++;
            if(i==k)
            {
                break;
            }
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        current.next=null;
    }
    static void insertAtK(int data,int k)
    {
        Node current=head,prev=current;
        Node newnode=new Node(data);
        int i=-1;
        while(current!=null)
        {
            i++;
            if(i==k)
            break;
            prev=current;
            current=current.next;
        }
        newnode.next=current;
        prev.next=newnode;
    }
    static void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
        }
        else{
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next = newnode;
        }
    }
    static void display(){
        Node current=head;
        do{
            System.out.print(current.data+" ");
            current=current.next;
        }
        while(current!=null);
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ele;
        System.out.println("Insert the elements ... to quit give -1:");
        while(true){
            ele = s.nextInt();
            if (ele == -1)
                break;
            insert(ele);
        }
        // insert(10);
        // insert(20);
        // insert(30);
        // insert(40);
        // insert(50);
        // insert(60);

        display();
        int k;
        int choice;
        do{
            System.out.println("\n1.Insert at kth position\n2.Delete at kth position\n3.display\n4.Exit");
            choice=s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert and its position:");
                    int data = s.nextInt();
                    k = s.nextInt();
                    insertAtK(data, k);
                    display();
                    break;
                case 2:
                    System.out.println("Enter the position of the element that have to delete:");
                    k = s.nextInt();
                    deleteAtK(k);
                    display();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    break;
            }
        }while(choice!=4);
	}
}

