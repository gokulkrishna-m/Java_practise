package PractiseOne;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        ArrayList<Integer> al1 = new ArrayList<>();
        al.add("A");
        al.add("C");
        al.add(1,"D");
        al.add("B");

        al1.add(1);
        al1.add(2);
        al1.add(4);
        al1.add(3);

        //Collections.sort(al,Collections.reverseOrder());

        al.forEach(a -> System.out.println("sadfa :"+a));
        for (String a:al) {
            System.out.println(a);
        }

        for (Integer i:al1) {
            System.out.print(i+",");
        }

        Iterator itr = al.iterator();
        //System.out.println(itr);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
