public class TestSysout {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("Hello :"+ ++a + ++b);
        System.out.println("Hello :"+ ++a + b++);

        System.out.println("Hello :"+a+b);
        System.out.println("Hello :"+ ++a);
        System.out.println("Hello :"+ a++);

        System.out.println("Hello :"+ ++a + b);
        System.out.println("Hello :"+ ++a + ++b);
    }
}
