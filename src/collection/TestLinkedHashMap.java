package collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
        ArrayList<LinkedHashMap<String,String>> lhm4 = new ArrayList<>();
        LinkedHashMap<String,String> lhm2 = new LinkedHashMap<>();
        LinkedHashMap<String,String> lhm5;

        lhm.put("A","1");
        lhm.put("B","2");
        lhm.put("C","3");
        lhm.put("D","4");
        //lhm.put("E","5");

        lhm.forEach((a,b) -> System.out.println("Key :"+a+" value :"+b));

        lhm4.add(lhm);


        lhm2.put("B","2");
        lhm2.put("A","1");
        lhm2.put("C","3");
        lhm2.put("D","4");
        lhm2.put("E","5");

        LinkedHashMap<Integer,LinkedHashMap<String,String>> lhm1 = new LinkedHashMap<>();

        lhm1.put(1,lhm);
        lhm1.put(2,lhm2);

        lhm.clone();
        System.out.println(lhm1);

        System.out.println(lhm1.get(1));
        System.out.println(lhm1.get(1).keySet().toArray()[0]);
        //.keySet().toArray()
        //System.out.println(lhm.get(lhm1.get(1)));
        System.out.println("One :"+lhm.get(lhm1.get(1).keySet().toArray()[0]));
        System.out.println("Two :"+lhm.get(lhm1.get(1).keySet().toArray()[1]));

        System.out.println("size :"+lhm1.size());

        for(int memcount = 1; memcount <=2 ;memcount++){
            LinkedHashMap<String,String> lhm8 = new LinkedHashMap<>();
            //lhm2+String.valueOf(memcount) = new String();
        }




    }
}
