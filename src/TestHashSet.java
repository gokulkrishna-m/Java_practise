import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Ideas2it{
    int n,age;
    String name;
    Ideas2it(int n,String name,int age){
        this.n = n;
        this.name = name;
        this.age = age;
    }
}

public class TestHashSet
{
    public static void main(String[] args) {
        Ideas2it i1 = new Ideas2it(1,"gokul",23);
        Ideas2it i2 = new Ideas2it(1,"gokul",23);
        Ideas2it i3 = new Ideas2it(1,"gokul",23);
        Ideas2it i4 = new Ideas2it(1,"gokul",23);

        Set<Ideas2it> s = new HashSet<>();
        s.add(i1);
        s.add(i2);
        s.add(i3);
        s.add(i4);

        //System.out.println("Ideas2it :"+s);
        for(Ideas2it i:s){
            System.out.println(i.name+" "+i.age+" "+i.n);
        }

        if(i1 == i2){
            System.out.print("saldaslkdalksd");
        }
    }
}
