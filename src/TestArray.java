public class TestArray {
    public static void main(String[] args) {
        String[] arr = new String[2];
        arr[0] = "gokul";
        arr[1] = "Krishna";

        sample(arr);
    }

    public static void sample(String... args){
        System.out.println(args[0]);
        System.out.println(args[1]);
//        System.out.println(args);
    }
}
