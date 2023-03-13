import java.util.Scanner;

public class SinglyLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insertAtfirst() {
        System.out.println("enter the data :");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Node temp;
        Node current = new Node(n);
        if (head == null) {
            head = current;
            tail = current;
        } else {
            temp = head;
            head = current;
            head.next = temp;
        }


    }
    public void insertAtLast(){
        System.out.println("enter the data to be added in the last :");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        Node temp;
        Node newnode = new Node(m);
        Node temp1;
        temp1=head;
        while(temp1!=null){
            temp1=temp1.next;
        }
        temp1.next=newnode;
        newnode.next=null;

    }
    public void insertAtPos(){
        System.out.println("enter the position you want to insert inL:");
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        System.out.println("insert the data you want to insert:");
        int d=s.nextInt();
        Node temp=head;
        Node newNode=new Node(d);
        int count=1;
        while(count<pos-1){
            temp=temp.next;
            count++;
        }
        Node temp1=temp.next;
        temp.next=newNode;
        newNode.next=temp1;


    }

    public void deleteAtfirst(){
        Node temp=head;
        Node temp1=temp.next;

        temp.next=temp1.next;
        temp1.next=null;
    }
    public void deleteAtLast(){
        Node temp;
        Node temp1;
        temp=head;
        do{
            temp1=temp;
            temp=temp.next;
        }while(temp.next!=null);
        temp1.next=null;
    }
    public void deleteAtPos(){
        System.out.println("enter the position");
        Scanner s=new Scanner(System.in);
        int pos=s.nextInt();
        int count=1;
        Node temp=head;
        Node temp1;
        do{
            temp=temp.next;
            count++;
        }while(count<pos-1);
        temp1=temp.next;
        temp.next=temp1.next;
        temp1.next=null;
    }


}
