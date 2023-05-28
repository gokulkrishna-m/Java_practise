package hackerrank;

import java.util.HashMap;

public class TestSingleLinkedlist {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        System.out.println(arr.length);
        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

        String s = " ";

        System.out.println(!s.trim().equalsIgnoreCase(""));

        String pan = "12AAAAA0000A1Z5";

        System.out.println(pan.substring(2,12));

        System.out.println(2+3);
        System.out.println(""+2+3);
        System.out.println(2+3+"");
        System.out.println(2+""+3);

        Byte b = new Byte("1");
        System.out.println(b);

        Boolean[] bo = new Boolean[10];
        System.out.println(bo[0]);

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('a',1);
    }
}
