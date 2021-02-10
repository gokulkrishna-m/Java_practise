import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

interface Krishna{
    public int sum(int a,int b);
}

class Bansy{
    String name;
    Bansy(String name){
        this.name = name;
    }
}

public class TestArrayList implements Krishna
{
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();

        li.add("Gokul");
        li.add("Gokul");
        li.add("krishna");

        Bansy b3 = new Bansy("Bansy");
        Bansy b1 = new Bansy("Gokul");
        Bansy b2 = new Bansy("Bansy");

        Set<Bansy> ban = new HashSet<>();

        ban.add(b3);
        ban.add(b1);
        ban.add(b2);

        System.out.println("Ban :"+ban);
        //System.out.println("ban :"+ban.stream().collect(Collectors.toList()));

        System.out.println(li.stream().count());
        System.out.println(li.stream().distinct().map(p -> p).count());

        li.stream().distinct().forEach(System.out::println);
        li.stream().forEach(System.out::println);

        Krishna k = new TestArrayList();
        System.out.println("Krishna :"+k.sum(20,40));

        Krishna k1 = (a,b) -> {
            return a+b;
        };

        System.out.println("krishna 1 :"+k1.sum(30,40));

        List<String> li1 = gokul();

        for (String a: li1){
            System.out.println("ksjdfhkjdzfh :"+a);
        }
        Set<List<String>> set1 = Krishna();
        System.out.print("Set :"+set1);
    }
    public int sum(int a,int b){
        int result = a+b;
        return result;
    }

    public static List<String> gokul(){
        List<String> li = new ArrayList<>();

        li.add("Gokul");
        li.add("Gokul");
        li.add("krishna");

        return li;
    }

    public static Set<List<String>> Krishna(){
        List<String> lis = new ArrayList<>();
        lis.add("dfsf");
        lis.add("asdsdfs");
        lis.add("sdfgsf");
        Set<List<String>> s1 = new HashSet<>();

        s1.add(lis);
        return s1;
    }
}
