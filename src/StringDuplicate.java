import java.util.HashMap;

public class StringDuplicate {
    public static void main(String[] args) {
        String input = "Hello gokul krishna My name is gokul krishna what is your name your name is gokul krishna";
        String[] arr = input.split("\\s");
        int count = 1;

        HashMap<String,Integer> hm = new HashMap<>();

        //System.out.println(hm.get("kdsjf"));
        for(String arr1:arr){
            Integer n = hm.get(arr1);

            n = (n==null) ? 1 : ++n;
            hm.put(arr1,n);
        }
        System.out.println(hm);

        try{
            System.out.println();
        }finally {
            System.out.println();
        }
    }
}
