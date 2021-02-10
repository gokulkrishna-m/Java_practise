interface CSE{
    public int sum(int a,int b);
}
public class TestLambdaOne {
    public static void main(String[] args) {
        CSE c = (a,b) -> {
            return a+b;
        };
        System.out.println("Gokul :"+c.sum(10,20));

        CSE c1 = (a,b) -> (a+b);
        System.out.println("krishna :"+c1.sum(20,30));
    }
}
