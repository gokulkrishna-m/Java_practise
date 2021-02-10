import java.util.ArrayList;

class ObjectCreation{
    private String name;
    private int id;

    public ObjectCreation(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class TestObjectCreation {
    public static void main(String[] args) {
        String name1 = "gokul";

        //TestObjectCreation name = new TestObjectCreation();
        String[] names = {"gokul krishna","Balan","krishna"};
        int[] id = {1,2,3};

        ArrayList<ObjectCreation> al = new ArrayList<>();
        int i = 0;

        for (String gokul:names) {
            al.add(new ObjectCreation(names[i],id[i]));
            i++;
        }

        System.out.println("ArrayList :"+al.get(0).getClass());
    }
}
