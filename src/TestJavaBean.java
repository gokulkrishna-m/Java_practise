class JavaBean{
    private String name;

    public JavaBean(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class TestJavaBean {
    public static void main(String[] args) {
        JavaBean jb = new JavaBean();

        jb.setName("Gokul");

        System.out.println(jb.getName());
    }
}
