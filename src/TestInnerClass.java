class Gokul{
    class Krishna{
        public void display(){
            System.out.println("Krishna Method is running");
        }
    }
}

public class TestInnerClass {
    public static void main(String[] args) {
        Gokul g = new Gokul();
        Gokul.Krishna k = g.new Krishna();

        k.display();
    }
}
