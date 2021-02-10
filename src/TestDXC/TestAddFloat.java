package TestDXC;

public class TestAddFloat {
    public static void main(String[] args) {
        System.out.println("Sum :"+sum(1.1,3.05));
    }
    public static int sum(double a, double b){
        double result;
        result = a+b;
        return (int) Math.floor(result);
    }
}
