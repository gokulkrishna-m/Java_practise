package PractiseOne;

class Person{
    String name;
    int id;
    Person(){

    }
    Person(int id, String name){
        this.id = id;
        this.name = name;
    }
}

class Emp extends Person{
    int salary;
    Emp(int id, String name,int salary){
        super(id,name);
        this.salary = salary;
    }

    public void display(){
        System.out.println("ID :"+id+" Name :"+name+" Salary :"+salary);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Emp e1 = new Emp(1,"Gokul Krishna",50000);
        e1.display();
    }
}
