import java.util.LinkedList;

public class Linkedlist {
    public void lis(){
        LinkedList<Integer> list=new LinkedList<Integer>();
        for (int i=0;i<=5;i++){
            list.add(i);
        }
        list.addFirst(4);
        list.add(3,10);
        list.remove(4);
        for (int i=0;i<=5;i++){
            System.out.println(list.get(i));
        }

    }
}
