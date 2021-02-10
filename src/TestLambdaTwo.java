import java.util.*;
import java.util.stream.Stream;
class Mobile{
    int n,price;
    String name;
    Mobile(int n,String name,int price){
        this.n = n;
        this.name = name;
        this.price = price;
    }
}
public class TestLambdaTwo
{
    public static void main(String[] args) {
        ArrayList<Mobile> a1 = new ArrayList<Mobile>();
        a1.add(new Mobile(1,"oneplus",30000));
        a1.add(new Mobile(2,"Redmi note8",20000));
        a1.add(new Mobile(3,"Mi A3",18000));

        Mobile m1 = new Mobile(4,"Nokia lumia",15000);
        Mobile m2 = new Mobile(5,"Sumsung",18700);

        a1.add(m1);
        a1.add(m2);

        a1.forEach(Mobile -> System.out.println(Mobile.n+" "+Mobile.name+" "+Mobile.price));

        Stream<Mobile> streamdata = a1.stream().filter(p -> p.price>18000);
        streamdata.forEach(Mobile -> System.out.println(Mobile.n+" "+Mobile.name+" "+Mobile.price));
    }
}
