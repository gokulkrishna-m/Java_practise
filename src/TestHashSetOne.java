import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHashSetOne {
    public static void main(String[] args) {
        Set<String> st = new HashSet<>();
        List<Set<String>> li = new ArrayList<>();
        String[] arr = {"One","Two","Three","Four","Five","Six"};
        String[] arr2 = {"Six","Seven","Eight","Nine","Ten"};

        for(String arr1 : arr){
            st.add(arr1);
        }

        li.add(st);
        li.stream().forEach(a -> System.out.print("ArrayList<Set> :"+a));

        st.add(null);
        st.add(null);

        st.stream().forEach(System.out::println);

        System.out.println(st.size());

        st.clear();
        System.out.println(st);
        System.out.println(st.hashCode());

    }
}
