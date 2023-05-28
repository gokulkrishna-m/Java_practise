import java.util.ArrayList;
import java.util.HashSet;

class Employee{
    String name="";
    Employee(String name){
        this.name = name;
    }
}

public class TestFinalArrayList {
    public static void main(String[] args) {
        final ArrayList<String> al = new ArrayList<>();
        al.add("gokul");
        al.add("gokul");
        al.add("gokul");

        //al = new ArrayList<>();
        System.out.println(al);

        Employee emp = new Employee("gokul");
        Employee emp1 = new Employee("karthi");
        Employee emp2 = new Employee("gokul");

        String name = "gokul";
        HashSet<Employee> hs = new HashSet<>();
        hs.add(emp);
        hs.add(emp1);
        hs.add(emp2);

        System.out.println(emp == emp2);
        System.out.println(emp.equals(emp2));
        System.out.println(emp.equals(name));
        if(emp == emp2){
            //true;
        }if(emp.equals(emp2)){
            //true
        }if(emp.equals(name)){
            //false;
        }
    }
}
