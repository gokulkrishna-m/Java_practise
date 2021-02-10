package collection;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class TestArogya {
    public static void main(String[] args) {
        LinkedHashMap<String,String> lhm = new LinkedHashMap<>();
        ArrayList<LinkedHashMap<String,String>> lhm4 = new ArrayList<>();
        LinkedHashMap<String,String> lhm2 = new LinkedHashMap<>();
        LinkedHashMap<String,String> lhm5;

        lhm.put("A","1");
        lhm.put("B","2");
        lhm.put("C","3");
        lhm.put("D","4");
        System.out.println("gokul:"+lhm.get("D").contains("4"));
        System.out.println("lavanya"+lhm.isEmpty());
        if(lhm.isEmpty() == false){
            System.out.println("lavanya");
        }else{
            System.out.println("lavanya krishna");
        }


        System.out.println("gokul:"+lhm.get("F"));
        System.out.println("gokul:"+lhm.keySet());
        System.out.println("gokul:"+lhm.size());
        //lhm.put("E","5");

        lhm4.add(lhm);

        //lhm.clear();

        System.out.println("dfsd :"+lhm4);

        String[] g = {"0","1","2","3","4","5","6","7"};
        int count = 0;

        for(int i = 0; i< 2;i++){
            System.out.println(g[0+count]+"||"+g[1+count]+"||"+g[2+count]+"||"+g[3+count]);

            count+=4;
        }
    }
}
