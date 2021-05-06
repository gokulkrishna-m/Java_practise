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
    }
}
