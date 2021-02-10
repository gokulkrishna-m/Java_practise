package Intellect;

import java.lang.Exception;

public class TestSample {
    public static void main(String[] args) {

        try {
            System.out.println("Gokul");
        }finally {
            System.out.println("Abinaya");
        }

        System.out.println("moMethod :"+moMethod());

        if(args.length>0){
            System.out.println("Gokul");
        }else{
            System.out.println("Lavanya");
        }

        System.out.println(args);
        System.exit(1);
        System.out.println(args);
        System.out.println(args.length);
    }

    public static int moMethod(){
        try {
            int i = 1/0;
            System.out.println("Gokul1");
        }catch (Exception e){
            System.out.println("Lavanya1");
            //return 1;
            System.exit(0);
        }finally {
            System.out.println("Gowsalya1");
        }
        return 0;
    }
}
