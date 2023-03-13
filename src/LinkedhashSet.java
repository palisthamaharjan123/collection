import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedhashSet {
    public void linkedHashSet() {
        Set<String> name = new LinkedHashSet<>();//jun order ma value deko xa tei order ma value print hunxa
        name.add("Ram");
        name.add("Shyam");
        name.add("Hari");
        name.add("Ram");
        name.add("Anish");

        System.out.println("the elements of linked hash set set are:");
        System.out.println(name);
    }
}