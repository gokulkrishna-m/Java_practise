package PractiseOne;

public class TestObject {
    int id;
    String name;
    static int no=10;
    public static void main(String[] args) {
        TestObject o1 = new TestObject();
        TestObject o2 = null;
        System.out.println(o1 instanceof TestObject);
        System.out.println(o2 instanceof TestObject);
        System.out.println(o1.name);
        System.out.println(o1.id);
        System.out.println(TestObject.no);
    }
}
