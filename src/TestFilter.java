import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product{
    int p;
    String name;
    Product(String name,int p){
        this.p = p;
        this.name = name;
    }
}
public class TestFilter
{
    public static void main(String[] args) {
        List<Product> li = new ArrayList<Product>();
        li.add(new Product("A",1000));
        li.add(new Product("B",2000));
        li.add(new Product("C",3000));
        li.add(new Product("D",4000));
        li.add(new Product("E",5000));

        //int n = li.stream().filter(p -> p.p > 4000);
        li.stream().filter(b -> b.p > 3000).forEach(p -> System.out.println(p.name));
        System.out.print(li.stream().filter(a -> a.p > 3000).toString());
    }
}
