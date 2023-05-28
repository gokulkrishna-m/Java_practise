class Parent{
    String name = "Gokul";
}
class Child extends Parent{
    String name1 = "Krishna";
    String name2 = name;
    Child(){
        System.out.println(name);
    }
}
public class TestSingleInheritance {
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Parent();
        System.out.println(c.name);
        System.out.println(c.name1);
        System.out.println(p.name);
    }
}
