class Singleton{
    private static Singleton singleton_instance = null;

    String s = "";

    private Singleton(){
        s = "Hello gokul krishna";
    }

    public static Singleton getInstance(){
        if(singleton_instance == null){
            singleton_instance = new Singleton();
        }
        return singleton_instance;
    }
}

public class TestSingletonClass {
    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();

        System.out.print(x.s);
    }
}
