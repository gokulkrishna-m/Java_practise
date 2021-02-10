package PractiseOne;

public class TestWrapperClass {
    public static void main(String[] args) {
        int i = 10;
        Integer i1 = Integer.valueOf(i);
        Integer i2 = i;

        System.out.println("i :"+i+" i1:"+i1+" i2:"+i2);

        Integer i3 = new Integer(20);
        int j = i3.intValue();
        int j1 = i3;

        System.out.println("i3 :"+i3+" j:"+j+" j1:"+j1);
    }
}
