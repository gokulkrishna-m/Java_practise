package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class TestTreeset {
    public static void main(String[] args) {
        TreeSet<String> map = new TreeSet<>();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");

        System.out.println(map);

        ArrayList<String> al = new ArrayList<>();
        al.add("one");
        al.add("two");
        al.add("three");
        al.add("four");
        System.out.println(al);

        HashSet<String> hm = new HashSet<>();
        hm.add("Tom");
        hm.add("tom");
        hm.add("Thom");
        hm.add("thom");

        System.out.println(hm);
    }
}
