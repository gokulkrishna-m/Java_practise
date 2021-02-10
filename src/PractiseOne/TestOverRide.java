package PractiseOne;
class Load{
    public void output(){
        System.out.println("class Load Method");
    }
}
class SubLoad extends Load{
    public void output(){
        super.output();
        System.out.println("class SubLoad Method");
    }
}
public class TestOverRide {
    public static void main(String[] args) {
        SubLoad sl = new SubLoad();
        sl.output();
    }
}
