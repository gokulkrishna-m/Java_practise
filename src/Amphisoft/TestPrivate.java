package Amphisoft;
class Pr{
    private String name;
    private String name1 = "gokul";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName1() {
        return name1;
    }
}
public class TestPrivate {
    public static void main(String[] args) {
        Pr p = new Pr();

        p.setName("sdfdsfsdfs");

        System.out.println("dfsdfsdf :"+p.getName());
        System.out.println("dfsdfsdf :"+p.getName1());
    }
}
