import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();
        Set<String> s1 = new HashSet<>();

        s.add("A");
        s.add("D");
        s.add("B");
        s.add("E");
        s.add("C");

        s1.add("A");
        s1.add("B");
        s1.add("E");
        s1.add("C");
        s1.add("D");

        s.forEach(System.out::print);
        System.out.println();
        s1.forEach(System.out::print);

    }
}
