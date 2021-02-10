package PractiseOne;

import java.util.ArrayList;
import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("a","1");
        hm.put("b","2");
        hm.put("c","3");
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        hm.forEach((a,b) -> System.out.println(a.toString()+" || "+b.toString()));

        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> al1 = new ArrayList<>();

        al.add("a");
        al.add("b");
        al.add("c");
        al.add("d");
        al.add("e");

        al1.add("c");
        al1.add("d");
        al1.add("e");

        //al.removeAll(al1);
        al.retainAll(al1);
        System.out.println(al);
        //System.out.println();
    }
}
