package collection;

import java.util.LinkedHashMap;

public class TestObject {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> obj1 = new LinkedHashMap<>();
        LinkedHashMap<Integer,LinkedHashMap<String,Integer>> obj2 = new LinkedHashMap<>();

        int g = 10;

        for(int i=1; i<=2;i++){
            obj1 = new LinkedHashMap<>();
            obj1.put("alcohol "+i,g++);
            obj1.put("smoke "+i,g++);
            obj1.put("pan "+i,g++);
            obj1.put("habbit "+i,g++);

            obj2.put(i,obj1);
            obj1 = null;
        }

        System.out.println("obj2 :"+obj2);

        System.out.println(obj2.get(1).keySet().toArray()[0]);

        //System.out.println(obj2.get(1).entrySet());
//        System.out.println(obj2.get(1).values().toArray()[0]);
//        System.out.println(obj2.get(1).values().toArray()[1]);
//        System.out.println(obj2.get(1).values().toArray()[2]);
//        System.out.println(obj2.get(1).values().toArray()[3]);
//
//        System.out.println(obj2.get(2).values().toArray()[0]);
//        System.out.println(obj2.get(2).values().toArray()[1]);
//        System.out.println(obj2.get(2).values().toArray()[2]);
//        System.out.println(obj2.get(2).values().toArray()[3]);
        //System.out.println(obj2.get(obj1.get("alcohol 1")));

        //System.out.println(obj2.keySet());

        //String g1 = obj2.get(1).values().toArray()[0].toString();
        String g2 = obj2.get(1).keySet().toArray()[0].toString().split("\\s")[1];
        //System.out.println("g1 :"+g1);
        System.out.println("g2 :"+g2);

        String g3 = "alcohol1 daily";

        System.out.println("asasdas :"+g3.split("\\s")[1]);
    }
}
