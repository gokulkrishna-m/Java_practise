package PractiseOne;

abstract class Bike{
    Bike(){
        System.out.println("Bike is created...");
    }
    abstract void method();
    void gear(){
        System.out.println("Gear Method...");
    }
}

class Honda extends Bike{
    void method(){
        System.out.println("Method method...");
    }
}

public class TestAbstractClass {
    public static void main(String[] args) {
        Bike b = new Honda();
        b.method();
        b.gear();
    }
}
