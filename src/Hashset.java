import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Hashset {
    public void hashSet(){
        Set<String> name= new HashSet();
        name.add("Ram");
        name.add("Shyam");
        name.add("Hari");
        name.add("Ram");//duplicate add hundaina

        name.remove("Ram");//hashset ma index use garera remove garna mildaina

        System.out.println(name);
        System.out.println(name.size());

        System.out.println(name.contains("Shyam"));


        for(String names:name){//randomly iterate hundaina
            System.out.println(names);
        }
        name.iterator();

//        name.clear();
        if(name.isEmpty()){
            System.out.println("the set is empty");
        }else{
            System.out.println("the set is not empty");
        }

        LinkedList<String> newlist=new LinkedList<>();
        newlist.add("palistha");
        newlist.add("pali");
        newlist.add("maharjan");
        newlist.add("palistha");
        System.out.println("the list with duplicate value");
        System.out.println(newlist);//duplicate auxa


        System.out.println("the list without the duplicate values");
        Set<String> newSet=new HashSet<>(newlist);//constructor ma matra pathae ni hunxa
        newSet.addAll(newlist);
        System.out.println(newSet);








    }


}
