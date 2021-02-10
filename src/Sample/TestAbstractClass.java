package Sample;

import java.util.HashMap;
import java.util.Map;

public class TestAbstractClass {
    public static void main(String[] args) {
        Map<Integer,String> m = new HashMap<>();

        m.put(1,"A");
        m.put(2,"B");
        m.put(3,"C");
        m.put(4,"D");
        m.put(5,"E");

        int i = 0;
        m.keySet().stream().forEach(a -> System.out.println("Key :"+a.toString()));
        m.entrySet().stream().forEach(a -> System.out.println("Key :"+a.toString()+"||"+a.getValue()+"||"+a.getKey()));
        //m.entrySet().stream().forEach(a -> System.out.println("Key :"));
    }
}
