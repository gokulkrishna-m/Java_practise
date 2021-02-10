interface Tree{
    public String getname();
}

public class InterfaceSample implements Tree {
    public static void main(String[] args) {
        Tree tr = new InterfaceSample();
        InterfaceSample tr1 = new InterfaceSample();

        System.out.println(tr.getname());

        System.out.println(tr1.getname());
        System.out.println(tr1.name());
    }

    public String name(){
        return "name method is called";
    }
    @Override
    public String getname() {
        return "Getname method is called";
    }
}
