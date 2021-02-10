package TestDXC;

import java.util.HashMap;
import java.util.Map;

public class TestEricaBob {
    public static void main(String[] args) {
        System.out.println("Result :"+result("EHH","EME"));
        System.out.println("Result :"+result("E","H"));
        System.out.println("Result :"+result("h","H"));
    }
    public static String result(String input1,String input2){
        char[] split1 = input1.toUpperCase().toCharArray();
        char[] split2 = input2.toUpperCase().toCharArray();
        Map<Character,Integer> m1 = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();

        int result1=0,result2=0;

        m1.put('E',1);
        m1.put('M',3);
        m1.put('H',5);

        m2.put('E',1);
        m2.put('M',3);
        m2.put('H',5);

        for(int i = 0;i<split1.length;i++){
            result1 += m1.get(split1[i]);
            result2 += m2.get(split2[i]);
        }

        if(result1 > result2){
            return "Erica";
        }else if(result2 > result1){
            return  "Bob";
        }else{
            return "Tie";
        }
    }
}
