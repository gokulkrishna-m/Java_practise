package collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("A");
        li.add("B");
        li.add("C");
        li.add("D");
        li.add("E");

        System.out.println("one :"+li.toString());
        li.remove("B");
        System.out.println("one :"+li.toString());
        li.remove(2);
        System.out.println("one :"+li.toString());

        System.out.println("one :"+li.indexOf("A"));
        System.out.println("one :"+li.subList(0,2));

        //li.set(7,"O");

        System.out.println("one :"+li.toString());
        String fruit = "strawberries";
        System.out.println(fruit.substring(2,5));

    }
}
