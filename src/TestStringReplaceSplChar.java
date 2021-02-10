public class TestStringReplaceSplChar {
    public static void main(String[] args) {
        String input = "He is a very very good boy, isn't he?";
        String replace = input.replaceAll("[^\\dA-Za-z ]", "");

        System.out.print("Gokul :"+replace);
    }
}
