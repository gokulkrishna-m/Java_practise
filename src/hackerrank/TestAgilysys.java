package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class TestAgilysys {
    public static void main(String[] args) {
        TestAgilysys ta = new TestAgilysys();
        ta.testString("agilysys");

        String s = new String("gokul");
        String s1 = new String("gokul");

        System.out.println(s.equals(s1));
    }
    public void testString(String s){
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> hm = new HashMap<>();
        int i = 1;

        for(Character ch1:ch){
            if(hm.get(ch1)==null){
                hm.put(ch1,i);
            }else{
                hm.put(ch1,i+1);
            }
        }

        System.out.println(hm.toString());

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+"="+m.getValue());
        }
    }
}
