package Agnoshin;

interface Lavanya{
    int gokul(int a,int b);
}
interface Gokul{
    void lavanya();
}
interface Krishna{
    void lavnaya();
}
public class TestInterface implements Gokul,Krishna
{
    public static void main(String[] args) {
        TestInterface tf = new TestInterface();
        Krishna k = () -> {
            System.out.println("dfdfds ");
        };
        Gokul g = new TestInterface();
        k.lavnaya();
        tf.lavanya();
        tf.lavnaya();
        g.lavanya();
    }

    @Override
    public void lavanya() {
        System.out.println("Gokul :");
    }

    @Override
    public void lavnaya() {
        System.out.println("Krishna :");
    }
}
