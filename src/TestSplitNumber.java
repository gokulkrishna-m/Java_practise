import java.util.*;

public class TestSplitNumber
{
    public static void main(String[] args) {
        String numArray[] = {"1234.0","2345.0","3456.0","4567.0","5678.0"};

        System.out.println("Arrays :"+Arrays.asList(numArray));
        List<Integer> lint = new ArrayList<Integer>();
        for (String a:numArray){
            lint.add(Integer.parseInt(a.substring(0,4)));
        }
        System.out.println(lint);

        int sum = lint.stream().reduce(0,(a,b) -> a+b);

        System.out.println("sum :"+sum);
    }
}
