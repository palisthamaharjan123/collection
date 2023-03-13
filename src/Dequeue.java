import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public void dequeue(){
        Deque<String> dq=new ArrayDeque<>();
        dq.add("Ram");
        dq.addFirst("shyam");
        dq.addLast("hari");
        dq.add("sita");
        System.out.println(dq);
        System.out.println("the first removed item"+dq.removeFirst());
        System.out.println("the last removed item"+dq.removeLast());
        System.out.println("the first popped item"+dq.pop());
        System.out.println("the first popped item"+dq.poll());

        if(dq.isEmpty()){
            System.out.println("empty queue");
        }else{
            System.out.println(dq);
        }

    }
}
