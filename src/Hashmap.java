import java.util.HashMap;

public class Hashmap {
    public void map(){
        HashMap<String,Integer> empId=new HashMap<String,Integer>();
        empId.put("Ram",123);
        empId.put("Shyam",456);
        empId.put("Hari",789);
        System.out.println(empId);
        System.out.println(empId.get("Ram"));
        System.out.println(empId.containsKey("haru"));
        System.out.println(empId.containsValue(123));
        empId.replace("Ram",10101);
        System.out.println(empId.get("Ram"));
        empId.remove("Shyam");


    }
}
