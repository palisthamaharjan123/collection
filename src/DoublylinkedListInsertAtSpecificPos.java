public class DoublylinkedListInsertAtSpecificPos {
    class Node{
        String data;
        Node prev;
        Node next;

        public Node(String data) {
            this.data = data;
        }
    }
    public int size = 0;
    Node head = null;
    Node tail = null;
    public void firstNode(Node node){
        head = node;
        tail = node;
        head.prev = null;
        tail.next = null;
    }
    public void lastNode(Node node){
        tail.next = node;
        node.prev = tail;
        tail = node;
        tail.next = null;
    }
    public void addNodeInBeginning(Node node){
        head.prev = node;
        node.next = head;
        node.prev = null;
        head = node;
    }

    public void addNewNode(String data) {
        Node newNode = new Node(data);

        if(head == null) {
            firstNode(newNode);
        }
        else {
            lastNode(newNode);
        }
        size++;
    }

    public void addNodeToSpeciifiedPosition(int position, String data) {
        Node newNode = new Node(data);

        if(head == null) {
            System.out.println("The specified location is not available");
        }
        else {
            if(position == size+1){

                lastNode(newNode);

            }else if(position == 1){

                addNodeInBeginning(newNode);

            }else{
                Node current = head;
                Node temp = null;

                for(int i = 1; i < position-1; i++){
                    current = current.next;
                }

                temp = current.next;
                temp.prev = current;

                current.next = newNode;
                newNode.prev = current;
                newNode.next = temp;
                temp.prev = newNode;
            }
            size++;
        }
    }

    public void showData() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.data + "\n");
            current = current.next;
        }
    }


}
