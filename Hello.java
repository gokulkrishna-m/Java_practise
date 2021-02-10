import java.util.*;
class Hello{
    public static void main(String... args){
        System.out.println("Hello world");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number..");
        int n = scan.nextInt();

        for(int i = 0;i<=n;i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
            }else if(i%5==0){
                System.out.println("Fizz");
            }else if(i%3==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}