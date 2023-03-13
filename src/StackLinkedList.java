import java.util.Scanner;

class Node{
    int data;
    Node next;
}

public class StackLinkedList {
    private Node top;
    public StackLinkedList(){
        this.top=null;
    }
    public void push(){
        int n;
        System.out.println("enter the value:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        Node node=new Node();
        if(node==null){
            System.out.println("overflow");
            return;
        }
        System.out.println("inserting"+n);
        node.data=n;
        node.next=top;
        node.next=top;
        top=node;
    }

    public boolean isEmpty(){
        return top==null;
    }
    public int peek(){
        if(!isEmpty()){
            return top.data;
        }
        else{
            System.out.println("stack is empty");
            return -1;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("stack empty");
        }else{
            System.out.println("removing"+peek());
            top=top.next;
        }

    }
}
