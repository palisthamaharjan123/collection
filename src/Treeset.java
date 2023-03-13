
import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public void treeSet() {
        Set<String> name = new TreeSet<>();//diff from hashset is that esma serially dinxa value haru
        name.add("Ram");
        name.add("Shyam");
        name.add("Hari");
        name.add("Ram");
        name.add("Anish");

        System.out.println("the value of tress set are:");
        System.out.println(name);
    }
}
