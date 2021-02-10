public class StaticString {
    public static void main(String[] args) {
        System.out.println("Hello :"+keyName()+". How are you?");
    }
    private static String keyName(){
        final String KEY = "Gokul krishna";

        return KEY;
    }
}
