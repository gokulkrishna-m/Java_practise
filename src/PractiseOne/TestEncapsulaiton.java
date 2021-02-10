package PractiseOne;

import java.util.Random;

class StudentOne{
    private String name="",college="KLNCE";

    public String getCollege() {
        return college;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void display(){
        System.out.println("Name :"+name);
    }
}
public class TestEncapsulaiton {
    public static void main(String[] args) {
        StudentOne so = new StudentOne();
        System.out.println(so.getCollege());
        so.setName("Lavanya");
        so.display();

        Random r = new Random();
        int n = r.nextInt(10);
    }
}
