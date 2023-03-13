import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist{
    public void array(){
        ArrayList<Integer> arr=new ArrayList<Integer>(3);
        for(int i=0;i<=5;i++){
            arr.add(i);
        }
        arr.add(1,7);
        for (int i=0;i<=5;i++){
            System.out.println(arr.get(i));
        }
        Collections.sort(arr);
        System.out.println("the sorted list are:"+arr);
        arr.remove(1);
        System.out.println("the size of list is:"+arr.size());

    }
}
