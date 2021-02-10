package Intellect;

import java.util.Arrays;
import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        String name = "Gokul krishna ManiKumar";
        //Integer i = null;
        //System.out.println(name.toCharArray());
        //char[] ch = name.toCharArray();
        HashMap<String, String> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>();
        HashMap<String,Integer> hm = new HashMap<>();
        char[] ch = name.toLowerCase().replaceAll(" ","").toCharArray();
        Integer[] arr = new Integer[ch.length];
        System.out.println(ch);
        int count = 0;
        hm1.put("a","");
        hm2.put("a","1");
        System.out.println(hm1.get("a").isEmpty());
        System.out.println(hm1);
        hm1.putAll(hm2);
        System.out.println(hm1);
        if(hm1.get("a")==""){
            System.out.println("gokul");
        } if(hm1.get("a").equals("")){
            System.out.println("krishna");
        } if(hm1.get("a").equalsIgnoreCase("")){
            System.out.println("gokul krishna");
        }else{
            System.out.println("Nothing");
        }
//        for (char ch1:ch) {
//            //System.out.println(ch1);
//            Integer i = hm.get(ch1);
//            i = (i==null) ? 1 : ++i;
//            hm.put(String.valueOf(ch1),i);
//            /*if(i == null){
//                hm.put(String.valueOf(ch1),count);
//            }else{
//                hm.put(String.valueOf(ch1),++count);
//            }*/
//        }

        for (int g = 0;g<ch.length;g++){
            Integer i = hm.get(ch[g]);
            i = (i==null) ? 1 : ++i;
            hm.put(String.valueOf(ch[g]),i);
            arr[g] = i;
        }
        //System.out.println(hm);
        //System.out.println("arr :"+ Arrays.toString(arr));
        System.out.println(hm);
    }
}
