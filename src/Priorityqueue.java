import java.util.PriorityQueue;

public class Priorityqueue {
    public void priority(){
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("hi");
        pq.add("my");
        pq.add("name");
        pq.add("is");
        pq.add("palistha");

        System.out.println(pq);

//        pq.peek();
        System.out.println(pq.peek());

        for(String x:pq){
            System.out.println(x);
        }
        System.out.println(pq.contains("is"));
        System.out.println(pq.size());
        pq.poll();
        System.out.println(pq);



    }
}
