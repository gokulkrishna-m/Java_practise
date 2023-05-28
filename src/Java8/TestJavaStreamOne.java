package Java8;
import java.util.*;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class TestJavaStreamOne {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList2 = productsList.stream().filter(p -> p.price>28000).map(p -> p.price).collect(Collectors.toList());
        List<Float> productPriceList3 = productsList.stream().filter(p -> p.price <= 25000).map(p -> p.price).collect(Collectors.toList());

        System.out.println(productPriceList2);
        System.out.println(productPriceList3);
    }
}
