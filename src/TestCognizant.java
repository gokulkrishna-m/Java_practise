import java.util.ArrayList;
import java.util.List;

class TestParent{
    TestParent(){
        System.out.println("TestParent Const");
    }

    public int methodName(){
        System.out.println("TestParent Class");
        return 1;
    }
}

class TestChild extends TestParent{
    TestChild(){
        System.out.println("TestChild Const");
    }

    public int methodName(){
        System.out.println("TestChild Class");
        return 0;
    }
}

public class TestCognizant {
    public static void main(String[] args) {
        TestChild tc = new TestChild();
        TestParent tp = new TestChild();

        //tc.methodName();
        tp.methodName();

        int i = 011;
        int j = 07;

        System.out.println(i);
        System.out.println(j);

        List al = new ArrayList<String>();

        int g;
        String s;

        //System.out.println(g+"||"+s);

        String pan = "BOMPG5858K";

        System.out.println(pan.substring(3,4));

        //System.out.println(al.cap);
    }
}
