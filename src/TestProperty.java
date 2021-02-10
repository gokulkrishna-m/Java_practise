import java.util.Map;
import java.util.Properties;

public class TestProperty {
    public static void main(String[] args) {
        Properties prop = System.getProperties();

        for (Map.Entry m: prop.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
