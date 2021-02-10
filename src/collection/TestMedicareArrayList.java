package collection;

import java.util.ArrayList;

public class TestMedicareArrayList {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("a");
        a1.add("b");
        a1.add("c");
        a1.add("d");
        a1.add("e");

        ArrayList<ArrayList> a2 = new ArrayList<>();

        a2.add(a1);

        a1 = (ArrayList) a2.get(0);

        System.out.println("sdffds :"+a1);
        System.out.println("sdffds :"+a1.get(3));
    }
}
