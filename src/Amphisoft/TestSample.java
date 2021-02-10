package Amphisoft;

import java.util.HashMap;

public class TestSample {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h1 = new HashMap<>();

        HashMap<String,Integer> h3 = new HashMap<>();

        h1.put(1,1);
        h1.put(1,3);

        System.out.println("sdfsdf :"+h1.get(1));

        HashMap<HashMap<Integer,Integer>,String> h2 = new HashMap<>();


        h2.put(h1,"gokul");

        System.out.println("sdfsdf :"+h2.get(h1));

        Integer a = 10,b=10;

        if(a == b)
            System.out.println("Gokul");
        else
            System.out.println("Krishna");
    }
}
