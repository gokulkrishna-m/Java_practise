import java.util.HashMap;
import java.util.Map;

public class TestIntellect {
    public static void main(String[] args) {
        String pan = "BOMPG5858K";
        String subs = pan.substring(3,4);
        String pid = "CN";

        HashMap<String,String> hm = new HashMap<>();
        //System.out.println(subs);
        if(subs.equalsIgnoreCase("p")){
            //System.out.println(subs);
            hm.put("AAD","P");
            hm.put("DRV","P");
            hm.put("VID","P");

            if(hm.get(pid) == null){
                System.out.println("Individual");
                System.out.println("Not Applicable");
            }else{
                System.out.println("Individual");
                System.out.println("Applicable");
            }

        }else{
            hm.put("AAD","C");
            hm.put("DRV","C");
            hm.put("VID","C");

            if(hm.get(pid) != null){
                System.out.println("Company");
                System.out.println("Not Applicable");
            }else{
                System.out.println("Company");
                System.out.println("Applicable");
            }

        }
        for(Map.Entry m: hm.entrySet()){

        }
        /*if(hm.get(pid) == null){
            System.out.println("Not Applicable");
        }else{
            System.out.println("Applicable");
        }*/

        /*for (Map.Entry<String, String> entry : hm.entrySet()) {
            if(subs.equalsIgnoreCase("p")){
                if(hm.get(pid)== null){
                    System.out.println("Not Applicable");
                }else{
                    System.out.println("Applicable");
                }
            }
            *//*if (entry.getValue().equals("c")) {
                System.out.println(entry.getKey());
            }*//*
        }*/

        /*for(Map.Entry m : hm.entrySet()){
            if(subs.equalsIgnoreCase("p")){
                if(m.getKey() == null){
                    System.out.println("Not Applicable");
                }else{
                    System.out.println("Applicable");
                }
            }
        }*/
    }
}
