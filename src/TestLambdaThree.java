interface gokul{
    int sub(int a,int b);
}
public class TestLambdaThree {
    public static void main(String[] args) {
        gokul g = (a,b) -> {
            return a-b;
        };
        System.out.print(g.sub(30,10));
    }
}
