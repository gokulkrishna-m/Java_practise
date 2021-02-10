package PractiseOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestScannerVSBuffered {
    public static void main(String[] args) throws IOException {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer :");
        int a = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the String :");
        String s = scan.nextLine();
        System.out.println("The value are :"+a+" and "+s);*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer :");
        int a1 = Integer.parseInt(br.readLine());
        //scan.nextLine();
        System.out.println("Enter the String :");
        String s1 = br.readLine();
        System.out.println("The value are :"+a1+" and "+s1);
    }
}
