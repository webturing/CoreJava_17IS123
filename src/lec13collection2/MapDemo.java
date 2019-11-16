import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
       // Map<String,String> contacts=new TreeMap<>();//O(logn)
        Map<String,String> contacts=new HashMap<>();//O(1)
        System.out.println(contacts.get("zj"));
        contacts.put("zj","33470027");
        contacts.put("tom","123456");
        contacts.put("jerry","987654321");
        contacts.put("cat","6666");
        System.out.println(contacts.size());
        for(String name:contacts.keySet()){//dump keySet
            System.out.println(name);
        }
        for(String number:contacts.values()){//dump values
            System.out.println(number);
        }
        for(String name:contacts.keySet()){
            System.out.println(name+"--->"+contacts.get(name));
        }
    }
}
