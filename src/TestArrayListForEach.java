import java.util.*;
public class TestArrayListForEach {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Abara");
        al.add("Balan");
        al.add("Abinaya");
        al.add("Gowsalya");
        al.add("Gokul");
        al.add("Lavanya");

        al.forEach(
                String -> System.out.println(String)
        );

        al.forEach(
                a -> System.out.print(a+" ")
        );
    }
}
