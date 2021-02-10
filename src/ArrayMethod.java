import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMethod {
    public static void main(String[] args) {
        System.out.println(sample()[0]);
        System.out.println(sample()[1]);
        System.out.println(sample()[2]);
        System.out.println(sample()[3]);

        String source = "810LN15";
        String source1 = "Classifier (ID:3039) submitted";
        String[] parts = source1.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        System.out.println(Arrays.toString(parts));
        System.out.println(parts[1]);

        List<String> al = Arrays.asList(sample());

        for (String l1: al) {
            System.out.println("Name :"+l1);
        }
        //al.add("SuBi");
    }
    public static String[] sample(){
        final String ARR[] = {"Gokul","Krishna","Lavanya","Priya"};
        ARR[0] = "Abinaya";
        return ARR;
    }
}
