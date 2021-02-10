package Sample;

import java.util.ArrayList;
import java.util.List;

public class TestKrishna {
    public static void main(String[] args) {
        TestGokul tg = new TestGokul();
        TestGokul tg1 = new TestGokul();
        tg.setRoll(144030);
        tg.setName("Gokul");
        tg1.setRoll(144039);
        tg1.setName("Lavanya");

        List<TestGokul> li = new ArrayList<>();
        li.add(tg);
        li.add(tg1);

        li.forEach(a -> System.out.println(a.getRoll()+"::"+a.getName()));

        //int n = li.stream().filter(a->a.getRoll() == 144030);
    }
}
