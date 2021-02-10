package PractiseOne;

class Student{
    private int rollno;
    private String name;
    private static String college = "KLNCE";

    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public void display(){
        System.out.println("Roll Number :"+rollno+" Name :"+name+" College :"+college);
        //this.display();
    }
}
public class TestStatic {
    public static void main(String[] args) {
        Student s1 = new Student(144030,"Gokul Krishna");

        s1.display();
    }
}
