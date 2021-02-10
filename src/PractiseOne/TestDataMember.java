package PractiseOne;
class A{
    int speed = 100;
}
class B extends A{
    int speed = 200;
}
public class TestDataMember {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();

        System.out.println(a.speed);
        System.out.println(b.speed);
    }
}
