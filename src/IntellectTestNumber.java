import java.lang.reflect.Array;
import java.util.Arrays;

public class IntellectTestNumber {
    public static void main(String[] args) {
        int n = 1;
        String s1 = "3";
        int n1 = Integer.parseInt(s1);
        int sum = n+1;
        System.out.println("Sum :"+sum);
        if(n==n1 || n1==sum){
            System.out.println("Gokul Loves Lavanya");
        }else{
            System.out.println("Lavanya Loves Gokul");
        }

        String _fapoPayCurrRowSLNo = "";
        String _fapoPayPrevRowSLNo = "";
        int _slNo = 1;
        int _prevNo = 0;

        _fapoPayCurrRowSLNo = "2";
        _fapoPayPrevRowSLNo = "1";

        if(!_fapoPayPrevRowSLNo.equalsIgnoreCase("0")){
            _prevNo = Integer.parseInt(_fapoPayPrevRowSLNo) + 1;
        }else{
            _prevNo = 1;
        }

        if(_fapoPayPrevRowSLNo.equalsIgnoreCase("0") && (_slNo != Integer.parseInt(_fapoPayCurrRowSLNo))){
            System.out.println("Please enter the serial number in order");
        }else if(_prevNo != Integer.parseInt(_fapoPayCurrRowSLNo)){
            System.out.println("Please enter the serial number in order");
        }else{
            System.out.println("Success");
        }

        int a1 = -10;
        int a2 = 10;

        System.out.println("a1 :"+Math.abs(a1));
        System.out.println("a2 :"+Math.abs(a2));

        System.out.println("abs1 :"+abs1(a1));
        System.out.println("abs2 :"+abs1(a2));

        int arr[] = {3,2,4,1};

        for (int g:arr) {
            System.out.println("ARR :"+g);
        }

        Arrays.sort(arr);
        for (int g:arr) {
            System.out.println("Sorted :"+g);
        }
        //System.out.println("Sorted :"+ arr);

    }

    public static int abs1(int a) {
        //return (a < 0) ? -a : a;
        if(a < 0){
            return -a;
        }
        return a;
    }
}
