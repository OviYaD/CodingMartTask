class singlyLinkedList{
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static void deleteFirst() {
        head = head.next;
    }

    static void deleteLast() {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    static void deleteAtK(int k) {
        Node current = head;
        Node prev = current;
        int i = 0;
        while(current.next!=null)
        {
            i++;
            if (i == k) {
                break;
            }
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        current.next = null;
        
    }
    static void insertFirst(int data) {
        Node new_node = new Node(data);
        Node current = head;
        head = new_node;
        new_node.next = current;
    }

    static void insertAtMiddle(int data,int k)
    {
        Node new_node = new Node(data);
        Node current = head;
        Node prev = current;
        int i = 0;
        while(current.next!=null)
        {
            i++;
            if (i == k+1)
                break;
            prev = current;
            current = current.next;
        }
        new_node.next = current;
        prev.next = new_node;
    }
    static void insert(int data)
    {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }

    }

    static void find(int data) {
        Node current = head;
        while(current!=null)
        {
            if (current.data == data) {
                System.out.println("found");
                return;
            }
            current=current.next;
        }
        System.out.println("Not found");
        
    }
    static void display()
    {
        Node current = head;
        while (current!= null) {
            System.out.print(current.data+" ");
            current = current.next;
        }

    }

    public static void main(String args[]) throws Exception {
        
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        insert(70);
        insert(80);
        insert(90);
        insert(100);
        insertFirst(102);
        System.out.println("after insertion:");
        display();
        deleteFirst();
        System.out.println("\nafter delete at first:");
        display();
        deleteLast();
        System.out.println("\nafter delete at last:");
        display();
        find(10);
        find(100);
        System.out.println("delete at kth position");
        deleteAtK(5);
        display();
        System.out.println("insert at kth position");
        insertAtMiddle(101, 4);
        display();

    }
}