package PractiseOne;

public class TestOverLoad {
    public static void main(String[] args) {
        System.out.println("Main method with array");
        int[] a = {0,1,2,3,4,5,6,7,8,9,10};
        int[] b = new int[2];

        for(int i = a.length-1;i>=0;i--){
            System.out.println("fadsf :"+a[i]);
        }
    }

    public static void main(String args) {
        System.out.println("Main method with String");
    }
    public static int sum(int a, int b){
        return a+b;
    }

    //public static int sum(int a, int b){ return (float) a+b;}

    public static double sum(int a, int b, int c){
        return a + b;
    }
}
