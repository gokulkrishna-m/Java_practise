interface Annony{
    void anno();
}
public class TestAnnon implements Annony {
    public static void main(String[] args) {
        Annony an = new TestAnnon();

        an.anno();

        Annony an1 = () -> {
            System.out.println("lavanya");
        };

        an1.anno();

        int a = 1231398129;

        System.out.println();
    }
    public void anno(){
        System.out.println("gokul");
    }
}
