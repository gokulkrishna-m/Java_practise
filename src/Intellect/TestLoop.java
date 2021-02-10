package Intellect;

public class TestLoop {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        X1:for (i = 0; i < 3; i++) {
            X2:for (j=3;i<j;j--){
                if(i<j){
                    System.out.println("I1 :"+i+" J :"+j);
                    continue X1;
                }else{
                    System.out.println("I2 :"+i+" J :"+j);
                    continue X2;
                }
            }
        }
        System.out.println("I :"+i+" J :"+j);

        //Range.from(1, 8).forEach(i -> System.out.println(i))

        String s1 = "gokul";
    }
}
