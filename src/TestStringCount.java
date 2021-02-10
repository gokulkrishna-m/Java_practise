import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStringCount
{
    public static void main(String[] args) {
        String s1 = "This is a pen This is not a pencil";
        String[] s = s1.split("\\s");

        List<String> li = new ArrayList<>();

        int count = 0;

        for(String m:s){
            //count++;
            li.add(m);
        }
        System.out.println("li :"+li);

        System.out.println("This :"+li.stream().filter(a -> a.contains("This")).count());
        System.out.println("is :"+li.stream().filter(a -> a.contains("is")).count());
        System.out.println("a :"+li.stream().filter(a -> a.contains("a")).count());
        System.out.println("pen :"+li.stream().filter(a -> a.contains("pen")).count());
        System.out.println("pencil :"+li.stream().filter(a -> a.contains("pencil")).count());
        System.out.println("not :"+li.stream().filter(a -> a.contains("not")).count());


        Map<String,Integer> m = new HashMap<>();
        Map<String,Integer> map = new HashMap<>();
        m.put("gokul",1);
        m.put("gokulk",1);
        m.put("gokulkr",1);
        m.put("gokulkri",1);
        m.put("gokulkris",1);

        System.out.println("sdfsfds :"+m.get("gokul"));
        for(String s3:s){
            Integer n = map.get(s3);
            System.out.println("n :"+n+"||"+s3);
            n = (n == null) ? 1 : ++n;
            map.put(s3, n);
        }
        System.out.println("Map :"+map);

        //System.out.println(li.stream().distinct().count());
        //System.out.println("sdfsf :"+count);

        //System.out.println("sdfsf :"+s.length);
    }
}
