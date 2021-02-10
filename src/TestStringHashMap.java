import java.util.HashMap;
import java.util.Map;

public class TestStringHashMap {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        String s = "This is a pen this is not a pencil";
        String[] split = s.split("\\s");

        m.put("G",1);

        System.out.println("fsdfsdfsdf :"+m.get("G"));

        for(String s1:split){
            Integer n = m.get(s1);
            if(n == null){}
                //System.out.println("String :"+n);
                //m.put(s1,n);
        }
    }
}
