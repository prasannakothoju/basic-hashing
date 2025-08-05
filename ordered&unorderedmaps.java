import java.util.*;

public class A {
    public static void main(String[] args) {
        
        // unordered map
        Map<String, Integer> un = new HashMap<>();
        un.put("rose", 5);
        un.put("lisa", 3);
        un.put("jennie", 8);
        un.put("jhisso", 2);
        
        // ordered map
        Map<String, Integer> o = new LinkedHashMap<>();
        o.put("apple", 7);
        o.put("carrot", 2);
        o.put("banana", 8);
        o.put("mango", 5);
        
        System.out.println("Unordered Map:");
        for (Map.Entry<String, Integer> e : un.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
        
        System.out.println("Ordered Map:");
        for (Map.Entry<String, Integer> e : o.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}
