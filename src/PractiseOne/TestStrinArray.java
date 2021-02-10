package PractiseOne;

import java.util.Arrays;

public class TestStrinArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        String arr1[] = {"","",""};

        System.out.println(arr.length);
        System.out.println(arr1.length);

        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        //System.arraycopy();
        /*for (int a:arr) {
            System.out.println(a);
        }*/

        String array = "Gokul#Krishna";
        char[] split = array.split("#")[0].toCharArray();
        String[] sp = array.split("#");
        StringBuilder sb = new StringBuilder();
        sb.append(sp[0]);
        String out = "";
        out = sb.reverse() + "#";
        System.out.println("OUT :"+out);
        sb.delete(0,sb.length());
        sb.append(sp[1]);
        System.out.println("SB :"+sb);
        out = out + sb.reverse();
        System.out.println("OUT :"+out);
        for (int i = split.length-1; i >= 0; i--) {
            out += split[i];
        }
        //System.out.println("OUT :"+out);
    }
}
