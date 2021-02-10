interface Abinaya{
    void gokul();
}
interface Gowsalya{
    void gokul();
}
public class TestInterFace implements Abinaya,Gowsalya {
    public static void main(String[] args) {
        Gowsalya g  = () -> {System.out.println("gokul ");};
        Abinaya a = () -> {System.out.println("krishna ");};
        a.gokul();
        g.gokul();
    }
    public void gokul(){
        System.out.println("gokul ");
    }
}
