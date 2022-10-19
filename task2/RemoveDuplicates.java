package task2;
import java.util.*;
public class RemoveDuplicates{
    static Node head;
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    
    static void insert(int data){
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
    }
    
    static void removeDuplicates(){
        HashMap<Integer,Integer> map=new HashMap<>();
        
        Node current=head;
        Node prev=current;
        while(current!=null){
            if(map.containsKey(current.data)){
                prev.next=current.next;
                current.next=null;
                current=prev.next;
                continue;
            }
            map.put(current.data,1);
            prev=current;
            current=current.next;
        }
        System.out.println("LL after removing duplicates:");
        display();
    }
    
    static void display(){
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
        System.out.println("Enter the elements of list ..... to quit enter -1");
        
        while (true) {
            ele = s.nextInt();
            if (ele == -1)
                break;
            insert(ele);
        }
        
        System.out.println("Elements of LL:");
        display();
        removeDuplicates();
        
	}
}