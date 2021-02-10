package PractiseOne;

public class TestString {
    public static void main(String[] args) {
        String s1 = "Gokul";
        System.out.println(s1.hashCode());
        s1 = s1 + " Krishna";
        System.out.println(s1.hashCode());
        StringBuffer sb = new StringBuffer("Gokul");
        System.out.println(sb.hashCode());
        sb.append(" Krishna");
        System.out.println(sb.hashCode());
        System.err.println("Error :"+sb);

        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
    }
    public static String concatWithString()    {
        String t = "Java";
        for (int i=0; i<10000; i++){
            t = t + "Tpoint";
        }
        return t;
    }
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Java");
        for (int i=0; i<10000; i++){
            sb.append("Tpoint");
        }
        return sb.toString();
    }
}
