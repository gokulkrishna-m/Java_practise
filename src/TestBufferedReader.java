import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestBufferedReader {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = scan.nextInt();
        System.out.println("Enter the string");
        String s = scan.nextLine();

        System.out.println("kdsjfksdf :"+a+" sdfsdfsd :"+s);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number :");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Enter the string");
        String s1 = br.readLine();

        System.out.println("kdsjfksdf :"+b+" sdfsdfsd :"+s1);
    }
}
