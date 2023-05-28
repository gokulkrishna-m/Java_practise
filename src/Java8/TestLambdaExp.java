package Java8;

interface Draw{
    public void drawing(); //no parameter
}
interface Sayable{
    public String say(String name); // single parameter
}

interface Addable{
    public int add(int a, int b); //multiple parameter
}
public class TestLambdaExp {
    public static void main(String[] args) {
        int i = 10;
        Draw d = ()->{
            System.out.println("Width :"+i);
        };

        d.drawing();

        Sayable s = (s1)->{
            return "Hello "+s1;
        };

        Sayable ss = s2 -> {
            return "Hi "+s2;
        };
        System.out.println(s.say("Gokul Krishna"));
        System.out.println(ss.say("Lavanya"));

        Addable a1 = (a,b) -> (a+b); // no datatype & return type
        System.out.println(a1.add(10,10));

        Addable a2 = (int a, int b) -> (a+b); // no return type
        System.out.println(a2.add(20,20));

        Addable a3 = (int a, int b) -> {
            return a+b;
        }; // with datatype & return type
        System.out.println(a2.add(30,30));
    }
}
