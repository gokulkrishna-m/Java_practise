class CSENAME{
    int rollno;
    String name;
    CSENAME(int rollno, String name){
        this.name = name;
        this.rollno = rollno;
    }
}
public class TestClassObject {
    public static void main(String[] args) {
        CSENAME c1 = new CSENAME(144030,"GK");
        CSENAME c2 = c1;

        System.out.println(c1.name+"||"+c1.rollno);
        System.out.println(c2.name+"||"+c2.rollno);

        c2.name = "Lavanya";
        c2.rollno = 144038;
        System.out.println(c2.name+"||"+c2.rollno);

        String s1 = "Gokul";
        String s2 = s1;

        System.out.println("S1 :"+s1+"|| S2 :"+s2);

        s1 = s1+" krishna";
        System.out.println("S1 :"+s1+"|| S2 :"+s2);
    }
}
